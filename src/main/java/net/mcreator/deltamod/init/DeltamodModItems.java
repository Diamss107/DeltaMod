
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

import net.mcreator.deltamod.item.EmeraudedelangeItem;
import net.mcreator.deltamod.item.EmeraudeangeeItem;
import net.mcreator.deltamod.item.CaetherItem;
import net.mcreator.deltamod.item.AngeliItem;
import net.mcreator.deltamod.item.AlphastoneItem;
import net.mcreator.deltamod.DeltamodMod;

public class DeltamodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DeltamodMod.MODID);
	public static final RegistryObject<Item> ALPHAPORTALACTIVE = block(DeltamodModBlocks.ALPHAPORTALACTIVE, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> ALPHASTONE = REGISTRY.register("alphastone", () -> new AlphastoneItem());
	public static final RegistryObject<Item> ALPHAPORTALNONACTIVE = block(DeltamodModBlocks.ALPHAPORTALNONACTIVE, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> ALPHAPORTALBLOCK = block(DeltamodModBlocks.ALPHAPORTALBLOCK, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> HOME_BLOCK = block(DeltamodModBlocks.HOME_BLOCK, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> PORTAILDIMENSIONS = block(DeltamodModBlocks.PORTAILDIMENSIONS, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> ERABLE = block(DeltamodModBlocks.ERABLE, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> CAETHER = REGISTRY.register("caether", () -> new CaetherItem());
	public static final RegistryObject<Item> PORTAILTEMPORAIRECAETHER = block(DeltamodModBlocks.PORTAILTEMPORAIRECAETHER,
			DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> PIERRECAETHER = block(DeltamodModBlocks.PIERRECAETHER, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> ANGELI_BUCKET = REGISTRY.register("angeli_bucket", () -> new AngeliItem());
	public static final RegistryObject<Item> EMERAUDEANGELIC = block(DeltamodModBlocks.EMERAUDEANGELIC, DeltamodModTabs.TAB_ALPHA_CAT);
	public static final RegistryObject<Item> EMERAUDEDELANGE = REGISTRY.register("emeraudedelange", () -> new EmeraudedelangeItem());
	public static final RegistryObject<Item> EMERAUDEANGEE_HELMET = REGISTRY.register("emeraudeangee_helmet", () -> new EmeraudeangeeItem.Helmet());
	public static final RegistryObject<Item> EMERAUDEANGEE_CHESTPLATE = REGISTRY.register("emeraudeangee_chestplate",
			() -> new EmeraudeangeeItem.Chestplate());
	public static final RegistryObject<Item> EMERAUDEANGEE_LEGGINGS = REGISTRY.register("emeraudeangee_leggings",
			() -> new EmeraudeangeeItem.Leggings());
	public static final RegistryObject<Item> EMERAUDEANGEE_BOOTS = REGISTRY.register("emeraudeangee_boots", () -> new EmeraudeangeeItem.Boots());
	public static final RegistryObject<Item> FEUILLEANGELIQUE = block(DeltamodModBlocks.FEUILLEANGELIQUE, DeltamodModTabs.TAB_ALPHA_CAT);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
