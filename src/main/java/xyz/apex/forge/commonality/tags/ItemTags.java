package xyz.apex.forge.commonality.tags;

import com.google.common.collect.ImmutableMap;

import net.minecraft.core.Registry;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import xyz.apex.forge.commonality.Mods;

import java.util.function.Function;

@SuppressWarnings("ALL")
public interface ItemTags
{
	interface Vanilla
	{
		TagKey<Item> WOOL = net.minecraft.tags.ItemTags.WOOL;
		TagKey<Item> PLANKS = net.minecraft.tags.ItemTags.PLANKS;
		TagKey<Item> STONE_BRICKS = net.minecraft.tags.ItemTags.STONE_BRICKS;
		TagKey<Item> WOODEN_BUTTONS = net.minecraft.tags.ItemTags.WOODEN_BUTTONS;
		TagKey<Item> BUTTONS = net.minecraft.tags.ItemTags.BUTTONS;
		TagKey<Item> CARPETS = net.minecraft.tags.ItemTags.CARPETS;
		TagKey<Item> WOODEN_DOORS = net.minecraft.tags.ItemTags.WOODEN_DOORS;
		TagKey<Item> WOODEN_STAIRS = net.minecraft.tags.ItemTags.WOODEN_STAIRS;
		TagKey<Item> WOODEN_SLABS = net.minecraft.tags.ItemTags.WOODEN_SLABS;
		TagKey<Item> WOODEN_FENCES = net.minecraft.tags.ItemTags.WOODEN_FENCES;
		TagKey<Item> WOODEN_PRESSURE_PLATES = net.minecraft.tags.ItemTags.WOODEN_PRESSURE_PLATES;
		TagKey<Item> WOODEN_TRAPDOORS = net.minecraft.tags.ItemTags.WOODEN_TRAPDOORS;
		TagKey<Item> DOORS = net.minecraft.tags.ItemTags.DOORS;
		TagKey<Item> SAPLINGS = net.minecraft.tags.ItemTags.SAPLINGS;
		TagKey<Item> LOGS_THAT_BURN = net.minecraft.tags.ItemTags.LOGS_THAT_BURN;
		TagKey<Item> LOGS = net.minecraft.tags.ItemTags.LOGS;
		TagKey<Item> DARK_OAK_LOGS = net.minecraft.tags.ItemTags.DARK_OAK_LOGS;
		TagKey<Item> OAK_LOGS = net.minecraft.tags.ItemTags.OAK_LOGS;
		TagKey<Item> BIRCH_LOGS = net.minecraft.tags.ItemTags.BIRCH_LOGS;
		TagKey<Item> ACACIA_LOGS = net.minecraft.tags.ItemTags.ACACIA_LOGS;
		TagKey<Item> JUNGLE_LOGS = net.minecraft.tags.ItemTags.JUNGLE_LOGS;
		TagKey<Item> SPRUCE_LOGS = net.minecraft.tags.ItemTags.SPRUCE_LOGS;
		TagKey<Item> CRIMSON_STEMS = net.minecraft.tags.ItemTags.CRIMSON_STEMS;
		TagKey<Item> WARPED_STEMS = net.minecraft.tags.ItemTags.WARPED_STEMS;
		TagKey<Item> BANNERS = net.minecraft.tags.ItemTags.BANNERS;
		TagKey<Item> SAND = net.minecraft.tags.ItemTags.SAND;
		TagKey<Item> STAIRS = net.minecraft.tags.ItemTags.STAIRS;
		TagKey<Item> SLABS = net.minecraft.tags.ItemTags.SLABS;
		TagKey<Item> WALLS = net.minecraft.tags.ItemTags.WALLS;
		TagKey<Item> ANVIL = net.minecraft.tags.ItemTags.ANVIL;
		TagKey<Item> RAILS = net.minecraft.tags.ItemTags.RAILS;
		TagKey<Item> LEAVES = net.minecraft.tags.ItemTags.LEAVES;
		TagKey<Item> TRAPDOORS = net.minecraft.tags.ItemTags.TRAPDOORS;
		TagKey<Item> SMALL_FLOWERS = net.minecraft.tags.ItemTags.SMALL_FLOWERS;
		TagKey<Item> BEDS = net.minecraft.tags.ItemTags.BEDS;
		TagKey<Item> FENCES = net.minecraft.tags.ItemTags.FENCES;
		TagKey<Item> TALL_FLOWERS = net.minecraft.tags.ItemTags.TALL_FLOWERS;
		TagKey<Item> FLOWERS = net.minecraft.tags.ItemTags.FLOWERS;
		TagKey<Item> PIGLIN_REPELLENTS = net.minecraft.tags.ItemTags.PIGLIN_REPELLENTS;
		TagKey<Item> PIGLIN_LOVED = net.minecraft.tags.ItemTags.PIGLIN_LOVED;
		TagKey<Item> IGNORED_BY_PIGLIN_BABIES = net.minecraft.tags.ItemTags.IGNORED_BY_PIGLIN_BABIES;
		TagKey<Item> PIGLIN_FOOD = net.minecraft.tags.ItemTags.PIGLIN_FOOD;
		TagKey<Item> FOX_FOOD = net.minecraft.tags.ItemTags.FOX_FOOD;
		TagKey<Item> GOLD_ORES = net.minecraft.tags.ItemTags.GOLD_ORES;
		TagKey<Item> IRON_ORES = net.minecraft.tags.ItemTags.IRON_ORES;
		TagKey<Item> DIAMOND_ORES = net.minecraft.tags.ItemTags.DIAMOND_ORES;
		TagKey<Item> REDSTONE_ORES = net.minecraft.tags.ItemTags.REDSTONE_ORES;
		TagKey<Item> LAPIS_ORES = net.minecraft.tags.ItemTags.LAPIS_ORES;
		TagKey<Item> COAL_ORES = net.minecraft.tags.ItemTags.COAL_ORES;
		TagKey<Item> EMERALD_ORES = net.minecraft.tags.ItemTags.EMERALD_ORES;
		TagKey<Item> COPPER_ORES = net.minecraft.tags.ItemTags.COPPER_ORES;
		TagKey<Item> NON_FLAMMABLE_WOOD = net.minecraft.tags.ItemTags.NON_FLAMMABLE_WOOD;
		TagKey<Item> SOUL_FIRE_BASE_BLOCKS = net.minecraft.tags.ItemTags.SOUL_FIRE_BASE_BLOCKS;
		TagKey<Item> CANDLES = net.minecraft.tags.ItemTags.CANDLES;
		TagKey<Item> DIRT = net.minecraft.tags.ItemTags.DIRT;
		TagKey<Item> TERRACOTTA = net.minecraft.tags.ItemTags.TERRACOTTA;
		TagKey<Item> BOATS = net.minecraft.tags.ItemTags.BOATS;
		TagKey<Item> FISHES = net.minecraft.tags.ItemTags.FISHES;
		TagKey<Item> SIGNS = net.minecraft.tags.ItemTags.SIGNS;
		TagKey<Item> MUSIC_DISCS = net.minecraft.tags.ItemTags.MUSIC_DISCS;
		TagKey<Item> CREEPER_DROP_MUSIC_DISCS = net.minecraft.tags.ItemTags.CREEPER_DROP_MUSIC_DISCS;
		TagKey<Item> COALS = net.minecraft.tags.ItemTags.COALS;
		TagKey<Item> ARROWS = net.minecraft.tags.ItemTags.ARROWS;
		TagKey<Item> LECTERN_BOOKS = net.minecraft.tags.ItemTags.LECTERN_BOOKS;
		TagKey<Item> BEACON_PAYMENT_ITEMS = net.minecraft.tags.ItemTags.BEACON_PAYMENT_ITEMS;
		TagKey<Item> STONE_TOOL_MATERIALS = net.minecraft.tags.ItemTags.STONE_TOOL_MATERIALS;
		TagKey<Item> STONE_CRAFTING_MATERIALS = net.minecraft.tags.ItemTags.STONE_CRAFTING_MATERIALS;
		TagKey<Item> FREEZE_IMMUNE_WEARABLES = net.minecraft.tags.ItemTags.FREEZE_IMMUNE_WEARABLES;
		TagKey<Item> AXOLOTL_TEMPT_ITEMS = net.minecraft.tags.ItemTags.AXOLOTL_TEMPT_ITEMS;
		TagKey<Item> OCCLUDES_VIBRATION_SIGNALS = net.minecraft.tags.ItemTags.OCCLUDES_VIBRATION_SIGNALS;
		TagKey<Item> CLUSTER_MAX_HARVESTABLES = net.minecraft.tags.ItemTags.CLUSTER_MAX_HARVESTABLES;
	}

