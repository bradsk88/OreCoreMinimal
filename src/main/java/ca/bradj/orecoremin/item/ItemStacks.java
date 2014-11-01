package ca.bradj.orecoremin.item;

import net.minecraft.item.ItemStack;

public class ItemStacks {

	public static ItemStack two(ItemStack i) {
		return new ItemStack(i.getItem(), 2);
	}

	public static ItemStack one(ItemStack i) {
		return new ItemStack(i.getItem(), 1);
	}

}
