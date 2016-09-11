package ca.bradj.orecoremin.item.base;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class OreCoreMinBlock extends Block implements OreCoreMinBlockInterface {

    protected OreCoreMinBlock(Material arg0, String textureName) {
        super(arg0);
        setUnlocalizedName(textureName);
        setRegistryName(textureName);
//        setBlockTextureName("orecoremin:"+textureName);
        setCreativeTab(OreCoreMin.tabOreCoreMin);
    }

    @Override
    public IBlockState getDefaultBlockState() {
        return getDefaultState();
    }

    @Override
    public String getBlockRegistryName() {
        return getRegistryName().toString();
    }
}
