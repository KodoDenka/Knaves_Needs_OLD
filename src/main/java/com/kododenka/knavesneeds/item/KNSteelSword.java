package com.kododenka.knavesneeds.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantments;

public class KNSteelSword extends SwordItem {
    public KNSteelSword(Tier material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, (new Item.Properties()).stacksTo(1).defaultDurability(material.getUses()).tab(ModCreativeModeTab.TAB_KNAVES_NEEDS));
    }

    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> list) {
        if (this.allowdedIn(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.enchant(Enchantments.MOB_LOOTING, 2);
            list.add(istack);
        }

    }
}