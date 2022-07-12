package net.mcreator.deltamod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.deltamod.network.DeltamodModVariables;
import net.mcreator.deltamod.DeltamodMod;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class HomesProcesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		double compteur = 0;
		if (!(StringArgumentType.getString(arguments, "homename")).equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("execute if entity @e[limit=1,name="
								+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DeltamodModVariables.PlayerVariables())).originalName
								+ StringArgumentType.getString(arguments, "homename")
								+ "] run tellraw @a {\"text\":\"T\u00E9l\u00E9portation au home "
								+ StringArgumentType.getString(arguments, "homename") + " r\u00E9ussie !\",\"color\":\"green\"}"));
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							("tp @p @e[limit=1,name="
									+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DeltamodModVariables.PlayerVariables())).originalName
									+ StringArgumentType.getString(arguments, "homename") + "]"));
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("execute unless entity @e[limit=1,name="
								+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DeltamodModVariables.PlayerVariables())).originalName
								+ StringArgumentType.getString(arguments, "homename") + "] run tellraw @a {\"text\":\"Le home "
								+ StringArgumentType.getString(arguments, "homename") + " n'existe pas !\",\"color\":\"red\"}"));
			DeltamodMod.LOGGER.info(
					("tp @p @e[limit=1,name=" + entity.getDisplayName().getString() + StringArgumentType.getString(arguments, "homename") + "]"));
		} else {
			while (compteur != (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DeltamodModVariables.PlayerVariables())).limit_home) {
				DeltamodMod.LOGGER.info(("" + compteur));
			}
		}
	}
}
