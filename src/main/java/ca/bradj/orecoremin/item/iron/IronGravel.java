package ca.bradj.orecoremin.item.iron;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.GravelBlock;

import com.google.common.collect.Lists;

public class IronGravel extends GravelBlock {

	public IronGravel() {
		super("ironGravel");
		setHardness(2f);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.iron().asDust(), 1));
		return drops;
	}
}
