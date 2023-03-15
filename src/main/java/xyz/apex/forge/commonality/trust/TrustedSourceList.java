package xyz.apex.forge.commonality.trust;

import com.google.common.collect.Lists;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public final class TrustedSourceList
{
	public static final String SITES_URL = "https://api.stopmodreposts.org/minecraft/sites.txt";
	private static boolean enabled = true;
	private static boolean init = false;
	private static final List<URL> blacklist = Lists.newArrayList();
	private static final Logger LOGGER = LogManager.getLogger("TrustedSourceList");

	public static boolean isTrusted(URL url)
	{
		return !isBlacklisted(url);
	}

	public static boolean isTrusted(TrustManager.ZoneIdentity zoneIdentity)
	{
		downloadTrustedSources();

		var referrerUrl = zoneIdentity.referrerUrl();
		var hostUrl = zoneIdentity.hostUrl();

		var referrerTrusted = referrerUrl == null || isTrusted(referrerUrl);
		var hostTrusted = hostUrl == null || isTrusted(hostUrl);

		LOGGER.debug("Mod '{}' ReferrerURL: '{}', Trusted: {}", zoneIdentity.modId(), referrerUrl, referrerTrusted ? "TRUE" : "FALSE");
		LOGGER.debug("Mod '{}' Host: '{}', Trusted: {}", zoneIdentity.modId(), hostUrl, hostTrusted ? "TRUE" : "FALSE");

		if(!enabled)
			return true;

		return referrerTrusted && hostTrusted;
	}

	public static boolean isBlacklisted(URL url)
	{
		downloadTrustedSources();

		if(enabled)
		{
			var host = url.getHost();

			for(var blacklisted : blacklist)
			{
				if(StringUtils.containsIgnoreCase(host, blacklisted.getHost()))
					return true;
			}
		}

		return false;
	}

	static void downloadTrustedSources()
	{
		if(init)
			return;

		init = true;

		if(!FMLEnvironment.production)
		{
			LOGGER.info("Currently running in Development Environment, Disabling trusted source list!");
			enabled = false;
			return;
		}

		LOGGER.info("Loading BlackListed sources from remote... ({})", SITES_URL);

		try
		{
			var url = new URL(SITES_URL);

			try(var reader = new BufferedReader(new InputStreamReader(url.openStream())))
			{
				String line;

				while((line = reader.readLine()) != null)
				{
					line = line.trim();

					if(!line.isEmpty() && !line.startsWith("#"))
					{
						try
						{
							blacklist.add(new URL("http://%s".formatted(line)));
						}
						catch(MalformedURLException ignored)
						{
						}
					}
				}
			}
		}
		catch(IOException e)
		{
			LOGGER.error("Error occurred while loading remote file!", e);
		}

		LOGGER.info("Loaded {} BlackListed sources from remote", blacklist.size());
	}
}
