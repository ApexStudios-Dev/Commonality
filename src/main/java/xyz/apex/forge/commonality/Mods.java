package xyz.apex.forge.commonality;

import com.mojang.logging.LogUtils;
import net.minecraftforge.data.loading.DatagenModLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.versions.forge.ForgeVersion;
import org.apache.logging.log4j.LogManager;
import xyz.apex.forge.commonality.trust.TrustManager;

import java.lang.reflect.InvocationTargetException;

public interface Mods
{
	String FORGE = ForgeVersion.MOD_ID;
	String MINECRAFT = "minecraft";

	String APEX_CORE = "apexcore";
	String COMMONALITY = "commonality";
	String FANTASY_DICE = "fantasydice";
	String FANTASY_FURNITURE = "fantasyfurniture";
	String INFUSED_FOODS = "infusedfoods";
	String ITEM_RESISTANCE = "itemresistance";

	String XYCRAFT = "xycraft";
	String XYCRAFT_WORLD = "xycraft_world";
	String XYCRAFT_OVERRIDE = "xycraft_override";
	String XYCRAFT_CORE = "xycraft_core";

	String CTM = "ctm";
	String JEI = "jei";
	String GECKO_LIB = "geckolib3";

	@Mod(COMMONALITY)
	final class CommonalityMod
	{
		public CommonalityMod()
		{
			// line exists to print current versions & to ensure Constants class is not referencing any client only code
			// would crash dedicated servers if was referencing client code
			LogManager.getLogger().info("Running Minecraft '{}', & Forge '{}' on Java '{}'", Constants.Common.VERSION_STRING, ForgeVersion.getVersion(), Constants.Common.JAVA_VERSION);

			TrustManager.throwIfUntrusted(COMMONALITY);

			if(DatagenModLoader.isRunningDataGen())
			{
				try
				{
					var clazz = Class.forName("xyz.apex.forge.commonality.Commonality");
					var onGatherData = clazz.getMethod("onGatherData");
					onGatherData.setAccessible(true);
					onGatherData.invoke(null);
				}
				catch(ClassNotFoundException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e)
				{
					var logger = LogUtils.getLogger();
					logger.error("Failed to register DataGeneration for Commonality!");
					logger.error(e.toString());
				}
			}
		}
	}
}
