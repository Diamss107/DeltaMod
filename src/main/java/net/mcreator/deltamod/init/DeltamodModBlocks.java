
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

import net.mcreator.deltamod.block.PortailtemporairecaetherBlock;
import net.mcreator.deltamod.block.PortaildimensionsBlock;
import net.mcreator.deltamod.block.PierrecaetherBlock;
import net.mcreator.deltamod.block.HomeBlockBlock;
import net.mcreator.deltamod.block.FeuilleangeliqueBlock;
import net.mcreator.deltamod.block.ErableBlock;
import net.mcreator.deltamod.block.EmeraudeangelicBlock;
import net.mcreator.deltamod.block.CaetherPortalBlock;
import net.mcreator.deltamod.block.AngeliBlock;
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
	public static final RegistryObject<Block> PORTAILDIMENSIONS = REGISTRY.register("portaildimensions", () -> new PortaildimensionsBlock());
	public static final RegistryObject<Block> ERABLE = REGISTRY.register("erable", () -> new ErableBlock());
	public static final RegistryObject<Block> CAETHER_PORTAL = REGISTRY.register("caether_portal", () -> new CaetherPortalBlock());
	public static final RegistryObject<Block> PORTAILTEMPORAIRECAETHER = REGISTRY.register("portailtemporairecaether",
			() -> new PortailtemporairecaetherBlock());
	public static final RegistryObject<Block> PIERRECAETHER = REGISTRY.register("pierrecaether", () -> new PierrecaetherBlock());
	public static final RegistryObject<Block> ANGELI = REGISTRY.register("angeli", () -> new AngeliBlock());
	public static final RegistryObject<Block> EMERAUDEANGELIC = REGISTRY.register("emeraudeangelic", () -> new EmeraudeangelicBlock());
	public static final RegistryObject<Block> FEUILLEANGELIQUE = REGISTRY.register("feuilleangelique", () -> new FeuilleangeliqueBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AlphaportalactiveBlock.registerRenderLayer();
			AlphaportalnonactiveBlock.registerRenderLayer();
			AlphaportalblockBlock.registerRenderLayer();
			HomeBlockBlock.registerRenderLayer();
			PortaildimensionsBlock.registerRenderLayer();
		}
	}
}
