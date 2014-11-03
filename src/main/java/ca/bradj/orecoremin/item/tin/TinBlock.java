package ca.bradj.orecoremin.item.tin;

import ca.bradj.orecoremin.item.base.OreBlock;

public class TinBlock extends OreBlock {

    public TinBlock() {
        super("tin");
        setHardness(2.5f);
        this.setHarvestLevel("pickaxe", 2);
    }

}
