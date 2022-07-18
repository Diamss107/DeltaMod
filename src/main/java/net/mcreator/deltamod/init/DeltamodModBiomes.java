
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deltamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.deltamod.world.biome.ForetangeBiome;
import net.mcreator.deltamod.world.biome.DesertalphaBiome;
import net.mcreator.deltamod.world.biome.DeepGloryBiome;
import net.mcreator.deltamod.world.biome.DarkDesertBiome;
import net.mcreator.deltamod.DeltamodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeltamodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, DeltamodMod.MODID);
	public static final RegistryObject<Biome> DESERTALPHA = REGISTRY.register("desertalpha", () -> DesertalphaBiome.createBiome());
	public static final RegistryObject<Biome> DARK_DESERT = REGISTRY.register("dark_desert", () -> DarkDesertBiome.createBiome());
	public static final RegistryObject<Biome> DEEP_GLORY = REGISTRY.register("deep_glory", () -> DeepGloryBiome.createBiome());
	public static final RegistryObject<Biome> FORETANGE = REGISTRY.register("foretange", () -> ForetangeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DesertalphaBiome.init();
			DarkDesertBiome.init();
			DeepGloryBiome.init();
			ForetangeBiome.init();
		});
	}
}
