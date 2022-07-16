package xyz.apex.forge.commonality.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

import xyz.apex.forge.commonality.Mods;

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

	interface Forge
	{
		// The following tags are copied directly from Forge PR #8442 (https://github.com/MinecraftForge/MinecraftForge/pull/8442)
		// TODO: Reference instances from Forges `Tags.EntityTypes` class if / when PR gets merged
		TagKey<EntityType<?>> AMPHIBIANS = forgeTag("amphibians");
		TagKey<EntityType<?>> AQUATIC = forgeTag("aquatic");
		TagKey<EntityType<?>> ARTHROPODS = forgeTag("arthropods");
		TagKey<EntityType<?>> AVIANS = forgeTag("avians");
		TagKey<EntityType<?>> AVIANS_FOWLS = forgeTag("avians/fowls");
		TagKey<EntityType<?>> BOSSES = forgeTag("bosses");
		TagKey<EntityType<?>> CEPHALOPODS = forgeTag("cephalopods");
		TagKey<EntityType<?>> CREEPERS = forgeTag("creepers");
		TagKey<EntityType<?>> DRAGONS = forgeTag("dragons");

		/**
		 * Mobs that are logically composed of a base element
		 * If your mob is a combination of elements, feel free to add it to all appropriate tags
		 */
		TagKey<EntityType<?>> ELEMENTALS = forgeTag("elementals");
		TagKey<EntityType<?>> ELEMENTALS_FIRE = forgeTag("elementals/fire");
		TagKey<EntityType<?>> ELEMENTALS_ICE = forgeTag("elementals/ice");
		/**
		 * Mobs that are meant to be antagonistic to the player
		 */
		TagKey<EntityType<?>> ENEMIES = forgeTag("enemies");
		/**
		 * Mobs that have an associated item with the 'fish' tag
		 */
		TagKey<EntityType<?>> FISH = forgeTag("fish");
		TagKey<EntityType<?>> FLYING = forgeTag("flying");
		TagKey<EntityType<?>> LAND = forgeTag("land");

		TagKey<EntityType<?>> MAMMALS = forgeTag("mammals");
		TagKey<EntityType<?>> MAMMALS_BOVINES = forgeTag("mammals/bovines");
		TagKey<EntityType<?>> MAMMALS_CAMELIDS = forgeTag("mammals/camelids");
		TagKey<EntityType<?>> MAMMALS_CANIDS = forgeTag("mammals/canids");
		TagKey<EntityType<?>> MAMMALS_CAPRINES = forgeTag("mammals/caprines");
		TagKey<EntityType<?>> MAMMALS_EQUINES = forgeTag("mammals/equines");
		TagKey<EntityType<?>> MAMMALS_FELIDS = forgeTag("mammals/felids");
		TagKey<EntityType<?>> MAMMALS_SWINES = forgeTag("mammals/swines");
		TagKey<EntityType<?>> MAMMALS_URSIDS = forgeTag("mammals/ursids");

		/**
		 * Mobs that simulate an intelligent, independent relationship of some sort with the player
		 */
		TagKey<EntityType<?>> NPC = forgeTag("npc");
		TagKey<EntityType<?>> REPTILES = forgeTag("reptiles");
		TagKey<EntityType<?>> UNDEAD = forgeTag("undead");
		TagKey<EntityType<?>> UNDEAD_SKELETONS = forgeTag("undead/skeletons");
		TagKey<EntityType<?>> UNDEAD_ZOMBIES = forgeTag("undead/zombies");
		/**
		 * Mobs that prefer to live in lava
		 */
		TagKey<EntityType<?>> VOLCANIC = forgeTag("volcanic");
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