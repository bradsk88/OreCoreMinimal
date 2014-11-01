package ca.bradj.orecoremin.item.aluminum;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.GravelBlock;
import ca.bradj.orecoremin.item.OreCoreMinItems;

import com.google.common.collect.Lists;

public class BauxiteGravelBlock extends GravelBlock {

	private static final int MAX_DUST_DROP = 5;

	protected BauxiteGravelBlock() {
		super("bauxiteGravel");
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.aluminumDust, world.rand.nextInt(MAX_DUST_DROP - 1) + 1));
		return drops;
	}

}
