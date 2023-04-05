
package net.mcreator.midnightweapons.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DemonicLongswordItem extends SwordItem {
	public DemonicLongswordItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.LAVA_BUCKET), new ItemStack(Items.DIAMOND));
			}
		}, 3, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
