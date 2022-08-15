package xyz.apex.forge.commonality;

import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public final class Commonality
{
	public static void onGatherData()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(EventPriority.NORMAL, false, GatherDataEvent.class, event -> {
			var generator = event.getGenerator();
			var fileHelper = event.getExistingFileHelper();

			var includeClient = event.includeClient();
			var includeServer = event.includeServer();

			if(includeClient)
			{
			}

			if(includeServer)
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
		});
	}
}