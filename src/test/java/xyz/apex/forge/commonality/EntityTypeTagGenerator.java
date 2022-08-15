package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;

import xyz.apex.forge.commonality.tags.EntityTags;

@SuppressWarnings("unchecked")
final class EntityTypeTagGenerator extends EntityTypeTagsProvider
{
	EntityTypeTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags()
	{
		tag(EntityTags.Common.CHICKENS).add(EntityType.CHICKEN);
		tag(EntityTags.Common.COWS).add(EntityType.COW);
		tag(EntityTags.Common.SHEEPS).add(EntityType.SHEEP);
		tag(EntityTags.Common.HORSES).add(EntityType.HORSE, EntityType.SKELETON_HORSE, EntityType.ZOMBIE_HORSE);

		// See EntityTypeTags class, for more info when where these came from
		// and why they are associated to these values
		tag(EntityTags.Forge.AMPHIBIANS).add(EntityType.AXOLOTL);
		tag(EntityTags.Forge.AQUATIC).add(EntityType.AXOLOTL, EntityType.COD, EntityType.DOLPHIN, EntityType.ELDER_GUARDIAN, EntityType.GLOW_SQUID, EntityType.GUARDIAN, EntityType.PUFFERFISH, EntityType.SALMON, EntityType.SQUID, EntityType.TROPICAL_FISH, EntityType.TURTLE); // TODO Add frog and tadpole tags when they come to Minecraft Java
		tag(EntityTags.Forge.ARTHROPODS).add(EntityType.BEE, EntityType.CAVE_SPIDER, EntityType.ENDERMITE, EntityType.SILVERFISH, EntityType.SPIDER);
		tag(EntityTags.Forge.AVIANS).addTag(EntityTags.Forge.AVIANS_FOWLS).add(EntityType.PARROT);
		tag(EntityTags.Forge.AVIANS_FOWLS).add(EntityType.CHICKEN);
		tag(EntityTags.Forge.BOSSES).add(EntityType.ENDER_DRAGON, EntityType.WITHER);
		tag(EntityTags.Forge.CEPHALOPODS).add(EntityType.GLOW_SQUID, EntityType.SQUID);
		tag(EntityTags.Forge.CREEPERS).add(EntityType.CREEPER);
		tag(EntityTags.Forge.DRAGONS).add(EntityType.ENDER_DRAGON);

		tag(EntityTags.Forge.ELEMENTALS).addTags(EntityTags.Forge.ELEMENTALS_FIRE, EntityTags.Forge.ELEMENTALS_ICE);
		tag(EntityTags.Forge.ELEMENTALS_FIRE).add(EntityType.BLAZE);
		tag(EntityTags.Forge.ELEMENTALS_ICE).add(EntityType.SNOW_GOLEM);
		tag(EntityTags.Forge.ENEMIES).addTags(EntityTags.Forge.BOSSES, EntityTags.Forge.CREEPERS, EntityTypeTags.RAIDERS).add(EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.DROWNED, EntityType.ELDER_GUARDIAN, EntityType.ENDERMAN, EntityType.ENDERMITE, EntityType.GHAST, EntityType.GUARDIAN, EntityType.HOGLIN, EntityType.HUSK, EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.PIGLIN, EntityType.PIGLIN_BRUTE, EntityType.SHULKER, EntityType.SILVERFISH, EntityType.SKELETON, EntityType.SLIME, EntityType.SPIDER, EntityType.STRAY, EntityType.VEX, EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN);
		tag(EntityTags.Forge.FISH).add(EntityType.COD, EntityType.PUFFERFISH, EntityType.SALMON, EntityType.TROPICAL_FISH);
		tag(EntityTags.Forge.FLYING).add(EntityType.BAT, EntityType.BEE, EntityType.ENDER_DRAGON, EntityType.GHAST, EntityType.PARROT, EntityType.PHANTOM, EntityType.VEX, EntityType.WITHER);
		tag(EntityTags.Forge.LAND).add(EntityType.BLAZE, EntityType.CAT, EntityType.CAVE_SPIDER, EntityType.CHICKEN, EntityType.CREEPER, EntityType.DONKEY, EntityType.DROWNED, EntityType.ENDERMAN, EntityType.ENDERMITE, EntityType.EVOKER, EntityType.FOX, EntityType.GOAT, EntityType.HOGLIN, EntityType.HORSE, EntityType.HUSK, EntityType.ILLUSIONER, EntityType.IRON_GOLEM, EntityType.LLAMA, EntityType.MAGMA_CUBE, EntityType.MULE, EntityType.OCELOT, EntityType.PANDA, EntityType.PIG, EntityType.PIGLIN, EntityType.PIGLIN_BRUTE, EntityType.PILLAGER, EntityType.PLAYER, EntityType.POLAR_BEAR, EntityType.RABBIT, EntityType.RAVAGER, EntityType.SHEEP, EntityType.SHULKER, EntityType.SILVERFISH, EntityType.SKELETON, EntityType.SKELETON_HORSE, EntityType.SLIME, EntityType.SNOW_GOLEM, EntityType.SPIDER, EntityType.STRAY, EntityType.TRADER_LLAMA, EntityType.VILLAGER, EntityType.VINDICATOR, EntityType.WANDERING_TRADER, EntityType.WITCH, EntityType.WITHER_SKELETON, EntityType.WOLF, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN);

		tag(EntityTags.Forge.MAMMALS).addTags(EntityTags.Forge.MAMMALS_BOVINES, EntityTags.Forge.MAMMALS_CAMELIDS, EntityTags.Forge.MAMMALS_CANIDS, EntityTags.Forge.MAMMALS_CAPRINES, EntityTags.Forge.MAMMALS_EQUINES, EntityTags.Forge.MAMMALS_FELIDS, EntityTags.Forge.MAMMALS_SWINES, EntityTags.Forge.MAMMALS_URSIDS).add(EntityType.BAT, EntityType.RABBIT);
		tag(EntityTags.Forge.MAMMALS_BOVINES).add(EntityType.COW, EntityType.MOOSHROOM, EntityType.SHEEP);
		tag(EntityTags.Forge.MAMMALS_CAMELIDS).add(EntityType.LLAMA, EntityType.TRADER_LLAMA);
		tag(EntityTags.Forge.MAMMALS_CANIDS).add(EntityType.FOX, EntityType.WOLF);
		tag(EntityTags.Forge.MAMMALS_CAPRINES).add(EntityType.GOAT);
		tag(EntityTags.Forge.MAMMALS_EQUINES).add(EntityType.DONKEY, EntityType.HORSE, EntityType.MULE);
		tag(EntityTags.Forge.MAMMALS_FELIDS).add(EntityType.CAT, EntityType.OCELOT);
		tag(EntityTags.Forge.MAMMALS_SWINES).add(EntityType.HOGLIN, EntityType.PIG);
		tag(EntityTags.Forge.MAMMALS_URSIDS).add(EntityType.PANDA, EntityType.POLAR_BEAR);

		tag(EntityTags.Forge.NPC).add(EntityType.PIGLIN, EntityType.VILLAGER, EntityType.WANDERING_TRADER);
		tag(EntityTags.Forge.REPTILES).add(EntityType.TURTLE);
		tag(EntityTags.Forge.UNDEAD).addTags(EntityTags.Forge.UNDEAD_SKELETONS, EntityTags.Forge.UNDEAD_ZOMBIES).add(EntityType.PHANTOM, EntityType.WITHER);
		tag(EntityTags.Forge.UNDEAD_SKELETONS).addTag(EntityTypeTags.SKELETONS).add(EntityType.SKELETON_HORSE);
		tag(EntityTags.Forge.UNDEAD_ZOMBIES).add(EntityType.DROWNED, EntityType.HUSK, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN);
		tag(EntityTags.Forge.VOLCANIC).add(EntityType.STRIDER);
	}

	@Override
	public String getName()
	{
		return "Commonality-EntityTypeTags";
	}
}