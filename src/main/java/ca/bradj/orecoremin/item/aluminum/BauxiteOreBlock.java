package ca.bradj.orecoremin.item.aluminum;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import ca.bradj.orecoremin.item.base.OreBlock;

public class BauxiteOreBlock extends OreBlock {

	public BauxiteOreBlock() {
		super("bauxite");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 2);
	}

	// TODO: What was this for?
//	@Override
//	public boolean isReplaceableOreGen(World world, int x, int y, int z, Block target) {
//		return true;
//	}

}
