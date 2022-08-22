package xyz.apex.forge.commonality;

import com.mojang.logging.LogUtils;

import net.minecraftforge.data.loading.DatagenModLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.versions.forge.ForgeVersion;

import java.lang.reflect.InvocationTargetException;

public interface Mods
{
	String FORGE = ForgeVersion.MOD_ID;
	String MINECRAFT = "minecraft";

	String APEX_CORE = "apexcore";
	String COMMONALITY = "commonality";
	String FANTASY_DICE = "fantasydice";
	String FANTASY_FURNITURE = "fantasyfurniture";
	String FANTASY_MOUNTS = "fantasymounts";
	String INFUSED_FOODS = "infusedfoods";
	String ITEM_RESISTANCE = "itemresistance";
	
	String CTM = "ctm";
	String JEI = "jei";
	String GECKO_LIB = "geckolib3";

	@Mod(COMMONALITY)
	final class CommonalityMod
	{
		public CommonalityMod()
		{
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