package xyz.apex.forge.commonality;

import net.minecraft.ChatFormatting;
import net.minecraft.SharedConstants;
import net.minecraft.SystemReport;
import net.minecraft.Util;
import net.minecraft.advancements.critereon.*;
import net.minecraft.commands.Commands;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.StateHolder;
import net.minecraft.world.level.chunk.storage.ChunkSerializer;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

import java.util.UUID;

// Some elements in here could be in ClientConstants
// but moved here to allow usage of them in common code
// without needing to manually create them or risk crashing the game
// by referencing client code on dedicated servers
//
// Good example would be the 'Textures' which are mostly used for
// rendering which is client only, but its nice to have access to these anywhere we want
@SuppressWarnings({ "unused", "deprecation" })
public interface Constants
{
	interface Common
	{
		boolean SNAPSHOT = SharedConstants.SNAPSHOT;
		int WORLD_VERSION = SharedConstants.WORLD_VERSION;
		String VERSION_STRING = SharedConstants.VERSION_STRING;
		String RELEASE_TARGET = SharedConstants.RELEASE_TARGET;
		int RESOURCE_PACK_FORMAT = SharedConstants.RESOURCE_PACK_FORMAT;
		int DATA_PACK_FORMAT = SharedConstants.DATA_PACK_FORMAT;
		int MAX_CHAT_LENGTH = SharedConstants.MAX_CHAT_LENGTH;
		int MAX_COMMAND_LENGTH = SharedConstants.MAX_COMMAND_LENGTH;
		int MAX_RENDER_DISTANCE = SharedConstants.MAX_RENDER_DISTANCE;
		int TICKS_PER_SECOND = SharedConstants.TICKS_PER_SECOND;
		int TICKS_PER_MINUTE = SharedConstants.TICKS_PER_MINUTE;
		int TICKS_PER_GAME_DAY = SharedConstants.TICKS_PER_GAME_DAY;
		float AVERAGE_GAME_TICKS_PER_RANDOM_TICK_PER_BLOCK = SharedConstants.AVERAGE_GAME_TICKS_PER_RANDOM_TICK_PER_BLOCK;
		float AVERAGE_RANDOM_TICKS_PER_BLOCK_PER_MINUTE = SharedConstants.AVERAGE_RANDOM_TICKS_PER_BLOCK_PER_MINUTE;
		float AVERAGE_RANDOM_TICKS_PER_BLOCK_PER_GAME_DAY = SharedConstants.AVERAGE_RANDOM_TICKS_PER_BLOCK_PER_GAME_DAY;

		long BYTES_PER_MEBIBYTE = SystemReport.BYTES_PER_MEBIBYTE;
		long ONE_GIGA = 1000000000L; // SystemReport.ONE_GIGA;
		String OPERATING_SYSTEM = "%s (%s) version %s".formatted(System.getProperty("os.name"), System.getProperty("os.arch"), System.getProperty("os.version")); // SystemReport.OPERATING_SYSTEM;
		String JAVA_VERSION = "%s, %s".formatted(System.getProperty("java.version"), System.getProperty("java.vendor")); // SystemReport.JAVA_VERSION;
		String JAVA_VM_VERSION = "%s (%s), %s".formatted(System.getProperty("java.vm.name"), System.getProperty("java.vm.info"), System.getProperty("java.vm.vendor")); // SystemReport.JAVA_VM_VERSION;

		char CHAT_FORMATTING_PREFIX = ChatFormatting.PREFIX_CODE;

		UUID NIL_UUID = Util.NIL_UUID;

		int MAX_TICKS_PER_UPDATE = 10; // Minecraft.MAX_TICKS_PER_UPDATE;

		float DEFAULT_VOLUME = 1F; // Options.DEFAULT_VOLUME;

		String DEFAULT_LAYER = "main"; // ModelLayers.DEFAULT_LAYER;

		String SKIN_URL_TEMPLATE = "http://skins.minecraft.net/MinecraftSkins/%s.png"; // AbstractClientPlayer.SKIN_URL_TEMPLATE;

		int OP_LEVEL_ALL = Commands.LEVEL_ALL;
		int OP_LEVEL_MODERATORS = Commands.LEVEL_MODERATORS;
		int OP_LEVEL_GAMEMASTERS = Commands.LEVEL_GAMEMASTERS;
		int OP_LEVEL_ADMINS = Commands.LEVEL_ADMINS;
		int OP_LEVEL_OWNERS = Commands.LEVEL_OWNERS;

		Direction[] DIRECTIONS = Direction.values();

		UUID SPEED_MODIFIER_SPRINTING_UUID = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"); // LivingEntity.SPEED_MODIFIER_SPRINTING_UUID;
		UUID SPEED_MODIFIER_SOUL_SPEED_UUID = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038"); // LivingEntity.SPEED_MODIFIER_SOUL_SPEED_UUID;
		UUID SPEED_MODIFIER_POWDER_SNOW_UUID = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce"); // LivingEntity.SPEED_MODIFIER_POWDER_SNOW_UUID;
		UUID HORSE_ARMOR_MODIFIER_UUID = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295"); // Horse.ARMOR_MODIFIER_UUID;
		UUID ENDERMAN_SPEED_MODIFIER_ATTACKING_UUID = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0"); // EnderMan.SPEED_MODIFIER_ATTACKING_UUID;
		UUID SHULKER_COVERED_ARMOR_MODIFIER_UUID = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F"); // Shulker.COVERED_ARMOR_MODIFIER_UUID;
		UUID WITCH_SPEED_MODIFIER_DRINKING_UUID = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E"); // Witch.SPEED_MODIFIER_DRINKING_UUID;
		UUID ZOMBIE_SPEED_MODIFIER_BABY_UUID = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836"); // Zombie.SPEED_MODIFIER_BABY_UUID;
		UUID ZOMBIEFIED_PIGLIN_SPEED_MODIFIER_ATTACKING_UUID = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718"); // ZombifiedPiglin.SPEED_MODIFIER_ATTACKING_UUID;
		UUID PIGLIN_SPEED_MODIFIER_BABY_UUID = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667"); // Piglin.SPEED_MODIFIER_BABY_UUID;

		// ArmorItem.ARMOR_MODIFIER_UUID_PER_SLOT;
		UUID ARMOR_MODIFIER_UUID_HELMET = UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B");
		UUID ARMOR_MODIFIER_UUID_CHESTPLATE = UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D");
		UUID ARMOR_MODIFIER_UUID_LEGGINGS = UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E");
		UUID ARMOR_MODIFIER_UUID_BOOTS = UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150");

		int[] ARMOR_HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 }; // ArmorMaterials.HEALTH_PER_SLOT;

		String HORSE_TEXTURE_FOLDER = "textures/entity/horse/"; // HorseArmorItem.TEX_FOLDER;

		UUID ITEM_BASE_ATTACK_DAMAGE_UUID = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF"); // Item.BASE_ATTACK_DAMAGE_UUID;
		UUID ITEM_BASE_ATTACK_SPEED_UUID = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"); // Item.BASE_ATTACK_SPEED_UUID;

