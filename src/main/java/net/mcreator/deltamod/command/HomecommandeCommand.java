
package net.mcreator.deltamod.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import net.mcreator.deltamod.procedures.SetHomesProcesProcedure;
import net.mcreator.deltamod.procedures.HomesProcesProcedure;
import net.mcreator.deltamod.procedures.DelHomeProcesProcedure;

import java.util.Objects;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class HomecommandeCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("home")

				.then(Commands.literal("set").then(Commands.argument("homename", StringArgumentType.word()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					SetHomesProcesProcedure.execute(arguments, entity);
					return 0;
				}))).then(Commands.literal("remove").then(Commands.argument("homename", StringArgumentType.word()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					DelHomeProcesProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))).then(Commands.literal("tp").then(Commands.argument("homename", StringArgumentType.word()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					HomesProcesProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))));
	}
}
