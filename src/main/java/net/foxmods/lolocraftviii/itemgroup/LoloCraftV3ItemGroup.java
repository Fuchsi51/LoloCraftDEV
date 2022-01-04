
package net.foxmods.lolocraftviii.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.foxmods.lolocraftviii.item.WhitePickaxeItem;
import net.foxmods.lolocraftviii.LolocraftModElements;

@LolocraftModElements.ModElement.Tag
public class LoloCraftV3ItemGroup extends LolocraftModElements.ModElement {
	public LoloCraftV3ItemGroup(LolocraftModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_v_3") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WhitePickaxeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