		int INVALID_COLOR = -1; // BlockColors.DEFAULT; | ItemColors.DEFAULT;
	}

	interface KeyCategories
	{
		String MOVEMENT = "key.categories.movement"; // KeyMapping.CATEGORY_MOVEMENT;
		String MISC = "key.categories.misc"; // KeyMapping.CATEGORY_MISC;
		String MULTIPLAYER = "key.categories.multiplayer"; // KeyMapping.CATEGORY_MULTIPLAYER;
		String GAMEPLAY = "key.categories.gameplay"; // KeyMapping.CATEGORY_GAMEPLAY;
		String INVENTORY = "key.categories.inventory"; // KeyMapping.CATEGORY_INVENTORY;
		String INTERFACE = "key.categories.ui"; // KeyMapping.CATEGORY_INTERFACE;
		String CREATIVE = "key.categories.creative"; // KeyMapping.CATEGORY_CREATIVE;
	}

	interface ResourceLocations
	{
		ResourceLocation ATLAS_BLOCKS = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/blocks.png"); // InventoryMenu.BLOCK_ATLAS; // TextureAtlas.LOCATION_BLOCKS;
		ResourceLocation ATLAS_PARTICLES = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/particles.png"); // TextureAtlas.LOCATION_PARTICLES;
		ResourceLocation COLORMAP_FOLIAGE = new ResourceLocation(Mods.MINECRAFT, "textures/colormap/foliage.png"); // FoliageColorReloadListener.LOCATION;
		ResourceLocation COLORMAP_GRASS = new ResourceLocation(Mods.MINECRAFT, "textures/colormap/grass.png"); // GrassColorReloadListener.LOCATION;

		// GameRenderer.EFFECTS;
		ResourceLocation SHADER_NOTCH = new ResourceLocation(Mods.MINECRAFT, "shaders/post/notch.json");
		ResourceLocation SHADER_FXAA = new ResourceLocation(Mods.MINECRAFT, "shaders/post/fxaa.json");
		ResourceLocation SHADER_ART = new ResourceLocation(Mods.MINECRAFT, "shaders/post/art.json");
		ResourceLocation SHADER_BUMPY = new ResourceLocation(Mods.MINECRAFT, "shaders/post/bumpy.json");
		ResourceLocation SHADER_BLOBS2 = new ResourceLocation(Mods.MINECRAFT, "shaders/post/blobs2.json");
		ResourceLocation SHADER_PENCIL = new ResourceLocation(Mods.MINECRAFT, "shaders/post/pencil.json");
		ResourceLocation SHADER_COLOR_CONVOLVE = new ResourceLocation(Mods.MINECRAFT, "shaders/post/color_convolve.json");
		ResourceLocation SHADER_DECONVERGE = new ResourceLocation(Mods.MINECRAFT, "shaders/post/deconverge.json");
		ResourceLocation SHADER_FLIP = new ResourceLocation(Mods.MINECRAFT, "shaders/post/flip.json");
		ResourceLocation SHADER_INVERT = new ResourceLocation(Mods.MINECRAFT, "shaders/post/invert.json");
		ResourceLocation SHADER_NTSC = new ResourceLocation(Mods.MINECRAFT, "shaders/post/ntsc.json");
		ResourceLocation SHADER_OUTLINE = new ResourceLocation(Mods.MINECRAFT, "shaders/post/outline.json");
		ResourceLocation SHADER_PHOSPHOR = new ResourceLocation(Mods.MINECRAFT, "shaders/post/phosphor.json");
		ResourceLocation SHADER_SCAN_PINCUSHION = new ResourceLocation(Mods.MINECRAFT, "shaders/post/scan_pincushion.json");
		ResourceLocation SHADER_SOBEL = new ResourceLocation(Mods.MINECRAFT, "shaders/post/sobel.json");
		ResourceLocation SHADER_BITS = new ResourceLocation(Mods.MINECRAFT, "shaders/post/bits.json");
		ResourceLocation SHADER_DESATURATE = new ResourceLocation(Mods.MINECRAFT, "shaders/post/desaturate.json");
		ResourceLocation SHADER_GREEN = new ResourceLocation(Mods.MINECRAFT, "shaders/post/green.json");
		ResourceLocation SHADER_BLUR = new ResourceLocation(Mods.MINECRAFT, "shaders/post/blur.json");
		ResourceLocation SHADER_WOBBLE = new ResourceLocation(Mods.MINECRAFT, "shaders/post/wobble.json");
		ResourceLocation SHADER_BLOBS = new ResourceLocation(Mods.MINECRAFT, "shaders/post/blobs.json");
		ResourceLocation SHADER_ANTIALIAS = new ResourceLocation(Mods.MINECRAFT, "shaders/post/antialias.json");
		ResourceLocation SHADER_CREEPER = new ResourceLocation(Mods.MINECRAFT, "shaders/post/creeper.json");
		ResourceLocation SHADER_SPIDER = new ResourceLocation(Mods.MINECRAFT, "shaders/post/spider.json");
	}

	interface TextureNames
	{
		char REF = '#'; // BlockModel.REFERENCE_CHAR;
		String PARTICLE = "particle"; // BlockModel.PARTICLE_TEXTURE_REFERENCE;

		// ItemModelGenerator.LAYERS
		String LAYER0 = "layer0";
		String LAYER1 = "layer1";
		String LAYER2 = "layer2";
		String LAYER3 = "layer3";
		String LAYER4 = "layer4";

		String ALL = "all"; // TextureSlot.ALL;
		String TEXTURE = "texture"; // TextureSlot.TEXTURE;
		// String PARTICLE = "particle"; // TextureSlot.PARTICLE;
		String END = "end"; // TextureSlot.END;
		String BOTTOM = "bottom"; // TextureSlot.BOTTOM;
		String TOP = "top"; // TextureSlot.TOP;
		String FRONT = "front"; // TextureSlot.FRONT;
		String BACK = "back"; // TextureSlot.BACK;
		String SIDE = "side"; // TextureSlot.SIDE;
		String NORTH = "north"; // TextureSlot.NORTH;
		String SOUTH = "south"; // TextureSlot.SOUTH;
		String EAST = "east"; // TextureSlot.EAST;
		String WEST = "west"; // TextureSlot.WEST;
		String UP = "up"; // TextureSlot.UP;
		String DOWN = "down"; // TextureSlot.DOWN;
		String CROSS = "cross"; // TextureSlot.CROSS;
		String PLANT = "plant"; // TextureSlot.PLANT;
		String WALL = "wall"; // TextureSlot.WALL;
		String RAIL = "rail"; // TextureSlot.RAIL;
		String WOOL = "wool"; // TextureSlot.WOOL;
		String PATTERN = "pattern"; // TextureSlot.PATTERN;
		String PANE = "pane"; // TextureSlot.PANE;
		String EDGE = "edge"; // TextureSlot.EDGE;
		String FAN = "fan"; // TextureSlot.FAN;
		String STEM = "stem"; // TextureSlot.STEM;
		String UPPER_STEM = "upperstem"; // TextureSlot.UPPER_STEM;
		String CROP = "crop"; // TextureSlot.CROP;
		String DIRT = "dirt"; // TextureSlot.DIRT;
		String FIRE = "fire"; // TextureSlot.FIRE;
		String LANTERN = "lantern"; // TextureSlot.LANTERN;
		String PLATFORM = "platform"; // TextureSlot.PLATFORM;
		String UNSTICKY = "unsticky"; // TextureSlot.UNSTICKY;
		String TORCH = "torch"; // TextureSlot.TORCH;
		// String LAYER0 = "layer0"; // TextureSlot.LAYER0;
		String LIT_LOG = "lit_log"; // TextureSlot.LIT_LOG;
		String CANDLE = "candle"; // TextureSlot.CANDLE;
		String INSIDE = "inside"; // TextureSlot.INSIDE;
		String CONTENT = "content"; // TextureSlot.CONTENT;
		String INNER_TOP = "inner_top"; // TextureSlot.INNER_TOP;
	}

	interface Textures
	{
		ResourceLocation DEFAULT_FONT = new ResourceLocation(Mods.MINECRAFT, "default"); // Minecraft.DEFAULT_FONT;
		ResourceLocation UNIFORM_FONT = new ResourceLocation(Mods.MINECRAFT, "uniform"); // Minecraft.UNIFORM_FONT;
		ResourceLocation ALT_FONT = new ResourceLocation(Mods.MINECRAFT, "alt"); // Minecraft.ALT_FONT;
		ResourceLocation MISSING_FONT = new ResourceLocation(Mods.MINECRAFT, "missing"); // FontManager.MISSING_FONT;
		ResourceLocation VIGNETTE = new ResourceLocation(Mods.MINECRAFT, "textures/misc/vignette.png"); // Gui.VIGNETTE_LOCATION;
		ResourceLocation WIDGETS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/widgets.png"); // Gui.WIDGETS_LOCATION;
		ResourceLocation PUMPKIN_BLUR = new ResourceLocation(Mods.MINECRAFT, "textures/misc/pumpkinblur.png"); // Gui.PUMPKIN_BLUR_LOCATION;
		ResourceLocation SPYGLASS_SCOPE = new ResourceLocation(Mods.MINECRAFT, "textures/misc/spyglass_scope.png"); // Gui.SPYGLASS_SCOPE_LOCATION;
		ResourceLocation POWDER_SNOW_OUTLINE = new ResourceLocation(Mods.MINECRAFT, "textures/misc/powder_snow_outline.png"); // Gui.POWDER_SNOW_OUTLINE_LOCATION;
		ResourceLocation BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/options_background.png"); // GuiComponent.BACKGROUND_LOCATION;
		ResourceLocation STAT_ICONS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/stats_icons.png"); // GuiComponent.STATS_ICON_LOCATION;
		ResourceLocation GUI_ICONS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/icons.png"); // GuiComponent.GUI_ICONS_LOCATION;
		ResourceLocation MAP_ICONS = new ResourceLocation(Mods.MINECRAFT, "textures/map/map_icons.png"); // MapRenderer.MAP_ICONS_LOCATION;
		// ResourceLocation WIDGETS = WIDGETS; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/widgets.png"); // AbstractWidget.WIDGETS_LOCATION;
		ResourceLocation GUI_BARS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/bars.png"); // BossHealthOverlay.GUI_BARS_LOCATION;
		ResourceLocation CHECKBOX = new ResourceLocation(Mods.MINECRAFT, "textures/gui/checkbox.png"); // Checkbox.TEXTURE;
		// ResourceLocation WIDGETS = WIDGETS; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/widgets.png"); // SpectatorGui.WIDGETS_LOCATION;
		ResourceLocation SPECTATOR_WIDGETS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/spectator_widgets.png"); // SpectatorGui.SPECTATOR_LOCATION;
		ResourceLocation DEMO_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/demo_background.png"); // DemoIntroScreen.DEMO_BACKGROUND_LOCATION;
		ResourceLocation MOJANG_STUDIOS_LOGO = new ResourceLocation(Mods.MINECRAFT, "textures/gui/title/mojangstudios.png"); // LoadingOverlay.MOJANG_STUDIOS_LOGO_LOCATION;
		ResourceLocation PANORAMA_OVERLAY = new ResourceLocation(Mods.MINECRAFT, "textures/gui/title/background/panorama_overlay.png"); // TitleScreen.PANORAMA_OVERLAY;
		ResourceLocation ACCESSIBILITY = new ResourceLocation(Mods.MINECRAFT, "textures/gui/accessibility.png"); // TitleScreen.ACCESSIBILITY_TEXTURE;
		ResourceLocation MINECRAFT_LOGO = new ResourceLocation(Mods.MINECRAFT, "textures/gui/title/minecraft.png"); // TitleScreen.MINECRAFT_LOGO;
		ResourceLocation MINECRAFT_EDITION = new ResourceLocation(Mods.MINECRAFT, "textures/gui/title/edition.png"); // TitleScreen.MINECRAFT_EDITION;
		// ResourceLocation LOGO = MINECRAFT_LOGO; // new ResourceLocation("Mods.MINECRAFT, textures/gui/title/minecraft.png"); // WinScreen.LOGO_LOCATION;
		// ResourceLocation EDITION = MINECRAFT_EDITION; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/title/edition.png"); // WinScreen.EDITION_LOCATION;
		// ResourceLocation VIGNETTE = VIGNETTE; // new ResourceLocation(Mods.MINECRAFT, "textures/misc/vignette.png"); // WinScreen.VIGNETTE_LOCATION;
		ResourceLocation ADVANCEMENT_WINDOW = new ResourceLocation(Mods.MINECRAFT, "textures/gui/advancements/window.png"); // AdvancementsScreen.WINDOW_LOCATION;
		ResourceLocation ADVANCEMENT_TABS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/advancements/tabs.png"); // AdvancementsScreen.TABS_LOCATION;
		ResourceLocation ADVANCEMENT_WIDGETS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/advancements/widgets.png"); // AdvancementWidget.WIDGETS_LOCATION;
		ResourceLocation GAMEMODE_SWITCHER = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/gamemode_switcher.png"); // GameModeSwitcherScreen.GAMEMODE_SWITCHER_LOCATION;
		ResourceLocation INVENTORY_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/inventory.png"); // AbstractContainerScreen.INVENTORY_LOCATION;
		ResourceLocation RECIPE_BUTTON = new ResourceLocation(Mods.MINECRAFT, "textures/gui/recipe_button.png"); // AbstractFurnaceScreen.RECIPE_BUTTON_LOCATION;
		ResourceLocation ANVIL_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/anvil.png"); // AnvilScreen.ANVIL_LOCATION;
		ResourceLocation BEACON_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/beacon.png"); // BeaconScreen.BEACON_LOCATION;
		ResourceLocation BLAST_FURNACE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/blast_furnace.png"); // BlastFurnaceScreen.TEXTURE;
		ResourceLocation BOOK = new ResourceLocation(Mods.MINECRAFT, "textures/gui/book.png"); // BookViewScreen.BOOK_LOCATION;
		ResourceLocation BREWING_STAND_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/brewing_stand.png"); // BrewingStandScreen.BREWING_STAND_LOCATION;
		ResourceLocation CARTOGRAPHY_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/cartography_table.png"); // CartographyTableScreen.BG_LOCATION;
		ResourceLocation CHEST_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/generic_54.png"); // ContainerScreen.CONTAINER_BACKGROUND;
		ResourceLocation CRAFTING_TABLE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/crafting_table.png"); // CraftingScreen.CRAFTING_TABLE_LOCATION;
		// ResourceLocation RECIPE_BUTTON = RECIPE_BUTTON; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/recipe_button.png"); // CraftingScreen.RECIPE_BUTTON_LOCATION;
		ResourceLocation CREATIVE_TABS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/creative_inventory/tabs.png"); // CreativeModeInventoryScreen.CREATIVE_TABS_LOCATION;
		ResourceLocation DISPENSER_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/dispenser.png"); // DispenserScreen.CONTAINER_LOCATION;
		// ResourceLocation ALT_FONT = new ResourceLocation(Mods.MINECRAFT, "alt"); // EnchantmentNames.ALT_FONT;
		ResourceLocation ENCHANTING_TABLE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/enchanting_table.png"); // EnchantmentScreen.ENCHANTING_TABLE_LOCATION;
		ResourceLocation ENCHANTING_BOOK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enchanting_table_book.png"); // EnchantmentScreen.ENCHANTING_BOOK_LOCATION;
		ResourceLocation FURNACE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/furnace.png"); // FurnaceScreen.TEXTURE;
		ResourceLocation GRINDSTONE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/grindstone.png"); // GrindstoneScreen.GRINDSTONE_LOCATION;
		ResourceLocation HOPPER_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/hopper.png"); // HopperScreen.HOPPER_LOCATION;
		ResourceLocation HORSE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/horse.png"); // HorseInventoryScreen.HORSE_INVENTORY_LOCATION;
		// ResourceLocation RECIPE_BUTTON = RECIPE_BUTTON; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/recipe_button.png"); // InventoryScreen.RECIPE_BUTTON_LOCATION;
		ResourceLocation LOOM_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/loom.png"); // LoomScreen.BG_LOCATION;
		ResourceLocation VILLAGER_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/villager2.png"); // MerchantScreen.VILLAGER_LOCATION;
		ResourceLocation SHULKER_BOX_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/shulker_box.png"); // ShulkerBoxScreen.CONTAINER_TEXTURE;
		ResourceLocation SMITHING_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/smithing.png"); // SmithingScreen.SMITHING_LOCATION;
		ResourceLocation SMOKER_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/smoker.png"); // SmokerScreen.TEXTURE;
		ResourceLocation STONECUTTER_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/stonecutter.png"); // StonecutterScreen.BG_LOCATION;
		ResourceLocation BUNDLE_BACKGROUND = new ResourceLocation(Mods.MINECRAFT, "textures/gui/container/bundle.png"); // ClientBundleTooltip.TEXTURE_LOCATION;
		ResourceLocation UNKNOWN_SERVER = new ResourceLocation(Mods.MINECRAFT, "textures/misc/unknown_server.png"); // ServerSelectionList.ICON_MISSING;
		ResourceLocation SERVER_SELECTION_OVERLAY = new ResourceLocation(Mods.MINECRAFT, "textures/gui/server_selection.png"); // ServerSelectionList.ICON_OVERLAY_LOCATION;
		ResourceLocation UNKNOWN_PACK = new ResourceLocation(Mods.MINECRAFT, "textures/misc/unknown_pack.png"); // PackSelectionScreen.DEFAULT_ICON;
		ResourceLocation PACK_SELECTION_OVERLAY = new ResourceLocation(Mods.MINECRAFT, "textures/gui/resource_packs.png"); // TransferableSelectionList.ICON_OVERLAY_LOCATION;
		// ResourceLocation RECIPE_BOOK = RECIPE_BUTTON; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/recipe_book.png"); // OverlayRecipeComponent.RECIPE_BOOK_LOCATION;
		ResourceLocation RECIPE_BOOK = new ResourceLocation(Mods.MINECRAFT, "textures/gui/recipe_book.png"); // RecipeBookComponent.RECIPE_BOOK_LOCATION;
		// ResourceLocation RECIPE_BOOK = RECIPE_BUTTON; // new ResourceLocation(Mods.MINECRAFT, "textures/gui/recipe_book.png"); // RecipeButton.RECIPE_BOOK_LOCATION;
		ResourceLocation CHECKMARK = new ResourceLocation("realms", "textures/gui/realms/checkmark.png"); // ChatSelectionScreen.MessageEntry.CHECKMARK_TEXTURE;
		ResourceLocation REPORT_BUTTON = new ResourceLocation(Mods.MINECRAFT, "textures/gui/report_button.png"); // PlayerEntry.REPORT_BUTTON_LOCATION;
		ResourceLocation SOCIAL_INTERACTIONS = new ResourceLocation(Mods.MINECRAFT, "textures/gui/social_interactions.png"); // SocialInteractionsScreen.SOCIAL_INTERACTIONS_LOCATION;
		ResourceLocation UNKNOWN_WORLD = UNKNOWN_SERVER; // new ResourceLocation(Mods.MINECRAFT, "textures/misc/unknown_server.png"); // WorldSelectionList.ICON_MISSING;
		ResourceLocation WORLD_SELECTION_OVERLAY = new ResourceLocation(Mods.MINECRAFT, "textures/gui/world_selection.png"); // WorldSelectionList.ICON_OVERLAY_LOCATION;
		ResourceLocation TRIDENT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/trident.png"); // TridentModel.TEXTURE;
		ResourceLocation NAUSEA = new ResourceLocation(Mods.MINECRAFT, "textures/misc/nausea.png"); // GameRenderer.NAUSEA_LOCATION;
		ResourceLocation MOON = new ResourceLocation(Mods.MINECRAFT, "textures/environment/moon_phases.png"); // LevelRenderer.MOON_LOCATION;
		ResourceLocation SUN = new ResourceLocation(Mods.MINECRAFT, "textures/environment/sun.png"); // LevelRenderer.SUN_LOCATION;
		ResourceLocation CLOUDS = new ResourceLocation(Mods.MINECRAFT, "textures/environment/clouds.png"); // LevelRenderer.CLOUDS_LOCATION;
		ResourceLocation END_SKY = new ResourceLocation(Mods.MINECRAFT, "textures/environment/end_sky.png"); // LevelRenderer.END_SKY_LOCATION;
		ResourceLocation FORCEFIELD = new ResourceLocation(Mods.MINECRAFT, "textures/misc/forcefield.png"); // LevelRenderer.FORCEFIELD_LOCATION;
		ResourceLocation RAIN = new ResourceLocation(Mods.MINECRAFT, "textures/environment/rain.png"); // LevelRenderer.RAIN_LOCATION;
		ResourceLocation SNOW = new ResourceLocation(Mods.MINECRAFT, "textures/environment/snow.png"); // LevelRenderer.SNOW_LOCATION;
		ResourceLocation UNDERWATER = new ResourceLocation(Mods.MINECRAFT, "textures/misc/underwater.png"); // ScreenEffectRenderer.UNDERWATER_LOCATION;
		ResourceLocation SHULKER_SHEET = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/shulker_boxes.png"); // Sheets.SHULKER_SHEET;
		ResourceLocation BED_SHEET = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/beds.png"); // Sheets.BED_SHEET;
		ResourceLocation BANNER_SHEET = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/banner_patterns.png"); // Sheets.BANNER_SHEET;
		ResourceLocation SHIELD_SHEET = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/shield_patterns.png"); // Sheets.SHIELD_SHEET;
		ResourceLocation SIGN_SHEET = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/signs.png"); // Sheets.SIGN_SHEET;
		ResourceLocation CHEST_SHEET = new ResourceLocation(Mods.MINECRAFT, "textures/atlas/chest.png"); // Sheets.CHEST_SHEET;
		ResourceLocation BEACON_BEAM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/beacon_beam.png"); // BeaconRenderer.BEAM_LOCATION;

		// SkullBlockRenderer.SKIN_BY_TYPE
		ResourceLocation SKIN_SKELETON = new ResourceLocation(Mods.MINECRAFT, "textures/entity/skeleton/skeleton.png");
		ResourceLocation SKIN_WITHER_SKELETON = new ResourceLocation(Mods.MINECRAFT, "textures/entity/skeleton/wither_skeleton.png");
		ResourceLocation SKIN_ZOMBIE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie/zombie.png");
		ResourceLocation SKIN_CREEPER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/creeper/creeper.png");
		ResourceLocation SKIN_DRAGON = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderdragon/dragon.png");

		ResourceLocation SKIN_STEVE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/steve.png"); // DefaultPlayerSkin.STEVE_SKIN_LOCATION;
		ResourceLocation SKIN_ALEX = new ResourceLocation(Mods.MINECRAFT, "textures/entity/alex.png"); // DefaultPlayerSkin.ALEX_SKIN_LOCATION;
		ResourceLocation GATEWAY_BEAM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/end_gateway_beam.png"); // TheEndGatewayRenderer.BEAM_LOCATION;
		// ResourceLocation END_SKY = END_SKY; // new ResourceLocation(Mods.MINECRAFT, "textures/environment/end_sky.png"); // TheEndPortalRenderer.END_SKY_LOCATION;
		ResourceLocation END_PORTAL = new ResourceLocation(Mods.MINECRAFT, "textures/entity/end_portal.png"); // TheEndPortalRenderer.END_PORTAL_LOCATION;
		ResourceLocation ZOMBIE = SKIN_ZOMBIE; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie/zombie.png"); // AbstractZombieRenderer.ZOMBIE_LOCATION;
		ResourceLocation ALLAY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/allay/allay.png"); // AllayRenderer.ALLAY_TEXTURE;
		ResourceLocation ARMOR_STAND = new ResourceLocation(Mods.MINECRAFT, "textures/entity/armorstand/wood.png"); // ArmorStandRenderer.DEFAULT_SKIN_LOCATION;

		// AxolotlRenderer.TEXTURE_BY_TYPE
		ResourceLocation AXOLOTL_LUCY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/axolotl/axolotl_lucy.png");
		ResourceLocation AXOLOTL_WILD = new ResourceLocation(Mods.MINECRAFT, "textures/entity/axolotl/axolotl_wild.png");
		ResourceLocation AXOLOTL_GOLD = new ResourceLocation(Mods.MINECRAFT, "textures/entity/axolotl/axolotl_gold.png");
		ResourceLocation AXOLOTL_CYAN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/axolotl/axolotl_cyan.png");
		ResourceLocation AXOLOTL_BLUE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/axolotl/axolotl_blue.png");

		ResourceLocation BAT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bat.png"); // BatRenderer.BAT_LOCATION;
		ResourceLocation ANGRY_BEE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bee/bee_angry.png"); // BeeRenderer.ANGRY_BEE_TEXTURE;
		ResourceLocation ANGRY_NECTAR_BEE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bee/bee_angry_nectar.png"); // BeeRenderer.ANGRY_NECTAR_BEE_TEXTURE;
		ResourceLocation BEE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bee/bee.png"); // BeeRenderer.BEE_TEXTURE;
		ResourceLocation NECTAR_BEE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bee/bee_nectar.png"); // BeeRenderer.NECTAR_BEE_TEXTURE;
		ResourceLocation BLAZE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/blaze.png"); // BlazeRenderer.BLAZE_LOCATION;
		ResourceLocation CAVE_SPIDER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/spider/cave_spider.png"); // CaveSpiderRenderer.CAVE_SPIDER_LOCATION;

		// ChestedHorseRenderer.MAP
		ResourceLocation DONKEY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/donkey.png");
		ResourceLocation MULE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/mule.png");

		ResourceLocation CHICKEN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/chicken.png"); // ChickenRenderer.CHICKEN_LOCATION;
		ResourceLocation COD = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fish/cod.png"); // CodRenderer.COD_LOCATION;
		ResourceLocation COW = new ResourceLocation(Mods.MINECRAFT, "textures/entity/cow/cow.png"); // CowRenderer.COW_LOCATION;
		ResourceLocation CREEPER = SKIN_CREEPER; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/creeper/creeper.png"); // CreeperRenderer.CREEPER_LOCATION;
		ResourceLocation DOLPHIN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/dolphin.png"); // DolphinRenderer.DOLPHIN_LOCATION;
		ResourceLocation DRAGON_FIREBALL = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderdragon/dragon_fireball.png"); // DragonFireballRenderer.TEXTURE_LOCATION;
		ResourceLocation DROWNED = new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie/drowned.png"); // DrownedRenderer.DROWNED_LOCATION;
		ResourceLocation GUARDIAN_ELDER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/guardian_elder.png"); // ElderGuardianRenderer.GUARDIAN_ELDER_LOCATION;
		ResourceLocation END_CRYSTAL = new ResourceLocation(Mods.MINECRAFT, "textures/entity/end_crystal/end_crystal.png"); // EndCrystalRenderer.END_CRYSTAL_LOCATION;
		ResourceLocation CRYSTAL_BEAM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/end_crystal/end_crystal_beam.png"); // EnderDragonRenderer.CRYSTAL_BEAM_LOCATION;
		ResourceLocation DRAGON_EXPLODING = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderdragon/dragon_exploding.png"); // EnderDragonRenderer.DRAGON_EXPLODING_LOCATION;
		ResourceLocation DRAGON = SKIN_DRAGON; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderdragon/dragon.png"); // EnderDragonRenderer.DRAGON_LOCATION;
		ResourceLocation DRAGON_EYES = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderdragon/dragon_eyes.png"); // EnderDragonRenderer.DRAGON_EYES_LOCATION;
		ResourceLocation ENDERMAN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderman/enderman.png"); // EndermanRenderer.ENDERMAN_LOCATION;
		ResourceLocation ENDERMITE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/endermite.png"); // EndermiteRenderer.ENDERMITE_LOCATION;
		ResourceLocation EVOKER_FANGS = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/evoker_fangs.png"); // EvokerFangsRenderer.TEXTURE_LOCATION;
		ResourceLocation EVOKER_ILLAGER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/evoker.png"); // EvokerRenderer.EVOKER_ILLAGER;
		ResourceLocation EXPERIENCE_ORB = new ResourceLocation(Mods.MINECRAFT, "textures/entity/experience_orb.png"); // ExperienceOrbRenderer.EXPERIENCE_ORB_LOCATION;
		ResourceLocation FISHING_HOOK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fishing_hook.png"); // FishingHookRenderer.TEXTURE_LOCATION;
		ResourceLocation RED_FOX = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fox/fox.png"); // FoxRenderer.RED_FOX_TEXTURE;
		ResourceLocation RED_FOX_SLEEP = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fox/fox_sleep.png"); // FoxRenderer.RED_FOX_SLEEP_TEXTURE;
		ResourceLocation SNOW_FOX = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fox/snow_fox.png"); // FoxRenderer.SNOW_FOX_TEXTURE;
		ResourceLocation SNOW_FOX_SLEEP = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fox/snow_fox_sleep.png"); // FoxRenderer.SNOW_FOX_SLEEP_TEXTURE;
		ResourceLocation GHAST = new ResourceLocation(Mods.MINECRAFT, "textures/entity/ghast/ghast.png"); // GhastRenderer.GHAST_LOCATION;
		ResourceLocation GHAST_SHOOTING = new ResourceLocation(Mods.MINECRAFT, "textures/entity/ghast/ghast_shooting.png"); // GhastRenderer.GHAST_SHOOTING_LOCATION;
		ResourceLocation GIANT = ZOMBIE; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie/zombie.png"); // GiantMobRenderer.ZOMBIE_LOCATION;
		ResourceLocation GLOW_SQUID = new ResourceLocation(Mods.MINECRAFT, "textures/entity/squid/glow_squid.png"); // GlowSquidRenderer.GLOW_SQUID_LOCATION;
		ResourceLocation GOAT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/goat/goat.png"); // GoatRenderer.GOAT_LOCATION;
		ResourceLocation GUARDIAN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/guardian.png"); // GuardianRenderer.GUARDIAN_LOCATION;
		ResourceLocation GUARDIAN_BEAM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/guardian_beam.png"); // GuardianRenderer.GUARDIAN_BEAM_LOCATION;
		ResourceLocation HOGLIN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/hoglin/hoglin.png"); // HoglinRenderer.HOGLIN_LOCATION;

		// HorseRenderer.LOCATION_BY_VARIANT
		ResourceLocation HORSE_VARIANT_WHITE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_white.png");
		ResourceLocation HORSE_VARIANT_CREAMY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_creamy.png");
		ResourceLocation HORSE_VARIANT_CHESTNUT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_chestnut.png");
		ResourceLocation HORSE_VARIANT_BROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_brown.png");
		ResourceLocation HORSE_VARIANT_BLACK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_black.png");
		ResourceLocation HORSE_VARIANT_GRAY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_gray.png");
		ResourceLocation HORSE_VARIANT_DARKBROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_darkbrown.png");

		ResourceLocation HUMANOID = SKIN_STEVE; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/steve.png"); // HumanoidMobRenderer.DEFAULT_LOCATION;
		ResourceLocation HUSK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie/husk.png"); // HuskRenderer.HUSK_LOCATION;
		ResourceLocation ILLUSIONER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/illusioner.png"); // IllusionerRenderer.ILLUSIONER;
		ResourceLocation IRON_GOLEM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/iron_golem/iron_golem.png"); // IronGolemRenderer.GOLEM_LOCATION;
		ResourceLocation ENCHANT_GLINT = new ResourceLocation(Mods.MINECRAFT, "textures/misc/enchanted_item_glint.png"); // ItemRenderer.ENCHANT_GLINT_LOCATION;
		ResourceLocation LEAD_KNOT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/lead_knot.png"); // LeashKnotRenderer.KNOT_LOCATION;

		// LlamaRenderer.LLAMA_LOCATIONS;
		ResourceLocation LLAMA_CREAMY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/creamy.png");
		ResourceLocation LLAMA_WHITE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/white.png");
		ResourceLocation LLAMA_BROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/brown.png");
		ResourceLocation LLAMA_GRAY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/gray.png");

		ResourceLocation LLAMA_SPIT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/spit.png"); // LlamaSpitRenderer.LLAMA_SPIT_LOCATION;
		ResourceLocation MAGMACUBE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/slime/magmacube.png"); // MagmaCubeRenderer.MAGMACUBE_LOCATION;
		ResourceLocation MINECART = new ResourceLocation(Mods.MINECRAFT, "textures/entity/minecart.png"); // MinecartRenderer.MINECART_LOCATION;

		// MushroomCowRenderer.TEXTURES
		ResourceLocation MUSHROOM_COW_BROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/cow/brown_mooshroom.png");
		ResourceLocation MUSHROOM_COW_RED = new ResourceLocation(Mods.MINECRAFT, "textures/entity/cow/red_mooshroom.png");

		ResourceLocation CAT_OCELOT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/cat/ocelot.png"); // OcelotRenderer.CAT_OCELOT_LOCATION;

		// PandaRenderer.TEXTURES
		ResourceLocation PANDA_NORMAL = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/panda.png");
		ResourceLocation PANDA_LAZY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/lazy_panda.png");
		ResourceLocation PANDA_WORRIED = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/worried_panda.png");
		ResourceLocation PANDA_PLAYFUL = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/playful_panda.png");
		ResourceLocation PANDA_BROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/brown_panda.png");
		ResourceLocation PANDA_WEAK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/weak_panda.png");
		ResourceLocation PANDA_AGGRESSIVE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/panda/aggressive_panda.png");

		// ParrotRenderer.PARROT_LOCATIONS
		ResourceLocation PARROT_RED_BLUE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/parrot/parrot_red_blue.png");
		ResourceLocation PARROT_BLUE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/parrot/parrot_blue.png");
		ResourceLocation PARROT_GREEN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/parrot/parrot_green.png");
		ResourceLocation PARROT_YELLOW_BLUE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/parrot/parrot_yellow_blue.png");
		ResourceLocation PARROT_GREY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/parrot/parrot_grey.png");

		ResourceLocation PHANTOM_LOCATION = new ResourceLocation(Mods.MINECRAFT, "textures/entity/phantom.png"); // PhantomRenderer.PHANTOM_LOCATION;

		// PiglinRenderer.TEXTURES
		ResourceLocation PIGLIN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/piglin/piglin.png");
		ResourceLocation PIGLIN_ZOMBIFIED = new ResourceLocation(Mods.MINECRAFT, "textures/entity/piglin/zombified_piglin.png");
		ResourceLocation PIGLIN_BRUTE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/piglin/piglin_brute.png");

		ResourceLocation PIG = new ResourceLocation(Mods.MINECRAFT, "textures/entity/pig/pig.png"); // PigRenderer.PIG_LOCATION;
		ResourceLocation PILLAGER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/pillager.png"); // PillagerRenderer.PILLAGER;
		ResourceLocation POLAR_BEAR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bear/polarbear.png"); // PolarBearRenderer.BEAR_LOCATION;
		ResourceLocation PUFFERFISH = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fish/pufferfish.png"); // PufferfishRenderer.PUFFER_LOCATION;

		ResourceLocation RABBIT_BROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/brown.png"); // RabbitRenderer.RABBIT_BROWN_LOCATION;
		ResourceLocation RABBIT_WHITE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/white.png"); // RabbitRenderer.RABBIT_WHITE_LOCATION;
		ResourceLocation RABBIT_BLACK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/black.png"); // RabbitRenderer.RABBIT_BLACK_LOCATION;
		ResourceLocation RABBIT_GOLD = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/gold.png"); // RabbitRenderer.RABBIT_GOLD_LOCATION;
		ResourceLocation RABBIT_SALT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/salt.png"); // RabbitRenderer.RABBIT_SALT_LOCATION;
		ResourceLocation RABBIT_WHITE_SPLOTCHED = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/white_splotched.png"); // RabbitRenderer.RABBIT_WHITE_SPLOTCHED_LOCATION;
		ResourceLocation RABBIT_TOAST = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/toast.png"); // RabbitRenderer.RABBIT_TOAST_LOCATION;
		ResourceLocation RABBIT_EVIL = new ResourceLocation(Mods.MINECRAFT, "textures/entity/rabbit/caerbannog.png"); // RabbitRenderer.RABBIT_EVIL_LOCATION;
		ResourceLocation RAVAGER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/ravager.png"); // RavagerRenderer.TEXTURE_LOCATION;
		ResourceLocation SALMON = new ResourceLocation(Mods.MINECRAFT, "textures/entity/fish/salmon.png"); // SalmonRenderer.SALMON_LOCATION;
		ResourceLocation SHEEP = new ResourceLocation(Mods.MINECRAFT, "textures/entity/sheep/sheep.png"); // SheepRenderer.SHEEP_LOCATION;
		ResourceLocation SHULKER_BULLET = new ResourceLocation(Mods.MINECRAFT, "textures/entity/shulker/spark.png"); // ShulkerBulletRenderer.TEXTURE_LOCATION;
		ResourceLocation SHULKER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/shulker/shulker.png"); // ShulkerRenderer.DEFAULT_TEXTURE_LOCATION;
		ResourceLocation SILVERFISH = new ResourceLocation(Mods.MINECRAFT, "textures/entity/silverfish.png"); // SilverfishRenderer.SILVERFISH_LOCATION;
		ResourceLocation SKELETON = SKIN_SKELETON; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/skeleton/skeleton.png"); // SkeletonRenderer.SKELETON_LOCATION;
		ResourceLocation SLIME = new ResourceLocation(Mods.MINECRAFT, "textures/entity/slime/slime.png"); // SlimeRenderer.SLIME_LOCATION;
		ResourceLocation SNOW_GOLEM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/snow_golem.png"); // SnowGolemRenderer.SNOW_GOLEM_LOCATION;
		ResourceLocation SPECTRAL_ARROW = new ResourceLocation(Mods.MINECRAFT, "textures/entity/projectiles/spectral_arrow.png"); // SpectralArrowRenderer.SPECTRAL_ARROW_LOCATION;
		ResourceLocation SPIDER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/spider/spider.png"); // SpiderRenderer.SPIDER_LOCATION;
		ResourceLocation SQUID = new ResourceLocation(Mods.MINECRAFT, "textures/entity/squid/squid.png"); // SquidRenderer.SQUID_LOCATION;
		ResourceLocation STRAY_SKELETON = new ResourceLocation(Mods.MINECRAFT, "textures/entity/skeleton/stray.png"); // StrayRenderer.STRAY_SKELETON_LOCATION;
		ResourceLocation STRIDER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/strider/strider.png"); // StriderRenderer.STRIDER_LOCATION;
		ResourceLocation COLD = new ResourceLocation(Mods.MINECRAFT, "textures/entity/strider/strider_cold.png"); // StriderRenderer.COLD_LOCATION;
		ResourceLocation TADPOLE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/tadpole/tadpole.png"); // TadpoleRenderer.TADPOLE_TEXTURE;
		// ResourceLocation TRIDENT = TRIDENT; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/trident.png"); // ThrownTridentRenderer.TRIDENT_LOCATION;
		ResourceLocation NORMAL_ARROW = new ResourceLocation(Mods.MINECRAFT, "textures/entity/projectiles/arrow.png"); // TippableArrowRenderer.NORMAL_ARROW_LOCATION;
		ResourceLocation TIPPED_ARROW = new ResourceLocation(Mods.MINECRAFT, "textures/entity/projectiles/tipped_arrow.png"); // TippableArrowRenderer.TIPPED_ARROW_LOCATION;
		ResourceLocation TURTLE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/turtle/big_sea_turtle.png"); // TurtleRenderer.TURTLE_LOCATION;

		// UndeadHorseRenderer.MAP
		ResourceLocation ZOMBIE_HORSE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_zombie.png");
		ResourceLocation SKELETON_HORSE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_skeleton.png");

		ResourceLocation VEX = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/vex.png"); // VexRenderer.VEX_LOCATION;
		ResourceLocation VEX_CHARGING = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/vex_charging.png"); // VexRenderer.VEX_CHARGING_LOCATION;
		ResourceLocation VILLAGER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/villager/villager.png"); // VillagerRenderer.VILLAGER_BASE_SKIN;
		ResourceLocation VINDICATOR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/illager/vindicator.png"); // VindicatorRenderer.VINDICATOR;
		ResourceLocation WANDERING_TRADER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wandering_trader.png"); // WanderingTraderRenderer.VILLAGER_BASE_SKIN;
		ResourceLocation WARDEN_ = new ResourceLocation(Mods.MINECRAFT, "textures/entity/warden/warden.png"); // WardenRenderer.TEXTURE;
		ResourceLocation WARDEN_BIOLUMINESCENT = new ResourceLocation(Mods.MINECRAFT, "textures/entity/warden/warden_bioluminescent_layer.png"); // WardenRenderer.BIOLUMINESCENT_LAYER_TEXTURE;
		ResourceLocation WARDEN_HEART = new ResourceLocation(Mods.MINECRAFT, "textures/entity/warden/warden_heart.png"); // WardenRenderer.HEART_TEXTURE;
		ResourceLocation WARDEN_PULSATING_SPOTS_1 = new ResourceLocation(Mods.MINECRAFT, "textures/entity/warden/warden_pulsating_spots_1.png"); // WardenRenderer.PULSATING_SPOTS_TEXTURE_1;
		ResourceLocation WARDEN_PULSATING_SPOTS_2 = new ResourceLocation(Mods.MINECRAFT, "textures/entity/warden/warden_pulsating_spots_2.png"); // WardenRenderer.PULSATING_SPOTS_TEXTURE_2;
		ResourceLocation WITCH = new ResourceLocation(Mods.MINECRAFT, "textures/entity/witch.png"); // WitchRenderer.WITCH_LOCATION;
		ResourceLocation WITHER_INVULNERABLE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wither/wither_invulnerable.png"); // WitherBossRenderer.WITHER_INVULNERABLE_LOCATION;
		ResourceLocation WITHER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wither/wither.png"); // WitherBossRenderer.WITHER_LOCATION;
		ResourceLocation WITHER_SKELETON = SKIN_WITHER_SKELETON; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/skeleton/wither_skeleton.png"); // WitherSkeletonRenderer.WITHER_SKELETON_LOCATION;
		// ResourceLocation WITHER_INVULNERABLE = WITHER_INVULNERABLE; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/wither/wither_invulnerable.png"); // WitherSkullRenderer.WITHER_INVULNERABLE_LOCATION;
		// ResourceLocation WITHER = WITHER; // new ResourceLocation(Mods.MINECRAFT, "textures/entity/wither/wither.png"); // WitherSkullRenderer.WITHER_LOCATION;
		ResourceLocation WOLF = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wolf/wolf.png"); // WolfRenderer.WOLF_LOCATION;
		ResourceLocation WOLF_TAME = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wolf/wolf_tame.png"); // WolfRenderer.WOLF_TAME_LOCATION;
		ResourceLocation WOLF_ANGRY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wolf/wolf_angry.png"); // WolfRenderer.WOLF_ANGRY_LOCATION;
		ResourceLocation ZOGLIN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/hoglin/zoglin.png"); // ZoglinRenderer.ZOGLIN_LOCATION;
		ResourceLocation ZOMBIE_VILLAGER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie_villager/zombie_villager.png"); // ZombieVillagerRenderer.ZOMBIE_VILLAGER_LOCATION;
		ResourceLocation BEE_STINGER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/bee/bee_stinger.png"); // BeeStingerLayer.BEE_STINGER_LOCATION;
		ResourceLocation CAT_COLLAR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/cat/cat_collar.png"); // CatCollarLayer.CAT_COLLAR_LOCATION;
		ResourceLocation CREEPER_ARMOR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/creeper/creeper_armor.png"); // CreeperPowerLayer.POWER_LOCATION;
		ResourceLocation DROWNED_OUTER = new ResourceLocation(Mods.MINECRAFT, "textures/entity/zombie/drowned_outer_layer.png"); // DrownedOuterLayer.DROWNED_OUTER_LAYER_LOCATION;
		ResourceLocation ELYTRA = new ResourceLocation(Mods.MINECRAFT, "textures/entity/elytra.png"); // ElytraLayer.WINGS_LOCATION;
		ResourceLocation ENDERMAN_EYES = new ResourceLocation(Mods.MINECRAFT, "textures/entity/enderman/enderman_eyes.png"); // EnderEyesLayer.ENDERMAN_EYES;

		// HorseMarkingLayer.LOCATION_BY_MARKINGS
		ResourceLocation HORSE_MARKINGS_WHITE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_markings_white.png");
		ResourceLocation HORSE_MARKINGS_WHITE_FIELD = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_markings_whitefield.png");
		ResourceLocation HORSE_MARKINGS_WHITE_DOTS = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_markings_whitedots.png");
		ResourceLocation HORSE_MARKINGS_BLACK_DOTS = new ResourceLocation(Mods.MINECRAFT, "textures/entity/horse/horse_markings_blackdots.png");

		// IronGolemCrackinessLayer.resourceLocations
		ResourceLocation IRON_GOLEM_CRACKINESS_LOW = new ResourceLocation(Mods.MINECRAFT, "textures/entity/iron_golem/iron_golem_crackiness_low.png");
		ResourceLocation IRON_GOLEM_CRACKINESS_MEDIUM = new ResourceLocation(Mods.MINECRAFT, "textures/entity/iron_golem/iron_golem_crackiness_medium.png");
		ResourceLocation IRON_GOLEM_CRACKINESS_HIGH = new ResourceLocation(Mods.MINECRAFT, "textures/entity/iron_golem/iron_golem_crackiness_high.png");

		// LlamaDecorLayer.TEXTURE_LOCATION
		ResourceLocation TRADER_LLAMA_DECOR_WHITE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/white.png");
		ResourceLocation TRADER_LLAMA_DECOR_ORANGE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/orange.png");
		ResourceLocation TRADER_LLAMA_DECOR_MANGENTA = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/magenta.png");
		ResourceLocation TRADER_LLAMA_DECOR_LIGHT_BLUE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/light_blue.png");
		ResourceLocation TRADER_LLAMA_DECOR_YELLOW = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/yellow.png");
		ResourceLocation TRADER_LLAMA_DECOR_LIME = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/lime.png");
		ResourceLocation TRADER_LLAMA_DECOR_PINK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/pink.png");
		ResourceLocation TRADER_LLAMA_DECOR_GRAY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/gray.png");
		ResourceLocation TRADER_LLAMA_DECOR_LIGHT_GRAY = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/light_gray.png");
		ResourceLocation TRADER_LLAMA_DECOR_CYAN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/cyan.png");
		ResourceLocation TRADER_LLAMA_DECOR_PURPLE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/purple.png");
		ResourceLocation TRADER_LLAMA_DECOR_BLUE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/blue.png");
		ResourceLocation TRADER_LLAMA_DECOR_BROWN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/brown.png");
		ResourceLocation TRADER_LLAMA_DECOR_GREEN = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/green.png");
		ResourceLocation TRADER_LLAMA_DECOR_RED = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/red.png");
		ResourceLocation TRADER_LLAMA_DECOR_BLACK = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/black.png");

		ResourceLocation TRADER_LLAMA = new ResourceLocation(Mods.MINECRAFT, "textures/entity/llama/decor/trader_llama.png"); // LlamaDecorLayer.TRADER_LLAMA;
		ResourceLocation PHANTOM_EYES = new ResourceLocation(Mods.MINECRAFT, "textures/entity/phantom_eyes.png"); // PhantomEyesLayer.PHANTOM_EYES;
		ResourceLocation SHEEP_FUR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/sheep/sheep_fur.png"); // SheepFurLayer.SHEEP_FUR_LOCATION;
		ResourceLocation SPIDER_EYES = new ResourceLocation(Mods.MINECRAFT, "textures/entity/spider_eyes.png"); //SpiderEyesLayer.SPIDER_EYES;
		ResourceLocation TRIDENT_RIPTIDE = new ResourceLocation(Mods.MINECRAFT, "textures/entity/trident_riptide.png"); // SpinAttackEffectLayer.TEXTURE;
		ResourceLocation STRAY_CLOTHES = new ResourceLocation(Mods.MINECRAFT, "textures/entity/skeleton/stray_overlay.png"); // StrayClothingLayer.STRAY_CLOTHES_LOCATION;
		ResourceLocation WITHER_ARMOR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wither/wither_armor.png"); // WitherArmorLayer.WITHER_ARMOR_LOCATION;
		ResourceLocation WOLF_COLLAR = new ResourceLocation(Mods.MINECRAFT, "textures/entity/wolf/wolf_collar.png"); // WolfCollarLayer.WOLF_COLLAR_LOCATION;
		ResourceLocation MISSING = new ResourceLocation(Mods.MINECRAFT, "missingno"); // MissingTextureAtlasSprite.MISSING_TEXTURE_LOCATION;
		ResourceLocation EMPTY_ARMOR_SLOT_HELMET = new ResourceLocation(Mods.MINECRAFT, "item/empty_armor_slot_helmet"); // InventoryMenu.EMPTY_ARMOR_SLOT_HELMET;
		ResourceLocation EMPTY_ARMOR_SLOT_CHESTPLATE = new ResourceLocation(Mods.MINECRAFT, "item/empty_armor_slot_chestplate"); // InventoryMenu.EMPTY_ARMOR_SLOT_CHESTPLATE;
		ResourceLocation EMPTY_ARMOR_SLOT_LEGGINGS = new ResourceLocation(Mods.MINECRAFT, "item/empty_armor_slot_leggings"); // InventoryMenu.EMPTY_ARMOR_SLOT_LEGGINGS;
		ResourceLocation EMPTY_ARMOR_SLOT_BOOTS = new ResourceLocation(Mods.MINECRAFT, "item/empty_armor_slot_boots"); // InventoryMenu.EMPTY_ARMOR_SLOT_BOOTS;
		ResourceLocation EMPTY_ARMOR_SLOT_SHIELD = new ResourceLocation(Mods.MINECRAFT, "item/empty_armor_slot_shield"); // InventoryMenu.EMPTY_ARMOR_SLOT_SHIELD;
	}

	interface NbtNames
	{
		String CUSTOM_MODEL_DATA = "CustomModelData"; // ItemProperties.TAG_CUSTOM_MODEL_DATA;

		String ENTITY_ID = Entity.ID_TAG;
		String ENTITY_PASSENGERS = Entity.PASSENGERS_TAG;
		String ENTITY_UUID = Entity.UUID_TAG;
		String MOB_LEASH = Mob.LEASH_TAG;
		String GOSSIP_TARGET = "Target"; // GossipContainer.GossipEntry.TAG_TARGET;
		String GOSSIP_TYPE = "Type"; // GossipContainer.GossipEntry.TAG_TYPE;
		String GOSSIP_VALUE = "Value"; // GossipContainer.GossipEntry.TAG_VALUE;
		String BEE_ENTITY_CROPS_GROWN_SINCE_POLLINATION = Bee.TAG_CROPS_GROWN_SINCE_POLLINATION;
		String BEE_ENTITY_CANNOT_ENTER_HIVE_TICKS = Bee.TAG_CANNOT_ENTER_HIVE_TICKS;
		String BEE_ENTITY_TICKS_SINCE_POLLINATION = Bee.TAG_TICKS_SINCE_POLLINATION;
		String BEE_ENTITY_HAS_STUNG = Bee.TAG_HAS_STUNG;
		String BEE_ENTITY_HAS_NECTAR = Bee.TAG_HAS_NECTAR;
		String BEE_ENTITY_FLOWER_POS = Bee.TAG_FLOWER_POS;
		String BEE_ENTITY_HIVE_POS = Bee.TAG_HIVE_POS;
		String FISH_BUCKET_VARIANT = TropicalFish.BUCKET_VARIANT_TAG;
		String AXOLOTL_VARIANT = Axolotl.VARIANT_TAG;
		String FROG_VARIANT = Frog.VARIANT_KEY;
		String DRAGON_DEATH_TIME = "DragonDeathTime"; // EnderDragon.DRAGON_DEATH_TIME_KEY;
		String DRAGON_PHASE = "DragonPhase"; // EnderDragon.DRAGON_PHASE_KEY;
		String MARKER_DATA = "data"; // Marker.DATA_TAG;
		String STRAY_CONVERSION = Skeleton.CONVERSION_TAG;
		String VINDICATOR_JOHNNY = "Johnny"; // Vindicator.TAG_JOHNNY;
		String ITEM_BLOCK_ENTITY = "BlockEntityTag"; // BlockItem.BLOCK_ENTITY_TAG;
		String ITEM_BLOCK_STATE = BlockItem.BLOCK_STATE_TAG;
		String BUNDLE_ITEMS = "Items"; // BundleItem.TAG_ITEMS;
		String COMPASS_LODESTONE_POS = CompassItem.TAG_LODESTONE_POS;
		String COMPASS_LODESTONE_DIMENSION = CompassItem.TAG_LODESTONE_DIMENSION;
		String COMPASS_LODESTONE_TRACKED = CompassItem.TAG_LODESTONE_TRACKED;
		String CROSSBOW_CHARGED = "Charged"; // CrossbowItem.TAG_CHARGED;
		String CROSSBOW_CHARGED_PROJECTILES = "ChargedProjectiles"; // CrossbowItem.TAG_CHARGED_PROJECTILES;
		String ENCHANTED_BOOK_STORED_ENCHANTMENTS = EnchantedBookItem.TAG_STORED_ENCHANTMENTS;
		String FIREWORK_FIREWORKS = FireworkRocketItem.TAG_FIREWORKS;
		String FIREWORK_EXPLOSION = FireworkRocketItem.TAG_EXPLOSION;
		String FIREWORK_EXPLOSIONS = FireworkRocketItem.TAG_EXPLOSIONS;
		String FIREWORK_FLIGHT = FireworkRocketItem.TAG_FLIGHT;
		String FIREWORK_EXPLOSION_TYPE = FireworkRocketItem.TAG_EXPLOSION_TYPE;
		String FIREWORK_EXPLOSION_TRAIL = FireworkRocketItem.TAG_EXPLOSION_TRAIL;
		String FIREWORK_EXPLOSION_FLICKER = FireworkRocketItem.TAG_EXPLOSION_FLICKER;
		String FIREWORK_EXPLOSION_COLORS = FireworkRocketItem.TAG_EXPLOSION_COLORS;
		String FIREWORK_EXPLOSION_FADECOLORS = FireworkRocketItem.TAG_EXPLOSION_FADECOLORS;
		String INSTRUMENT = "instrument"; // InstrumentItem.TAG_INSTRUMENT;
		String ITEMSTACK_ENCHANTMENTS = ItemStack.TAG_ENCH;
		String ITEMSTACK_DISPLAY = ItemStack.TAG_DISPLAY;
		String ITEMSTACK_DISPLAY_NAME = ItemStack.TAG_DISPLAY_NAME;
		String ITEMSTACK_LORE = ItemStack.TAG_LORE;
		String ITEMSTACK_DAMAGE = ItemStack.TAG_DAMAGE;
		String ITEMSTACK_COLOR = ItemStack.TAG_COLOR;
		String ITEMSTACK_UNBREAKABLE = "Unbreakable"; // ItemStack.TAG_UNBREAKABLE;
		String ITEMSTACK_REPAIR_COST = "RepairCost"; // ItemStack.TAG_REPAIR_COST;
		String ITEMSTACK_CAN_DESTROY_BLOCK_LIST = "CanDestroy"; // ItemStack.TAG_CAN_DESTROY_BLOCK_LIST;
		String ITEMSTACK_CAN_PLACE_ON_BLOCK_LIST = "CanPlaceOn"; // ItemStack.TAG_CAN_PLACE_ON_BLOCK_LIST;
		String ITEMSTACK_HIDE_FLAGS = "HideFlags"; // ItemStack.TAG_HIDE_FLAGS;
		String RECIPES = "Recipes"; // KnowledgeBookItem.RECIPE_TAG;
		String MAP = "map"; // MapItem.TAG_MAP;
		String ITEM_SKULL_OWNER = PlayerHeadItem.TAG_SKULL_OWNER;
		String SHIELD_BASE_COLOR = ShieldItem.TAG_BASE_COLOR;
		String STEW_EFFECTS_TAG = SuspiciousStewItem.EFFECTS_TAG;
		String STEW_EFFECT_ID_TAG = SuspiciousStewItem.EFFECT_ID_TAG;
		String STEW_EFFECT_DURATION_TAG = SuspiciousStewItem.EFFECT_DURATION_TAG;
		String BOOK_TITLE = WrittenBookItem.TAG_TITLE;
		String BOOK_FILTERED_TITLE = WrittenBookItem.TAG_FILTERED_TITLE;
		String BOOK_AUTHOR = WrittenBookItem.TAG_AUTHOR;
		String BOOK_PAGES = WrittenBookItem.TAG_PAGES;
		String BOOK_FILTERED_PAGES = WrittenBookItem.TAG_FILTERED_PAGES;
		String BOOK_GENERATION = WrittenBookItem.TAG_GENERATION;
		String BOOK_RESOLVED = WrittenBookItem.TAG_RESOLVED;
		String CUSTOM_POTION_EFFECTS = PotionUtils.TAG_CUSTOM_POTION_EFFECTS;
		String CUSTOM_POTION_COLOR = PotionUtils.TAG_CUSTOM_POTION_COLOR;
		String POTION = PotionUtils.TAG_POTION;
		String ENCHANTMENT_ID = "id"; // EnchantmentHelper.TAG_ENCH_ID;
		String ENCHANTMENT_LEVEL = "lvl"; // EnchantmentHelper.TAG_ENCH_LEVEL;
		String FORCED = "Forced"; // ForcedChunksSavedData.TAG_FORCED;
		String BANNER_PATTERNS = BannerBlockEntity.TAG_PATTERNS;
		String BANNER_PATTERN = BannerBlockEntity.TAG_PATTERN;
		String BANNER_COLOR = BannerBlockEntity.TAG_COLOR;
		String BEE_BLOCK_ENTITY_FLOWER_POS = BeehiveBlockEntity.TAG_FLOWER_POS;
		String BEE_BLOCK_ENTITY_MIN_OCCUPATION_TICKS = BeehiveBlockEntity.MIN_OCCUPATION_TICKS;
		String BEE_BLOCK_ENTITY_ENTITY_DATA = BeehiveBlockEntity.ENTITY_DATA;
		String BEE_BLOCK_ENTITY_TICKS_IN_HIVE = BeehiveBlockEntity.TICKS_IN_HIVE;
		String BEE_BLOCK_ENTITY_HAS_NECTAR = BeehiveBlockEntity.HAS_NECTAR;
		String BEE_BLOCK_ENTITY_BEES = BeehiveBlockEntity.BEES;
		String JIGSAW_TARGET = JigsawBlockEntity.TARGET;
		String JIGSAW_POOL = JigsawBlockEntity.POOL;
		String JIGSAW_JOINT = JigsawBlockEntity.JOINT;
		String JIGSAW_NAME = JigsawBlockEntity.NAME;
		String JIGSAW_FINAL_STATE = JigsawBlockEntity.FINAL_STATE;
		String LOOT_TABLE_TAG = RandomizableContainerBlockEntity.LOOT_TABLE_TAG;
		String LOOT_TABLE_SEED_TAG = RandomizableContainerBlockEntity.LOOT_TABLE_SEED_TAG;
		String SHULKER_ITEMS = ShulkerBoxBlockEntity.ITEMS_TAG;
		String BLOCK_ENTITY_SKULL_OWNER = SkullBlockEntity.TAG_SKULL_OWNER;
		String STRUCTURE_AUTHOR_TAG = StructureBlockEntity.AUTHOR_TAG;
		String STATE_NAME = StateHolder.NAME_TAG;
		String STATE_PROPERTIES = StateHolder.PROPERTIES_TAG;
		String INDICES = "Indices"; // UpgradeData.TAG_INDICES;
		String CHUNK_UPGRADE_DATA = "UpgradeData"; // ChunkSerializer.TAG_UPGRADE_DATA;
		String CHUNK_BLOCK_TICKS = "block_ticks"; // ChunkSerializer.BLOCK_TICKS_TAG;
		String CHUNK_FLUID_TICKS = "fluid_ticks"; // ChunkSerializer.FLUID_TICKS_TAG;
		String CHUNK_X_POS = ChunkSerializer.X_POS_TAG;
		String CHUNK_Z_POS = ChunkSerializer.Z_POS_TAG;
		String CHUNK_HEIGHTMAPS = ChunkSerializer.HEIGHTMAPS_TAG;
		String CHUNK_IS_LIGHT_ON = ChunkSerializer.IS_LIGHT_ON_TAG;
		String CHUNK_SECTIONS = ChunkSerializer.SECTIONS_TAG;
		String CHUNK_BLOCK_LIGHT = ChunkSerializer.BLOCK_LIGHT_TAG;
		String CHUNK_SKY_LIGHT = ChunkSerializer.SKY_LIGHT_TAG;
		String ENTITIES = "Entities"; // EntityStorage.ENTITIES_TAG;
		String POSITION = "Position"; // EntityStorage.POSITION_TAG;
		String SECTIONS = "Sections"; // SectionStorage.SECTIONS_TAG;
		String TEMPLATE_PALETTE_TAG = StructureTemplate.PALETTE_TAG;
		String TEMPLATE_PALETTE_LIST_TAG = StructureTemplate.PALETTE_LIST_TAG;
		String TEMPLATE_ENTITIES_TAG = StructureTemplate.ENTITIES_TAG;
		String TEMPLATE_BLOCKS_TAG = StructureTemplate.BLOCKS_TAG;
		String TEMPLATE_BLOCK_TAG_POS = StructureTemplate.BLOCK_TAG_POS;
		String TEMPLATE_BLOCK_TAG_STATE = StructureTemplate.BLOCK_TAG_STATE;
		String TEMPLATE_BLOCK_TAG_NBT = StructureTemplate.BLOCK_TAG_NBT;
		String TEMPLATE_ENTITY_TAG_POS = StructureTemplate.ENTITY_TAG_POS;
		String TEMPLATE_ENTITY_TAG_BLOCKPOS = StructureTemplate.ENTITY_TAG_BLOCKPOS;
		String TEMPLATE_ENTITY_TAG_NBT = StructureTemplate.ENTITY_TAG_NBT;
		String TEMPLATE_SIZE_TAG = StructureTemplate.SIZE_TAG;
		String COMMAND_CONTENTS = "contents"; // CommandStorage.Container.TAG_CONTENTS;
		String LEVEL_DATA = "Data"; // LevelStorageSource.TAG_DATA;
		String PRIMARY_LEVEL_PLAYER = "Player"; // PrimaryLevelData.PLAYER;
		String PRIMARY_LEVEL_WORLD_GEN_SETTINGS = "WorldGenSettings"; // PrimaryLevelData.WORLD_GEN_SETTINGS;
		String LOOT_BLOCK_ENTITY = "block_entity"; // ContextNbtProvider.BLOCK_ENTITY_ID;
		String CALLBACK_DATA = "Callback"; // TimerQueue.CALLBACK_DATA_TAG;
		String TIMER_NAME = "Name"; // TimerQueue.TIMER_NAME_TAG;
		String TIMER_TRIGGER_TIME = "TriggerTime"; // TimerQueue.TIMER_TRIGGER_TIME_TAG;
		String SAVE_ID = "i"; // SavedTick.TAG_ID;
		String SAVE_X = "x"; // SavedTick.TAG_X;
		String SAVE_Y = "y"; // SavedTick.TAG_Y;
		String SAVE_Z = "z"; // SavedTick.TAG_Z;
		String SAVE_DELAY = "t"; // SavedTick.TAG_DELAY;
		String SAVE_PRIORITY = "p"; // SavedTick.TAG_PRIORITY;
	}

	interface ItemProperties
	{
		ResourceLocation DAMAGED = new ResourceLocation(Mods.MINECRAFT, "damaged"); // ItemProperties.DAMAGED;
		ResourceLocation DAMAGE = new ResourceLocation(Mods.MINECRAFT, "damage"); // ItemProperties.DAMAGE;
	}

	interface Predicates
	{
		BlockPredicate ANY_BLOCK = BlockPredicate.ANY;
		DamagePredicate ANY_DAMAGE = DamagePredicate.ANY;
		DamageSourcePredicate ANY_DAMAGE_SOURCE = DamageSourcePredicate.ANY;
		DistancePredicate ANY_DISTANCE = DistancePredicate.ANY;
		EnchantmentPredicate ANY_ENCHANTMENT = EnchantmentPredicate.ANY;
		EntityEquipmentPredicate ANY_EQUIPMENT = EntityEquipmentPredicate.ANY;
		EntityFlagsPredicate ANY_FLAGS = EntityFlagsPredicate.ANY;
		EntityPredicate ANY_ENTITY = EntityPredicate.ANY;
		EntityPredicate.Composite ANY_ENTITY_COMPOSITE = EntityPredicate.Composite.ANY;
		EntityTypePredicate ANY_ENTITY_TYPE = EntityTypePredicate.ANY;
		FishingHookPredicate ANY_FISHING_HOOK = FishingHookPredicate.ANY;
		FluidPredicate ANY_FLUID = FluidPredicate.ANY;
		ItemPredicate ANY_ITEM = ItemPredicate.ANY;
		LightPredicate ANY_LIGHT = LightPredicate.ANY;
		LocationPredicate ANY = LocationPredicate.ANY;
		MinMaxBounds.Doubles ANY_DOUBLE = MinMaxBounds.Doubles.ANY;
		MinMaxBounds.Ints ANY_INT = MinMaxBounds.Ints.ANY;
		MobEffectsPredicate ANY_MOB_EFFECT = MobEffectsPredicate.ANY;
		NbtPredicate ANY_NBT = NbtPredicate.ANY;
		StatePropertiesPredicate ANY_BLOCK_STATE = StatePropertiesPredicate.ANY;
		WrappedMinMaxBounds ANY_WRAPPED_MINMAX = WrappedMinMaxBounds.ANY;

		EnchantmentPredicate[] NO_ENCHANTMENTS = EnchantmentPredicate.NONE;
		EntityEquipmentPredicate EQUIPMENT_CAPTAIN = EntityEquipmentPredicate.CAPTAIN;
	}

	interface CritereonNames
	{
		ResourceLocation BEE_NEST_DESTROYED = new ResourceLocation("bee_nest_destroyed"); // BeeNestDestroyedTrigger.ID;
		ResourceLocation BRED_ANIMALS = new ResourceLocation("bred_animals"); // BredAnimalsTrigger.ID;
		ResourceLocation BREWED_POTION = new ResourceLocation("brewed_potion"); // BrewedPotionTrigger.ID;
		ResourceLocation CHANGED_DIMENSION = new ResourceLocation("changed_dimension"); // ChangeDimensionTrigger.ID;
		ResourceLocation CHANNELED_LIGHTNING = new ResourceLocation("channeled_lightning"); // ChanneledLightningTrigger.ID;
		ResourceLocation CONSTRUCT_BEACON = new ResourceLocation("construct_beacon"); // ConstructBeaconTrigger.ID;
		ResourceLocation CONSUME_ITEM = new ResourceLocation("consume_item"); // ConsumeItemTrigger.ID;
		ResourceLocation CURED_ZOMBIE_VILLAGE = new ResourceLocation("cured_zombie_villager"); // CuredZombieVillagerTrigger.ID;
		ResourceLocation EFFECTS_CHANGED = new ResourceLocation("effects_changed"); // EffectsChangedTrigger.ID;
		ResourceLocation ENCHANTED_ITEM = new ResourceLocation("enchanted_item"); // EnchantedItemTrigger.ID;
		ResourceLocation ENTER_BLOCK = new ResourceLocation("enter_block"); // EnterBlockTrigger.ID;
		ResourceLocation ENTITY_HURT_PLAYER = new ResourceLocation("entity_hurt_player"); // EntityHurtPlayerTrigger.ID;
		ResourceLocation FILLED_BUCKET = new ResourceLocation("filled_bucket"); // FilledBucketTrigger.ID;
		ResourceLocation FISHING_ROD_HOOKED = new ResourceLocation("fishing_rod_hooked"); // FishingRodHookedTrigger.ID;
		ResourceLocation IMPOSSIBLE = new ResourceLocation("impossible"); // ImpossibleTrigger.ID;
		ResourceLocation INVENTORY_CHANGED = new ResourceLocation("inventory_changed"); // InventoryChangeTrigger.ID;
		ResourceLocation ITEM_DURABILITY_CHANGED = new ResourceLocation("item_durability_changed"); // ItemDurabilityTrigger.ID;
		ResourceLocation KILLED_BY_CROSSBOW = new ResourceLocation("killed_by_crossbow"); // KilledByCrossbowTrigger.ID;
		ResourceLocation LEVITATION = new ResourceLocation("levitation"); // LevitationTrigger.ID;
		ResourceLocation LIGHTNING_STRIKE = new ResourceLocation("lightning_strike"); // LightningStrikeTrigger.ID;
		ResourceLocation PLAYER_GENERATES_CONTAINER_LOOT = new ResourceLocation("player_generates_container_loot"); // LootTableTrigger.ID;
		ResourceLocation PLACED_BLOCK = new ResourceLocation("placed_block"); // PlacedBlockTrigger.ID;
		ResourceLocation PLAYER_HURT_ENTITY = new ResourceLocation("player_hurt_entity"); // PlayerHurtEntityTrigger.ID;
		ResourceLocation PLAYER_INTERACTED_WITH_ENTITY = new ResourceLocation("player_interacted_with_entity"); // PlayerInteractTrigger.ID;
		ResourceLocation RECIPE_UNLOCKED = new ResourceLocation("recipe_unlocked"); // RecipeUnlockedTrigger.ID;
		ResourceLocation SHOT_CROSSBOW = new ResourceLocation("shot_crossbow"); // ShotCrossbowTrigger.ID;
		ResourceLocation SLIDE_DOWN_BLOCK = new ResourceLocation("slide_down_block"); // SlideDownBlockTrigger.ID;
		ResourceLocation STARTED_RIDING = new ResourceLocation("started_riding"); // StartRidingTrigger.ID;
		ResourceLocation SUMMONED_ENTITY = new ResourceLocation("summoned_entity"); // SummonedEntityTrigger.ID;
		ResourceLocation TAME_ANIMAL = new ResourceLocation("tame_animal"); // TameAnimalTrigger.ID;
		ResourceLocation TARGET_HIT = new ResourceLocation("target_hit"); // TargetBlockTrigger.ID;
		ResourceLocation VILLAGER_TRADE = new ResourceLocation("villager_trade"); // TradeTrigger.ID;
		ResourceLocation USED_ENDER_EYE = new ResourceLocation("used_ender_eye"); // UsedEnderEyeTrigger.ID;
		ResourceLocation USED_TOTEM = new ResourceLocation("used_totem"); // UsedTotemTrigger.ID;
		ResourceLocation USING_TOTEM = new ResourceLocation("using_item"); // UsingItemTrigger.ID;
	}
}