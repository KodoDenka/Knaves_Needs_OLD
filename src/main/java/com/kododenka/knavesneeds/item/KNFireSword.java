package com.kododenka.knavesneeds.item;


import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import twilightforest.item.TFItems;

import javax.annotation.Nullable;
import java.util.List;

@Mod.EventBusSubscriber(
        modid = "knavesneeds"
)
public class KNFireSword extends SwordItem {
    public KNFireSword(Tier toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, (new Item.Properties()).stacksTo(1).defaultDurability(toolMaterial.getUses()).tab(ModCreativeModeTab.TAB_KNAVES_NEEDS));
    }

    public static final TagKey<Item> fiery_weapon = ItemTags.create(new ResourceLocation("knavesneeds", "fiery_weapons"));

    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment != Enchantments.FIRE_ASPECT && super.canApplyAtEnchantingTable(stack, enchantment);
    }

    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return !EnchantmentHelper.getEnchantments(book).containsKey(Enchantments.FIRE_ASPECT) && super.isBookEnchantable(stack, book);
    }

    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);
        if (result && !target.getLevel().isClientSide() && !target.fireImmune()) {
            target.setSecondsOnFire(15);
        } else {
            for(int var1 = 0; var1 < 20; ++var1) {
                double px = target.getX() + (double)(target.getLevel().getRandom().nextFloat() * target.getBbWidth() * 2.0F) - (double)target.getBbWidth();
                double py = target.getY() + (double)(target.getLevel().getRandom().nextFloat() * target.getBbHeight());
                double pz = target.getZ() + (double)(target.getLevel().getRandom().nextFloat() * target.getBbWidth() * 2.0F) - (double)target.getBbWidth();
                target.getLevel().addParticle(ParticleTypes.FLAME, px, py, pz, 0.02, 0.02, 0.02);
            }
        }

        return result;
    }

    @SubscribeEvent
    public static void setFireBeforeDeath(LivingAttackEvent event) {
        Entity var2 = event.getSource().getEntity();
        if (var2 instanceof EntityPlayer_BetterCombat living) {
            if (living.getCurrentAttack() != null && living.getCurrentAttack().itemStack().is(fiery_weapon) && !event.getEntityLiving().fireImmune()) {
                event.getEntityLiving().setSecondsOnFire(1);
            }
        }

    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        tooltip.add((new TranslatableComponent("item.twilightforest.fiery_sword.tooltip")).withStyle(ChatFormatting.GRAY));
    }
}

