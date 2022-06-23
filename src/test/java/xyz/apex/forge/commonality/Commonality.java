package xyz.apex.forge.commonality;

import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.InvocationTargetException;

@Mod("commonality")
public final class Commonality
{
	public Commonality()
	{
		try
		{
			Class.forName("xyz.apex.forge.commonality.internal.DataSetup").getMethod("generate").invoke(null);
		}
		catch(ClassNotFoundException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e)
		{
			throw new RuntimeException(e);
		}
	}
}