	interface Forge
	{
		TagKey<Item> BARRELS = Tags.Items.BARRELS;
		TagKey<Item> BARRELS_WOODEN = Tags.Items.BARRELS_WOODEN;
		TagKey<Item> BONES = Tags.Items.BONES;
		TagKey<Item> BOOKSHELVES = Tags.Items.BOOKSHELVES;
		TagKey<Item> CHESTS = Tags.Items.CHESTS;
		TagKey<Item> CHESTS_ENDER = Tags.Items.CHESTS_ENDER;
		TagKey<Item> CHESTS_TRAPPED = Tags.Items.CHESTS_TRAPPED;
		TagKey<Item> CHESTS_WOODEN = Tags.Items.CHESTS_WOODEN;
		TagKey<Item> COBBLESTONE = Tags.Items.COBBLESTONE;
		TagKey<Item> COBBLESTONE_NORMAL = Tags.Items.COBBLESTONE_NORMAL;
		TagKey<Item> COBBLESTONE_INFESTED = Tags.Items.COBBLESTONE_INFESTED;
		TagKey<Item> COBBLESTONE_MOSSY = Tags.Items.COBBLESTONE_MOSSY;
		TagKey<Item> COBBLESTONE_DEEPSLATE = Tags.Items.COBBLESTONE_DEEPSLATE;
		TagKey<Item> CROPS = Tags.Items.CROPS;
		TagKey<Item> CROPS_BEETROOT = Tags.Items.CROPS_BEETROOT;
		TagKey<Item> CROPS_CARROT = Tags.Items.CROPS_CARROT;
		TagKey<Item> CROPS_NETHER_WART = Tags.Items.CROPS_NETHER_WART;
		TagKey<Item> CROPS_POTATO = Tags.Items.CROPS_POTATO;
		TagKey<Item> CROPS_WHEAT = Tags.Items.CROPS_WHEAT;
		TagKey<Item> DUSTS = Tags.Items.DUSTS;
		TagKey<Item> DUSTS_PRISMARINE = Tags.Items.DUSTS_PRISMARINE;
		TagKey<Item> DUSTS_REDSTONE = Tags.Items.DUSTS_REDSTONE;
		TagKey<Item> DUSTS_GLOWSTONE = Tags.Items.DUSTS_GLOWSTONE;
		TagKey<Item> DYES = Tags.Items.DYES;
		TagKey<Item> DYES_BLACK = Tags.Items.DYES_BLACK;
		TagKey<Item> DYES_RED = Tags.Items.DYES_RED;
		TagKey<Item> DYES_GREEN = Tags.Items.DYES_GREEN;
		TagKey<Item> DYES_BROWN = Tags.Items.DYES_BROWN;
		TagKey<Item> DYES_BLUE = Tags.Items.DYES_BLUE;
		TagKey<Item> DYES_PURPLE = Tags.Items.DYES_PURPLE;
		TagKey<Item> DYES_CYAN = Tags.Items.DYES_CYAN;
		TagKey<Item> DYES_LIGHT_GRAY = Tags.Items.DYES_LIGHT_GRAY;
		TagKey<Item> DYES_GRAY = Tags.Items.DYES_GRAY;
		TagKey<Item> DYES_PINK = Tags.Items.DYES_PINK;
		TagKey<Item> DYES_LIME = Tags.Items.DYES_LIME;
		TagKey<Item> DYES_YELLOW = Tags.Items.DYES_YELLOW;
		TagKey<Item> DYES_LIGHT_BLUE = Tags.Items.DYES_LIGHT_BLUE;
		TagKey<Item> DYES_MAGENTA = Tags.Items.DYES_MAGENTA;
		TagKey<Item> DYES_ORANGE = Tags.Items.DYES_ORANGE;
		TagKey<Item> DYES_WHITE = Tags.Items.DYES_WHITE;
		TagKey<Item> EGGS = Tags.Items.EGGS;
		TagKey<Item> ENCHANTING_FUELS = Tags.Items.ENCHANTING_FUELS;
		TagKey<Item> END_STONES = Tags.Items.END_STONES;
		TagKey<Item> ENDER_PEARLS = Tags.Items.ENDER_PEARLS;
		TagKey<Item> FEATHERS = Tags.Items.FEATHERS;
		TagKey<Item> FENCE_GATES = Tags.Items.FENCE_GATES;
		TagKey<Item> FENCE_GATES_WOODEN = Tags.Items.FENCE_GATES_WOODEN;
		TagKey<Item> FENCES = Tags.Items.FENCES;
		TagKey<Item> FENCES_NETHER_BRICK = Tags.Items.FENCES_NETHER_BRICK;
		TagKey<Item> FENCES_WOODEN = Tags.Items.FENCES_WOODEN;
		TagKey<Item> GEMS = Tags.Items.GEMS;
		TagKey<Item> GEMS_DIAMOND = Tags.Items.GEMS_DIAMOND;
		TagKey<Item> GEMS_EMERALD = Tags.Items.GEMS_EMERALD;
		TagKey<Item> GEMS_AMETHYST = Tags.Items.GEMS_AMETHYST;
		TagKey<Item> GEMS_LAPIS = Tags.Items.GEMS_LAPIS;
		TagKey<Item> GEMS_PRISMARINE = Tags.Items.GEMS_PRISMARINE;
		TagKey<Item> GEMS_QUARTZ = Tags.Items.GEMS_QUARTZ;
		TagKey<Item> GLASS = Tags.Items.GLASS;
		TagKey<Item> GLASS_BLACK = Tags.Items.GLASS_BLACK;
		TagKey<Item> GLASS_BLUE = Tags.Items.GLASS_BLUE;
		TagKey<Item> GLASS_BROWN = Tags.Items.GLASS_BROWN;
		TagKey<Item> GLASS_COLORLESS = Tags.Items.GLASS_COLORLESS;
		TagKey<Item> GLASS_CYAN = Tags.Items.GLASS_CYAN;
		TagKey<Item> GLASS_GRAY = Tags.Items.GLASS_GRAY;
		TagKey<Item> GLASS_GREEN = Tags.Items.GLASS_GREEN;
		TagKey<Item> GLASS_LIGHT_BLUE = Tags.Items.GLASS_LIGHT_BLUE;
		TagKey<Item> GLASS_LIGHT_GRAY = Tags.Items.GLASS_LIGHT_GRAY;
		TagKey<Item> GLASS_LIME = Tags.Items.GLASS_LIME;
		TagKey<Item> GLASS_MAGENTA = Tags.Items.GLASS_MAGENTA;
		TagKey<Item> GLASS_ORANGE = Tags.Items.GLASS_ORANGE;
		TagKey<Item> GLASS_PINK = Tags.Items.GLASS_PINK;
		TagKey<Item> GLASS_PURPLE = Tags.Items.GLASS_PURPLE;
		TagKey<Item> GLASS_RED = Tags.Items.GLASS_RED;
		TagKey<Item> GLASS_SILICA = Tags.Items.GLASS_SILICA;
		TagKey<Item> GLASS_TINTED = Tags.Items.GLASS_TINTED;
		TagKey<Item> GLASS_WHITE = Tags.Items.GLASS_WHITE;
		TagKey<Item> GLASS_YELLOW = Tags.Items.GLASS_YELLOW;
		TagKey<Item> GLASS_PANES = Tags.Items.GLASS_PANES;
		TagKey<Item> GLASS_PANES_BLACK = Tags.Items.GLASS_PANES_BLACK;
		TagKey<Item> GLASS_PANES_BLUE = Tags.Items.GLASS_PANES_BLUE;
		TagKey<Item> GLASS_PANES_BROWN = Tags.Items.GLASS_PANES_BROWN;
		TagKey<Item> GLASS_PANES_COLORLESS = Tags.Items.GLASS_PANES_COLORLESS;
		TagKey<Item> GLASS_PANES_CYAN = Tags.Items.GLASS_PANES_CYAN;
		TagKey<Item> GLASS_PANES_GRAY = Tags.Items.GLASS_PANES_GRAY;
		TagKey<Item> GLASS_PANES_GREEN = Tags.Items.GLASS_PANES_GREEN;
		TagKey<Item> GLASS_PANES_LIGHT_BLUE = Tags.Items.GLASS_PANES_LIGHT_BLUE;
		TagKey<Item> GLASS_PANES_LIGHT_GRAY = Tags.Items.GLASS_PANES_LIGHT_GRAY;
		TagKey<Item> GLASS_PANES_LIME = Tags.Items.GLASS_PANES_LIME;
		TagKey<Item> GLASS_PANES_MAGENTA = Tags.Items.GLASS_PANES_MAGENTA;
		TagKey<Item> GLASS_PANES_ORANGE = Tags.Items.GLASS_PANES_ORANGE;
		TagKey<Item> GLASS_PANES_PINK = Tags.Items.GLASS_PANES_PINK;
		TagKey<Item> GLASS_PANES_PURPLE = Tags.Items.GLASS_PANES_PURPLE;
		TagKey<Item> GLASS_PANES_RED = Tags.Items.GLASS_PANES_RED;
		TagKey<Item> GLASS_PANES_WHITE = Tags.Items.GLASS_PANES_WHITE;
		TagKey<Item> GLASS_PANES_YELLOW = Tags.Items.GLASS_PANES_YELLOW;
		TagKey<Item> GRAVEL = Tags.Items.GRAVEL;
		TagKey<Item> GUNPOWDER = Tags.Items.GUNPOWDER;
		TagKey<Item> HEADS = Tags.Items.HEADS;
		TagKey<Item> INGOTS = Tags.Items.INGOTS;
		TagKey<Item> INGOTS_BRICK = Tags.Items.INGOTS_BRICK;
		TagKey<Item> INGOTS_COPPER = Tags.Items.INGOTS_COPPER;
		TagKey<Item> INGOTS_GOLD = Tags.Items.INGOTS_GOLD;
		TagKey<Item> INGOTS_IRON = Tags.Items.INGOTS_IRON;
		TagKey<Item> INGOTS_NETHERITE = Tags.Items.INGOTS_NETHERITE;
		TagKey<Item> INGOTS_NETHER_BRICK = Tags.Items.INGOTS_NETHER_BRICK;
		TagKey<Item> LEATHER = Tags.Items.LEATHER;
		TagKey<Item> MUSHROOMS = Tags.Items.MUSHROOMS;
		TagKey<Item> NETHER_STARS = Tags.Items.NETHER_STARS;
		TagKey<Item> NETHERRACK = Tags.Items.NETHERRACK;
		TagKey<Item> NUGGETS = Tags.Items.NUGGETS;
		TagKey<Item> NUGGETS_GOLD = Tags.Items.NUGGETS_GOLD;
		TagKey<Item> NUGGETS_IRON = Tags.Items.NUGGETS_IRON;
		TagKey<Item> OBSIDIAN = Tags.Items.OBSIDIAN;
		TagKey<Item> ORE_BEARING_GROUND_DEEPSLATE = Tags.Items.ORE_BEARING_GROUND_DEEPSLATE;
		TagKey<Item> ORE_BEARING_GROUND_NETHERRACK = Tags.Items.ORE_BEARING_GROUND_NETHERRACK;
		TagKey<Item> ORE_BEARING_GROUND_STONE = Tags.Items.ORE_BEARING_GROUND_STONE;
		TagKey<Item> ORE_RATES_DENSE = Tags.Items.ORE_RATES_DENSE;
		TagKey<Item> ORE_RATES_SINGULAR = Tags.Items.ORE_RATES_SINGULAR;
		TagKey<Item> ORE_RATES_SPARSE = Tags.Items.ORE_RATES_SPARSE;
		TagKey<Item> ORES = Tags.Items.ORES;
		TagKey<Item> ORES_COAL = Tags.Items.ORES_COAL;
		TagKey<Item> ORES_COPPER = Tags.Items.ORES_COPPER;
		TagKey<Item> ORES_DIAMOND = Tags.Items.ORES_DIAMOND;
		TagKey<Item> ORES_EMERALD = Tags.Items.ORES_EMERALD;
		TagKey<Item> ORES_GOLD = Tags.Items.ORES_GOLD;
		TagKey<Item> ORES_IRON = Tags.Items.ORES_IRON;
		TagKey<Item> ORES_LAPIS = Tags.Items.ORES_LAPIS;
		TagKey<Item> ORES_NETHERITE_SCRAP = Tags.Items.ORES_NETHERITE_SCRAP;
		TagKey<Item> ORES_QUARTZ = Tags.Items.ORES_QUARTZ;
		TagKey<Item> ORES_REDSTONE = Tags.Items.ORES_REDSTONE;
		TagKey<Item> ORES_IN_GROUND_DEEPSLATE = Tags.Items.ORES_IN_GROUND_DEEPSLATE;
		TagKey<Item> ORES_IN_GROUND_NETHERRACK = Tags.Items.ORES_IN_GROUND_NETHERRACK;
		TagKey<Item> ORES_IN_GROUND_STONE = Tags.Items.ORES_IN_GROUND_STONE;
		TagKey<Item> RAW_MATERIALS = Tags.Items.RAW_MATERIALS;
		TagKey<Item> RAW_MATERIALS_COPPER = Tags.Items.RAW_MATERIALS_COPPER;
		TagKey<Item> RAW_MATERIALS_GOLD = Tags.Items.RAW_MATERIALS_GOLD;
		TagKey<Item> RAW_MATERIALS_IRON = Tags.Items.RAW_MATERIALS_IRON;
		TagKey<Item> RODS = Tags.Items.RODS;
		TagKey<Item> RODS_BLAZE = Tags.Items.RODS_BLAZE;
		TagKey<Item> RODS_WOODEN = Tags.Items.RODS_WOODEN;
		TagKey<Item> SAND = Tags.Items.SAND;
		TagKey<Item> SAND_COLORLESS = Tags.Items.SAND_COLORLESS;
		TagKey<Item> SAND_RED = Tags.Items.SAND_RED;
		TagKey<Item> SANDSTONE = Tags.Items.SANDSTONE;
		TagKey<Item> SEEDS = Tags.Items.SEEDS;
		TagKey<Item> SEEDS_BEETROOT = Tags.Items.SEEDS_BEETROOT;
		TagKey<Item> SEEDS_MELON = Tags.Items.SEEDS_MELON;
		TagKey<Item> SEEDS_PUMPKIN = Tags.Items.SEEDS_PUMPKIN;
		TagKey<Item> SEEDS_WHEAT = Tags.Items.SEEDS_WHEAT;
		TagKey<Item> SHEARS = Tags.Items.SHEARS;
		TagKey<Item> SLIMEBALLS = Tags.Items.SLIMEBALLS;
		TagKey<Item> STAINED_GLASS = Tags.Items.STAINED_GLASS;
		TagKey<Item> STAINED_GLASS_PANES = Tags.Items.STAINED_GLASS_PANES;
		TagKey<Item> STONE = Tags.Items.STONE;
		TagKey<Item> STORAGE_BLOCKS = Tags.Items.STORAGE_BLOCKS;
		TagKey<Item> STORAGE_BLOCKS_AMETHYST = Tags.Items.STORAGE_BLOCKS_AMETHYST;
		TagKey<Item> STORAGE_BLOCKS_COAL = Tags.Items.STORAGE_BLOCKS_COAL;
		TagKey<Item> STORAGE_BLOCKS_COPPER = Tags.Items.STORAGE_BLOCKS_COPPER;
		TagKey<Item> STORAGE_BLOCKS_DIAMOND = Tags.Items.STORAGE_BLOCKS_DIAMOND;
		TagKey<Item> STORAGE_BLOCKS_EMERALD = Tags.Items.STORAGE_BLOCKS_EMERALD;
		TagKey<Item> STORAGE_BLOCKS_GOLD = Tags.Items.STORAGE_BLOCKS_GOLD;
		TagKey<Item> STORAGE_BLOCKS_IRON = Tags.Items.STORAGE_BLOCKS_IRON;
		TagKey<Item> STORAGE_BLOCKS_LAPIS = Tags.Items.STORAGE_BLOCKS_LAPIS;
		TagKey<Item> STORAGE_BLOCKS_NETHERITE = Tags.Items.STORAGE_BLOCKS_NETHERITE;
		TagKey<Item> STORAGE_BLOCKS_QUARTZ = Tags.Items.STORAGE_BLOCKS_QUARTZ;
		TagKey<Item> STORAGE_BLOCKS_RAW_COPPER = Tags.Items.STORAGE_BLOCKS_RAW_COPPER;
		TagKey<Item> STORAGE_BLOCKS_RAW_GOLD = Tags.Items.STORAGE_BLOCKS_RAW_GOLD;
		TagKey<Item> STORAGE_BLOCKS_RAW_IRON = Tags.Items.STORAGE_BLOCKS_RAW_IRON;
		TagKey<Item> STORAGE_BLOCKS_REDSTONE = Tags.Items.STORAGE_BLOCKS_REDSTONE;
		TagKey<Item> STRING = Tags.Items.STRING;
	}

