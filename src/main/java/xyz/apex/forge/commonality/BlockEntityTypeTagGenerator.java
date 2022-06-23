package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeRegistryTagsProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;

final class BlockEntityTypeTagGenerator extends ForgeRegistryTagsProvider<BlockEntityType<?>>
{
	private final Function<TagKey<Block>, Tag.Builder> blockTags;

	BlockEntityTypeTagGenerator(DataGenerator generator, BlockTagGenerator blockTagGenerator, ExistingFileHelper fileHelper)
	{
		super(generator, ForgeRegistries.BLOCK_ENTITIES, Commonality.ID, fileHelper);

		blockTags = blockTagGenerator::getOrCreateRawBuilder;
	}

	@Override
	protected void addTags()
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-BlockEntityTypeTags";
	}

	public void copy(TagKey<Block> blockTag, TagKey<BlockEntityType<?>> blockEntityTag)
	{
		Tag.Builder blockEntityTagBuilder = getOrCreateRawBuilder(blockEntityTag);
		Tag.Builder blockTagBuilder = blockTags.apply(blockTag);
		blockTagBuilder.getEntries().forEach(blockEntityTagBuilder::add);
	}
}
