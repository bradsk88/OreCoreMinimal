package ca.bradj.orecoremin.item.copper;

import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.GravelBlock;
import com.google.common.collect.Lists;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;
import java.util.List;

public class CopperGravel extends GravelBlock {

	private static final int COPPER_DUST_CHANCE = 100; //TODO: Configurable -BJ
	private static final int COPPER_CARBONATE_DUST_CHANCE = 50;

	public CopperGravel() {
		super("copperGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList();
		if (RANDOM.nextInt(100) < COPPER_DUST_CHANCE) {
			drops.add(new ItemStack(OreCoreMinItems.copper().asDust(), 1));
		}
		if (RANDOM.nextInt(100) < COPPER_CARBONATE_DUST_CHANCE) {
			drops.add(new ItemStack(OreCoreMinItems.copper2Carbonate().asDust(), 1));
		}
		return drops;
	}

}