	interface Common
	{
		TagKey<Item> QUARTZ_ORES = vanillaTag("quartz_ores");

		TagKey<Item> WEAPONS = forgeTag("weapons");
		TagKey<Item> WEAPONS_BOW = forgeTag("weapons/bow");
		TagKey<Item> WEAPONS_CROSSBOW = forgeTag("weapons/crossbow");
		TagKey<Item> WEAPONS_SWORD = forgeTag("weapons/sword");

		TagKey<Item> TOOLS = forgeTag("tools");
		TagKey<Item> TOOLS_PICKAXE = forgeTag("tools/pickaxe");
		TagKey<Item> TOOLS_AXE = forgeTag("tools/axe");
		TagKey<Item> TOOLS_SHOVEL = forgeTag("tools/shovel");
		TagKey<Item> TOOLS_HOE = forgeTag("tools/hoe");
		TagKey<Item> TOOLS_WRENCH = forgeTag("tools/wrench");

		// Creative Mode Tabs
		TagKey<Item> ITEM_GROUPS = tag(Mods.COMMONALITY, "item_groups");
		TagKey<Item> ITEM_GROUPS_BUILDING_BLOCKS = tag(Mods.COMMONALITY, "item_groups/building_blocks");
		TagKey<Item> ITEM_GROUPS_DECORATIONS = tag(Mods.COMMONALITY, "item_groups/decorations");
		TagKey<Item> ITEM_GROUPS_REDSTONE = tag(Mods.COMMONALITY, "item_groups/redstone");
		TagKey<Item> ITEM_GROUPS_TRANSPORTATION = tag(Mods.COMMONALITY, "item_groups/transportation");
		TagKey<Item> ITEM_GROUPS_MISC = tag(Mods.COMMONALITY, "item_groups/misc");
		TagKey<Item> ITEM_GROUPS_FOOD = tag(Mods.COMMONALITY, "item_groups/food");
		TagKey<Item> ITEM_GROUPS_TOOLS = tag(Mods.COMMONALITY, "item_groups/tools");
		TagKey<Item> ITEM_GROUPS_COMBAT = tag(Mods.COMMONALITY, "item_groups/combat");
		TagKey<Item> ITEM_GROUPS_BREWING = tag(Mods.COMMONALITY, "item_groups/brewing");
	}

