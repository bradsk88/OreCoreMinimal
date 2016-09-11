package ca.bradj.orecoremin.item.base;

import net.minecraft.block.material.Material;

public class OreBlock extends OreCoreMinBlock implements OreCoreMinBlockInterface {

    protected OreBlock(String textureName) {
        super(Material.ROCK, textureName);
    }

}
