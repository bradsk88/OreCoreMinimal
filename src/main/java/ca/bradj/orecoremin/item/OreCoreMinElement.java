package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.item.base.GravelBlock;
import ca.bradj.orecoremin.item.base.OreCoreMinBlock;

public interface OreCoreMinElement {

    GravelBlock asGravel();

    OreCoreMinBlock asInferior();

    OreCoreMinBlock asOre();
}