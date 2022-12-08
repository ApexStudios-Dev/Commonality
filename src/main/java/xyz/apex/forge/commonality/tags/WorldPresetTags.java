package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.presets.WorldPreset;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface WorldPresetTags
{
	interface Vanilla
	{
		TagKey<WorldPreset> NORMAL = net.minecraft.tags.WorldPresetTags.NORMAL;
		TagKey<WorldPreset> EXTENDED = net.minecraft.tags.WorldPresetTags.EXTENDED;
	}

	static TagKey<WorldPreset> tag(String namespace, String path)
	{
		return TagKey.create(Registries.WORLD_PRESET, new ResourceLocation(namespace, path));
	}

	static TagKey<WorldPreset> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<WorldPreset> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
