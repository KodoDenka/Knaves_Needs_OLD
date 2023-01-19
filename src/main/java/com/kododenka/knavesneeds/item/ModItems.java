package com.kododenka.knavesneeds.item;

import com.kododenka.knavesneeds.KnavesNeeds;
import com.stal111.forbidden_arcanus.common.item.ModTiers;

import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.item.FierySwordItem;

import java.util.ArrayList;
import java.util.List;

import static com.kododenka.knavesneeds.item.ModTiers.*;
import static quek.undergarden.registry.UGItemTiers.*;



public class ModItems {

    //weapon type modifiers.
    static int longsword_damage_mod = 0;
    static float longsword_speed_mod = -2.4f;
    static int twinblade_damage_mod = 0;
    static float twinblade_speed_mod = -1.7f;
    static int rapier_damage_mod = -1;
    static float rapier_speed_mod = -1.6f;
    static int katana_damage_mod = 0;
    static float katana_speed_mod = -2.0f;
    static int sai_damage_mod = -3;
    static float sai_speed_mod = -1.1f;
    static int spear_damage_mod = 0;
    static float spear_speed_mod = -2.7f;
    static int glaive_damage_mod = 0;
    static float glaive_speed_mod = -2.6f;
    static int warglaive_damage_mod = 0;
    static float warglaive_speed_mod = -2.2f;
    static int cutlass_damage_mod = 0;
    static float cutlass_speed_mod = -2.0f;
    static int claymore_damage_mod = 2;
    static float claymore_speed_mod = -2.8f;
    static int greataxe_damage_mod = 3;
    static float greataxe_speed_mod = -3.1f;
    static int greathammer_damage_mod = 4;
    static float greathammer_speed_mod = -3.2f;
    static int chakram_damage_mod = -1;
    static float chakram_speed_mod = -3.0f;
    static int scythe_damage_mod = 1;
    static float scythe_speed_mod = -2.7f;


    //Mod Tier damage modifier
    //Forbidden & Arcanus
    static int ARCANE_GOLDEN_MOD = 3;
    static int REINFORCED_ARCANE_GOLDEN_MOD = 3;
    static int DRACO_ARCANUS_MOD = 4;

    //The Undergarden
    static int UTHERIUM_MOD = 3;
    static int FROSTSTEEL_MOD = 3;
    static int FORGOTTEN_MOD = 3;
    static int CLOGGRUM_MOD = 3;


    //Plus The End
    static int ENDRONIUM_MOD = 3;


    //Twilight Forest
    static int STEELEAF_MOD = 3;
    static int IRONWOOD_MOD = 3;
    static int FIERY_MOD= 3;
    static int KNIGHTMETAL_MOD = 3;

    //Blue Skies
    static int TURQUOISE_STONE_MOD = 3;
    static int LUNAR_STONE_MOD = 3;
    static int PYROPE_MOD = 3;
    static int AQUITE_MOD = 3;
    static int DIOPSIDE_MOD =3;
    static int CHARROITE_MOD = 3;
    static int HORIZONITE_MOD = 3;

    //Blue Skies Woods
    static int BLUEBRIGHT_WOOD_MOD = 3;
    static int LUNAR_WOOD_MOD = 3;
    static int STARLIT_WOOD_MOD = 3;
    static int DUSK_WOOD_MOD = 3;
    static int FROSTBRIGHT_WOOD_MOD = 3;
    static int MAPLE_WOOD_MOD = 3;
    static int CHERRY_WOOD_MOD = 3;


