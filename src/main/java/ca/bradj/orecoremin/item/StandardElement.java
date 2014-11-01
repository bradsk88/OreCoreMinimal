package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * A "Standard Element" has the following incarnations:
 * <ol>
 * <li>Ore Block
 * <li>Ore Block (Inferior)
 * <li>Gravel Ore Block
 * <li>Dust
 * <li>Ingot
 * <li>Nugget
 * <li>Pure Element Block
 * </ol>
 * <p>
 * <ul>
 * <li>An ore block melts into one ingot.
 * <li>An inferior ore block melts into three nuggets.
 * <li>A gravel ore block melts into one ingot.
 * <li>One dust item melts into one ingot.
 * </ul>
 * <ul>
 * <li>A pure element block can be crafted into nine ingots - and vice versa.
 * <li>An ingot can be crafted into nine nuggets - and vice versa.
 * </ul>
 */
public interface StandardElement {

	Block asOre();
	Block asInferior();
	Item asIngot();
	Item asNugget();
	Item asDust();
	PureBlock asPureBlock();
	Block asGravel();

}
