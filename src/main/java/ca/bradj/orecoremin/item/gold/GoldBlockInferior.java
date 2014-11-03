package ca.bradj.orecoremin.item.gold;

import ca.bradj.orecoremin.item.base.OreBlock;

public class GoldBlockInferior extends OreBlock {

	public GoldBlockInferior() {
		super("goldInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
