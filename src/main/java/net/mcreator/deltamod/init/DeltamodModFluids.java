
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deltamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.deltamod.fluid.AngeliFluid;
import net.mcreator.deltamod.DeltamodMod;

public class DeltamodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DeltamodMod.MODID);
	public static final RegistryObject<Fluid> ANGELI = REGISTRY.register("angeli", () -> new AngeliFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ANGELI = REGISTRY.register("flowing_angeli", () -> new AngeliFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ANGELI.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ANGELI.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
