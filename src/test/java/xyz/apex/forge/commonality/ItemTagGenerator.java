package xyz.apex.forge.commonality;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import xyz.apex.forge.commonality.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

final class ItemTagGenerator extends ItemTagsProvider
{
	ItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, CompletableFuture<TagLookup<Block>> blockTagLookup, ExistingFileHelper fileHelper)
	{
		super(output, completableFuture, blockTagLookup, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider)
	{
		tag(ItemTags.Common.QUARTZ_ORES).add(Items.NETHER_QUARTZ_ORE);
		tag(ItemTags.Forge.ORES_QUARTZ).addTag(ItemTags.Common.QUARTZ_ORES);

		tag(ItemTags.Common.TOOLS_WRENCH);

		tag(ItemTags.Forge.TOOLS).addTags(ItemTags.Common.TOOLS_WRENCH);
	}

	@Override
	public String getName()
	{
		return "Commonality-ItemTags";
	}
}
