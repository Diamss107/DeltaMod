
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deltamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.deltamod.block.HomeBlockBlock;
import net.mcreator.deltamod.block.AlphaportalnonactiveBlock;
import net.mcreator.deltamod.block.AlphaportalblockBlock;
import net.mcreator.deltamod.block.AlphaportalactiveBlock;
import net.mcreator.deltamod.DeltamodMod;

public class DeltamodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DeltamodMod.MODID);
	public static final RegistryObject<Block> ALPHAPORTALACTIVE = REGISTRY.register("alphaportalactive", () -> new AlphaportalactiveBlock());
	public static final RegistryObject<Block> ALPHAPORTALNONACTIVE = REGISTRY.register("alphaportalnonactive", () -> new AlphaportalnonactiveBlock());
	public static final RegistryObject<Block> ALPHAPORTALBLOCK = REGISTRY.register("alphaportalblock", () -> new AlphaportalblockBlock());
	public static final RegistryObject<Block> HOME_BLOCK = REGISTRY.register("home_block", () -> new HomeBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AlphaportalactiveBlock.registerRenderLayer();
			AlphaportalnonactiveBlock.registerRenderLayer();
			AlphaportalblockBlock.registerRenderLayer();
			HomeBlockBlock.registerRenderLayer();
		}
	}
}
