
package net.mcreator.midnightweapons.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class EmeraldianGreatswordItem extends SwordItem {
	public EmeraldianGreatswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.EMERALD_BLOCK));
			}
		}, 3, -3.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
