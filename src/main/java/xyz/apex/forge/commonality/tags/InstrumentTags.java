package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Instrument;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface InstrumentTags
{
	interface Vanilla
	{
		TagKey<Instrument> REGULAR_GOAT_HORNS = net.minecraft.tags.InstrumentTags.REGULAR_GOAT_HORNS;
		TagKey<Instrument> SCREAMING_GOAT_HORNS = net.minecraft.tags.InstrumentTags.SCREAMING_GOAT_HORNS;
		TagKey<Instrument> GOAT_HORNS = net.minecraft.tags.InstrumentTags.GOAT_HORNS;
	}

	static TagKey<Instrument> tag(String namespace, String path)
	{
		return TagKey.create(Registries.INSTRUMENT, new ResourceLocation(namespace, path));
	}

	static TagKey<Instrument> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<Instrument> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
