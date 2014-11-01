package ca.bradj.orecoremin.item.copper;

import ca.bradj.orecoremin.item.OreBlock;

public class CopperBlock extends OreBlock {

	public CopperBlock() {
		super("copper");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}


}
