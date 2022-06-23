package xyz.apex.forge.commonality.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.Tags;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface FluidTags
{
	interface Vanilla
	{
		TagKey<Fluid> WATER = net.minecraft.tags.FluidTags.WATER;
		TagKey<Fluid> LAVA = net.minecraft.tags.FluidTags.LAVA;
	}

	interface Forge
	{
		TagKey<Fluid> MILK = Tags.Fluids.MILK;
	}

	static TagKey<Fluid> tag(String namespace, String path)
	{
		return TagKey.create(Registry.FLUID_REGISTRY, new ResourceLocation(namespace, path));
	}

	static TagKey<Fluid> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<Fluid> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
