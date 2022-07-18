
package net.mcreator.deltamod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.deltamod.init.DeltamodModFluids;

public class AngeliBlock extends LiquidBlock {
	public AngeliBlock() {
		super(() -> (FlowingFluid) DeltamodModFluids.ANGELI.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.WATER).strength(100f)

				.lightLevel(s -> 4));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}
}
