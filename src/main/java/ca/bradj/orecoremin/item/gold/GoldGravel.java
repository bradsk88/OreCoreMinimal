package ca.bradj.orecoremin.item.gold;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.GravelBlock;
import ca.bradj.orecoremin.item.OreCoreMinItems;

import com.google.common.collect.Lists;

public class GoldGravel extends GravelBlock {

	protected GoldGravel() {
		super("goldGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.goldDust, 1));
		return drops;
	}

}
