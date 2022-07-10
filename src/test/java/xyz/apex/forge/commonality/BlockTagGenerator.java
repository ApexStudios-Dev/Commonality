package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

import xyz.apex.forge.commonality.tags.BlockTags;

final class BlockTagGenerator extends BlockTagsProvider
{
	BlockTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags()
	{
		tag(BlockTags.Common.QUARTZ_ORES).add(Blocks.NETHER_QUARTZ_ORE);
		tag(BlockTags.Forge.ORES_QUARTZ).addTag(BlockTags.Common.QUARTZ_ORES);
	}

	@Override
	public String getName()
	{
		return "Commonality-BlockTags";
	}

	// made public for BlockEntityTagGenerator
	@Override
	public TagBuilder getOrCreateRawBuilder(TagKey<Block> tag)
	{
		return super.getOrCreateRawBuilder(tag);
	}
}