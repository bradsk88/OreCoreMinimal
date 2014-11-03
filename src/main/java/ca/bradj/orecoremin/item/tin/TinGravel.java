package ca.bradj.orecoremin.item.tin;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.GravelBlock;

import com.google.common.collect.Lists;

public class TinGravel extends GravelBlock {

	public TinGravel() {
		super("tinGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreMinItems.tin().asDust(), 1));
	}

}
