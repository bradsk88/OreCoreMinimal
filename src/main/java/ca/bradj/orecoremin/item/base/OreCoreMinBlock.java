package ca.bradj.orecoremin.item.base;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCoreMinBlock extends Block {

    protected OreCoreMinBlock(Material arg0, String textureName) {
        super(arg0);
        setUnlocalizedName(textureName);
        setRegistryName(textureName);
//        setBlockTextureName("orecoremin:"+textureName);
        setCreativeTab(OreCoreMin.tabOreCoreMin);
    }

}
