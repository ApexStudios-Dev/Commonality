package xyz.apex.forge.commonality.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

@SuppressWarnings("ALL")
public interface EntityTags
{
	interface Vanilla
	{
		TagKey<EntityType<?>> SKELETONS = net.minecraft.tags.EntityTypeTags.SKELETONS;
		TagKey<EntityType<?>> RAIDERS = net.minecraft.tags.EntityTypeTags.RAIDERS;
		TagKey<EntityType<?>> BEEHIVE_INHABITORS = net.minecraft.tags.EntityTypeTags.BEEHIVE_INHABITORS;
		TagKey<EntityType<?>> ARROWS = net.minecraft.tags.EntityTypeTags.ARROWS;
		TagKey<EntityType<?>> IMPACT_PROJECTILES = net.minecraft.tags.EntityTypeTags.IMPACT_PROJECTILES;
		TagKey<EntityType<?>> POWDER_SNOW_WALKABLE_MOBS = net.minecraft.tags.EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS;
		TagKey<EntityType<?>> AXOLOTL_ALWAYS_HOSTILES = net.minecraft.tags.EntityTypeTags.AXOLOTL_ALWAYS_HOSTILES;
		TagKey<EntityType<?>> AXOLOTL_HUNT_TARGETS = net.minecraft.tags.EntityTypeTags.AXOLOTL_HUNT_TARGETS;
		TagKey<EntityType<?>> FREEZE_IMMUNE_ENTITY_TYPES = net.minecraft.tags.EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES;
		TagKey<EntityType<?>> FREEZE_HURTS_EXTRA_TYPES = net.minecraft.tags.EntityTypeTags.FREEZE_HURTS_EXTRA_TYPES;
	}

	interface Common
	{
		TagKey<EntityType<?>> CHICKENS = forgeTag("chickens");
		TagKey<EntityType<?>> COWS = forgeTag("cows");
		TagKey<EntityType<?>> SHEEPS = forgeTag("sheeps");
		TagKey<EntityType<?>> HORSES = forgeTag("horses");
	}

	static TagKey<EntityType<?>> tag(String namespace, String path)
	{
		return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation(namespace, path));
	}

	static TagKey<EntityType<?>> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<EntityType<?>> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
