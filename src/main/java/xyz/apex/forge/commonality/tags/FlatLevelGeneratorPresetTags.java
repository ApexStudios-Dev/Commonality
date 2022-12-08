package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorPreset;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface FlatLevelGeneratorPresetTags
{
	interface Vanilla
	{
		TagKey<FlatLevelGeneratorPreset> VISIBLE = net.minecraft.tags.FlatLevelGeneratorPresetTags.VISIBLE;
	}

	static TagKey<FlatLevelGeneratorPreset> tag(String namespace, String path)
	{
		return TagKey.create(Registries.FLAT_LEVEL_GENERATOR_PRESET, new ResourceLocation(namespace, path));
	}

	static TagKey<FlatLevelGeneratorPreset> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<FlatLevelGeneratorPreset> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
