
package net.mcreator.deltamod.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import net.mcreator.deltamod.procedures.DelallhomeprocesProcedure;

import java.util.Objects;

@Mod.EventBusSubscriber
public class DelallhomeCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("delallhome").requires(s -> s.hasPermission(4)).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			Direction direction = Objects.requireNonNull(entity).getDirection();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);

			DelallhomeprocesProcedure.execute(world, x, y, z, entity);
			return 0;
		}));
	}
}
