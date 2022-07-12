package net.mcreator.deltamod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.deltamod.network.DeltamodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LoadPlayerProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DeltamodModVariables.PlayerVariables())).isLoaded != true) {
			{
				String _setval = entity.getDisplayName().getString();
				entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.originalName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.setCustomName(new TextComponent(("\u00A7a[Alpha] " + entity.getDisplayName().getString())));
			{
				boolean _setval = true;
				entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.isLoaded = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A7aVous avez bien \u00E9t\u00E9 charg\u00E9 !"), (false));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A7cVous avez d\u00E9j\u00E9 \u00E9t\u00E9 charg\u00E9 !"), (false));
		}
	}
}
