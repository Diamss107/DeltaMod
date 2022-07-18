
package net.mcreator.deltamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.deltamod.init.DeltamodModTabs;
import net.mcreator.deltamod.init.DeltamodModFluids;

public class AngeliItem extends BucketItem {
	public AngeliItem() {
		super(DeltamodModFluids.ANGELI,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(DeltamodModTabs.TAB_ALPHA_CAT));
	}
}
