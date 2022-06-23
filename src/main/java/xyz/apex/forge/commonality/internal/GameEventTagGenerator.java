package xyz.apex.forge.commonality.internal;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.GameEventTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

final class GameEventTagGenerator extends GameEventTagsProvider
{
	GameEventTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, DataSetup.ID, fileHelper);
	}

	@Override
	protected void addTags()
	{
	}

	@Override
	public String getName()
	{
		return "Commonality-GameEventTags";
	}
}
