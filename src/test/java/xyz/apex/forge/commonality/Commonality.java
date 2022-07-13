package xyz.apex.forge.commonality;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public final class Commonality
{
	public static void onGatherData()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(EventPriority.NORMAL, false, GatherDataEvent.class, event -> {
			var generator = event.getGenerator();
			var fileHelper = event.getExistingFileHelper();

			var includeClient = event.includeClient();
			var includeServer = event.includeServer();

			var blockTags = new BlockTagGenerator(generator, fileHelper);

			generator.addProvider(includeServer, new BannerPatternTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new BiomeTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new BlockEntityTypeTagGenerator(generator, blockTags, fileHelper));
			generator.addProvider(includeServer, new CatVariantTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, blockTags);
			generator.addProvider(includeServer, new EntityTypeTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new FlatLevelGeneratorPresetTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new FluidTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new GameEventTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new InstrumentTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new ItemTagGenerator(generator, blockTags, fileHelper));
			generator.addProvider(includeServer, new PaintingVariantTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new PoiTypeTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new StructureTagGenerator(generator, fileHelper));
			generator.addProvider(includeServer, new WorldPresetTagGenerator(generator, fileHelper));
		});
	}
}