
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deltamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.deltamod.item.GetKitsItemItem;
import net.mcreator.deltamod.item.AlphastoneItem;
import net.mcreator.deltamod.DeltamodMod;

public class DeltamodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DeltamodMod.MODID);
	public static final RegistryObject<Item> ALPHAPORTALACTIVE = block(DeltamodModBlocks.ALPHAPORTALACTIVE, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> ALPHASTONE = REGISTRY.register("alphastone", () -> new AlphastoneItem());
	public static final RegistryObject<Item> ALPHAPORTALNONACTIVE = block(DeltamodModBlocks.ALPHAPORTALNONACTIVE, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> ALPHAPORTALBLOCK = block(DeltamodModBlocks.ALPHAPORTALBLOCK, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> HOME_BLOCK = block(DeltamodModBlocks.HOME_BLOCK, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> GET_KITS_ITEM = REGISTRY.register("get_kits_item", () -> new GetKitsItemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
