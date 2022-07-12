
package net.mcreator.deltamod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.deltamod.init.DeltamodModTabs;

public class AlphastoneItem extends Item {
	public AlphastoneItem() {
		super(new Item.Properties().tab(DeltamodModTabs.TAB_ALPHA_CAT).stacksTo(1).rarity(Rarity.RARE));
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
