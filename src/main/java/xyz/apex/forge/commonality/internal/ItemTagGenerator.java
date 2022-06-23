package xyz.apex.forge.commonality.internal;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

import xyz.apex.forge.commonality.tags.ItemTags;

final class ItemTagGenerator extends ItemTagsProvider
{
	ItemTagGenerator(DataGenerator generator, BlockTagGenerator blockTagGenerator, ExistingFileHelper fileHelper)
	{
		super(generator, blockTagGenerator, DataSetup.ID, fileHelper);
	}

	@Override
	protected void addTags()
	{
		tag(ItemTags.Common.QUARTZ_ORES).add(Items.NETHER_QUARTZ_ORE);
		tag(ItemTags.Forge.ORES_QUARTZ).addTag(ItemTags.Common.QUARTZ_ORES);

		tag(ItemTags.Common.WEAPONS_BOW).add(Items.BOW);
		tag(ItemTags.Common.WEAPONS_CROSSBOW).add(Items.CROSSBOW);
		tag(ItemTags.Common.WEAPONS_SWORD).add(Items.WOODEN_SWORD, Items.STONE_SWORD, Items.GOLDEN_SWORD, Items.IRON_SWORD, Items.DIAMOND_SWORD, Items.NETHERITE_SWORD);

		tag(ItemTags.Common.WEAPONS).addTags(
				ItemTags.Common.WEAPONS_BOW,
				ItemTags.Common.WEAPONS_CROSSBOW,
				ItemTags.Common.WEAPONS_SWORD
		);

		tag(ItemTags.Common.TOOLS_PICKAXE).add(Items.WOODEN_PICKAXE, Items.STONE_PICKAXE, Items.GOLDEN_PICKAXE, Items.IRON_PICKAXE, Items.DIAMOND_PICKAXE, Items.NETHERITE_PICKAXE);
		tag(ItemTags.Common.TOOLS_AXE).add(Items.WOODEN_AXE, Items.STONE_AXE, Items.GOLDEN_AXE, Items.IRON_AXE, Items.DIAMOND_AXE, Items.NETHERITE_AXE);
		tag(ItemTags.Common.TOOLS_SHOVEL).add(Items.WOODEN_SHOVEL, Items.STONE_SHOVEL, Items.GOLDEN_SHOVEL, Items.IRON_SHOVEL, Items.DIAMOND_SHOVEL, Items.NETHERITE_SHOVEL);
		tag(ItemTags.Common.TOOLS_HOE).add(Items.WOODEN_HOE, Items.STONE_HOE, Items.GOLDEN_HOE, Items.IRON_HOE, Items.DIAMOND_HOE, Items.NETHERITE_HOE);
		tag(ItemTags.Common.TOOLS_WRENCH);

		tag(ItemTags.Common.TOOLS).addTags(
				ItemTags.Common.TOOLS_PICKAXE,
				ItemTags.Common.TOOLS_AXE,
				ItemTags.Common.TOOLS_SHOVEL,
				ItemTags.Common.TOOLS_HOE,
				ItemTags.Common.TOOLS_WRENCH
		);
	}

	@Override
	public String getName()
	{
		return "Commonality-ItemTags";
	}
}
