package xyz.apex.forge.commonality;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

final class PaintingVariantTagGenerator extends PaintingVariantTagsProvider
{
	PaintingVariantTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, ExistingFileHelper fileHelper)
	{
		super(output, completableFuture, Mods.COMMONALITY, fileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider)
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-PaintingVariantTags";
	}
}
