package com.kododenka.knavesneeds.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_KNAVES_NEEDS = new CreativeModeTab("tabknavesneeds") {
        @Override
        public ItemStack makeIcon() {
                //return new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("twilightforest:steeleaf_ingot")));
            return new ItemStack(ModItems.arcane_golden_chakram.get());
        }
    };
}


