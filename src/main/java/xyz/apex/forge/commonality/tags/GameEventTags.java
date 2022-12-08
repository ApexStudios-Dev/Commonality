package xyz.apex.forge.commonality.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.gameevent.GameEvent;

import xyz.apex.forge.commonality.Mods;

@SuppressWarnings("ALL")
public interface GameEventTags
{
	interface Vanilla
	{
		public static final TagKey<GameEvent> VIBRATIONS = net.minecraft.tags.GameEventTags.VIBRATIONS;
		public static final TagKey<GameEvent> WARDEN_CAN_LISTEN = net.minecraft.tags.GameEventTags.WARDEN_CAN_LISTEN;
		public static final TagKey<GameEvent> SHRIEKER_CAN_LISTEN = net.minecraft.tags.GameEventTags.SHRIEKER_CAN_LISTEN;
		public static final TagKey<GameEvent> IGNORE_VIBRATIONS_SNEAKING = net.minecraft.tags.GameEventTags.IGNORE_VIBRATIONS_SNEAKING;
		public static final TagKey<GameEvent> ALLAY_CAN_LISTEN = net.minecraft.tags.GameEventTags.ALLAY_CAN_LISTEN;
	}

	static TagKey<GameEvent> tag(String namespace, String path)
	{
		return TagKey.create(Registries.GAME_EVENT, new ResourceLocation(namespace, path));
	}

	static TagKey<GameEvent> forgeTag(String path)
	{
		return tag(Mods.FORGE, path);
	}

	static TagKey<GameEvent> vanillaTag(String path)
	{
		return tag(Mods.MINECRAFT, path);
	}
}
