package ca.bradj.orecoremin.item.iron;

import ca.bradj.orecoremin.item.OreBlock;

public class IronBlockInferior extends OreBlock {

	public IronBlockInferior() {
		super("ironInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 0);
	}


}
