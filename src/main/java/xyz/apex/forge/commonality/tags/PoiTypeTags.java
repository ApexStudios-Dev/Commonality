package xyz.apex.forge.commonality.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.village.poi.PoiType;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface PoiTypeTags
{
	interface Vanilla
	{
		TagKey<PoiType> ACQUIRABLE_JOB_SITE = net.minecraft.tags.PoiTypeTags.ACQUIRABLE_JOB_SITE;
		TagKey<PoiType> VILLAGE = net.minecraft.tags.PoiTypeTags.VILLAGE;
		TagKey<PoiType> BEE_HOME = net.minecraft.tags.PoiTypeTags.BEE_HOME;
	}

	static TagKey<PoiType> tag(String namespace, String path)
	{
		return TagKey.create(Registry.POINT_OF_INTEREST_TYPE_REGISTRY, new ResourceLocation(namespace, path));
	}

	static TagKey<PoiType> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<PoiType> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}