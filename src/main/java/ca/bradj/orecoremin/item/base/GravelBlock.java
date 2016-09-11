package ca.bradj.orecoremin.item.base;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;

public abstract class GravelBlock extends BlockFalling implements OreCoreMinBlockInterface {

	protected GravelBlock(String name) {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
//		setBlockTextureName("orecoremin:"+name);
		setCreativeTab(OreCoreMin.tabOreCoreMin);
		setSoundType(SoundType.SAND);
	}

	public IBlockState getDefaultBlockState() {
		return getDefaultState();
	}
	public String getBlockRegistryName() {
		return getRegistryName().toString();
	}


}
