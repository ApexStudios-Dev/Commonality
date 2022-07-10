package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FlatLevelGeneratorPresetTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

final class FlatLevelGeneratorPresetTagGenerator extends FlatLevelGeneratorPresetTagsProvider
{
	FlatLevelGeneratorPresetTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags()
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-FlatLevelGeneratorPresetTags";
	}
}