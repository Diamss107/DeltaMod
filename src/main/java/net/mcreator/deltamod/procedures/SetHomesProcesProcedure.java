package net.mcreator.deltamod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.deltamod.network.DeltamodModVariables;
import net.mcreator.deltamod.DeltamodMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetHomesProcesProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						("/execute if entity @e[limit=1,name="
								+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DeltamodModVariables.PlayerVariables())).originalName
								+ StringArgumentType.getString(arguments, "homename") + "] run tellraw @a {\"text\":\"le home "
								+ StringArgumentType.getString(arguments, "homename") + " existe d\u00E9ja !\",\"color\":\"red\"}"));
		}
		if ((entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(
				new DeltamodModVariables.PlayerVariables())).nb_home != (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DeltamodModVariables.PlayerVariables())).limit_home) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							("/execute unless entity @e[limit=1,name="
									+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DeltamodModVariables.PlayerVariables())).originalName
									+ StringArgumentType.getString(arguments, "homename") + "] run tellraw @a {\"text\":\"Le home "
									+ StringArgumentType.getString(arguments, "homename")
									+ " a bien \u00E9t\u00E9 cr\u00E9er !\",\"color\":\"green\"}"));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							("/summon armor_stand ~ ~ ~ {Invisible:1b,Invulnerable:1b,PersistenceRequired:1b,NoGravity:1b,Small:1b,Tags:[\"home\"],CustomName:'{\"text\":\""
									+ ""
									+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DeltamodModVariables.PlayerVariables())).originalName
									+ StringArgumentType.getString(arguments, "homename") + "\"}'}"));
			}
			{
				double _setval = (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DeltamodModVariables.PlayerVariables())).nb_home + 1;
				entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.nb_home = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 5;
				entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.limit_home = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("\u00A7cLimite de home atteint !"), (false));
		}
		DeltamodMod.LOGGER.info(("nb_home : "
				+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DeltamodModVariables.PlayerVariables())).nb_home
				+ " limit_home : " + (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DeltamodModVariables.PlayerVariables())).limit_home));
		DeltamodMod.LOGGER.info(("" + entity.getDisplayName().getString()));
	}
}
