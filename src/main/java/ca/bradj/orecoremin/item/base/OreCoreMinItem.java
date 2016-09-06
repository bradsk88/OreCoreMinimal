package ca.bradj.orecoremin.item.base;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.item.Item;

public class OreCoreMinItem extends Item {

	public OreCoreMinItem(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
//		setTextureName("orecoremin:"+name);
		setCreativeTab(OreCoreMin.tabOreCoreMin);
	}

}
