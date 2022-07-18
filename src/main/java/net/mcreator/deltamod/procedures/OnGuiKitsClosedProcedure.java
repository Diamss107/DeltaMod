package net.mcreator.deltamod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.deltamod.network.DeltamodModVariables;
import net.mcreator.deltamod.init.DeltamodModItems;

public class OnGuiKitsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DeltamodModVariables.PlayerVariables())).HasClicked) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(DeltamodModItems.GET_KITS_ITEM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = false;
				entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HasClicked = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
