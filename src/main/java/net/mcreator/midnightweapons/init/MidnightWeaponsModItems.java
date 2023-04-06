
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.midnightweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.midnightweapons.item.RoyalSlash1Item;
import net.mcreator.midnightweapons.item.RiversOfBlood1Item;
import net.mcreator.midnightweapons.item.RippersItem;
import net.mcreator.midnightweapons.item.RedAxeTempTestItem;
import net.mcreator.midnightweapons.item.MurasamaSheathItem;
import net.mcreator.midnightweapons.item.MuramasaItem;
import net.mcreator.midnightweapons.item.MoonlightGlaiveItem;
import net.mcreator.midnightweapons.item.MoonlightDaggerItem;
import net.mcreator.midnightweapons.item.HolyLongswordItem;
import net.mcreator.midnightweapons.item.HeroicSword1Item;
import net.mcreator.midnightweapons.item.HeiLongJianItem;
import net.mcreator.midnightweapons.item.GoldenBattleaxe1Item;
import net.mcreator.midnightweapons.item.GhastlySpear1Item;
import net.mcreator.midnightweapons.item.EverbleederItem;
import net.mcreator.midnightweapons.item.EnderBlade1Item;
import net.mcreator.midnightweapons.item.EmeraldianGreatswordItem;
import net.mcreator.midnightweapons.item.EagleFang1Item;
import net.mcreator.midnightweapons.item.EagleClaw1Item;
import net.mcreator.midnightweapons.item.Devourer1Item;
import net.mcreator.midnightweapons.item.DemonicLongswordItem;
import net.mcreator.midnightweapons.item.DemonicBlade1Item;
import net.mcreator.midnightweapons.item.DeathBringer1Item;
import net.mcreator.midnightweapons.item.CrimsonShadowbladeItem;
import net.mcreator.midnightweapons.item.BloodThirst1Item;
import net.mcreator.midnightweapons.item.ArchangelSwordItem;
import net.mcreator.midnightweapons.item.ArchangelSpearItem;
import net.mcreator.midnightweapons.item.AmongusFistsItem;
import net.mcreator.midnightweapons.MidnightWeaponsMod;

public class MidnightWeaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MidnightWeaponsMod.MODID);
	public static final RegistryObject<Item> RIPPERS = REGISTRY.register("rippers", () -> new RippersItem());
	public static final RegistryObject<Item> DEMONIC_BLADE = REGISTRY.register("demonic_blade", () -> new DemonicBlade1Item());
	public static final RegistryObject<Item> RIVERS_OF_BLOOD = REGISTRY.register("rivers_of_blood", () -> new RiversOfBlood1Item());
	public static final RegistryObject<Item> ENDER_BLADE = REGISTRY.register("ender_blade", () -> new EnderBlade1Item());
	public static final RegistryObject<Item> EAGLE_CLAW = REGISTRY.register("eagle_claw", () -> new EagleClaw1Item());
	public static final RegistryObject<Item> HEROIC_SWORD = REGISTRY.register("heroic_sword", () -> new HeroicSword1Item());
	public static final RegistryObject<Item> EAGLE_FANG = REGISTRY.register("eagle_fang", () -> new EagleFang1Item());
	public static final RegistryObject<Item> DEATH_BRINGER = REGISTRY.register("death_bringer", () -> new DeathBringer1Item());
	public static final RegistryObject<Item> ROYAL_SLASH = REGISTRY.register("royal_slash", () -> new RoyalSlash1Item());
	public static final RegistryObject<Item> GHASTLY_SPEAR = REGISTRY.register("ghastly_spear", () -> new GhastlySpear1Item());
	public static final RegistryObject<Item> BLOOD_THIRST = REGISTRY.register("blood_thirst", () -> new BloodThirst1Item());
	public static final RegistryObject<Item> GOLDEN_BATTLEAXE = REGISTRY.register("golden_battleaxe", () -> new GoldenBattleaxe1Item());
	public static final RegistryObject<Item> DEVOURER = REGISTRY.register("devourer", () -> new Devourer1Item());
	public static final RegistryObject<Item> ARCHANGEL_SWORD = REGISTRY.register("archangel_sword", () -> new ArchangelSwordItem());
	public static final RegistryObject<Item> ARCHANGEL_SPEAR = REGISTRY.register("archangel_spear", () -> new ArchangelSpearItem());
	public static final RegistryObject<Item> HOLY_LONGSWORD = REGISTRY.register("holy_longsword", () -> new HolyLongswordItem());
	public static final RegistryObject<Item> DEMONIC_LONGSWORD = REGISTRY.register("demonic_longsword", () -> new DemonicLongswordItem());
	public static final RegistryObject<Item> AMONG_US_FISTS = REGISTRY.register("among_us_fists", () -> new AmongusFistsItem());
	public static final RegistryObject<Item> DRAGONFIRE_GREAT_AXE = REGISTRY.register("dragonfire_great_axe", () -> new RedAxeTempTestItem());
	public static final RegistryObject<Item> EVERBLEEDER = REGISTRY.register("everbleeder", () -> new EverbleederItem());
	public static final RegistryObject<Item> CRIMSON_SHADOWBLADE = REGISTRY.register("crimson_shadowblade", () -> new CrimsonShadowbladeItem());
	public static final RegistryObject<Item> MOONLIGHT_DAGGER = REGISTRY.register("moonlight_dagger", () -> new MoonlightDaggerItem());
	public static final RegistryObject<Item> MOONLIGHT_GLAIVE = REGISTRY.register("moonlight_glaive", () -> new MoonlightGlaiveItem());
	public static final RegistryObject<Item> HEI_LONG_JIAN = REGISTRY.register("hei_long_jian", () -> new HeiLongJianItem());
	public static final RegistryObject<Item> MURAMASA = REGISTRY.register("muramasa", () -> new MuramasaItem());
	public static final RegistryObject<Item> EMERALDIAN_GREATSWORD = REGISTRY.register("emeraldian_greatsword", () -> new EmeraldianGreatswordItem());
	public static final RegistryObject<Item> MURASAMA_SHEATH = REGISTRY.register("murasama_sheath", () -> new MurasamaSheathItem());
}
