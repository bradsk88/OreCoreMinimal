package ca.bradj.orecoremin.item.base;

import net.minecraft.block.state.IBlockState;

/**
 * Created by bradsk88 on 9/11/16.
 */
public interface OreCoreMinBlockInterface {
    IBlockState getDefaultBlockState();

    String getBlockRegistryName();
}
