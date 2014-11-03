package ca.bradj.orecoremin.item.tin;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ca.bradj.orecoremin.OreCoreMin;

public class PureBlockMin extends Block {

    public PureBlockMin(String texture) {
        super(Material.rock);
        setHardness(3.0f);
        setHarvestLevel("pickaxe", 1);
        setBlockTextureName("orecoremin:" + texture);
        setCreativeTab(OreCoreMin.tabOreCoreMin);
    }

}
