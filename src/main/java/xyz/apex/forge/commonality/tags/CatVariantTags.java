package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.animal.CatVariant;
import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface CatVariantTags
{
	interface Vanilla
	{
		TagKey<CatVariant> DEFAULT_SPAWNS = net.minecraft.tags.CatVariantTags.DEFAULT_SPAWNS;
		TagKey<CatVariant> FULL_MOON_SPAWNS = net.minecraft.tags.CatVariantTags.FULL_MOON_SPAWNS;
	}

	static TagKey<CatVariant> tag(String namespace, String path)
	{
		return TagKey.create(Registries.CAT_VARIANT, new ResourceLocation(namespace, path));
	}

	static TagKey<CatVariant> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<CatVariant> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
