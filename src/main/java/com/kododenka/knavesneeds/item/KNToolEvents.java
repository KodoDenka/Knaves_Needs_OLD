package com.kododenka.knavesneeds.item;


import net.bettercombat.api.AttackHand;
import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import quek.undergarden.registry.UGTags;

@Mod.EventBusSubscriber(
        modid = "knavesneeds"
)

public class KNToolEvents {

    public KNToolEvents() {
    }


    public static final TagKey<Item> forgotten_weapon = ItemTags.create(new ResourceLocation("knavesneeds", "forgotten_weapons"));
    public static final TagKey<Item> froststeel_weapon = ItemTags.create(new ResourceLocation("knavesneeds", "froststeel_weapons"));
    public static final TagKey<Item> utherium_weapon = ItemTags.create(new ResourceLocation("knavesneeds", "utherium_weapons"));
    //public static final TagKey<Item> horizonite_weapon = ItemTags.create(new ResourceLocation("knavesneeds", "horizonite_weapons"));

    @SubscribeEvent
    public static void forgottenAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        float damage = event.getAmount();
        if (source instanceof EntityPlayer_BetterCombat playerBetterCombat) {
            if (playerBetterCombat.getCurrentAttack() != null && playerBetterCombat.getCurrentAttack().itemStack().is(forgotten_weapon) && event.getEntityLiving().getType().getRegistryName().getNamespace().equals("undergarden") && event.getEntityLiving().canChangeDimensions()) {
                event.setAmount(damage * 1.5F);
            }
        }
    }

    @SubscribeEvent
    public static void utheriumAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        float damage = event.getAmount();
        if (source instanceof EntityPlayer_BetterCombat playerBetterCombat) {
            if (playerBetterCombat.getCurrentAttack() != null && playerBetterCombat.getCurrentAttack().itemStack().is(utherium_weapon) && event.getEntityLiving().getType().is(UGTags.Entities.ROTSPAWN)) {
                event.setAmount(damage * 1.5F);
            }
        }
    }


    /*

    @SubscribeEvent
    public static void froststeelAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        if (source instanceof Player player) {
            if (player.getMainHandItem().is(froststeel_weapon)) {
                event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2));
            }
        }
    }


     */

    @SubscribeEvent
    public static void new_attack_logic(LivingAttackEvent event) {
        Entity source = event.getSource().getEntity();
        if (source instanceof EntityPlayer_BetterCombat playerBetterCombat) {
            if (playerBetterCombat.getCurrentAttack() != null && playerBetterCombat.getCurrentAttack().itemStack().is(froststeel_weapon)){
                event.getEntityLiving().addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2));
            }
        }
    }

}

