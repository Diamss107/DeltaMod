
package net.mcreator.deltamod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.deltamod.init.DeltamodModTabs;

public class EmeraudedelangeItem extends Item {
	public EmeraudedelangeItem() {
		super(new Item.Properties().tab(DeltamodModTabs.TAB_ALPHA_CAT).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
