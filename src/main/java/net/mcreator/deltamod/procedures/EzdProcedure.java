package net.mcreator.deltamod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.deltamod.init.DeltamodModItems;
import net.mcreator.deltamod.init.DeltamodModBlocks;

import java.util.Map;

public class EzdProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DeltamodModItems.ALPHASTONE.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = DeltamodModBlocks.ALPHAPORTALACTIVE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			world.setBlock(new BlockPos(x - 0, y - 1, z - 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 0, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 0, y - 2, z - 0), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 2, z - 1), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 2, z + 0), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 2, z + 1), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 0, y - 2, z + 1), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 2, z + 1), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 2, z + 0), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 2, z - 1), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 2, z - 1), DeltamodModBlocks.ALPHAPORTALBLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 0, y - 3, z - 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 3, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 3, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 3, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 0, y - 3, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 3, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 3, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 3, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 3, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 1, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 1, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 1, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 1, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 1, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 2, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 2, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 2, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 2, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 2, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 2, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 2, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 2, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 2, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 2, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 3, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 3, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 3, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 3, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 3, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 3, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 3, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 3, z + 0), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 3, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 3, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 3, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 3, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 3, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 3, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 3, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 3, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 2, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 2, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 2, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 2, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 2, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 2, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 1, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z + 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 0, y - 1, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z - 2), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
		}
	}
}
