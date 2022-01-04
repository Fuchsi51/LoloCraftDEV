
package net.foxmods.lolocraftviii.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.foxmods.lolocraftviii.itemgroup.LoloCraftV3ItemGroup;
import net.foxmods.lolocraftviii.LolocraftModElements;

@LolocraftModElements.ModElement.Tag
public class WhiteSwordItem extends LolocraftModElements.ModElement {
	@ObjectHolder("lolocraft:white_sword")
	public static final Item block = null;

	public WhiteSwordItem(LolocraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 6.9f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WhiteIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(LoloCraftV3ItemGroup.tab)) {
		}.setRegistryName("white_sword"));
	}
}
