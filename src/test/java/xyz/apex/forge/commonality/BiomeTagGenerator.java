package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

final class BiomeTagGenerator extends BiomeTagsProvider
{
	BiomeTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
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
		return "Commonality-BiomeTags";
	}
}
