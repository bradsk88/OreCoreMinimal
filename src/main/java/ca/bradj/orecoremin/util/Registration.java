package ca.bradj.orecoremin.util;

import ca.bradj.orecoremin.item.OreCoreMinForgeable;
import ca.bradj.orecoremin.item.OreCoreMinMaterial;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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

    public static void nuggetToIngotStandard(Item nuggetInstance, Item ingotInstance) {
        GameRegistry.addRecipe(new ItemStack(ingotInstance, 1), new Object[] {"###", "###", "###", '#', nuggetInstance});
    }

    public static void ingotToNuggetStandard(Item ingotInstance, Item nuggetInstance) {
        GameRegistry.addRecipe(new ItemStack(nuggetInstance, 9), new Object[] {"#", '#', ingotInstance});
    }

    public static void ingotToBlockStandard(Item ingotInstance, Block blockInstance) {
        GameRegistry.addRecipe(new ItemStack(blockInstance, 1), new Object[] {"###", "###", "###", '#', ingotInstance});
    }

    public static void blockToIngotStandard(Block blockInstance, Item ingotInstance) {
        GameRegistry.addRecipe(new ItemStack(ingotInstance, 9), new Object[] {"#", '#', blockInstance});
    }

    public static void initMaterialRecipes(OreCoreMinMaterial forgeable) {
        initForgeableRecipes(forgeable);
        GameRegistry.addSmelting(forgeable.asInferior(), new ItemStack(forgeable.asNugget(), 4), 0);
        GameRegistry.addSmelting(forgeable.asOre(), new ItemStack(forgeable.asIngot(), 1), 0);
        GameRegistry.addSmelting(forgeable.asGravel(), new ItemStack(forgeable.asIngot(), 1), 0);
    }

    public static void initForgeableRecipes(OreCoreMinForgeable forgeable) {
        nuggetToIngotStandard(forgeable.asNugget(), forgeable.asIngot());
        ingotToNuggetStandard(forgeable.asIngot(), forgeable.asNugget());
        ingotToBlockStandard(forgeable.asIngot(), forgeable.asPureBlock());
        blockToIngotStandard(forgeable.asPureBlock(), forgeable.asIngot());
        GameRegistry.addSmelting(forgeable.asDust(), new ItemStack(forgeable.asNugget(), 3), 0);
    }
}
