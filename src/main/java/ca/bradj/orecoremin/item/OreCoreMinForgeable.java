package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public interface OreCoreMinForgeable {

    //@formatter:off
    Item asDust();

    Item asIngot();

    Item asNugget();

    Block asPureBlock();
}
