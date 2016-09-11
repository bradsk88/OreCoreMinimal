package ca.bradj.orecoremin.item.aluminum;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.GravelBlock;

import com.google.common.collect.Lists;

public class BauxiteGravelBlock extends GravelBlock {

	private static final int MAX_DUST_DROP = 5;

	public BauxiteGravelBlock() {
		super("bauxiteGravel");
		setHardness(4.0f);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		int dropAmount = RANDOM.nextInt(MAX_DUST_DROP - 1) + 1;
        ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreMinItems.aluminum().asDust(), dropAmount));
		return drops;
	}

}
