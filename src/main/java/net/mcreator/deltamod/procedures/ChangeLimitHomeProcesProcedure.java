package net.mcreator.deltamod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.deltamod.network.DeltamodModVariables;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class ChangeLimitHomeProcesProcedure {
	public static void execute(LevelAccessor world, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		boolean Resussite = false;
		Resussite = false;
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if ((entityiterator.getDisplayName().getString()).equals(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "")) {
					{
						double _setval = new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "");
						entityiterator.getCapability(DeltamodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.limit_home = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList()
									.broadcastMessage(new TextComponent(("\uFFFDaLa limite de home pour le joueur"
											+ (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "a bien \uFFFDt\uFFFD mis \uFFFD "
											+ (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : ""))), ChatType.SYSTEM, Util.NIL_UUID);
					}
					Resussite = true;
				}
			}
		}
		if (Resussite == false) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(("\uFFFDcLe joueur"
							+ (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "n'est actuellement pas connect\uFFFD au serveur")),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
	}
}
