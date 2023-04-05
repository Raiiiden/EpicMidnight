
package net.mcreator.midnightweapons.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BloodThirst1Item extends SwordItem {
	public BloodThirst1Item() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHERITE_SCRAP));
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}
}
