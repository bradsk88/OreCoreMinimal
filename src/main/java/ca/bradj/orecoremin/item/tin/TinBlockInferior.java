package ca.bradj.orecoremin.item.tin;

import ca.bradj.orecoremin.item.OreBlock;

public class TinBlockInferior extends OreBlock {

	public TinBlockInferior() {
		super("tinInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
