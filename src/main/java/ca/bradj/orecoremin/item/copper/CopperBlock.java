package ca.bradj.orecoremin.item.copper;

import ca.bradj.orecoremin.item.base.OreBlock;

public class CopperBlock extends OreBlock {

	public CopperBlock() {
		super("copperOre");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}


}
