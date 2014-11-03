package ca.bradj.orecoremin.item.copper;

import ca.bradj.orecoremin.item.base.OreBlock;

public class CopperBlockInferior extends OreBlock {

	public CopperBlockInferior() {
		super("copperInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
