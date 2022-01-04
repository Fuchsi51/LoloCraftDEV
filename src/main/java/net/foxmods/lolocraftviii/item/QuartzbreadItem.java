
package net.foxmods.lolocraftviii.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.foxmods.lolocraftviii.itemgroup.LoloCraftV3ItemGroup;
import net.foxmods.lolocraftviii.LolocraftModElements;

@LolocraftModElements.ModElement.Tag
public class QuartzbreadItem extends LolocraftModElements.ModElement {
	@ObjectHolder("lolocraft:quartzbread")
	public static final Item block = null;

	public QuartzbreadItem(LolocraftModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(LoloCraftV3ItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(3.3f)

							.build()));
			setRegistryName("quartzbread");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 52;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
