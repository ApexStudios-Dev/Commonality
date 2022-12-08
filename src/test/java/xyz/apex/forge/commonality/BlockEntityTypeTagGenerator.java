package xyz.apex.forge.commonality;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

final class BlockEntityTypeTagGenerator extends TagsProvider<BlockEntityType<?>>
{
	private final Function<TagKey<Block>, TagBuilder> blockTags;

	BlockEntityTypeTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, BlockTagGenerator blockTagGenerator, ExistingFileHelper fileHelper)
	{
		super(output, Registries.BLOCK_ENTITY_TYPE, completableFuture, Mods.COMMONALITY, fileHelper);

		blockTags = blockTagGenerator::getOrCreateRawBuilder;
	}

	@Override
	protected void addTags(HolderLookup.Provider provider)
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-BlockEntityTypeTags";
	}

	public void copy(TagKey<Block> blockTag, TagKey<BlockEntityType<?>> blockEntityTag)
	{
		var blockEntityTagBuilder = getOrCreateRawBuilder(blockEntityTag);
		var blockTagBuilder = blockTags.apply(blockTag);
		blockTagBuilder.build().forEach(blockEntityTagBuilder::add);
	}
}
