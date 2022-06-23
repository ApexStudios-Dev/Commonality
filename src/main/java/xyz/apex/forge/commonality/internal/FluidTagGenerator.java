package xyz.apex.forge.commonality.internal;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

final class FluidTagGenerator extends FluidTagsProvider
{
	FluidTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, DataSetup.ID, fileHelper);
	}

	@Override
	protected void addTags()
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-FluidTags";
	}
}
