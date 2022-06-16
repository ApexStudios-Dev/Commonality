package xyz.apex.forge.commonality;

import net.minecraftforge.fml.common.Mod;

import xyz.apex.forge.commonality.data.DataSetup;

@Mod(Commonality.ID)
public class Commonality
{
	public static final String ID = "commonality";

	public Commonality()
	{
		DataSetup.setup();
	}
}
