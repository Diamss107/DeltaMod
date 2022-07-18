package net.mcreator.deltamod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.deltamod.network.DeltamodModVariables;

public class OnButtonKitsGUIClickedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DeltamodModVariables.PlayerVariables())).HasClicked) {
			return false;
		}
		return true;
	}
}
