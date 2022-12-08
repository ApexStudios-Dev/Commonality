package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface BannerPatternTags
{
	interface Vanilla
	{
		TagKey<BannerPattern> NO_ITEM_REQUIRED = net.minecraft.tags.BannerPatternTags.NO_ITEM_REQUIRED;
		TagKey<BannerPattern> PATTERN_ITEM_FLOWER = net.minecraft.tags.BannerPatternTags.PATTERN_ITEM_FLOWER;
		TagKey<BannerPattern> PATTERN_ITEM_CREEPER = net.minecraft.tags.BannerPatternTags.PATTERN_ITEM_CREEPER;
		TagKey<BannerPattern> PATTERN_ITEM_SKULL = net.minecraft.tags.BannerPatternTags.PATTERN_ITEM_SKULL;
		TagKey<BannerPattern> PATTERN_ITEM_MOJANG = net.minecraft.tags.BannerPatternTags.PATTERN_ITEM_MOJANG;
		TagKey<BannerPattern> PATTERN_ITEM_GLOBE = net.minecraft.tags.BannerPatternTags.PATTERN_ITEM_GLOBE;
		TagKey<BannerPattern> PATTERN_ITEM_PIGLIN = net.minecraft.tags.BannerPatternTags.PATTERN_ITEM_PIGLIN;
	}

	static TagKey<BannerPattern> tag(String namespace, String path)
	{
		return TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(namespace, path));
	}

	static TagKey<BannerPattern> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<BannerPattern> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
