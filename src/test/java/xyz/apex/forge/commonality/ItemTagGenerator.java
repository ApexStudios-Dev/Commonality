package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

import xyz.apex.forge.commonality.tags.ItemTags;

final class ItemTagGenerator extends ItemTagsProvider
{
	ItemTagGenerator(DataGenerator generator, BlockTagGenerator blockTagGenerator, ExistingFileHelper fileHelper)
	{
		super(generator, blockTagGenerator, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags()
	{
		tag(ItemTags.Common.QUARTZ_ORES).add(Items.NETHER_QUARTZ_ORE);
		tag(ItemTags.Forge.ORES_QUARTZ).addTag(ItemTags.Common.QUARTZ_ORES);

		tag(ItemTags.Common.TOOLS_WRENCH);

		tag(ItemTags.Forge.TOOLS).addTags(ItemTags.Common.TOOLS_WRENCH);

		tag(ItemTags.Common.ITEM_GROUPS).addTags(
				ItemTags.Common.ITEM_GROUPS_BUILDING_BLOCKS,
				ItemTags.Common.ITEM_GROUPS_DECORATIONS,
				ItemTags.Common.ITEM_GROUPS_REDSTONE,
				ItemTags.Common.ITEM_GROUPS_TRANSPORTATION,
				ItemTags.Common.ITEM_GROUPS_MISC,
				ItemTags.Common.ITEM_GROUPS_FOOD,
				ItemTags.Common.ITEM_GROUPS_TOOLS,
				ItemTags.Common.ITEM_GROUPS_COMBAT,
				ItemTags.Common.ITEM_GROUPS_BREWING
		);

		ItemTags.registerItemGroupTags(Mods.MINECRAFT, this::tag);
	}

	@Override
	public String getName()
	{
		return "Commonality-ItemTags";
	}
}