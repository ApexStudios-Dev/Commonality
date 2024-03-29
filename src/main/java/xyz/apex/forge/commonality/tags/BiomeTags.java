package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.Tags;
import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface BiomeTags
{
	interface Vanilla
	{
		TagKey<Biome> IS_DEEP_OCEAN = net.minecraft.tags.BiomeTags.IS_DEEP_OCEAN;
		TagKey<Biome> IS_OCEAN = net.minecraft.tags.BiomeTags.IS_OCEAN;
		TagKey<Biome> IS_BEACH = net.minecraft.tags.BiomeTags.IS_BEACH;
		TagKey<Biome> IS_RIVER = net.minecraft.tags.BiomeTags.IS_RIVER;
		TagKey<Biome> IS_MOUNTAIN = net.minecraft.tags.BiomeTags.IS_MOUNTAIN;
		TagKey<Biome> IS_BADLANDS = net.minecraft.tags.BiomeTags.IS_BADLANDS;
		TagKey<Biome> IS_HILL = net.minecraft.tags.BiomeTags.IS_HILL;
		TagKey<Biome> IS_TAIGA = net.minecraft.tags.BiomeTags.IS_TAIGA;
		TagKey<Biome> IS_JUNGLE = net.minecraft.tags.BiomeTags.IS_JUNGLE;
		TagKey<Biome> IS_FOREST = net.minecraft.tags.BiomeTags.IS_FOREST;
		TagKey<Biome> IS_SAVANNA = net.minecraft.tags.BiomeTags.IS_SAVANNA;
		TagKey<Biome> IS_OVERWORLD = net.minecraft.tags.BiomeTags.IS_OVERWORLD;
		TagKey<Biome> IS_NETHER = net.minecraft.tags.BiomeTags.IS_NETHER;
		TagKey<Biome> IS_END = net.minecraft.tags.BiomeTags.IS_END;
		TagKey<Biome> STRONGHOLD_BIASED_TO = net.minecraft.tags.BiomeTags.STRONGHOLD_BIASED_TO;
		TagKey<Biome> HAS_BURIED_TREASURE = net.minecraft.tags.BiomeTags.HAS_BURIED_TREASURE;
		TagKey<Biome> HAS_DESERT_PYRAMID = net.minecraft.tags.BiomeTags.HAS_DESERT_PYRAMID;
		TagKey<Biome> HAS_IGLOO = net.minecraft.tags.BiomeTags.HAS_IGLOO;
		TagKey<Biome> HAS_JUNGLE_TEMPLE = net.minecraft.tags.BiomeTags.HAS_JUNGLE_TEMPLE;
		TagKey<Biome> HAS_MINESHAFT = net.minecraft.tags.BiomeTags.HAS_MINESHAFT;
		TagKey<Biome> HAS_MINESHAFT_MESA = net.minecraft.tags.BiomeTags.HAS_MINESHAFT_MESA;
		TagKey<Biome> HAS_OCEAN_MONUMENT = net.minecraft.tags.BiomeTags.HAS_OCEAN_MONUMENT;
		TagKey<Biome> HAS_OCEAN_RUIN_COLD = net.minecraft.tags.BiomeTags.HAS_OCEAN_RUIN_COLD;
		TagKey<Biome> HAS_OCEAN_RUIN_WARM = net.minecraft.tags.BiomeTags.HAS_OCEAN_RUIN_WARM;
		TagKey<Biome> HAS_PILLAGER_OUTPOST = net.minecraft.tags.BiomeTags.HAS_PILLAGER_OUTPOST;
		TagKey<Biome> HAS_RUINED_PORTAL_DESERT = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_DESERT;
		TagKey<Biome> HAS_RUINED_PORTAL_JUNGLE = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_JUNGLE;
		TagKey<Biome> HAS_RUINED_PORTAL_OCEAN = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_OCEAN;
		TagKey<Biome> HAS_RUINED_PORTAL_SWAMP = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_SWAMP;
		TagKey<Biome> HAS_RUINED_PORTAL_MOUNTAIN = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_MOUNTAIN;
		TagKey<Biome> HAS_RUINED_PORTAL_STANDARD = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_STANDARD;
		TagKey<Biome> HAS_SHIPWRECK_BEACHED = net.minecraft.tags.BiomeTags.HAS_SHIPWRECK_BEACHED;
		TagKey<Biome> HAS_SHIPWRECK = net.minecraft.tags.BiomeTags.HAS_SHIPWRECK;
		TagKey<Biome> HAS_STRONGHOLD = net.minecraft.tags.BiomeTags.HAS_STRONGHOLD;
		TagKey<Biome> HAS_SWAMP_HUT = net.minecraft.tags.BiomeTags.HAS_SWAMP_HUT;
		TagKey<Biome> HAS_VILLAGE_DESERT = net.minecraft.tags.BiomeTags.HAS_VILLAGE_DESERT;
		TagKey<Biome> HAS_VILLAGE_PLAINS = net.minecraft.tags.BiomeTags.HAS_VILLAGE_PLAINS;
		TagKey<Biome> HAS_VILLAGE_SAVANNA = net.minecraft.tags.BiomeTags.HAS_VILLAGE_SAVANNA;
		TagKey<Biome> HAS_VILLAGE_SNOWY = net.minecraft.tags.BiomeTags.HAS_VILLAGE_SNOWY;
		TagKey<Biome> HAS_VILLAGE_TAIGA = net.minecraft.tags.BiomeTags.HAS_VILLAGE_TAIGA;
		TagKey<Biome> HAS_WOODLAND_MANSION = net.minecraft.tags.BiomeTags.HAS_WOODLAND_MANSION;
		TagKey<Biome> HAS_NETHER_FORTRESS = net.minecraft.tags.BiomeTags.HAS_NETHER_FORTRESS;
		TagKey<Biome> HAS_NETHER_FOSSIL = net.minecraft.tags.BiomeTags.HAS_NETHER_FOSSIL;
		TagKey<Biome> HAS_BASTION_REMNANT = net.minecraft.tags.BiomeTags.HAS_BASTION_REMNANT;
		TagKey<Biome> HAS_ANCIENT_CITY = net.minecraft.tags.BiomeTags.HAS_ANCIENT_CITY;
		TagKey<Biome> HAS_RUINED_PORTAL_NETHER = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_NETHER;
		TagKey<Biome> HAS_END_CITY = net.minecraft.tags.BiomeTags.HAS_END_CITY;
		TagKey<Biome> REQUIRED_OCEAN_MONUMENT_SURROUNDING = net.minecraft.tags.BiomeTags.REQUIRED_OCEAN_MONUMENT_SURROUNDING;
		TagKey<Biome> MINESHAFT_BLOCKING = net.minecraft.tags.BiomeTags.MINESHAFT_BLOCKING;
		TagKey<Biome> PLAYS_UNDERWATER_MUSIC = net.minecraft.tags.BiomeTags.PLAYS_UNDERWATER_MUSIC;
		TagKey<Biome> HAS_CLOSER_WATER_FOG = net.minecraft.tags.BiomeTags.HAS_CLOSER_WATER_FOG;
		TagKey<Biome> WATER_ON_MAP_OUTLINES = net.minecraft.tags.BiomeTags.WATER_ON_MAP_OUTLINES;
		TagKey<Biome> PRODUCES_CORALS_FROM_BONEMEAL = net.minecraft.tags.BiomeTags.PRODUCES_CORALS_FROM_BONEMEAL;
		TagKey<Biome> INCREASED_FIRE_BURNOUT = net.minecraft.tags.BiomeTags.INCREASED_FIRE_BURNOUT;
		TagKey<Biome> SNOW_GOLEM_MELTS = net.minecraft.tags.BiomeTags.SNOW_GOLEM_MELTS;
		TagKey<Biome> WITHOUT_ZOMBIE_SIEGES = net.minecraft.tags.BiomeTags.WITHOUT_ZOMBIE_SIEGES;
		TagKey<Biome> WITHOUT_PATROL_SPAWNS = net.minecraft.tags.BiomeTags.WITHOUT_PATROL_SPAWNS;
		TagKey<Biome> WITHOUT_WANDERING_TRADER_SPAWNS = net.minecraft.tags.BiomeTags.WITHOUT_WANDERING_TRADER_SPAWNS;
		TagKey<Biome> SPAWNS_COLD_VARIANT_FROGS = net.minecraft.tags.BiomeTags.SPAWNS_COLD_VARIANT_FROGS;
		TagKey<Biome> SPAWNS_WARM_VARIANT_FROGS = net.minecraft.tags.BiomeTags.SPAWNS_WARM_VARIANT_FROGS;
		TagKey<Biome> SPAWNS_GOLD_RABBITS = net.minecraft.tags.BiomeTags.SPAWNS_GOLD_RABBITS;
		TagKey<Biome> SPAWNS_WHITE_RABBITS = net.minecraft.tags.BiomeTags.SPAWNS_WHITE_RABBITS;
		TagKey<Biome> REDUCED_WATER_AMBIENT_SPAWNS = net.minecraft.tags.BiomeTags.REDUCED_WATER_AMBIENT_SPAWNS;
		TagKey<Biome> ALLOWS_TROPICAL_FISH_SPAWNS_AT_ANY_HEIGHT = net.minecraft.tags.BiomeTags.ALLOWS_TROPICAL_FISH_SPAWNS_AT_ANY_HEIGHT;
		TagKey<Biome> POLAR_BEARS_SPAWN_ON_ALTERNATE_BLOCKS = net.minecraft.tags.BiomeTags.POLAR_BEARS_SPAWN_ON_ALTERNATE_BLOCKS;
		TagKey<Biome> MORE_FREQUENT_DROWNED_SPAWNS = net.minecraft.tags.BiomeTags.MORE_FREQUENT_DROWNED_SPAWNS;
		TagKey<Biome> ALLOWS_SURFACE_SLIME_SPAWNS = net.minecraft.tags.BiomeTags.ALLOWS_SURFACE_SLIME_SPAWNS;
		TagKey<Biome> SPAWNS_SNOW_FOXES = net.minecraft.tags.BiomeTags.SPAWNS_SNOW_FOXES;
	}

	interface Forge
	{
		TagKey<Biome> IS_HOT = Tags.Biomes.IS_HOT;
		TagKey<Biome> IS_HOT_OVERWORLD = Tags.Biomes.IS_HOT_OVERWORLD;
		TagKey<Biome> IS_HOT_NETHER = Tags.Biomes.IS_HOT_NETHER;
		TagKey<Biome> IS_HOT_END = Tags.Biomes.IS_HOT_END;
		TagKey<Biome> IS_COLD = Tags.Biomes.IS_COLD;
		TagKey<Biome> IS_COLD_OVERWORLD = Tags.Biomes.IS_COLD_OVERWORLD;
		TagKey<Biome> IS_COLD_NETHER = Tags.Biomes.IS_COLD_NETHER;
		TagKey<Biome> IS_COLD_END = Tags.Biomes.IS_COLD_END;
		TagKey<Biome> IS_SPARSE = Tags.Biomes.IS_SPARSE;
		TagKey<Biome> IS_SPARSE_OVERWORLD = Tags.Biomes.IS_SPARSE_OVERWORLD;
		TagKey<Biome> IS_SPARSE_NETHER = Tags.Biomes.IS_SPARSE_NETHER;
		TagKey<Biome> IS_SPARSE_END = Tags.Biomes.IS_SPARSE_END;
		TagKey<Biome> IS_DENSE = Tags.Biomes.IS_DENSE;
		TagKey<Biome> IS_DENSE_OVERWORLD = Tags.Biomes.IS_DENSE_OVERWORLD;
		TagKey<Biome> IS_DENSE_NETHER = Tags.Biomes.IS_DENSE_NETHER;
		TagKey<Biome> IS_DENSE_END = Tags.Biomes.IS_DENSE_END;
		TagKey<Biome> IS_WET = Tags.Biomes.IS_WET;
		TagKey<Biome> IS_WET_OVERWORLD = Tags.Biomes.IS_WET_OVERWORLD;
		TagKey<Biome> IS_WET_NETHER = Tags.Biomes.IS_WET_NETHER;
		TagKey<Biome> IS_WET_END = Tags.Biomes.IS_WET_END;
		TagKey<Biome> IS_DRY = Tags.Biomes.IS_DRY;
		TagKey<Biome> IS_DRY_OVERWORLD = Tags.Biomes.IS_DRY_OVERWORLD;
		TagKey<Biome> IS_DRY_NETHER = Tags.Biomes.IS_DRY_NETHER;
		TagKey<Biome> IS_DRY_END = Tags.Biomes.IS_DRY_END;
		TagKey<Biome> IS_CONIFEROUS = Tags.Biomes.IS_CONIFEROUS;
		TagKey<Biome> IS_SPOOKY = Tags.Biomes.IS_SPOOKY;
		TagKey<Biome> IS_DEAD = Tags.Biomes.IS_DEAD;
		TagKey<Biome> IS_LUSH = Tags.Biomes.IS_LUSH;
		TagKey<Biome> IS_MUSHROOM = Tags.Biomes.IS_MUSHROOM;
		TagKey<Biome> IS_MAGICAL = Tags.Biomes.IS_MAGICAL;
		TagKey<Biome> IS_RARE = Tags.Biomes.IS_RARE;
		TagKey<Biome> IS_PLATEAU = Tags.Biomes.IS_PLATEAU;
		TagKey<Biome> IS_MODIFIED = Tags.Biomes.IS_MODIFIED;
		TagKey<Biome> IS_WATER = Tags.Biomes.IS_WATER;
		TagKey<Biome> IS_DESERT = Tags.Biomes.IS_DESERT;
		TagKey<Biome> IS_PLAINS = Tags.Biomes.IS_PLAINS;
		TagKey<Biome> IS_SWAMP = Tags.Biomes.IS_SWAMP;
		TagKey<Biome> IS_SANDY = Tags.Biomes.IS_SANDY;
		TagKey<Biome> IS_SNOWY = Tags.Biomes.IS_SNOWY;
		TagKey<Biome> IS_WASTELAND = Tags.Biomes.IS_WASTELAND;
		TagKey<Biome> IS_VOID = Tags.Biomes.IS_VOID;
		TagKey<Biome> IS_UNDERGROUND = Tags.Biomes.IS_UNDERGROUND;
		TagKey<Biome> IS_CAVE = Tags.Biomes.IS_CAVE;
		TagKey<Biome> IS_PEAK = Tags.Biomes.IS_PEAK;
		TagKey<Biome> IS_SLOPE = Tags.Biomes.IS_SLOPE;
		TagKey<Biome> IS_MOUNTAIN = Tags.Biomes.IS_MOUNTAIN;
	}

	static TagKey<Biome> tag(String namespace, String path)
	{
		return TagKey.create(Registries.BIOME, new ResourceLocation(namespace, path));
	}

	static TagKey<Biome> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<Biome> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
