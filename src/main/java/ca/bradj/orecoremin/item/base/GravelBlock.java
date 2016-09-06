package ca.bradj.orecoremin.item.base;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;

public abstract class GravelBlock extends BlockFalling {

	protected GravelBlock(String name) {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
//		setBlockTextureName("orecoremin:"+name);
		setCreativeTab(OreCoreMin.tabOreCoreMin);
		setSoundType(SoundType.SAND);
	}

}
