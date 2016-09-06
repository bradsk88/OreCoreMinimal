package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.util.DictionaryNames;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateDust;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateIngot;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateNugget;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonatePureBlock;

public class Copper2Carbonate implements OreCoreMinForgeable {

    private static final String COPPER_2_CARBONATE_DUST_NAME = "Copper.II.Carbonate.Dust";
    private static final String COPPER_2_CARBONATE_NUGGET_NAME = "Copper.II.Carbonate.Nugget";
    private static final String COPPER_2_CARBONATE_INGOT_NAME = "Copper.II.Carbonate.Ingot";
    private static final String COPPER_2_CARBONATE_BLOCK_NAME = "Copper.II.Carbonate.Block";

    private static Copper2Carbonate INSTANCE;

    static Copper2Carbonate getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Copper2Carbonate();
        }
        return INSTANCE;
    }

    public static void init() {
        getInstance().doInit();
    }

    public static void preInit() {
        getInstance().doPreInit();
    }

//    private static DictionaryNames DICT = new DictionaryNames() {
//        {
//            this.DUST.set("dustCopper2Carbonate");
//            this.INGOT.set("ingotCopper2Carbonate");
//            this.PURE_BLOCK.set("blockCopper2Carbonate");
//            this.NUGGET.set("nuggetCopper2Carbonate");
//        }
//    };

    private void doPreInit() {
//        OreCoreMinItemsRepo.copper2CarbonateDust = OreCoreRegistration.registerItem(new Copper2CarbonateDust(), COPPER_2_CARBONATE_DUST_NAME);
//        OreCoreMinItemsRepo.copper2CarbonateNugget = OreCoreRegistration.registerItem(new Copper2CarbonateNugget(), COPPER_2_CARBONATE_NUGGET_NAME);
//        OreCoreMinItemsRepo.copper2CarbonateIngot = OreCoreRegistration.registerItem(new Copper2CarbonateIngot(), COPPER_2_CARBONATE_INGOT_NAME);
//        OreCoreMinItemsRepo.copper2CarbonateBlock = OreCoreRegistration.registerBlock(new Copper2CarbonatePureBlock(), COPPER_2_CARBONATE_BLOCK_NAME);
//        StandardForgeableRegistrations.initDictionary(this, DICT);
    }

    private void doInit() {
//        StandardForgeableRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.copper2CarbonateDust; }
    @Override public Item asIngot() { return OreCoreMinItemsRepo.copper2CarbonateIngot; }
    @Override public Item asNugget() { return OreCoreMinItemsRepo.copper2CarbonateNugget; }
    @Override public Block asPureBlock() { return OreCoreMinItemsRepo.copper2CarbonateBlock; }

}
