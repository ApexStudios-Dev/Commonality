package xyz.apex.forge.commonality.data;

import org.apache.commons.lang3.Validate;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public final class DataSetup
{
	static final String DATA_ID = "commonality";
	private static boolean setup = false;

	public static void setup()
	{
		if(setup)
			return;

		Validate.isTrue(setup == false);
		setup = true;
		FMLJavaModLoadingContext.get().getModEventBus().addListener(DataSetup::onGatherData);
	}

	private static void onGatherData(GatherDataEvent event)
	{
		var generator = event.getGenerator();
		var fileHelper = event.getExistingFileHelper();

		if(event.includeClient())
		{

		}

		if(event.includeServer())
		{
			var blockTags = new BlockTagGenerator(generator, fileHelper);

			generator.addProvider(new BiomeTagGenerator(generator, fileHelper));
			generator.addProvider(new BlockEntityTypeTagGenerator(generator, blockTags, fileHelper));
			generator.addProvider(blockTags);
			generator.addProvider(new EntityTypeTagGenerator(generator, fileHelper));
			generator.addProvider(new FluidTagGenerator(generator, fileHelper));
			generator.addProvider(new GameEventTagGenerator(generator, fileHelper));
			generator.addProvider(new ItemTagGenerator(generator, blockTags, fileHelper));
			generator.addProvider(new StructureTagGenerator(generator, fileHelper));
		}
	}
}
