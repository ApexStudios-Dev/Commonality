package xyz.apex.forge.commonality.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;

import xyz.apex.forge.commonality.init.EntityTags;

public final class EntityTypeTagGenerator extends EntityTypeTagsProvider
{
	EntityTypeTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, DataSetup.DATA_ID, fileHelper);
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
