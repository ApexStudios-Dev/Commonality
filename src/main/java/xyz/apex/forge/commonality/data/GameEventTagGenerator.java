package xyz.apex.forge.commonality.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.GameEventTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class GameEventTagGenerator extends GameEventTagsProvider
{
	GameEventTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper)
	{
		super(generator, DataSetup.DATA_ID, fileHelper);
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
