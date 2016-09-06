package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.aluminum.AluminumDust;
import ca.bradj.orecoremin.item.aluminum.AluminumIngot;
import ca.bradj.orecoremin.item.aluminum.AluminumNugget;
import ca.bradj.orecoremin.item.aluminum.AluminumPureBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteGravelBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteOreBlock;

public class Aluminum implements OreCoreMinForgeable, OreCoreMinElement {

//    private static final String BAUXITE_DICT = OreCoreRegistration.registerDictString("oreBauxite");
//    private static final String BAUXITE_DICT2 = OreCoreRegistration.registerDictString("oreAluminum");
//    private static final String BAUXITE_DICT3 = OreCoreRegistration.registerDictString("oreAluminium");
//    private static final String ALUMINUM_DUST_DICT = OreCoreRegistration.registerDictString("dustAluminum");
//    private static final String ALUMINUM_DUST_DICT2 = OreCoreRegistration.registerDictString("dustAluminium");
//    private static final String ALUMINUM_NUGGET_DICT = OreCoreRegistration.registerDictString("nuggetAluminum");
//    private static final String ALUMINUM_NUGGET_DICT2 = OreCoreRegistration.registerDictString("nuggetAluminium");
//    private static final String ALUMINUM_INGOT_DICT = OreCoreRegistration.registerDictString("ingotAluminum");
//    private static final String ALUMINUM_INGOT_DICT2 = OreCoreRegistration.registerDictString("ingotAluminium");
//    private static final String ALUMINUM_BLOCK_DICT = OreCoreRegistration.registerDictString("blockAluminum");
//    private static final String ALUMINUM_BLOCK_DICT2 = OreCoreRegistration.registerDictString("blockAluminium");

    private static final String BAUXITE_NAME = "Bauxite.Ore";
    private static final String BAUXITE_GRAVEL_NAME = "Bauxite.Gravel";
    private static final String ALUMINUM_DUST_NAME = "Aluminum.Dust";
    private static final String ALUMINUM_NUGGET_NAME = "Aluminum.Nugget";
    private static final String ALUMINUM_INGOT_NAME = "Aluminum.Ingot";
    private static final String ALUMINUM_BLOCK_NAME = "Aluminum.Block";

    public static final int BAUXITE_TOP_LEVEL = 50;

    public static final int BAUXITE_VEIN_SIZE = 4;
    public static final int BAUXITE_GRAVEL_VEIN_SIZE = 10;

    private static Aluminum INSTANCE;

    public static Aluminum getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Aluminum();
        }
        return INSTANCE;
    }

    public static void preInit() {

        register();
//        OreCoreMinItemsRepo.bauxite = OreCoreRegistration.registerBlock(new BauxiteOreBlock(), BAUXITE_NAME);
//        OreCoreMinItemsRepo.bauxiteGravel = OreCoreRegistration.registerBlock(new BauxiteGravelBlock(), BAUXITE_GRAVEL_NAME);
//        OreCoreMinItemsRepo.aluminumDust = OreCoreRegistration.registerItem(new AluminumDust(), ALUMINUM_DUST_NAME);
//        OreCoreMinItemsRepo.aluminumNugget = OreCoreRegistration.registerItem(new AluminumNugget(), ALUMINUM_NUGGET_NAME);
//        OreCoreMinItemsRepo.aluminumBlock = OreCoreRegistration.registerBlock(new AluminumPureBlock(), ALUMINUM_BLOCK_NAME);
//
//        OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
//        OreDictionary.registerOre(BAUXITE_DICT2, new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
//        OreDictionary.registerOre(BAUXITE_DICT3, new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
//
//        OreDictionary.registerOre(ALUMINUM_DUST_DICT, OreCoreMinItemsRepo.aluminumDust);
//        OreDictionary.registerOre(ALUMINUM_DUST_DICT2, OreCoreMinItemsRepo.aluminumDust);
//
//        OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, OreCoreMinItemsRepo.aluminumNugget);
//        OreDictionary.registerOre(ALUMINUM_NUGGET_DICT2, OreCoreMinItemsRepo.aluminumNugget);
//
//        OreDictionary.registerOre(ALUMINUM_INGOT_DICT, OreCoreMinItemsRepo.aluminumIngot);
//        OreDictionary.registerOre(ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumIngot);
//
//        OreDictionary.registerOre(ALUMINUM_BLOCK_DICT, OreCoreMinItemsRepo.aluminumBlock);
//        OreDictionary.registerOre(ALUMINUM_BLOCK_DICT2, OreCoreMinItemsRepo.aluminumBlock);

    }

    public static void init() {

//        OreCoreRegistration.nuggetToIngotStandard(OreCoreMinItems.aluminum().asNugget(), ALUMINUM_NUGGET_DICT, OreCoreMinItemsRepo.aluminumIngot);
//        OreCoreRegistration.nuggetToIngotStandard(OreCoreMinItems.aluminum().asNugget(), ALUMINUM_NUGGET_DICT2, OreCoreMinItemsRepo.aluminumIngot);
//
//        OreCoreRegistration.ingotToNuggetStandard(OreCoreMinItems.aluminum().asIngot(), ALUMINUM_INGOT_DICT, OreCoreMinItemsRepo.aluminumNugget);
//        OreCoreRegistration.ingotToNuggetStandard(OreCoreMinItems.aluminum().asIngot(), ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumNugget);
//
//        OreCoreRegistration.ingotToBlockStandard(OreCoreMinItems.aluminum().asIngot(), ALUMINUM_INGOT_DICT, OreCoreMinItemsRepo.aluminumBlock);
//        OreCoreRegistration.ingotToBlockStandard(OreCoreMinItems.aluminum().asIngot(), ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumBlock);
//
//        OreCoreRegistration.blockToIngotStandard(OreCoreMinItems.aluminum().asPureBlock(), ALUMINUM_BLOCK_DICT, OreCoreMinItemsRepo.aluminumIngot);
//        OreCoreRegistration.blockToIngotStandard(OreCoreMinItems.aluminum().asPureBlock(), ALUMINUM_BLOCK_DICT2, OreCoreMinItemsRepo.aluminumIngot);
//
//        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.aluminumDust, OreCoreMinItemsRepo.aluminumNugget, 3);
//        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.bauxite, OreCoreMinItemsRepo.aluminumIngot, 1);
//        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.bauxiteGravel, OreCoreMinItemsRepo.aluminumIngot, 1);
    }

    private static void register() {
        OreCoreMinItemsRepo.aluminumIngot = new AluminumIngot();
        GameRegistry.register(OreCoreMinItemsRepo.aluminumIngot);
    }

    public static void registerRenders() {
        registerRender(OreCoreMinItemsRepo.aluminumIngot);
    }

    public static void registerRender(Item item) {
        ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, location);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.aluminumDust; }
    @Override public Block asGravel() { return OreCoreMinItemsRepo.bauxiteGravel; }
    @Override public Block asInferior() { return OreCoreMinItemsRepo.bauxite; } //TODO: Add inferior?
    @Override public Item asIngot() { return OreCoreMinItemsRepo.aluminumIngot; }
    @Override public Item asNugget() { return OreCoreMinItemsRepo.aluminumNugget; }
    @Override public Block asOre() { return OreCoreMinItemsRepo.bauxite; }
    @Override public Block asPureBlock() { return OreCoreMinItemsRepo.aluminumBlock; }

}
