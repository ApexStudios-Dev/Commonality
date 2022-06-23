package xyz.apex.forge.commonality.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ConfiguredStructureTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface StructureTags
{
	interface Vanilla
	{
		TagKey<ConfiguredStructureFeature<?, ?>> EYE_OF_ENDER_LOCATED = ConfiguredStructureTags.EYE_OF_ENDER_LOCATED;
		TagKey<ConfiguredStructureFeature<?, ?>> DOLPHIN_LOCATED = ConfiguredStructureTags.DOLPHIN_LOCATED;
		TagKey<ConfiguredStructureFeature<?, ?>> ON_WOODLAND_EXPLORER_MAPS = ConfiguredStructureTags.ON_WOODLAND_EXPLORER_MAPS;
		TagKey<ConfiguredStructureFeature<?, ?>> ON_OCEAN_EXPLORER_MAPS = ConfiguredStructureTags.ON_OCEAN_EXPLORER_MAPS;
		TagKey<ConfiguredStructureFeature<?, ?>> ON_TREASURE_MAPS = ConfiguredStructureTags.ON_TREASURE_MAPS;
		TagKey<ConfiguredStructureFeature<?, ?>> VILLAGE = ConfiguredStructureTags.VILLAGE;
		TagKey<ConfiguredStructureFeature<?, ?>> MINESHAFT = ConfiguredStructureTags.MINESHAFT;
		TagKey<ConfiguredStructureFeature<?, ?>> SHIPWRECK = ConfiguredStructureTags.SHIPWRECK;
		TagKey<ConfiguredStructureFeature<?, ?>> RUINED_PORTAL = ConfiguredStructureTags.RUINED_PORTAL;
		TagKey<ConfiguredStructureFeature<?, ?>> OCEAN_RUIN = ConfiguredStructureTags.OCEAN_RUIN;
	}

	static TagKey<ConfiguredStructureFeature<?, ?>> tag(String namespace, String path)
	{
		return TagKey.create(Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY, new ResourceLocation(namespace, path));
	}

	static TagKey<ConfiguredStructureFeature<?, ?>> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<ConfiguredStructureFeature<?, ?>> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
