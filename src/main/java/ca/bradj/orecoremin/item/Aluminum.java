package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.OreCoreMin;
import ca.bradj.orecoremin.item.base.OreBlock;
import ca.bradj.orecoremin.item.base.OreCoreMinBlockInterface;
import ca.bradj.orecoremin.util.Registration;
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

public class Aluminum implements OreCoreMinMaterial {

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

//    private static final String BAUXITE_NAME = "Bauxite.Ore";
//    private static final String BAUXITE_GRAVEL_NAME = "Bauxite.Gravel";
//    private static final String ALUMINUM_DUST_NAME = "Aluminum.Dust";
//    private static final String ALUMINUM_NUGGET_NAME = "Aluminum.Nugget";
//    private static final String ALUMINUM_INGOT_NAME = "Aluminum.Ingot";
//    private static final String ALUMINUM_BLOCK_NAME = "Aluminum.Block";

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

        OreCoreMinItemsRepo.bauxite = Registration.register(new BauxiteOreBlock());
        OreCoreMinItemsRepo.bauxiteGravel = Registration.register(new BauxiteGravelBlock());
        OreCoreMinItemsRepo.aluminumBlock = Registration.register(new AluminumPureBlock());
        OreCoreMinItemsRepo.aluminumDust = Registration.register(new AluminumDust());
        OreCoreMinItemsRepo.aluminumIngot = Registration.register(new AluminumIngot());
        OreCoreMinItemsRepo.aluminumNugget = Registration.register(new AluminumNugget());
//
        OreDictionary.registerOre("oreBauxite", new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
        OreDictionary.registerOre("oreAluminum", new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
        OreDictionary.registerOre("oreAluminium", new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
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

        Registration.nuggetToIngotStandard(OreCoreMinItems.aluminum().asNugget(), OreCoreMinItemsRepo.aluminumIngot);
//        Registration.nuggetToIngotStandard(OreCoreMinItems.aluminum().asNugget(), ALUMINUM_NUGGET_DICT2, OreCoreMinItemsRepo.aluminumIngot);
//
        Registration.ingotToNuggetStandard(OreCoreMinItems.aluminum().asIngot(), OreCoreMinItemsRepo.aluminumNugget);
//        OreCoreRegistration.ingotToNuggetStandard(OreCoreMinItems.aluminum().asIngot(), ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumNugget);
//
        Registration.ingotToBlockStandard(OreCoreMinItems.aluminum().asIngot(), OreCoreMinItemsRepo.aluminumBlock);
//        OreCoreRegistration.ingotToBlockStandard(OreCoreMinItems.aluminum().asIngot(), ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumBlock);
//
        Registration.blockToIngotStandard(OreCoreMinItems.aluminum().asPureBlock(), OreCoreMinItemsRepo.aluminumIngot);
//        OreCoreRegistration.blockToIngotStandard(OreCoreMinItems.aluminum().asPureBlock(), ALUMINUM_BLOCK_DICT2, OreCoreMinItemsRepo.aluminumIngot);
//
        GameRegistry.addSmelting(OreCoreMinItemsRepo.aluminumDust, new ItemStack(OreCoreMinItemsRepo.aluminumNugget, 3), 0);
        GameRegistry.addSmelting(OreCoreMinItemsRepo.bauxite, new ItemStack(OreCoreMinItemsRepo.aluminumIngot, 1), 0);
        GameRegistry.addSmelting(OreCoreMinItemsRepo.bauxiteGravel, new ItemStack(OreCoreMinItemsRepo.aluminumIngot, 1), 0);
    }

    public static void registerRenders() {
        Registration.registerRender(OreCoreMinItemsRepo.bauxite);
        Registration.registerRender(OreCoreMinItemsRepo.bauxiteGravel);
        Registration.registerRender(OreCoreMinItemsRepo.aluminumBlock);
        Registration.registerRender(OreCoreMinItemsRepo.aluminumDust);
        Registration.registerRender(OreCoreMinItemsRepo.aluminumIngot);
        Registration.registerRender(OreCoreMinItemsRepo.aluminumNugget);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.aluminumDust; }
    @Override public OreCoreMinBlockInterface asGravel() { return OreCoreMinItemsRepo.bauxiteGravel; }
    @Override public OreCoreMinBlockInterface asInferior() { return OreCoreMinItemsRepo.bauxite; } //TODO: Add inferior?
    @Override public Item asIngot() { return OreCoreMinItemsRepo.aluminumIngot; }
    @Override public Item asNugget() { return OreCoreMinItemsRepo.aluminumNugget; }
    @Override public OreCoreMinBlockInterface asOre() { return OreCoreMinItemsRepo.bauxite; }
    @Override public Block asPureBlock() { return OreCoreMinItemsRepo.aluminumBlock; }

}
