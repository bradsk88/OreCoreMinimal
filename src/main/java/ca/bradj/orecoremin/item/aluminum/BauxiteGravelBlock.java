package ca.bradj.orecoremin.item.aluminum;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.GravelBlock;

import com.google.common.collect.Lists;

public class BauxiteGravelBlock extends GravelBlock {

	private static final int MAX_DUST_DROP = 5;

	public BauxiteGravelBlock() {
		super("bauxiteGravel");
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		int dropAmount = world.rand.nextInt(MAX_DUST_DROP - 1) + 1;
        ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.aluminum().asDust(), dropAmount));
		return drops;
	}

}