    //start item reg
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KnavesNeeds.MOD_ID);

    //Material - ARCANE_GOLDEN
    public static final RegistryObject<Item> arcane_golden_longsword = ITEMS.register("arcane_golden_longsword", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> arcane_golden_twinblade = ITEMS.register("arcane_golden_twinblade", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> arcane_golden_rapier = ITEMS.register("arcane_golden_rapier", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> arcane_golden_katana = ITEMS.register("arcane_golden_katana", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> arcane_golden_sai = ITEMS.register("arcane_golden_sai", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> arcane_golden_spear = ITEMS.register("arcane_golden_spear", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> arcane_golden_glaive = ITEMS.register("arcane_golden_glaive", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> arcane_golden_warglaive = ITEMS.register("arcane_golden_warglaive", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> arcane_golden_cutlass = ITEMS.register("arcane_golden_cutlass", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> arcane_golden_claymore = ITEMS.register("arcane_golden_claymore", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> arcane_golden_greataxe = ITEMS.register("arcane_golden_greataxe", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> arcane_golden_greathammer = ITEMS.register("arcane_golden_greathammer", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> arcane_golden_chakram = ITEMS.register("arcane_golden_chakram", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> arcane_golden_scythe = ITEMS.register("arcane_golden_scythe", () -> new KNSwordItem(ModTiers.ARCANE_GOLDEN, ARCANE_GOLDEN_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - REINFORCED_ARCANE_GOLDEN
    public static final RegistryObject<Item> reinforced_arcane_golden_longsword = ITEMS.register("reinforced_arcane_golden_longsword", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_twinblade = ITEMS.register("reinforced_arcane_golden_twinblade", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_rapier = ITEMS.register("reinforced_arcane_golden_rapier", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_katana = ITEMS.register("reinforced_arcane_golden_katana", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_sai = ITEMS.register("reinforced_arcane_golden_sai", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_spear = ITEMS.register("reinforced_arcane_golden_spear", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_glaive = ITEMS.register("reinforced_arcane_golden_glaive", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_warglaive = ITEMS.register("reinforced_arcane_golden_warglaive", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_cutlass = ITEMS.register("reinforced_arcane_golden_cutlass", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_claymore = ITEMS.register("reinforced_arcane_golden_claymore", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_greataxe = ITEMS.register("reinforced_arcane_golden_greataxe", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_greathammer = ITEMS.register("reinforced_arcane_golden_greathammer", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_chakram = ITEMS.register("reinforced_arcane_golden_chakram", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> reinforced_arcane_golden_scythe = ITEMS.register("reinforced_arcane_golden_scythe", () -> new KNSwordItem(ModTiers.REINFORCED_ARCANE_GOLDEN, REINFORCED_ARCANE_GOLDEN_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - DRACO_ARCANUS
    public static final RegistryObject<Item> draco_arcanus_longsword = ITEMS.register("draco_arcanus_longsword", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_twinblade = ITEMS.register("draco_arcanus_twinblade", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_rapier = ITEMS.register("draco_arcanus_rapier", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_katana = ITEMS.register("draco_arcanus_katana", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_sai = ITEMS.register("draco_arcanus_sai", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_spear = ITEMS.register("draco_arcanus_spear", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_glaive = ITEMS.register("draco_arcanus_glaive", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_warglaive = ITEMS.register("draco_arcanus_warglaive", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_cutlass = ITEMS.register("draco_arcanus_cutlass", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_claymore = ITEMS.register("draco_arcanus_claymore", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_greataxe = ITEMS.register("draco_arcanus_greataxe", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_greathammer = ITEMS.register("draco_arcanus_greathammer", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_chakram = ITEMS.register("draco_arcanus_chakram", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> draco_arcanus_scythe = ITEMS.register("draco_arcanus_scythe", () -> new KNSwordItem(ModTiers.DRACO_ARCANUS, DRACO_ARCANUS_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - UTHERIUM
    public static final RegistryObject<Item> utherium_longsword = ITEMS.register("utherium_longsword", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> utherium_twinblade = ITEMS.register("utherium_twinblade", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> utherium_rapier = ITEMS.register("utherium_rapier", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> utherium_katana = ITEMS.register("utherium_katana", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> utherium_sai = ITEMS.register("utherium_sai", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> utherium_spear = ITEMS.register("utherium_spear", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> utherium_glaive = ITEMS.register("utherium_glaive", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> utherium_warglaive = ITEMS.register("utherium_warglaive", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> utherium_cutlass = ITEMS.register("utherium_cutlass", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> utherium_claymore = ITEMS.register("utherium_claymore", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> utherium_greataxe = ITEMS.register("utherium_greataxe", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> utherium_greathammer = ITEMS.register("utherium_greathammer", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> utherium_chakram = ITEMS.register("utherium_chakram", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> utherium_scythe = ITEMS.register("utherium_scythe", () -> new KNSwordItem(UTHERIUM, UTHERIUM_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - FROSTSTEEL
    public static final RegistryObject<Item> froststeel_longsword = ITEMS.register("froststeel_longsword", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> froststeel_twinblade = ITEMS.register("froststeel_twinblade", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> froststeel_rapier = ITEMS.register("froststeel_rapier", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> froststeel_katana = ITEMS.register("froststeel_katana", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> froststeel_sai = ITEMS.register("froststeel_sai", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> froststeel_spear = ITEMS.register("froststeel_spear", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> froststeel_glaive = ITEMS.register("froststeel_glaive", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> froststeel_warglaive = ITEMS.register("froststeel_warglaive", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> froststeel_cutlass = ITEMS.register("froststeel_cutlass", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> froststeel_claymore = ITEMS.register("froststeel_claymore", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> froststeel_greataxe = ITEMS.register("froststeel_greataxe", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> froststeel_greathammer = ITEMS.register("froststeel_greathammer", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> froststeel_chakram = ITEMS.register("froststeel_chakram", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> froststeel_scythe = ITEMS.register("froststeel_scythe", () -> new KNSwordItem(FROSTSTEEL, FROSTSTEEL_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - FORGOTTEN
    public static final RegistryObject<Item> forgotten_longsword = ITEMS.register("forgotten_longsword", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> forgotten_twinblade = ITEMS.register("forgotten_twinblade", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> forgotten_rapier = ITEMS.register("forgotten_rapier", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> forgotten_katana = ITEMS.register("forgotten_katana", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> forgotten_sai = ITEMS.register("forgotten_sai", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> forgotten_spear = ITEMS.register("forgotten_spear", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> forgotten_glaive = ITEMS.register("forgotten_glaive", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> forgotten_warglaive = ITEMS.register("forgotten_warglaive", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> forgotten_cutlass = ITEMS.register("forgotten_cutlass", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> forgotten_claymore = ITEMS.register("forgotten_claymore", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> forgotten_greataxe = ITEMS.register("forgotten_greataxe", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> forgotten_greathammer = ITEMS.register("forgotten_greathammer", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> forgotten_chakram = ITEMS.register("forgotten_chakram", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> forgotten_scythe = ITEMS.register("forgotten_scythe", () -> new KNSwordItem(FORGOTTEN, FORGOTTEN_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - CLOGGRUM
    public static final RegistryObject<Item> cloggrum_longsword = ITEMS.register("cloggrum_longsword", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> cloggrum_twinblade = ITEMS.register("cloggrum_twinblade", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> cloggrum_rapier = ITEMS.register("cloggrum_rapier", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> cloggrum_katana = ITEMS.register("cloggrum_katana", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> cloggrum_sai = ITEMS.register("cloggrum_sai", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> cloggrum_spear = ITEMS.register("cloggrum_spear", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> cloggrum_glaive = ITEMS.register("cloggrum_glaive", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> cloggrum_warglaive = ITEMS.register("cloggrum_warglaive", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> cloggrum_cutlass = ITEMS.register("cloggrum_cutlass", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> cloggrum_claymore = ITEMS.register("cloggrum_claymore", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> cloggrum_greataxe = ITEMS.register("cloggrum_greataxe", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> cloggrum_greathammer = ITEMS.register("cloggrum_greathammer", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> cloggrum_chakram = ITEMS.register("cloggrum_chakram", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> cloggrum_scythe = ITEMS.register("cloggrum_scythe", () -> new KNSwordItem(CLOGGRUM, CLOGGRUM_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - ENDRONIUM
    public static final RegistryObject<Item> endronium_longsword = ITEMS.register("endronium_longsword", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> endronium_twinblade = ITEMS.register("endronium_twinblade", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> endronium_rapier = ITEMS.register("endronium_rapier", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> endronium_katana = ITEMS.register("endronium_katana", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> endronium_sai = ITEMS.register("endronium_sai", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> endronium_spear = ITEMS.register("endronium_spear", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> endronium_glaive = ITEMS.register("endronium_glaive", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> endronium_warglaive = ITEMS.register("endronium_warglaive", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> endronium_cutlass = ITEMS.register("endronium_cutlass", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> endronium_claymore = ITEMS.register("endronium_claymore", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> endronium_greataxe = ITEMS.register("endronium_greataxe", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> endronium_greathammer = ITEMS.register("endronium_greathammer", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> endronium_chakram = ITEMS.register("endronium_chakram", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> endronium_scythe = ITEMS.register("endronium_scythe", () -> new KNSwordItem(ENDRONIUM, ENDRONIUM_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - STEELEAF
    public static final RegistryObject<Item> steeleaf_longsword = ITEMS.register("steeleaf_longsword", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> steeleaf_twinblade = ITEMS.register("steeleaf_twinblade", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> steeleaf_rapier = ITEMS.register("steeleaf_rapier", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> steeleaf_katana = ITEMS.register("steeleaf_katana", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> steeleaf_sai = ITEMS.register("steeleaf_sai", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> steeleaf_spear = ITEMS.register("steeleaf_spear", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> steeleaf_glaive = ITEMS.register("steeleaf_glaive", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> steeleaf_warglaive = ITEMS.register("steeleaf_warglaive", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> steeleaf_cutlass = ITEMS.register("steeleaf_cutlass", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> steeleaf_claymore = ITEMS.register("steeleaf_claymore", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> steeleaf_greataxe = ITEMS.register("steeleaf_greataxe", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> steeleaf_greathammer = ITEMS.register("steeleaf_greathammer", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> steeleaf_chakram = ITEMS.register("steeleaf_chakram", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> steeleaf_scythe = ITEMS.register("steeleaf_scythe", () -> new KNSteelSword(STEELEAF, STEELEAF_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - IRONWOOD
    public static final RegistryObject<Item> ironwood_longsword = ITEMS.register("ironwood_longsword", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> ironwood_twinblade = ITEMS.register("ironwood_twinblade", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> ironwood_rapier = ITEMS.register("ironwood_rapier", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> ironwood_katana = ITEMS.register("ironwood_katana", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> ironwood_sai = ITEMS.register("ironwood_sai", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> ironwood_spear = ITEMS.register("ironwood_spear", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> ironwood_glaive = ITEMS.register("ironwood_glaive", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> ironwood_warglaive = ITEMS.register("ironwood_warglaive", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> ironwood_cutlass = ITEMS.register("ironwood_cutlass", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> ironwood_claymore = ITEMS.register("ironwood_claymore", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> ironwood_greataxe = ITEMS.register("ironwood_greataxe", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> ironwood_greathammer = ITEMS.register("ironwood_greathammer", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> ironwood_chakram = ITEMS.register("ironwood_chakram", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> ironwood_scythe = ITEMS.register("ironwood_scythe", () -> new KNIronSword(IRONWOOD, IRONWOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - FIERY
    public static final RegistryObject<Item> fiery_longsword = ITEMS.register("fiery_longsword", () -> new KNFireSword(FIERY, FIERY_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> fiery_twinblade = ITEMS.register("fiery_twinblade", () -> new KNFireSword(FIERY, FIERY_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> fiery_rapier = ITEMS.register("fiery_rapier", () -> new KNFireSword(FIERY, FIERY_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> fiery_katana = ITEMS.register("fiery_katana", () -> new KNFireSword(FIERY, FIERY_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> fiery_sai = ITEMS.register("fiery_sai", () -> new KNFireSword(FIERY, FIERY_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> fiery_spear = ITEMS.register("fiery_spear", () -> new KNFireSword(FIERY, FIERY_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> fiery_glaive = ITEMS.register("fiery_glaive", () -> new KNFireSword(FIERY, FIERY_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> fiery_warglaive = ITEMS.register("fiery_warglaive", () -> new KNFireSword(FIERY, FIERY_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> fiery_cutlass = ITEMS.register("fiery_cutlass", () -> new KNFireSword(FIERY, FIERY_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> fiery_claymore = ITEMS.register("fiery_claymore", () -> new KNFireSword(FIERY, FIERY_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> fiery_greataxe = ITEMS.register("fiery_greataxe", () -> new KNFireSword(FIERY, FIERY_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> fiery_greathammer = ITEMS.register("fiery_greathammer", () -> new KNFireSword(FIERY, FIERY_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> fiery_chakram = ITEMS.register("fiery_chakram", () -> new KNFireSword(FIERY, FIERY_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> fiery_scythe = ITEMS.register("fiery_scythe", () -> new KNFireSword(FIERY, FIERY_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - KNIGHTMETAL
    public static final RegistryObject<Item> knightmetal_longsword = ITEMS.register("knightmetal_longsword", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> knightmetal_twinblade = ITEMS.register("knightmetal_twinblade", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> knightmetal_rapier = ITEMS.register("knightmetal_rapier", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> knightmetal_katana = ITEMS.register("knightmetal_katana", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> knightmetal_sai = ITEMS.register("knightmetal_sai", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> knightmetal_spear = ITEMS.register("knightmetal_spear", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> knightmetal_glaive = ITEMS.register("knightmetal_glaive", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> knightmetal_warglaive = ITEMS.register("knightmetal_warglaive", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> knightmetal_cutlass = ITEMS.register("knightmetal_cutlass", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> knightmetal_claymore = ITEMS.register("knightmetal_claymore", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> knightmetal_greataxe = ITEMS.register("knightmetal_greataxe", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> knightmetal_greathammer = ITEMS.register("knightmetal_greathammer", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> knightmetal_chakram = ITEMS.register("knightmetal_chakram", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> knightmetal_scythe = ITEMS.register("knightmetal_scythe", () -> new KNKnightSword(KNIGHTMETAL, KNIGHTMETAL_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - TURQUOISE_STONE
    public static final RegistryObject<Item> turquoise_stone_longsword = ITEMS.register("turquoise_stone_longsword", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_twinblade = ITEMS.register("turquoise_stone_twinblade", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_rapier = ITEMS.register("turquoise_stone_rapier", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_katana = ITEMS.register("turquoise_stone_katana", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_sai = ITEMS.register("turquoise_stone_sai", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_spear = ITEMS.register("turquoise_stone_spear", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_glaive = ITEMS.register("turquoise_stone_glaive", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_warglaive = ITEMS.register("turquoise_stone_warglaive", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_cutlass = ITEMS.register("turquoise_stone_cutlass", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_claymore = ITEMS.register("turquoise_stone_claymore", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_greataxe = ITEMS.register("turquoise_stone_greataxe", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_greathammer = ITEMS.register("turquoise_stone_greathammer", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_chakram = ITEMS.register("turquoise_stone_chakram", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> turquoise_stone_scythe = ITEMS.register("turquoise_stone_scythe", () -> new KNSwordItem(TURQUOISE_STONE, TURQUOISE_STONE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - LUNAR_STONE
    public static final RegistryObject<Item> lunar_stone_longsword = ITEMS.register("lunar_stone_longsword", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> lunar_stone_twinblade = ITEMS.register("lunar_stone_twinblade", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> lunar_stone_rapier = ITEMS.register("lunar_stone_rapier", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> lunar_stone_katana = ITEMS.register("lunar_stone_katana", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> lunar_stone_sai = ITEMS.register("lunar_stone_sai", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> lunar_stone_spear = ITEMS.register("lunar_stone_spear", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> lunar_stone_glaive = ITEMS.register("lunar_stone_glaive", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> lunar_stone_warglaive = ITEMS.register("lunar_stone_warglaive", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> lunar_stone_cutlass = ITEMS.register("lunar_stone_cutlass", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> lunar_stone_claymore = ITEMS.register("lunar_stone_claymore", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> lunar_stone_greataxe = ITEMS.register("lunar_stone_greataxe", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> lunar_stone_greathammer = ITEMS.register("lunar_stone_greathammer", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> lunar_stone_chakram = ITEMS.register("lunar_stone_chakram", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> lunar_stone_scythe = ITEMS.register("lunar_stone_scythe", () -> new KNSwordItem(LUNAR_STONE, LUNAR_STONE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - PYROPE
    public static final RegistryObject<Item> pyrope_longsword = ITEMS.register("pyrope_longsword", () -> new KNSwordItem(PYROPE, PYROPE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> pyrope_twinblade = ITEMS.register("pyrope_twinblade", () -> new KNSwordItem(PYROPE, PYROPE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> pyrope_rapier = ITEMS.register("pyrope_rapier", () -> new KNSwordItem(PYROPE, PYROPE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> pyrope_katana = ITEMS.register("pyrope_katana", () -> new KNSwordItem(PYROPE, PYROPE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> pyrope_sai = ITEMS.register("pyrope_sai", () -> new KNSwordItem(PYROPE, PYROPE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> pyrope_spear = ITEMS.register("pyrope_spear", () -> new KNSwordItem(PYROPE, PYROPE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> pyrope_glaive = ITEMS.register("pyrope_glaive", () -> new KNSwordItem(PYROPE, PYROPE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> pyrope_warglaive = ITEMS.register("pyrope_warglaive", () -> new KNSwordItem(PYROPE, PYROPE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> pyrope_cutlass = ITEMS.register("pyrope_cutlass", () -> new KNSwordItem(PYROPE, PYROPE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> pyrope_claymore = ITEMS.register("pyrope_claymore", () -> new KNSwordItem(PYROPE, PYROPE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> pyrope_greataxe = ITEMS.register("pyrope_greataxe", () -> new KNSwordItem(PYROPE, PYROPE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> pyrope_greathammer = ITEMS.register("pyrope_greathammer", () -> new KNSwordItem(PYROPE, PYROPE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> pyrope_chakram = ITEMS.register("pyrope_chakram", () -> new KNSwordItem(PYROPE, PYROPE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> pyrope_scythe = ITEMS.register("pyrope_scythe", () -> new KNSwordItem(PYROPE, PYROPE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - AQUITE
    public static final RegistryObject<Item> aquite_longsword = ITEMS.register("aquite_longsword", () -> new KNSwordItem(AQUITE, AQUITE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> aquite_twinblade = ITEMS.register("aquite_twinblade", () -> new KNSwordItem(AQUITE, AQUITE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> aquite_rapier = ITEMS.register("aquite_rapier", () -> new KNSwordItem(AQUITE, AQUITE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> aquite_katana = ITEMS.register("aquite_katana", () -> new KNSwordItem(AQUITE, AQUITE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> aquite_sai = ITEMS.register("aquite_sai", () -> new KNSwordItem(AQUITE, AQUITE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> aquite_spear = ITEMS.register("aquite_spear", () -> new KNSwordItem(AQUITE, AQUITE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> aquite_glaive = ITEMS.register("aquite_glaive", () -> new KNSwordItem(AQUITE, AQUITE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> aquite_warglaive = ITEMS.register("aquite_warglaive", () -> new KNSwordItem(AQUITE, AQUITE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> aquite_cutlass = ITEMS.register("aquite_cutlass", () -> new KNSwordItem(AQUITE, AQUITE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> aquite_claymore = ITEMS.register("aquite_claymore", () -> new KNSwordItem(AQUITE, AQUITE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> aquite_greataxe = ITEMS.register("aquite_greataxe", () -> new KNSwordItem(AQUITE, AQUITE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> aquite_greathammer = ITEMS.register("aquite_greathammer", () -> new KNSwordItem(AQUITE, AQUITE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> aquite_chakram = ITEMS.register("aquite_chakram", () -> new KNSwordItem(AQUITE, AQUITE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> aquite_scythe = ITEMS.register("aquite_scythe", () -> new KNSwordItem(AQUITE, AQUITE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - DIOPSIDE
    public static final RegistryObject<Item> diopside_longsword = ITEMS.register("diopside_longsword", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> diopside_twinblade = ITEMS.register("diopside_twinblade", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> diopside_rapier = ITEMS.register("diopside_rapier", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> diopside_katana = ITEMS.register("diopside_katana", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> diopside_sai = ITEMS.register("diopside_sai", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> diopside_spear = ITEMS.register("diopside_spear", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> diopside_glaive = ITEMS.register("diopside_glaive", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> diopside_warglaive = ITEMS.register("diopside_warglaive", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> diopside_cutlass = ITEMS.register("diopside_cutlass", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> diopside_claymore = ITEMS.register("diopside_claymore", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> diopside_greataxe = ITEMS.register("diopside_greataxe", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> diopside_greathammer = ITEMS.register("diopside_greathammer", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> diopside_chakram = ITEMS.register("diopside_chakram", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> diopside_scythe = ITEMS.register("diopside_scythe", () -> new KNSwordItem(DIOPSIDE, DIOPSIDE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - CHARROITE
    public static final RegistryObject<Item> charroite_longsword = ITEMS.register("charroite_longsword", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> charroite_twinblade = ITEMS.register("charroite_twinblade", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> charroite_rapier = ITEMS.register("charroite_rapier", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> charroite_katana = ITEMS.register("charroite_katana", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> charroite_sai = ITEMS.register("charroite_sai", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> charroite_spear = ITEMS.register("charroite_spear", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> charroite_glaive = ITEMS.register("charroite_glaive", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> charroite_warglaive = ITEMS.register("charroite_warglaive", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> charroite_cutlass = ITEMS.register("charroite_cutlass", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> charroite_claymore = ITEMS.register("charroite_claymore", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> charroite_greataxe = ITEMS.register("charroite_greataxe", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> charroite_greathammer = ITEMS.register("charroite_greathammer", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> charroite_chakram = ITEMS.register("charroite_chakram", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> charroite_scythe = ITEMS.register("charroite_scythe", () -> new KNSwordItem(CHARROITE, CHARROITE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - HORIZONITE
    public static final RegistryObject<Item> horizonite_longsword = ITEMS.register("horizonite_longsword", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> horizonite_twinblade = ITEMS.register("horizonite_twinblade", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> horizonite_rapier = ITEMS.register("horizonite_rapier", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> horizonite_katana = ITEMS.register("horizonite_katana", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> horizonite_sai = ITEMS.register("horizonite_sai", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> horizonite_spear = ITEMS.register("horizonite_spear", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> horizonite_glaive = ITEMS.register("horizonite_glaive", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> horizonite_warglaive = ITEMS.register("horizonite_warglaive", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> horizonite_cutlass = ITEMS.register("horizonite_cutlass", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> horizonite_claymore = ITEMS.register("horizonite_claymore", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> horizonite_greataxe = ITEMS.register("horizonite_greataxe", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> horizonite_greathammer = ITEMS.register("horizonite_greathammer", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> horizonite_chakram = ITEMS.register("horizonite_chakram", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> horizonite_scythe = ITEMS.register("horizonite_scythe", () -> new KNSwordItem(HORIZONITE, HORIZONITE_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - BLUEBRIGHT_WOOD
    public static final RegistryObject<Item> bluebright_wood_longsword = ITEMS.register("bluebright_wood_longsword", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_twinblade = ITEMS.register("bluebright_wood_twinblade", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_rapier = ITEMS.register("bluebright_wood_rapier", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_katana = ITEMS.register("bluebright_wood_katana", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_sai = ITEMS.register("bluebright_wood_sai", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_spear = ITEMS.register("bluebright_wood_spear", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_glaive = ITEMS.register("bluebright_wood_glaive", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_warglaive = ITEMS.register("bluebright_wood_warglaive", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_cutlass = ITEMS.register("bluebright_wood_cutlass", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_claymore = ITEMS.register("bluebright_wood_claymore", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_greataxe = ITEMS.register("bluebright_wood_greataxe", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_greathammer = ITEMS.register("bluebright_wood_greathammer", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_chakram = ITEMS.register("bluebright_wood_chakram", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> bluebright_wood_scythe = ITEMS.register("bluebright_wood_scythe", () -> new KNSwordItem(BLUEBRIGHT_WOOD, BLUEBRIGHT_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - LUNAR_WOOD
    public static final RegistryObject<Item> lunar_wood_longsword = ITEMS.register("lunar_wood_longsword", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> lunar_wood_twinblade = ITEMS.register("lunar_wood_twinblade", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> lunar_wood_rapier = ITEMS.register("lunar_wood_rapier", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> lunar_wood_katana = ITEMS.register("lunar_wood_katana", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> lunar_wood_sai = ITEMS.register("lunar_wood_sai", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> lunar_wood_spear = ITEMS.register("lunar_wood_spear", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> lunar_wood_glaive = ITEMS.register("lunar_wood_glaive", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> lunar_wood_warglaive = ITEMS.register("lunar_wood_warglaive", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> lunar_wood_cutlass = ITEMS.register("lunar_wood_cutlass", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> lunar_wood_claymore = ITEMS.register("lunar_wood_claymore", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> lunar_wood_greataxe = ITEMS.register("lunar_wood_greataxe", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> lunar_wood_greathammer = ITEMS.register("lunar_wood_greathammer", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> lunar_wood_chakram = ITEMS.register("lunar_wood_chakram", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> lunar_wood_scythe = ITEMS.register("lunar_wood_scythe", () -> new KNSwordItem(LUNAR_WOOD, LUNAR_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - STARLIT_WOOD
    public static final RegistryObject<Item> starlit_wood_longsword = ITEMS.register("starlit_wood_longsword", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> starlit_wood_twinblade = ITEMS.register("starlit_wood_twinblade", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> starlit_wood_rapier = ITEMS.register("starlit_wood_rapier", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> starlit_wood_katana = ITEMS.register("starlit_wood_katana", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> starlit_wood_sai = ITEMS.register("starlit_wood_sai", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> starlit_wood_spear = ITEMS.register("starlit_wood_spear", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> starlit_wood_glaive = ITEMS.register("starlit_wood_glaive", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> starlit_wood_warglaive = ITEMS.register("starlit_wood_warglaive", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> starlit_wood_cutlass = ITEMS.register("starlit_wood_cutlass", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> starlit_wood_claymore = ITEMS.register("starlit_wood_claymore", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> starlit_wood_greataxe = ITEMS.register("starlit_wood_greataxe", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> starlit_wood_greathammer = ITEMS.register("starlit_wood_greathammer", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> starlit_wood_chakram = ITEMS.register("starlit_wood_chakram", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> starlit_wood_scythe = ITEMS.register("starlit_wood_scythe", () -> new KNSwordItem(STARLIT_WOOD, STARLIT_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - DUSK_WOOD
    public static final RegistryObject<Item> dusk_wood_longsword = ITEMS.register("dusk_wood_longsword", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> dusk_wood_twinblade = ITEMS.register("dusk_wood_twinblade", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> dusk_wood_rapier = ITEMS.register("dusk_wood_rapier", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> dusk_wood_katana = ITEMS.register("dusk_wood_katana", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> dusk_wood_sai = ITEMS.register("dusk_wood_sai", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> dusk_wood_spear = ITEMS.register("dusk_wood_spear", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> dusk_wood_glaive = ITEMS.register("dusk_wood_glaive", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> dusk_wood_warglaive = ITEMS.register("dusk_wood_warglaive", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> dusk_wood_cutlass = ITEMS.register("dusk_wood_cutlass", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> dusk_wood_claymore = ITEMS.register("dusk_wood_claymore", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> dusk_wood_greataxe = ITEMS.register("dusk_wood_greataxe", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> dusk_wood_greathammer = ITEMS.register("dusk_wood_greathammer", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> dusk_wood_chakram = ITEMS.register("dusk_wood_chakram", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> dusk_wood_scythe = ITEMS.register("dusk_wood_scythe", () -> new KNSwordItem(DUSK_WOOD, DUSK_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - FROSTBRIGHT_WOOD
    public static final RegistryObject<Item> frostbright_wood_longsword = ITEMS.register("frostbright_wood_longsword", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_twinblade = ITEMS.register("frostbright_wood_twinblade", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_rapier = ITEMS.register("frostbright_wood_rapier", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_katana = ITEMS.register("frostbright_wood_katana", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_sai = ITEMS.register("frostbright_wood_sai", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_spear = ITEMS.register("frostbright_wood_spear", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_glaive = ITEMS.register("frostbright_wood_glaive", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_warglaive = ITEMS.register("frostbright_wood_warglaive", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_cutlass = ITEMS.register("frostbright_wood_cutlass", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_claymore = ITEMS.register("frostbright_wood_claymore", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_greataxe = ITEMS.register("frostbright_wood_greataxe", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_greathammer = ITEMS.register("frostbright_wood_greathammer", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_chakram = ITEMS.register("frostbright_wood_chakram", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> frostbright_wood_scythe = ITEMS.register("frostbright_wood_scythe", () -> new KNSwordItem(FROSTBRIGHT_WOOD, FROSTBRIGHT_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - MAPLE_WOOD
    public static final RegistryObject<Item> maple_wood_longsword = ITEMS.register("maple_wood_longsword", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> maple_wood_twinblade = ITEMS.register("maple_wood_twinblade", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> maple_wood_rapier = ITEMS.register("maple_wood_rapier", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> maple_wood_katana = ITEMS.register("maple_wood_katana", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> maple_wood_sai = ITEMS.register("maple_wood_sai", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> maple_wood_spear = ITEMS.register("maple_wood_spear", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> maple_wood_glaive = ITEMS.register("maple_wood_glaive", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> maple_wood_warglaive = ITEMS.register("maple_wood_warglaive", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> maple_wood_cutlass = ITEMS.register("maple_wood_cutlass", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> maple_wood_claymore = ITEMS.register("maple_wood_claymore", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> maple_wood_greataxe = ITEMS.register("maple_wood_greataxe", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> maple_wood_greathammer = ITEMS.register("maple_wood_greathammer", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> maple_wood_chakram = ITEMS.register("maple_wood_chakram", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> maple_wood_scythe = ITEMS.register("maple_wood_scythe", () -> new KNSwordItem(MAPLE_WOOD, MAPLE_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Material - CHERRY_WOOD
    public static final RegistryObject<Item> cherry_wood_longsword = ITEMS.register("cherry_wood_longsword", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + longsword_damage_mod, longsword_speed_mod));
    public static final RegistryObject<Item> cherry_wood_twinblade = ITEMS.register("cherry_wood_twinblade", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + twinblade_damage_mod, twinblade_speed_mod));
    public static final RegistryObject<Item> cherry_wood_rapier = ITEMS.register("cherry_wood_rapier", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + rapier_damage_mod, rapier_speed_mod));
    public static final RegistryObject<Item> cherry_wood_katana = ITEMS.register("cherry_wood_katana", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + katana_damage_mod, katana_speed_mod));
    public static final RegistryObject<Item> cherry_wood_sai = ITEMS.register("cherry_wood_sai", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + sai_damage_mod, sai_speed_mod));
    public static final RegistryObject<Item> cherry_wood_spear = ITEMS.register("cherry_wood_spear", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + spear_damage_mod, spear_speed_mod));
    public static final RegistryObject<Item> cherry_wood_glaive = ITEMS.register("cherry_wood_glaive", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + glaive_damage_mod, glaive_speed_mod));
    public static final RegistryObject<Item> cherry_wood_warglaive = ITEMS.register("cherry_wood_warglaive", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + warglaive_damage_mod, warglaive_speed_mod));
    public static final RegistryObject<Item> cherry_wood_cutlass = ITEMS.register("cherry_wood_cutlass", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + cutlass_damage_mod, cutlass_speed_mod));
    public static final RegistryObject<Item> cherry_wood_claymore = ITEMS.register("cherry_wood_claymore", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + claymore_damage_mod, claymore_speed_mod));
    public static final RegistryObject<Item> cherry_wood_greataxe = ITEMS.register("cherry_wood_greataxe", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + greataxe_damage_mod, greataxe_speed_mod));
    public static final RegistryObject<Item> cherry_wood_greathammer = ITEMS.register("cherry_wood_greathammer", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + greathammer_damage_mod, greathammer_speed_mod));
    public static final RegistryObject<Item> cherry_wood_chakram = ITEMS.register("cherry_wood_chakram", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + chakram_damage_mod, chakram_speed_mod));
    public static final RegistryObject<Item> cherry_wood_scythe = ITEMS.register("cherry_wood_scythe", () -> new KNSwordItem(CHERRY_WOOD, CHERRY_WOOD_MOD + scythe_damage_mod, scythe_speed_mod));

    //Reg items to item bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
