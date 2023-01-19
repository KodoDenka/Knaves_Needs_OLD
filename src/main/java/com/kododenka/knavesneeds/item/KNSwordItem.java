package com.kododenka.knavesneeds.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import quek.undergarden.registry.UGItemTiers;
import quek.undergarden.registry.UGItems;

import javax.annotation.Nullable;
import java.util.List;

import static com.kododenka.knavesneeds.item.KNToolEvents.*;

public class KNSwordItem extends SwordItem {
    public KNSwordItem(Tier tier, int attackDamage, float attackSpeed) {
        super(tier, attackDamage, attackSpeed, (new Item.Properties()).stacksTo(1).defaultDurability(tier.getUses()).tab(ModCreativeModeTab.TAB_KNAVES_NEEDS).rarity(isForgotten(tier)));
    }

    protected static Rarity isForgotten(Tier tier) {
        return tier.equals(UGItemTiers.FORGOTTEN) ? UGItems.FORGOTTEN : Rarity.COMMON;
    }

    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if (stack.is(froststeel_weapon))  {
            tooltip.add((new TranslatableComponent("tooltip.froststeel_sword")).withStyle(ChatFormatting.AQUA));
        }

        if (stack.is(forgotten_weapon)) {
            tooltip.add((new TranslatableComponent("tooltip.utheric_sword")).withStyle(ChatFormatting.RED));
        }

        if (stack.is(utherium_weapon)) {
            tooltip.add((new TranslatableComponent("tooltip.forgotten_sword")).withStyle(ChatFormatting.GREEN));
        }

    }
}