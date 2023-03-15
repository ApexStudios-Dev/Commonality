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
			var lookupProvider = event.getLookupProvider();
			var output = generator.getPackOutput();

			var includeClient = event.includeClient();
			var includeServer = event.includeServer();

			var blockTags = new BlockTagGenerator(output, lookupProvider, fileHelper);

			generator.addProvider(includeServer, new BannerPatternTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new BiomeTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new BlockEntityTypeTagGenerator(output, lookupProvider, blockTags, fileHelper));
			generator.addProvider(includeServer, new CatVariantTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, blockTags);
			generator.addProvider(includeServer, new EntityTypeTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new FlatLevelGeneratorPresetTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new FluidTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new GameEventTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new InstrumentTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new ItemTagGenerator(output, lookupProvider, blockTags.contentsGetter(), fileHelper));
			generator.addProvider(includeServer, new PaintingVariantTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new PoiTypeTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new StructureTagGenerator(output, lookupProvider, fileHelper));
			generator.addProvider(includeServer, new WorldPresetTagGenerator(output, lookupProvider, fileHelper));
		});
	}
}
