
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deeperocean.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.deeperocean.DeeperOceanMod;

public class DeeperOceanModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeeperOceanMod.MODID);
	public static final RegistryObject<CreativeModeTab> DEEPER_OCEAN = REGISTRY.register("deeper_ocean",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.deeper_ocean.deeper_ocean")).icon(() -> new ItemStack(Items.HEART_OF_THE_SEA)).displayItems((parameters, tabData) -> {
				tabData.accept(DeeperOceanModItems.SHARKTOOTH.get());
			})

					.build());
}