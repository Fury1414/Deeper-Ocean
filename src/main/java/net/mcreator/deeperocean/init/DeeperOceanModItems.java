
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deeperocean.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.deeperocean.item.SharktoothItem;
import net.mcreator.deeperocean.DeeperOceanMod;

public class DeeperOceanModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DeeperOceanMod.MODID);
	public static final RegistryObject<Item> SHARKTOOTH = REGISTRY.register("sharktooth", () -> new SharktoothItem());
}
