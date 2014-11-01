package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.item.Item;

public class OreCoreMinItem extends Item {

	public OreCoreMinItem(String name) {
		setTextureName("orecoremin:"+name);
		setCreativeTab(OreCoreMin.tabOreCoreMin);
	}

}
