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

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class DelHomeProcesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("execute unless entity @e[limit=1,name="
							+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DeltamodModVariables.PlayerVariables())).originalName
							+ StringArgumentType.getString(arguments, "homename")
							+ "] run tellraw @a {\"text\":\"\u00A7e home n'existe pas !\",\"color\":\"red\"}"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("execute if entity @e[limit=1,name="
							+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DeltamodModVariables.PlayerVariables())).originalName
							+ StringArgumentType.getString(arguments, "homename") + "] run tellraw @a {\"text\":\"le home "
							+ StringArgumentType.getString(arguments, "homename") + " a bien \u00E9t\u00E9 supprim\u00E9\",\"color\":\"red\"}"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("kill @e[type=armor_stand,name="
							+ (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DeltamodModVariables.PlayerVariables())).originalName
							+ StringArgumentType.getString(arguments, "homename") + "]"));
		{
			double _setval = (entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DeltamodModVariables.PlayerVariables())).nb_home - 1;
			entity.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.nb_home = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
