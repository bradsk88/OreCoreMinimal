package ca.bradj.orecoremin.util;

import ca.bradj.orecoremin.item.aluminum.AluminumIngot;
import ca.bradj.orecoremin.item.aluminum.BauxiteOreBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registration {
    public static void registerRender(Item item) {
        ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, location);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, location);
    }

    public static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        return item;
    }

    public static <T extends Block> T register(T block) {
        GameRegistry.register(block);
        ItemBlock ib = new ItemBlock(block);
        ib.setRegistryName(block.getRegistryName());
        GameRegistry.register(ib);
        return block;
    }
}
