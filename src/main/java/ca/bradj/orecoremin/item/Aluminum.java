package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardElement;
import ca.bradj.orecoremin.item.aluminum.AluminumDust;
import ca.bradj.orecoremin.item.aluminum.AluminumIngot;
import ca.bradj.orecoremin.item.aluminum.AluminumNugget;
import ca.bradj.orecoremin.item.aluminum.AluminumPureBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteGravelBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteOreBlock;

public class Aluminum implements StandardElement {

    private static final String BAUXITE_DICT = "oreBauxite";
    private static final String BAUXITE_DICT2 = "oreAluminum";
    private static final String BAUXITE_DICT3 = "oreAluminium";
    private static final String ALUMINUM_DUST_DICT = "dustAluminum";
    private static final String ALUMINUM_DUST_DICT2 = "dustAluminium";
    private static final String ALUMINUM_NUGGET_DICT = "nuggetAluminum";
    private static final String ALUMINUM_NUGGET_DICT2 = "nuggetAluminium";
    private static final String ALUMINUM_INGOT_DICT = "ingotAluminum";
    private static final String ALUMINUM_INGOT_DICT2 = "ingotAluminium";
    private static final String ALUMINUM_BLOCK_DICT = "blockAluminum";
    private static final String ALUMINUM_BLOCK_DICT2 = "blockAluminium";

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

        OreCoreMinItemsRepo.bauxite = OreCoreRegistration.registerBlock(new BauxiteOreBlock(), BAUXITE_NAME);
        OreCoreMinItemsRepo.bauxiteGravel = OreCoreRegistration.registerBlock(new BauxiteGravelBlock(), BAUXITE_GRAVEL_NAME);
        OreCoreMinItemsRepo.aluminumIngot = OreCoreRegistration.registerItem(new AluminumIngot(), ALUMINUM_INGOT_NAME);
        OreCoreMinItemsRepo.aluminumDust = OreCoreRegistration.registerItem(new AluminumDust(), ALUMINUM_DUST_NAME);
        OreCoreMinItemsRepo.aluminumNugget = OreCoreRegistration.registerItem(new AluminumNugget(), ALUMINUM_NUGGET_NAME);
        OreCoreMinItemsRepo.aluminumBlock = OreCoreRegistration.registerBlock(new AluminumPureBlock(), ALUMINUM_BLOCK_NAME);

        OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
        OreDictionary.registerOre(BAUXITE_DICT2, new ItemStack(OreCoreMinItemsRepo.bauxite, 1));
        OreDictionary.registerOre(BAUXITE_DICT3, new ItemStack(OreCoreMinItemsRepo.bauxite, 1));

        OreDictionary.registerOre(ALUMINUM_DUST_DICT, OreCoreMinItemsRepo.aluminumDust);
        OreDictionary.registerOre(ALUMINUM_DUST_DICT2, OreCoreMinItemsRepo.aluminumDust);

        OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, OreCoreMinItemsRepo.aluminumNugget);
        OreDictionary.registerOre(ALUMINUM_NUGGET_DICT2, OreCoreMinItemsRepo.aluminumNugget);

        OreDictionary.registerOre(ALUMINUM_INGOT_DICT, OreCoreMinItemsRepo.aluminumIngot);
        OreDictionary.registerOre(ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumIngot);

        OreDictionary.registerOre(ALUMINUM_BLOCK_DICT, OreCoreMinItemsRepo.aluminumBlock);
        OreDictionary.registerOre(ALUMINUM_BLOCK_DICT2, OreCoreMinItemsRepo.aluminumBlock);

    }

    public static void init() {

        OreCoreRegistration.nuggetToIngotStandard(ALUMINUM_NUGGET_DICT, OreCoreMinItemsRepo.aluminumIngot);
        OreCoreRegistration.nuggetToIngotStandard(ALUMINUM_NUGGET_DICT2, OreCoreMinItemsRepo.aluminumIngot);

        OreCoreRegistration.ingotToNuggetStandard(ALUMINUM_INGOT_DICT, OreCoreMinItemsRepo.aluminumNugget);
        OreCoreRegistration.ingotToNuggetStandard(ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumNugget);

        OreCoreRegistration.ingotToBlockStandard(ALUMINUM_INGOT_DICT, OreCoreMinItemsRepo.aluminumBlock);
        OreCoreRegistration.ingotToBlockStandard(ALUMINUM_INGOT_DICT2, OreCoreMinItemsRepo.aluminumBlock);

        OreCoreRegistration.blockToIngotStandard(ALUMINUM_BLOCK_DICT, OreCoreMinItemsRepo.aluminumIngot);
        OreCoreRegistration.blockToIngotStandard(ALUMINUM_BLOCK_DICT2, OreCoreMinItemsRepo.aluminumIngot);

        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.aluminumDust, OreCoreMinItemsRepo.aluminumNugget, 3);
        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.bauxite, OreCoreMinItemsRepo.aluminumIngot, 1);
        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.bauxiteGravel, OreCoreMinItemsRepo.aluminumIngot, 1);
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
