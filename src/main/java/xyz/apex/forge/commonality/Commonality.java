package xyz.apex.forge.commonality;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(Commonality.ID)
public final class Commonality
{
	public static final String ID = "commonality";

	public Commonality()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onGatherData);
	}

	private void onGatherData(GatherDataEvent event)
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
