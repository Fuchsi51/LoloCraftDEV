
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
public class BlackSwordItem extends LolocraftModElements.ModElement {
	@ObjectHolder("lolocraft:black_sword")
	public static final Item block = null;

	public BlackSwordItem(LolocraftModElements instance) {
		super(instance, 68);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 193;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 12f;
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
		}, 3, -2f, new Item.Properties().group(LoloCraftV3ItemGroup.tab)) {
		}.setRegistryName("black_sword"));
	}
}
