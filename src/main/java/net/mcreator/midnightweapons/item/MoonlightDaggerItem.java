
package net.mcreator.midnightweapons.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MoonlightDaggerItem extends SwordItem {
	public MoonlightDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 2100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
