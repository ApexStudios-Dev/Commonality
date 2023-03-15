package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface EntityTags
{
	interface Vanilla
	{
		TagKey<EntityType<?>> SKELETONS = EntityTypeTags.SKELETONS;
		TagKey<EntityType<?>> RAIDERS = EntityTypeTags.RAIDERS;
		TagKey<EntityType<?>> BEEHIVE_INHABITORS = EntityTypeTags.BEEHIVE_INHABITORS;
		TagKey<EntityType<?>> ARROWS = EntityTypeTags.ARROWS;
		TagKey<EntityType<?>> IMPACT_PROJECTILES = EntityTypeTags.IMPACT_PROJECTILES;
		TagKey<EntityType<?>> POWDER_SNOW_WALKABLE_MOBS = EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS;
		TagKey<EntityType<?>> AXOLOTL_ALWAYS_HOSTILES = EntityTypeTags.AXOLOTL_ALWAYS_HOSTILES;
		TagKey<EntityType<?>> AXOLOTL_HUNT_TARGETS = EntityTypeTags.AXOLOTL_HUNT_TARGETS;
		TagKey<EntityType<?>> FREEZE_IMMUNE_ENTITY_TYPES = EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES;
		TagKey<EntityType<?>> FREEZE_HURTS_EXTRA_TYPES = EntityTypeTags.FREEZE_HURTS_EXTRA_TYPES;
		TagKey<EntityType<?>> FROG_FOOD = EntityTypeTags.FROG_FOOD;
		TagKey<EntityType<?>> FALL_DAMAGE_IMMUNE = EntityTypeTags.FALL_DAMAGE_IMMUNE;
		TagKey<EntityType<?>> DISMOUNTS_UNDERWATER = EntityTypeTags.DISMOUNTS_UNDERWATER;
	}

	interface Forge
	{
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
		return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(namespace, path));
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
