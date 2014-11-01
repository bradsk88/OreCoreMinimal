package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PureBlock extends Block {

    public PureBlock(String modName, String name, CreativeTabs creativeTab) {
        super(Material.rock);
        setHardness(3.0f);
        setHarvestLevel("pickaxe", 1);
        setBlockTextureName(modName + ":" + name );
        setCreativeTab(creativeTab);
    }

}
