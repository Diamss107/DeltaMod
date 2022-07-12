
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deltamod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DeltamodModTabs {
	public static CreativeModeTab TAB_ALPHA_CAT;

	public static void load() {
		TAB_ALPHA_CAT = new CreativeModeTab("tabalpha_cat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DeltamodModBlocks.ALPHAPORTALACTIVE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
