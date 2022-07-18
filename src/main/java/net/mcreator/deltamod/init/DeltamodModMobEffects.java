
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deltamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.deltamod.potion.WitheringMobEffect;
import net.mcreator.deltamod.DeltamodMod;

public class DeltamodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DeltamodMod.MODID);
	public static final RegistryObject<MobEffect> WITHERING = REGISTRY.register("withering", () -> new WitheringMobEffect());
}
