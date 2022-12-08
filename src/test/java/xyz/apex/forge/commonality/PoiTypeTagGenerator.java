package xyz.apex.forge.commonality;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

final class PoiTypeTagGenerator extends PoiTypeTagsProvider
{
	PoiTypeTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, ExistingFileHelper fileHelper)
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
		return "Commonality-PoiTypeTags";
	}
}
