package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ConfiguredStructureTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

final class StructureTagGenerator extends ConfiguredStructureTagsProvider
{
	public StructureTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, Commonality.ID, fileHelper);
	}

	@Override
	protected void addTags()
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-StructureTags";
	}
}
