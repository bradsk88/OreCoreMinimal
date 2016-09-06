package ca.bradj.orecoremin.item.gold;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.GravelBlock;

import com.google.common.collect.Lists;

public class GoldGravel extends GravelBlock {

	public GoldGravel() {
		super("goldGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.gold().asDust(), 1));
		return drops;
	}

}
