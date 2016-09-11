package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.item.base.OreCoreMinBlockInterface;
import net.minecraft.block.Block;

interface OreCoreMinElement {

    OreCoreMinBlockInterface asGravel();

    OreCoreMinBlockInterface asInferior();

    OreCoreMinBlockInterface asOre();
}