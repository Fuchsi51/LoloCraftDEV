
package net.foxmods.lolocraftviii.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.foxmods.lolocraftviii.itemgroup.LoloCraftV3ItemGroup;
import net.foxmods.lolocraftviii.LolocraftModElements;

@LolocraftModElements.ModElement.Tag
public class BlackAxeItem extends LolocraftModElements.ModElement {
	@ObjectHolder("lolocraft:black_axe")
	public static final Item block = null;

	public BlackAxeItem(LolocraftModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Black_LoloIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LoloCraftV3ItemGroup.tab)) {
		}.setRegistryName("black_axe"));
	}
}
