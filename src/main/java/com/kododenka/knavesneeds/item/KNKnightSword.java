package com.kododenka.knavesneeds.item;


import net.bettercombat.api.EntityPlayer_BetterCombat;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundAnimatePacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import twilightforest.item.TFItems;

import javax.annotation.Nullable;
import java.util.List;

@Mod.EventBusSubscriber(
        modid = "knaveneeds"
)

public class KNKnightSword extends SwordItem {
    private static final int BONUS_DAMAGE = 2;

    public KNKnightSword(Tier material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, (new Item.Properties()).stacksTo(1).defaultDurability(material.getUses()).tab(ModCreativeModeTab.TAB_KNAVES_NEEDS));
    }

    public static final TagKey<Item> knightmetal_weapon = ItemTags.create(new ResourceLocation("knavesneeds", "fiery_weapons"));

    @SubscribeEvent
    public static void onDamage(LivingHurtEvent evt) {
        LivingEntity target = evt.getEntityLiving();
        if (!target.level.isClientSide) {
            Entity var3 = evt.getSource().getDirectEntity();
            if (var3 instanceof EntityPlayer_BetterCombat) {
                EntityPlayer_BetterCombat living = (EntityPlayer_BetterCombat)var3;
                ItemStack weapon = living.getCurrentAttack().itemStack();
                if (weapon != null && !weapon.isEmpty()) {
                    if (target.getArmorValue() > 0 && (weapon.is((knightmetal_weapon)))) {
                        if (target.getArmorCoverPercentage() > 0.0F) {
                            int moreBonus = (int)(2.0F * target.getArmorCoverPercentage());
                            evt.setAmount(evt.getAmount() + (float)moreBonus);
                        } else {
                            evt.setAmount(evt.getAmount() + 2.0F);
                        }

                        ((ServerLevel)target.level).getChunkSource().broadcastAndSend(target, new ClientboundAnimatePacket(target, 5));
                    }
                }
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flags) {
        super.appendHoverText(stack, world, tooltip, flags);
        tooltip.add((new TranslatableComponent("item.twilightforest.knightmetal_sword.tooltip")).withStyle(ChatFormatting.GRAY));
    }
}
