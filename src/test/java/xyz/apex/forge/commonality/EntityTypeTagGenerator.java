package xyz.apex.forge.commonality;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;

import xyz.apex.forge.commonality.tags.EntityTags;

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
	}

	@Override
	public String getName()
	{
		return "Commonality-EntityTypeTags";
	}
}