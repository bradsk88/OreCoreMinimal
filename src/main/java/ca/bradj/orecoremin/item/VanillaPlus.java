package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.item.base.OreCoreMinBlockInterface;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * A vanilla metal with dust, nugget, gravel and inferior ore states.
 */
public interface VanillaPlus {

    Item asDust();

    Item asNugget();

    OreCoreMinBlockInterface asGravel();

    OreCoreMinBlockInterface asInferior();

}
