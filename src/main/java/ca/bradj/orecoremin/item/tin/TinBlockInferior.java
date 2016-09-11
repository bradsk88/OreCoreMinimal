package ca.bradj.orecoremin.item.tin;

import ca.bradj.orecoremin.item.base.OreBlock;

public class TinBlockInferior extends OreBlock {

	public TinBlockInferior() {
		super("tinOreInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
