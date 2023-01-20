package com.kododenka.knavesneeds.item;

import net.mcreator.plustheend.init.PlusTheEndModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTiers {
    public static final ForgeTier ENDRONIUM = new ForgeTier(7,2500, 10.0F, 10.0F, 12, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(PlusTheEndModItems.ENDRONIUM_INGOT.get()));

    public static final ForgeTier STEELEAF = new ForgeTier(5,131,8.0f,6.0f, 7, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("twilightforest:steeleaf_ingot"))));
    public static final ForgeTier IRONWOOD = new ForgeTier(5,512,6.5f,5.0f, 6, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("twilightforest:ironwood_ingot"))));
    public static final ForgeTier FIERY = new ForgeTier(5,1024,9.0f,7.0f, 8, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("twilightforest:fiery_ingot"))));
    public static final ForgeTier KNIGHTMETAL = new ForgeTier(5,512,8.0f,6.0f, 7, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("twilightforest:knightmetal_ingot"))));

    public static final ForgeTier TURQUOISE_STONE = new ForgeTier(2,131,8.0f,4.0f, 5, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:turquoise_cobblestone"))));
    public static final ForgeTier LUNAR_STONE = new ForgeTier(2,131,8.0f,4.0f, 5, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:lunar_cobblestone"))));

    public static final ForgeTier PYROPE = new ForgeTier(5,200,8.0f,4.5f, 5, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:pyrope_gem"))));
    public static final ForgeTier AQUITE = new ForgeTier(5,270,8.0f,5.0f, 6, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:aquite"))));
    public static final ForgeTier DIOPSIDE = new ForgeTier(5,1661,8.0f,8.0f, 8, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:diopside_gem"))));
    public static final ForgeTier CHARROITE = new ForgeTier(5,1561,8.0f,6.0f, 7, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:charoite"))));
    public static final ForgeTier HORIZONITE = new ForgeTier(5,250,8.0f,5.0f, 6, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:horizonite_ingot"))));

    public static final ForgeTier BLUEBRIGHT_WOOD = new ForgeTier(1,59,5.0f,3.0f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:bluebright_planks"))));
    public static final ForgeTier LUNAR_WOOD = new ForgeTier(1,59,5.0f,3.0f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:lunar_planks"))));
    public static final ForgeTier STARLIT_WOOD = new ForgeTier(1,59,5.0f,3.0f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:starlit_planks"))));
    public static final ForgeTier DUSK_WOOD = new ForgeTier(1,59,5.0f,3.0f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:dusk_planks"))));
    public static final ForgeTier FROSTBRIGHT_WOOD = new ForgeTier(1,59,5.0f,3.0f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:frostbright_plank"))));
    public static final ForgeTier MAPLE_WOOD = new ForgeTier(1,59,5.0f,3.0f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:maple_planks"))));
    public static final ForgeTier CHERRY_WOOD = new ForgeTier(1,100,5.0f,3.5f, 3, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ForgeRegistries.ITEMS.getValue(ResourceLocation.tryParse("blue_skies:cherry_planks"))));

}
