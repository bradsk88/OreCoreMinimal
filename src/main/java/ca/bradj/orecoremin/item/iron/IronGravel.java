package ca.bradj.orecoremin.item.iron;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.GravelBlock;
import ca.bradj.orecoremin.item.OreCoreMinItems;

import com.google.common.collect.Lists;

public class IronGravel extends GravelBlock {

	protected IronGravel() {
		super("ironGravel");
		setHardness(2f);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.ironDust, 1));
		return drops;
	}
}
