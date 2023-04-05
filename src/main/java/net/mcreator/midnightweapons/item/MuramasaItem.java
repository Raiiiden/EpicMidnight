
package net.mcreator.midnightweapons.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MuramasaItem extends SwordItem {
	public MuramasaItem() {
		super(new Tier() {
			public int getUses() {
				return 2200;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
