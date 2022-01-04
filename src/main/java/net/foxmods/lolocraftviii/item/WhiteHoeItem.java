
package net.foxmods.lolocraftviii.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.foxmods.lolocraftviii.itemgroup.LoloCraftV3ItemGroup;
import net.foxmods.lolocraftviii.LolocraftModElements;

@LolocraftModElements.ModElement.Tag
public class WhiteHoeItem extends LolocraftModElements.ModElement {
	@ObjectHolder("lolocraft:white_hoe")
	public static final Item block = null;

	public WhiteHoeItem(LolocraftModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 600;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 0, -3f, new Item.Properties().group(LoloCraftV3ItemGroup.tab)) {
		}.setRegistryName("white_hoe"));
	}
}
