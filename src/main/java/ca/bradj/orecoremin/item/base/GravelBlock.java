package ca.bradj.orecoremin.item.base;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.BlockFalling;

public abstract class GravelBlock extends BlockFalling {

	protected GravelBlock(String name) {
		super();
//		setBlockTextureName("orecoremin:"+name);
		setCreativeTab(OreCoreMin.tabOreCoreMin);
//		setStepSound(soundTypeGravel);
	}

}
