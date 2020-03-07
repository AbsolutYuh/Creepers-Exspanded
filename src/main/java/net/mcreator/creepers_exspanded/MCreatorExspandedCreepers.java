package net.mcreator.creepers_exspanded;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

@Elementscreepers_exspanded.ModElement.Tag
public class MCreatorExspandedCreepers extends Elementscreepers_exspanded.ModElement {
	public MCreatorExspandedCreepers(Elementscreepers_exspanded instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabexspandedcreepers") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.SPAWN_EGG, (int) (1), 50);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
