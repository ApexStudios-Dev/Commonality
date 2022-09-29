package xyz.apex.forge.commonality.trust;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

import net.minecraft.Util;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLEnvironment;

import xyz.apex.forge.commonality.Mods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.Supplier;

public final class TrustManager
{
	private static final Logger LOGGER = LogManager.getLogger("TrustManager");
	private static final Map<String, TrustState> modTrustStateMap = Maps.newHashMap();
	private static final Map<String, ZoneIdentity> modZoneIdentityMap = Maps.newHashMap();
	private static boolean loggedDevWarning = false;
	private static boolean logModTrust = false;

	private static final Set<String> forcefullyTrusted = Util.make(Sets.newHashSet(), set -> {
		set.add(Mods.MINECRAFT);
		modTrustStateMap.put(Mods.MINECRAFT, TrustState.TRUSTED);

		set.add(Mods.FORGE);
		modTrustStateMap.put(Mods.FORGE, TrustState.TRUSTED);
	});

	public static TrustState getTrustWorthiness(String modId)
	{
		if(forcefullyTrusted.contains(modId))
			return TrustState.TRUSTED;
		if(modTrustStateMap.containsKey(modId))
			return modTrustStateMap.get(modId);

		if(!FMLEnvironment.production)
		{
			if(!loggedDevWarning)
			{
				loggedDevWarning = true;
				LOGGER.warn("Currently running in a Development Environment, All mods will be forcefully trusted!");
				TrustedSourceList.downloadTrustedSources();
			}

			modTrustStateMap.put(modId, TrustState.DEVELOPMENT);
			return TrustState.DEVELOPMENT;
		}

		TrustedSourceList.downloadTrustedSources();
		var zoneIdentity = getZoneIdentity(modId);
		var trust = zoneIdentity == null ? TrustState.UNKNOWN : TrustedSourceList.isTrusted(zoneIdentity) ? TrustState.TRUSTED : TrustState.UNTRUSTED;
		modTrustStateMap.put(modId, trust);

		if(logModTrust)
		{
			LOGGER.info("Loaded mod '{}' TrustWorthiness: {}", modId, trust.name());
			logModTrust = false;
		}

		return trust;
	}

	public static boolean isTrusted(String modId)
	{
		return getTrustWorthiness(modId).isTrusted();
	}

	public static <T extends Throwable> void throwIfUntrusted(String modId, Supplier<? extends T> exceptionSupplier) throws T
	{
		if(!isTrusted(modId))
		{
			var zoneIdentity = getZoneIdentity(modId);
			var suffix = zoneIdentity == null ? "" : " (host: '%s', Referrer: '%s')".formatted(zoneIdentity.hostUrl, zoneIdentity.referrerUrl);

			LOGGER.fatal("Mod '{}' downloaded from Untrustworthy location!{}", modId, suffix);
			LOGGER.fatal("Download from trusted sources to play with this mod!");

			throw exceptionSupplier.get();
		}
	}

	public static void throwIfUntrusted(String modId)
	{
		throwIfUntrusted(modId, () -> new RuntimeException("Mod '%s' downloaded from Untrustworthy location! Download from trusted sources to play with this mod.".formatted(modId)));
	}

	@Nullable
	private static ZoneIdentity getZoneIdentity(String modId)
	{
		if(modZoneIdentityMap.containsKey(modId))
			return modZoneIdentityMap.get(modId);

		var msg = (FMLEnvironment.production ? "Loading mod '%s' TrustWorthiness..." : "Loading mod '%s' TrustWorthiness from Jar AltDataStream (Zone.Identifier)...").formatted(modId);
		LOGGER.info(msg);
		logModTrust = true;

		try
		{
			var modFileInfo = ModList.get().getModFileById(modId);
			var modJarPath = modFileInfo.getFile().getFilePath();

			if(Files.isDirectory(modJarPath))
				throw new FileNotFoundException("Loading mods from Directories is not supported out side of Development environments!");

			var zonePath = "%s:Zone.Identifier".formatted(modJarPath.toAbsolutePath().toString());
			var zoneFile = new File(zonePath);
			var properties = new Properties();

			try
			{
				try(var stream = new FileInputStream(zoneFile))
				{
					properties.load(stream);
				}
			}
			catch(FileNotFoundException e)
			{
				msg = FMLEnvironment.production ? "Could not determine mod trust worthiness, Assuming Jar was downloaded from trusted source!" : "Could not read Zone.Identifier from Jar AltDataStream, Assuming Jar was downloaded from trusted source!";
				LOGGER.fatal(msg);
				modTrustStateMap.put(modId, TrustState.UNKNOWN);
				return null;
			}

			var zoneIndex = getInt(properties, "ZoneId");
			var referrerUrl = getUrl(properties, "ReferrerUrl");
			var hostUrl = getUrl(properties, "HostUrl");

			var zoneIdentity = new ZoneIdentity(modId, zoneIndex, referrerUrl, hostUrl);
			modZoneIdentityMap.put(modId, zoneIdentity);
			return zoneIdentity;
		}
		catch(Exception e)
		{
			msg = FMLEnvironment.production ? "Error occurred while determining trust worthiness!" : "Error occurred while read Jar Zone.Identity!";
			LOGGER.fatal(msg);
		}

		return null;
	}

	private static int getInt(Properties properties, String key)
	{
		if(properties.containsKey(key))
		{
			try
			{
				return Integer.parseInt(properties.getProperty(key));
			}
			catch(NumberFormatException ignored)
			{
			}
		}

		return -1;
	}

	@Nullable
	private static URL getUrl(Properties properties, String key) throws MalformedURLException
	{
		if(properties.containsKey(key))
		{
			var obj = properties.get(key);

			if(obj instanceof URL url)
				return url;
			else if(obj instanceof String str && !str.isBlank())
				return new URL(str);
		}

		return null;
	}

	public record ZoneIdentity(String modId, int zoneIndex, @Nullable URL referrerUrl, @Nullable URL hostUrl) { }
}