	static TagKey<Item> tag(String namespace, String path)
	{
		return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(namespace, path));
	}

	static TagKey<Item> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<Item> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}

	/**
	 * Register Creative Mode Tab <-> Item Tag entries for all Items from a given mod
	 * <p>
	 * Call from your ItemTagsProvider#addTags method<br>
	 * <pre>{@code ItemTags.registerItemGroupTags("my_mod_id", this::tag)}</pre>
	 *
	 * If you are using Registrate, you can do something similar to the following<br>
	 * <pre>{@code MyMod.registrate().addDataGenerator(ProviderType.ITEM_TAGS, provider -> ItemTags.registerItemGroupTags("my_mod_id", provider::tag));}</pre>
	 *
	 * @param modId Mod ID to register Creative Mode Tab ItemTags for
	 * @param tagBuilder Factory method used to obtain Tag Builder instances (This should be a method reference to {@link TagsProvider#tag(TagKey)})
	 */
	static void registerItemGroupTags(String modId, Function<TagKey<Item>, TagsProvider.TagAppender<Item>> tagBuilder)
	{
		var itemGroupTagMap = ImmutableMap.of(
				CreativeModeTab.TAB_BUILDING_BLOCKS,
				Common.ITEM_GROUPS_BUILDING_BLOCKS,

				CreativeModeTab.TAB_DECORATIONS,
				Common.ITEM_GROUPS_DECORATIONS,

				CreativeModeTab.TAB_REDSTONE,
				Common.ITEM_GROUPS_REDSTONE,

				CreativeModeTab.TAB_TRANSPORTATION,
				Common.ITEM_GROUPS_TRANSPORTATION,

				CreativeModeTab.TAB_MISC,
				Common.ITEM_GROUPS_MISC,

				CreativeModeTab.TAB_FOOD,
				Common.ITEM_GROUPS_FOOD,

				CreativeModeTab.TAB_TOOLS,
				Common.ITEM_GROUPS_TOOLS,

				CreativeModeTab.TAB_COMBAT,
				Common.ITEM_GROUPS_COMBAT,

				CreativeModeTab.TAB_BREWING,
				Common.ITEM_GROUPS_BREWING
		);

		for(var item : ForgeRegistries.ITEMS)
		{
			var registryName = ForgeRegistries.ITEMS.getKey(item);

			if(registryName != null && registryName.getNamespace().equals(modId))
			{
				var itemGroup = item.getItemCategory();

				if(itemGroup != null)
				{
					var tag = itemGroupTagMap.get(itemGroup);

					if(tag == null)
						continue;

					tagBuilder.apply(tag).add(item);
				}

				for(var otherItemGroup : item.getCreativeTabs())
				{
					if(otherItemGroup != null)
					{
						if(itemGroup != null && itemGroup == otherItemGroup)
							continue;

						var tag = itemGroupTagMap.get(otherItemGroup);

						if(tag != null)
							tagBuilder.apply(tag).add(item);
					}
				}
			}
		}
	}
}