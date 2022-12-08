package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface BlockTags
{
	interface Vanilla
	{
		TagKey<Block> WOOL = net.minecraft.tags.BlockTags.WOOL;
		TagKey<Block> PLANKS = net.minecraft.tags.BlockTags.PLANKS;
		TagKey<Block> STONE_BRICKS = net.minecraft.tags.BlockTags.STONE_BRICKS;
		TagKey<Block> WOODEN_BUTTONS = net.minecraft.tags.BlockTags.WOODEN_BUTTONS;
		TagKey<Block> BUTTONS = net.minecraft.tags.BlockTags.BUTTONS;
		TagKey<Block> WOOL_CARPETS = net.minecraft.tags.BlockTags.WOOL_CARPETS;
		TagKey<Block> WOODEN_DOORS = net.minecraft.tags.BlockTags.WOODEN_DOORS;
		TagKey<Block> WOODEN_STAIRS = net.minecraft.tags.BlockTags.WOODEN_STAIRS;
		TagKey<Block> WOODEN_SLABS = net.minecraft.tags.BlockTags.WOODEN_SLABS;
		TagKey<Block> WOODEN_FENCES = net.minecraft.tags.BlockTags.WOODEN_FENCES;
		TagKey<Block> PRESSURE_PLATES = net.minecraft.tags.BlockTags.PRESSURE_PLATES;
		TagKey<Block> WOODEN_PRESSURE_PLATES = net.minecraft.tags.BlockTags.WOODEN_PRESSURE_PLATES;
		TagKey<Block> STONE_PRESSURE_PLATES = net.minecraft.tags.BlockTags.STONE_PRESSURE_PLATES;
		TagKey<Block> WOODEN_TRAPDOORS = net.minecraft.tags.BlockTags.WOODEN_TRAPDOORS;
		TagKey<Block> DOORS = net.minecraft.tags.BlockTags.DOORS;
		TagKey<Block> SAPLINGS = net.minecraft.tags.BlockTags.SAPLINGS;
		TagKey<Block> LOGS_THAT_BURN = net.minecraft.tags.BlockTags.LOGS_THAT_BURN;
		TagKey<Block> OVERWORLD_NATURAL_LOGS = net.minecraft.tags.BlockTags.OVERWORLD_NATURAL_LOGS;
		TagKey<Block> LOGS = net.minecraft.tags.BlockTags.LOGS;
		TagKey<Block> DARK_OAK_LOGS = net.minecraft.tags.BlockTags.DARK_OAK_LOGS;
		TagKey<Block> OAK_LOGS = net.minecraft.tags.BlockTags.OAK_LOGS;
		TagKey<Block> BIRCH_LOGS = net.minecraft.tags.BlockTags.BIRCH_LOGS;
		TagKey<Block> ACACIA_LOGS = net.minecraft.tags.BlockTags.ACACIA_LOGS;
		TagKey<Block> JUNGLE_LOGS = net.minecraft.tags.BlockTags.JUNGLE_LOGS;
		TagKey<Block> SPRUCE_LOGS = net.minecraft.tags.BlockTags.SPRUCE_LOGS;
		TagKey<Block> MANGROVE_LOGS = net.minecraft.tags.BlockTags.MANGROVE_LOGS;
		TagKey<Block> CRIMSON_STEMS = net.minecraft.tags.BlockTags.CRIMSON_STEMS;
		TagKey<Block> WARPED_STEMS = net.minecraft.tags.BlockTags.WARPED_STEMS;
		TagKey<Block> BAMBOO_BLOCKS = net.minecraft.tags.BlockTags.BAMBOO_BLOCKS;
		TagKey<Block> WART_BLOCKS = net.minecraft.tags.BlockTags.WART_BLOCKS;
		TagKey<Block> BANNERS = net.minecraft.tags.BlockTags.BANNERS;
		TagKey<Block> SAND = net.minecraft.tags.BlockTags.SAND;
		TagKey<Block> STAIRS = net.minecraft.tags.BlockTags.STAIRS;
		TagKey<Block> SLABS = net.minecraft.tags.BlockTags.SLABS;
		TagKey<Block> WALLS = net.minecraft.tags.BlockTags.WALLS;
		TagKey<Block> ANVIL = net.minecraft.tags.BlockTags.ANVIL;
		TagKey<Block> RAILS = net.minecraft.tags.BlockTags.RAILS;
		TagKey<Block> LEAVES = net.minecraft.tags.BlockTags.LEAVES;
		TagKey<Block> TRAPDOORS = net.minecraft.tags.BlockTags.TRAPDOORS;
		TagKey<Block> SMALL_FLOWERS = net.minecraft.tags.BlockTags.SMALL_FLOWERS;
		TagKey<Block> BEDS = net.minecraft.tags.BlockTags.BEDS;
		TagKey<Block> FENCES = net.minecraft.tags.BlockTags.FENCES;
		TagKey<Block> TALL_FLOWERS = net.minecraft.tags.BlockTags.TALL_FLOWERS;
		TagKey<Block> FLOWERS = net.minecraft.tags.BlockTags.FLOWERS;
		TagKey<Block> PIGLIN_REPELLENTS = net.minecraft.tags.BlockTags.PIGLIN_REPELLENTS;
		TagKey<Block> GOLD_ORES = net.minecraft.tags.BlockTags.GOLD_ORES;
		TagKey<Block> IRON_ORES = net.minecraft.tags.BlockTags.IRON_ORES;
		TagKey<Block> DIAMOND_ORES = net.minecraft.tags.BlockTags.DIAMOND_ORES;
		TagKey<Block> REDSTONE_ORES = net.minecraft.tags.BlockTags.REDSTONE_ORES;
		TagKey<Block> LAPIS_ORES = net.minecraft.tags.BlockTags.LAPIS_ORES;
		TagKey<Block> COAL_ORES = net.minecraft.tags.BlockTags.COAL_ORES;
		TagKey<Block> EMERALD_ORES = net.minecraft.tags.BlockTags.EMERALD_ORES;
		TagKey<Block> COPPER_ORES = net.minecraft.tags.BlockTags.COPPER_ORES;
		TagKey<Block> CANDLES = net.minecraft.tags.BlockTags.CANDLES;
		TagKey<Block> DIRT = net.minecraft.tags.BlockTags.DIRT;
		TagKey<Block> TERRACOTTA = net.minecraft.tags.BlockTags.TERRACOTTA;
		TagKey<Block> COMPLETES_FIND_TREE_TUTORIAL = net.minecraft.tags.BlockTags.COMPLETES_FIND_TREE_TUTORIAL;
		TagKey<Block> FLOWER_POTS = net.minecraft.tags.BlockTags.FLOWER_POTS;
		TagKey<Block> ENDERMAN_HOLDABLE = net.minecraft.tags.BlockTags.ENDERMAN_HOLDABLE;
		TagKey<Block> ICE = net.minecraft.tags.BlockTags.ICE;
		TagKey<Block> VALID_SPAWN = net.minecraft.tags.BlockTags.VALID_SPAWN;
		TagKey<Block> IMPERMEABLE = net.minecraft.tags.BlockTags.IMPERMEABLE;
		TagKey<Block> UNDERWATER_BONEMEALS = net.minecraft.tags.BlockTags.UNDERWATER_BONEMEALS;
		TagKey<Block> CORAL_BLOCKS = net.minecraft.tags.BlockTags.CORAL_BLOCKS;
		TagKey<Block> WALL_CORALS = net.minecraft.tags.BlockTags.WALL_CORALS;
		TagKey<Block> CORAL_PLANTS = net.minecraft.tags.BlockTags.CORAL_PLANTS;
		TagKey<Block> CORALS = net.minecraft.tags.BlockTags.CORALS;
		TagKey<Block> BAMBOO_PLANTABLE_ON = net.minecraft.tags.BlockTags.BAMBOO_PLANTABLE_ON;
		TagKey<Block> STANDING_SIGNS = net.minecraft.tags.BlockTags.STANDING_SIGNS;
		TagKey<Block> WALL_SIGNS = net.minecraft.tags.BlockTags.WALL_SIGNS;
		TagKey<Block> SIGNS = net.minecraft.tags.BlockTags.SIGNS;
		TagKey<Block> CEILING_HANGING_SIGNS = net.minecraft.tags.BlockTags.CEILING_HANGING_SIGNS;
		TagKey<Block> WALL_HANGING_SIGNS = net.minecraft.tags.BlockTags.WALL_HANGING_SIGNS;
		TagKey<Block> ALL_HANGING_SIGNS = net.minecraft.tags.BlockTags.ALL_HANGING_SIGNS;
		TagKey<Block> ALL_SIGNS = net.minecraft.tags.BlockTags.ALL_SIGNS;
		TagKey<Block> DRAGON_IMMUNE = net.minecraft.tags.BlockTags.DRAGON_IMMUNE;
		TagKey<Block> DRAGON_TRANSPARENT = net.minecraft.tags.BlockTags.DRAGON_TRANSPARENT;
		TagKey<Block> WITHER_IMMUNE = net.minecraft.tags.BlockTags.WITHER_IMMUNE;
		TagKey<Block> WITHER_SUMMON_BASE_BLOCKS = net.minecraft.tags.BlockTags.WITHER_SUMMON_BASE_BLOCKS;
		TagKey<Block> BEEHIVES = net.minecraft.tags.BlockTags.BEEHIVES;
		TagKey<Block> CROPS = net.minecraft.tags.BlockTags.CROPS;
		TagKey<Block> BEE_GROWABLES = net.minecraft.tags.BlockTags.BEE_GROWABLES;
		TagKey<Block> PORTALS = net.minecraft.tags.BlockTags.PORTALS;
		TagKey<Block> FIRE = net.minecraft.tags.BlockTags.FIRE;
		TagKey<Block> NYLIUM = net.minecraft.tags.BlockTags.NYLIUM;
		TagKey<Block> BEACON_BASE_BLOCKS = net.minecraft.tags.BlockTags.BEACON_BASE_BLOCKS;
		TagKey<Block> SOUL_SPEED_BLOCKS = net.minecraft.tags.BlockTags.SOUL_SPEED_BLOCKS;
		TagKey<Block> WALL_POST_OVERRIDE = net.minecraft.tags.BlockTags.WALL_POST_OVERRIDE;
		TagKey<Block> CLIMBABLE = net.minecraft.tags.BlockTags.CLIMBABLE;
		TagKey<Block> FALL_DAMAGE_RESETTING = net.minecraft.tags.BlockTags.FALL_DAMAGE_RESETTING;
		TagKey<Block> SHULKER_BOXES = net.minecraft.tags.BlockTags.SHULKER_BOXES;
		TagKey<Block> HOGLIN_REPELLENTS = net.minecraft.tags.BlockTags.HOGLIN_REPELLENTS;
		TagKey<Block> SOUL_FIRE_BASE_BLOCKS = net.minecraft.tags.BlockTags.SOUL_FIRE_BASE_BLOCKS;
		TagKey<Block> STRIDER_WARM_BLOCKS = net.minecraft.tags.BlockTags.STRIDER_WARM_BLOCKS;
		TagKey<Block> CAMPFIRES = net.minecraft.tags.BlockTags.CAMPFIRES;
		TagKey<Block> GUARDED_BY_PIGLINS = net.minecraft.tags.BlockTags.GUARDED_BY_PIGLINS;
		TagKey<Block> PREVENT_MOB_SPAWNING_INSIDE = net.minecraft.tags.BlockTags.PREVENT_MOB_SPAWNING_INSIDE;
		TagKey<Block> FENCE_GATES = net.minecraft.tags.BlockTags.FENCE_GATES;
		TagKey<Block> UNSTABLE_BOTTOM_CENTER = net.minecraft.tags.BlockTags.UNSTABLE_BOTTOM_CENTER;
		TagKey<Block> MUSHROOM_GROW_BLOCK = net.minecraft.tags.BlockTags.MUSHROOM_GROW_BLOCK;
		TagKey<Block> INFINIBURN_OVERWORLD = net.minecraft.tags.BlockTags.INFINIBURN_OVERWORLD;
		TagKey<Block> INFINIBURN_NETHER = net.minecraft.tags.BlockTags.INFINIBURN_NETHER;
		TagKey<Block> INFINIBURN_END = net.minecraft.tags.BlockTags.INFINIBURN_END;
		TagKey<Block> BASE_STONE_OVERWORLD = net.minecraft.tags.BlockTags.BASE_STONE_OVERWORLD;
		TagKey<Block> STONE_ORE_REPLACEABLES = net.minecraft.tags.BlockTags.STONE_ORE_REPLACEABLES;
		TagKey<Block> DEEPSLATE_ORE_REPLACEABLES = net.minecraft.tags.BlockTags.DEEPSLATE_ORE_REPLACEABLES;
		TagKey<Block> BASE_STONE_NETHER = net.minecraft.tags.BlockTags.BASE_STONE_NETHER;
		TagKey<Block> OVERWORLD_CARVER_REPLACEABLES = net.minecraft.tags.BlockTags.OVERWORLD_CARVER_REPLACEABLES;
		TagKey<Block> NETHER_CARVER_REPLACEABLES = net.minecraft.tags.BlockTags.NETHER_CARVER_REPLACEABLES;
		TagKey<Block> CANDLE_CAKES = net.minecraft.tags.BlockTags.CANDLE_CAKES;
		TagKey<Block> CAULDRONS = net.minecraft.tags.BlockTags.CAULDRONS;
		TagKey<Block> CRYSTAL_SOUND_BLOCKS = net.minecraft.tags.BlockTags.CRYSTAL_SOUND_BLOCKS;
		TagKey<Block> INSIDE_STEP_SOUND_BLOCKS = net.minecraft.tags.BlockTags.INSIDE_STEP_SOUND_BLOCKS;
		TagKey<Block> OCCLUDES_VIBRATION_SIGNALS = net.minecraft.tags.BlockTags.OCCLUDES_VIBRATION_SIGNALS;
		TagKey<Block> DAMPENS_VIBRATIONS = net.minecraft.tags.BlockTags.DAMPENS_VIBRATIONS;
		TagKey<Block> DRIPSTONE_REPLACEABLE = net.minecraft.tags.BlockTags.DRIPSTONE_REPLACEABLE;
		TagKey<Block> CAVE_VINES = net.minecraft.tags.BlockTags.CAVE_VINES;
		TagKey<Block> MOSS_REPLACEABLE = net.minecraft.tags.BlockTags.MOSS_REPLACEABLE;
		TagKey<Block> LUSH_GROUND_REPLACEABLE = net.minecraft.tags.BlockTags.LUSH_GROUND_REPLACEABLE;
		TagKey<Block> AZALEA_ROOT_REPLACEABLE = net.minecraft.tags.BlockTags.AZALEA_ROOT_REPLACEABLE;
		TagKey<Block> SMALL_DRIPLEAF_PLACEABLE = net.minecraft.tags.BlockTags.SMALL_DRIPLEAF_PLACEABLE;
		TagKey<Block> BIG_DRIPLEAF_PLACEABLE = net.minecraft.tags.BlockTags.BIG_DRIPLEAF_PLACEABLE;
		TagKey<Block> SNOW = net.minecraft.tags.BlockTags.SNOW;
		TagKey<Block> MINEABLE_WITH_AXE = net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE;
		TagKey<Block> MINEABLE_WITH_HOE = net.minecraft.tags.BlockTags.MINEABLE_WITH_HOE;
		TagKey<Block> MINEABLE_WITH_PICKAXE = net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE;
		TagKey<Block> MINEABLE_WITH_SHOVEL = net.minecraft.tags.BlockTags.MINEABLE_WITH_SHOVEL;
		TagKey<Block> NEEDS_DIAMOND_TOOL = net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL;
		TagKey<Block> NEEDS_IRON_TOOL = net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL;
		TagKey<Block> NEEDS_STONE_TOOL = net.minecraft.tags.BlockTags.NEEDS_STONE_TOOL;
		TagKey<Block> FEATURES_CANNOT_REPLACE = net.minecraft.tags.BlockTags.FEATURES_CANNOT_REPLACE;
		TagKey<Block> LAVA_POOL_STONE_CANNOT_REPLACE = net.minecraft.tags.BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE;
		TagKey<Block> GEODE_INVALID_BLOCKS = net.minecraft.tags.BlockTags.GEODE_INVALID_BLOCKS;
		TagKey<Block> FROG_PREFER_JUMP_TO = net.minecraft.tags.BlockTags.FROG_PREFER_JUMP_TO;
		TagKey<Block> SCULK_REPLACEABLE = net.minecraft.tags.BlockTags.SCULK_REPLACEABLE;
		TagKey<Block> SCULK_REPLACEABLE_WORLD_GEN = net.minecraft.tags.BlockTags.SCULK_REPLACEABLE_WORLD_GEN;
		TagKey<Block> ANCIENT_CITY_REPLACEABLE = net.minecraft.tags.BlockTags.ANCIENT_CITY_REPLACEABLE;
		TagKey<Block> ANIMALS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.ANIMALS_SPAWNABLE_ON;
		TagKey<Block> AXOLOTLS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.AXOLOTLS_SPAWNABLE_ON;
		TagKey<Block> GOATS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.GOATS_SPAWNABLE_ON;
		TagKey<Block> MOOSHROOMS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.MOOSHROOMS_SPAWNABLE_ON;
		TagKey<Block> PARROTS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.PARROTS_SPAWNABLE_ON;
		TagKey<Block> POLAR_BEARS_SPAWNABLE_ON_ALTERNATE = net.minecraft.tags.BlockTags.POLAR_BEARS_SPAWNABLE_ON_ALTERNATE;
		TagKey<Block> RABBITS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.RABBITS_SPAWNABLE_ON;
		TagKey<Block> FOXES_SPAWNABLE_ON = net.minecraft.tags.BlockTags.FOXES_SPAWNABLE_ON;
		TagKey<Block> WOLVES_SPAWNABLE_ON = net.minecraft.tags.BlockTags.WOLVES_SPAWNABLE_ON;
		TagKey<Block> FROGS_SPAWNABLE_ON = net.minecraft.tags.BlockTags.FROGS_SPAWNABLE_ON;
		TagKey<Block> AZALEA_GROWS_ON = net.minecraft.tags.BlockTags.AZALEA_GROWS_ON;
		TagKey<Block> REPLACEABLE_PLANTS = net.minecraft.tags.BlockTags.REPLACEABLE_PLANTS;
		TagKey<Block> CONVERTABLE_TO_MUD = net.minecraft.tags.BlockTags.CONVERTABLE_TO_MUD;
		TagKey<Block> MANGROVE_LOGS_CAN_GROW_THROUGH = net.minecraft.tags.BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH;
		TagKey<Block> MANGROVE_ROOTS_CAN_GROW_THROUGH = net.minecraft.tags.BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH;
		TagKey<Block> DEAD_BUSH_MAY_PLACE_ON = net.minecraft.tags.BlockTags.DEAD_BUSH_MAY_PLACE_ON;
		TagKey<Block> SNAPS_GOAT_HORN = net.minecraft.tags.BlockTags.SNAPS_GOAT_HORN;
		TagKey<Block> SNOW_LAYER_CANNOT_SURVIVE_ON = net.minecraft.tags.BlockTags.SNOW_LAYER_CANNOT_SURVIVE_ON;
		TagKey<Block> SNOW_LAYER_CAN_SURVIVE_ON = net.minecraft.tags.BlockTags.SNOW_LAYER_CAN_SURVIVE_ON;
		TagKey<Block> INVALID_SPAWN_INSIDE = net.minecraft.tags.BlockTags.INVALID_SPAWN_INSIDE;
	}

	interface Forge
	{
		TagKey<Block> BARRELS = Tags.Blocks.BARRELS;
		TagKey<Block> BARRELS_WOODEN = Tags.Blocks.BARRELS_WOODEN;
		TagKey<Block> BOOKSHELVES = Tags.Blocks.BOOKSHELVES;
		TagKey<Block> CHESTS = Tags.Blocks.CHESTS;
		TagKey<Block> CHESTS_ENDER = Tags.Blocks.CHESTS_ENDER;
		TagKey<Block> CHESTS_TRAPPED = Tags.Blocks.CHESTS_TRAPPED;
		TagKey<Block> CHESTS_WOODEN = Tags.Blocks.CHESTS_WOODEN;
		TagKey<Block> COBBLESTONE = Tags.Blocks.COBBLESTONE;
		TagKey<Block> COBBLESTONE_NORMAL = Tags.Blocks.COBBLESTONE_NORMAL;
		TagKey<Block> COBBLESTONE_INFESTED = Tags.Blocks.COBBLESTONE_INFESTED;
		TagKey<Block> COBBLESTONE_MOSSY = Tags.Blocks.COBBLESTONE_MOSSY;
		TagKey<Block> COBBLESTONE_DEEPSLATE = Tags.Blocks.COBBLESTONE_DEEPSLATE;
		TagKey<Block> END_STONES = Tags.Blocks.END_STONES;
		TagKey<Block> ENDERMAN_PLACE_ON_BLACKLIST = Tags.Blocks.ENDERMAN_PLACE_ON_BLACKLIST;
		TagKey<Block> FENCE_GATES = Tags.Blocks.FENCE_GATES;
		TagKey<Block> FENCE_GATES_WOODEN = Tags.Blocks.FENCE_GATES_WOODEN;
		TagKey<Block> FENCES = Tags.Blocks.FENCES;
		TagKey<Block> FENCES_NETHER_BRICK = Tags.Blocks.FENCES_NETHER_BRICK;
		TagKey<Block> FENCES_WOODEN = Tags.Blocks.FENCES_WOODEN;
		TagKey<Block> GLASS = Tags.Blocks.GLASS;
		TagKey<Block> GLASS_BLACK = Tags.Blocks.GLASS_BLACK;
		TagKey<Block> GLASS_BLUE = Tags.Blocks.GLASS_BLUE;
		TagKey<Block> GLASS_BROWN = Tags.Blocks.GLASS_BROWN;
		TagKey<Block> GLASS_COLORLESS = Tags.Blocks.GLASS_COLORLESS;
		TagKey<Block> GLASS_CYAN = Tags.Blocks.GLASS_CYAN;
		TagKey<Block> GLASS_GRAY = Tags.Blocks.GLASS_GRAY;
		TagKey<Block> GLASS_GREEN = Tags.Blocks.GLASS_GREEN;
		TagKey<Block> GLASS_LIGHT_BLUE = Tags.Blocks.GLASS_LIGHT_BLUE;
		TagKey<Block> GLASS_LIGHT_GRAY = Tags.Blocks.GLASS_LIGHT_GRAY;
		TagKey<Block> GLASS_LIME = Tags.Blocks.GLASS_LIME;
		TagKey<Block> GLASS_MAGENTA = Tags.Blocks.GLASS_MAGENTA;
		TagKey<Block> GLASS_ORANGE = Tags.Blocks.GLASS_ORANGE;
		TagKey<Block> GLASS_PINK = Tags.Blocks.GLASS_PINK;
		TagKey<Block> GLASS_PURPLE = Tags.Blocks.GLASS_PURPLE;
		TagKey<Block> GLASS_RED = Tags.Blocks.GLASS_RED;
		TagKey<Block> GLASS_SILICA = Tags.Blocks.GLASS_SILICA;
		TagKey<Block> GLASS_TINTED = Tags.Blocks.GLASS_TINTED;
		TagKey<Block> GLASS_WHITE = Tags.Blocks.GLASS_WHITE;
		TagKey<Block> GLASS_YELLOW = Tags.Blocks.GLASS_YELLOW;
		TagKey<Block> GLASS_PANES = Tags.Blocks.GLASS_PANES;
		TagKey<Block> GLASS_PANES_BLACK = Tags.Blocks.GLASS_PANES_BLACK;
		TagKey<Block> GLASS_PANES_BLUE = Tags.Blocks.GLASS_PANES_BLUE;
		TagKey<Block> GLASS_PANES_BROWN = Tags.Blocks.GLASS_PANES_BROWN;
		TagKey<Block> GLASS_PANES_COLORLESS = Tags.Blocks.GLASS_PANES_COLORLESS;
		TagKey<Block> GLASS_PANES_CYAN = Tags.Blocks.GLASS_PANES_CYAN;
		TagKey<Block> GLASS_PANES_GRAY = Tags.Blocks.GLASS_PANES_GRAY;
		TagKey<Block> GLASS_PANES_GREEN = Tags.Blocks.GLASS_PANES_GREEN;
		TagKey<Block> GLASS_PANES_LIGHT_BLUE = Tags.Blocks.GLASS_PANES_LIGHT_BLUE;
		TagKey<Block> GLASS_PANES_LIGHT_GRAY = Tags.Blocks.GLASS_PANES_LIGHT_GRAY;
		TagKey<Block> GLASS_PANES_LIME = Tags.Blocks.GLASS_PANES_LIME;
		TagKey<Block> GLASS_PANES_MAGENTA = Tags.Blocks.GLASS_PANES_MAGENTA;
		TagKey<Block> GLASS_PANES_ORANGE = Tags.Blocks.GLASS_PANES_ORANGE;
		TagKey<Block> GLASS_PANES_PINK = Tags.Blocks.GLASS_PANES_PINK;
		TagKey<Block> GLASS_PANES_PURPLE = Tags.Blocks.GLASS_PANES_PURPLE;
		TagKey<Block> GLASS_PANES_RED = Tags.Blocks.GLASS_PANES_RED;
		TagKey<Block> GLASS_PANES_WHITE = Tags.Blocks.GLASS_PANES_WHITE;
		TagKey<Block> GLASS_PANES_YELLOW = Tags.Blocks.GLASS_PANES_YELLOW;
		TagKey<Block> GRAVEL = Tags.Blocks.GRAVEL;
		TagKey<Block> NETHERRACK = Tags.Blocks.NETHERRACK;
		TagKey<Block> OBSIDIAN = Tags.Blocks.OBSIDIAN;
		TagKey<Block> ORE_BEARING_GROUND_DEEPSLATE = Tags.Blocks.ORE_BEARING_GROUND_DEEPSLATE;
		TagKey<Block> ORE_BEARING_GROUND_NETHERRACK = Tags.Blocks.ORE_BEARING_GROUND_NETHERRACK;
		TagKey<Block> ORE_BEARING_GROUND_STONE = Tags.Blocks.ORE_BEARING_GROUND_STONE;
		TagKey<Block> ORE_RATES_DENSE = Tags.Blocks.ORE_RATES_DENSE;
		TagKey<Block> ORE_RATES_SINGULAR = Tags.Blocks.ORE_RATES_SINGULAR;
		TagKey<Block> ORE_RATES_SPARSE = Tags.Blocks.ORE_RATES_SPARSE;
		TagKey<Block> ORES = Tags.Blocks.ORES;
		TagKey<Block> ORES_COAL = Tags.Blocks.ORES_COAL;
		TagKey<Block> ORES_COPPER = Tags.Blocks.ORES_COPPER;
		TagKey<Block> ORES_DIAMOND = Tags.Blocks.ORES_DIAMOND;
		TagKey<Block> ORES_EMERALD = Tags.Blocks.ORES_EMERALD;
		TagKey<Block> ORES_GOLD = Tags.Blocks.ORES_GOLD;
		TagKey<Block> ORES_IRON = Tags.Blocks.ORES_IRON;
		TagKey<Block> ORES_LAPIS = Tags.Blocks.ORES_LAPIS;
		TagKey<Block> ORES_NETHERITE_SCRAP = Tags.Blocks.ORES_NETHERITE_SCRAP;
		TagKey<Block> ORES_QUARTZ = Tags.Blocks.ORES_QUARTZ;
		TagKey<Block> ORES_REDSTONE = Tags.Blocks.ORES_REDSTONE;
		TagKey<Block> ORES_IN_GROUND_DEEPSLATE = Tags.Blocks.ORES_IN_GROUND_DEEPSLATE;
		TagKey<Block> ORES_IN_GROUND_NETHERRACK = Tags.Blocks.ORES_IN_GROUND_NETHERRACK;
		TagKey<Block> ORES_IN_GROUND_STONE = Tags.Blocks.ORES_IN_GROUND_STONE;
		TagKey<Block> SAND = Tags.Blocks.SAND;
		TagKey<Block> SAND_COLORLESS = Tags.Blocks.SAND_COLORLESS;
		TagKey<Block> SAND_RED = Tags.Blocks.SAND_RED;
		TagKey<Block> SANDSTONE = Tags.Blocks.SANDSTONE;
		TagKey<Block> STAINED_GLASS = Tags.Blocks.STAINED_GLASS;
		TagKey<Block> STAINED_GLASS_PANES = Tags.Blocks.STAINED_GLASS_PANES;
		TagKey<Block> STONE = Tags.Blocks.STONE;
		TagKey<Block> STORAGE_BLOCKS = Tags.Blocks.STORAGE_BLOCKS;
		TagKey<Block> STORAGE_BLOCKS_AMETHYST = Tags.Blocks.STORAGE_BLOCKS_AMETHYST;
		TagKey<Block> STORAGE_BLOCKS_COAL = Tags.Blocks.STORAGE_BLOCKS_COAL;
		TagKey<Block> STORAGE_BLOCKS_COPPER = Tags.Blocks.STORAGE_BLOCKS_COPPER;
		TagKey<Block> STORAGE_BLOCKS_DIAMOND = Tags.Blocks.STORAGE_BLOCKS_DIAMOND;
		TagKey<Block> STORAGE_BLOCKS_EMERALD = Tags.Blocks.STORAGE_BLOCKS_EMERALD;
		TagKey<Block> STORAGE_BLOCKS_GOLD = Tags.Blocks.STORAGE_BLOCKS_GOLD;
		TagKey<Block> STORAGE_BLOCKS_IRON = Tags.Blocks.STORAGE_BLOCKS_IRON;
		TagKey<Block> STORAGE_BLOCKS_LAPIS = Tags.Blocks.STORAGE_BLOCKS_LAPIS;
		TagKey<Block> STORAGE_BLOCKS_NETHERITE = Tags.Blocks.STORAGE_BLOCKS_NETHERITE;
		TagKey<Block> STORAGE_BLOCKS_QUARTZ = Tags.Blocks.STORAGE_BLOCKS_QUARTZ;
		TagKey<Block> STORAGE_BLOCKS_RAW_COPPER = Tags.Blocks.STORAGE_BLOCKS_RAW_COPPER;
		TagKey<Block> STORAGE_BLOCKS_RAW_GOLD = Tags.Blocks.STORAGE_BLOCKS_RAW_GOLD;
		TagKey<Block> STORAGE_BLOCKS_RAW_IRON = Tags.Blocks.STORAGE_BLOCKS_RAW_IRON;
		TagKey<Block> STORAGE_BLOCKS_REDSTONE = Tags.Blocks.STORAGE_BLOCKS_REDSTONE;
		TagKey<Block> NEEDS_WOOD_TOOL = Tags.Blocks.NEEDS_WOOD_TOOL;
		TagKey<Block> NEEDS_GOLD_TOOL = Tags.Blocks.NEEDS_GOLD_TOOL;
		TagKey<Block> NEEDS_NETHERITE_TOOL = Tags.Blocks.NEEDS_NETHERITE_TOOL;
	}

	interface Common
	{
		TagKey<Block> QUARTZ_ORES = vanillaTag("quartz_ores");
	}

	static TagKey<Block> tag(String namespace, String path)
	{
		return TagKey.create(Registries.BLOCK, new ResourceLocation(namespace, path));
	}

	static TagKey<Block> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<Block> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
