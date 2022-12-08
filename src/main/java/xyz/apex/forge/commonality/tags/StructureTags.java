package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.Structure;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface StructureTags
{
	interface Vanilla
	{
		TagKey<Structure> EYE_OF_ENDER_LOCATED = net.minecraft.tags.StructureTags.EYE_OF_ENDER_LOCATED;
		TagKey<Structure> DOLPHIN_LOCATED = net.minecraft.tags.StructureTags.DOLPHIN_LOCATED;
		TagKey<Structure> ON_WOODLAND_EXPLORER_MAPS = net.minecraft.tags.StructureTags.ON_WOODLAND_EXPLORER_MAPS;
		TagKey<Structure> ON_OCEAN_EXPLORER_MAPS = net.minecraft.tags.StructureTags.ON_OCEAN_EXPLORER_MAPS;
		TagKey<Structure> ON_TREASURE_MAPS = net.minecraft.tags.StructureTags.ON_TREASURE_MAPS;
		TagKey<Structure> CATS_SPAWN_IN = net.minecraft.tags.StructureTags.CATS_SPAWN_IN;
		TagKey<Structure> CATS_SPAWN_AS_BLACK = net.minecraft.tags.StructureTags.CATS_SPAWN_AS_BLACK;
		TagKey<Structure> VILLAGE = net.minecraft.tags.StructureTags.VILLAGE;
		TagKey<Structure> MINESHAFT = net.minecraft.tags.StructureTags.MINESHAFT;
		TagKey<Structure> SHIPWRECK = net.minecraft.tags.StructureTags.SHIPWRECK;
		TagKey<Structure> RUINED_PORTAL = net.minecraft.tags.StructureTags.RUINED_PORTAL;
		TagKey<Structure> OCEAN_RUIN = net.minecraft.tags.StructureTags.OCEAN_RUIN;
	}

	static TagKey<Structure> tag(String namespace, String path)
	{
		return TagKey.create(Registries.STRUCTURE, new ResourceLocation(namespace, path));
	}

	static TagKey<Structure> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<Structure> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
