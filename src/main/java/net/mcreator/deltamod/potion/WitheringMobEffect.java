
package net.mcreator.deltamod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WitheringMobEffect extends MobEffect {
	public WitheringMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.deltamod.withering";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
