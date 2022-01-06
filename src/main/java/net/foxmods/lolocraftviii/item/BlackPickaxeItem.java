
package net.foxmods.lolocraftviii.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.foxmods.lolocraftviii.itemgroup.LoloCraftV3ItemGroup;
import net.foxmods.lolocraftviii.LolocraftModElements;

@LolocraftModElements.ModElement.Tag
public class BlackPickaxeItem extends LolocraftModElements.ModElement {
	@ObjectHolder("lolocraft:black_pickaxe")
	public static final Item block = null;

	public BlackPickaxeItem(LolocraftModElements instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 23;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Black_LoloIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LoloCraftV3ItemGroup.tab)) {
		}.setRegistryName("black_pickaxe"));
	}
}
