package ca.bradj.orecoremin.item.iron;

import ca.bradj.orecoremin.item.base.OreBlock;

public class IronBlockInferior extends OreBlock {

	public IronBlockInferior() {
		super("ironOreInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 0);
	}


}
