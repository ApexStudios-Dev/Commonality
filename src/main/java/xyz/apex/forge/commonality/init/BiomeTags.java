package xyz.apex.forge.commonality.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

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
		TagKey<Biome> IS_NETHER = net.minecraft.tags.BiomeTags.IS_NETHER;
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
		TagKey<Biome> HAS_SWAMP_HUT = net.minecraft.tags.BiomeTags.HAS_SWAMP_HUT;
		TagKey<Biome> HAS_VILLAGE_DESERT = net.minecraft.tags.BiomeTags.HAS_VILLAGE_DESERT;
		TagKey<Biome> HAS_VILLAGE_PLAINS = net.minecraft.tags.BiomeTags.HAS_VILLAGE_PLAINS;
		TagKey<Biome> HAS_VILLAGE_SAVANNA = net.minecraft.tags.BiomeTags.HAS_VILLAGE_SAVANNA;
		TagKey<Biome> HAS_VILLAGE_SNOWY = net.minecraft.tags.BiomeTags.HAS_VILLAGE_SNOWY;
		TagKey<Biome> HAS_VILLAGE_TAIGA = net.minecraft.tags.BiomeTags.HAS_VILLAGE_TAIGA;
		TagKey<Biome> HAS_WOODLAND_MANSION = net.minecraft.tags.BiomeTags.HAS_WOODLAND_MANSION;
		TagKey<Biome> HAS_STRONGHOLD = net.minecraft.tags.BiomeTags.HAS_STRONGHOLD;
		TagKey<Biome> HAS_NETHER_FORTRESS = net.minecraft.tags.BiomeTags.HAS_NETHER_FORTRESS;
		TagKey<Biome> HAS_NETHER_FOSSIL = net.minecraft.tags.BiomeTags.HAS_NETHER_FOSSIL;
		TagKey<Biome> HAS_BASTION_REMNANT = net.minecraft.tags.BiomeTags.HAS_BASTION_REMNANT;
		TagKey<Biome> HAS_RUINED_PORTAL_NETHER = net.minecraft.tags.BiomeTags.HAS_RUINED_PORTAL_NETHER;
		TagKey<Biome> HAS_END_CITY = net.minecraft.tags.BiomeTags.HAS_END_CITY;
	}

	static TagKey<Biome> tag(String namespace, String path)
	{
		return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(namespace, path));
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
