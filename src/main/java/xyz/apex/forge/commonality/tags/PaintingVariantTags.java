package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.decoration.PaintingVariant;
import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface PaintingVariantTags
{
	interface Vanilla
	{
		TagKey<PaintingVariant> PLACEABLE = net.minecraft.tags.PaintingVariantTags.PLACEABLE;
	}

	static TagKey<PaintingVariant> tag(String namespace, String path)
	{
		return TagKey.create(Registries.PAINTING_VARIANT, new ResourceLocation(namespace, path));
	}

	static TagKey<PaintingVariant> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<PaintingVariant> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
