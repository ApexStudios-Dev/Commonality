package xyz.apex.forge.commonality.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.gameevent.GameEvent;

@SuppressWarnings("ALL")
public interface GameEventTags
{
	interface Vanilla
	{
		TagKey<GameEvent> VIBRATIONS = net.minecraft.tags.GameEventTags.VIBRATIONS;
		TagKey<GameEvent> IGNORE_VIBRATIONS_SNEAKING = net.minecraft.tags.GameEventTags.IGNORE_VIBRATIONS_SNEAKING;
	}

	static TagKey<GameEvent> tag(String namespace, String path)
	{
		return TagKey.create(Registry.GAME_EVENT_REGISTRY, new ResourceLocation(namespace, path));
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
