
package net.mcreator.deltamod.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.deltamod.init.DeltamodModItems;
import net.mcreator.deltamod.init.DeltamodModFluids;
import net.mcreator.deltamod.init.DeltamodModBlocks;
import net.mcreator.deltamod.fluid.attributes.AngeliFluidAttributes;

public abstract class AngeliFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(DeltamodModFluids.ANGELI,
			DeltamodModFluids.FLOWING_ANGELI,
			AngeliFluidAttributes.builder(new ResourceLocation("deltamod:blocks/eaucaether"), new ResourceLocation("deltamod:blocks/eaucaether"))
					.luminosity(6)

					.rarity(Rarity.RARE).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.place"))).color(-13083194))
			.explosionResistance(100f).canMultiply()

			.bucket(DeltamodModItems.ANGELI_BUCKET).block(() -> (LiquidBlock) DeltamodModBlocks.ANGELI.get());

	private AngeliFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AngeliFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AngeliFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
