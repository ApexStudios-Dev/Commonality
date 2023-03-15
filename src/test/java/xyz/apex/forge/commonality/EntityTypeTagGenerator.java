package xyz.apex.forge.commonality;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;
import xyz.apex.forge.commonality.tags.EntityTags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
final class EntityTypeTagGenerator extends EntityTypeTagsProvider
{
	EntityTypeTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, ExistingFileHelper fileHelper)
	{
		super(output, completableFuture, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider)
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
