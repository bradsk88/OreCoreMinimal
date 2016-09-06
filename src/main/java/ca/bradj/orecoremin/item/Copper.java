package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.OreCoreMin;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.orecoremin.item.base.GravelBlock;
import ca.bradj.orecoremin.item.base.OreBlock;
import ca.bradj.orecoremin.item.copper.CopperBlock;
import ca.bradj.orecoremin.item.copper.CopperBlockInferior;
import ca.bradj.orecoremin.item.copper.CopperDust;
import ca.bradj.orecoremin.item.copper.CopperGravel;
import ca.bradj.orecoremin.item.copper.CopperIngot;
import ca.bradj.orecoremin.item.copper.CopperNugget;
import ca.bradj.orecoremin.item.copper.CopperPureBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Copper implements OreCoreMinElement, OreCoreMinForgeable {

    public static final int COPPER_TOP_LEVEL = 50;
    public static final int COPPER_GRAVEL_TOP_LEVEL = 50;
    public static final int COPPER_INFERIOR_TOP_LEVEL = 70;

    public static final int COPPER_VEIN_SIZE = 6;
    public static final int COPPER_GRAVEL_VEIN_SIZE = 4;
    public static final int COPPER_INFERIOR_VEIN_SIZE = 10;

    private static Copper INSTANCE;

    static Copper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Copper();
        }
        return INSTANCE;
    }

// TODO: Simplify and implement this
//    public static final DictionaryNames DICT = new DictionaryNames() {
//        {
//            super.ORE.set("oreCopper");
//            super.INFERIOR.set("oreCopperInferior");
//            super.DUST.set("dustCopper");
//            super.INGOT.set("ingotCopper");
//            super.NUGGET.set("nuggetCopper");
//            super.GRAVEL.set("gravelCopper");
//            super.PURE_BLOCK.set("blockCopper");
//        }
//    };

    private static final String COPPER_NAME = "Copper";
    private static final String COPPER_INFERIOR_NAME = "Inferior.Copper";
    private static final String COPPER_INGOT_NAME = "Copper.Ingot";
    private static final String COPPER_NUGGET_NAME = "Copper.Nugget";
    private static final String COPPER_DUST_NAME = "Copper.Dust";
    private static final String COPPER_GRAVEL_NAME = "Copper.Gravel";
    private static final String COPPER_BLOCK_NAME = "Copper.Block";

    public static void preInit() {
        getInstance().doPreInit();
    }

    public static void init() {
        getInstance().doInit();
    }

    private void doPreInit() {
//        OreCoreMinItemsRepo.copper = OreCoreMin.proxy.registerBlock(new CopperBlock(), COPPER_NAME);
//        OreCoreMinItemsRepo.copperInferior = OreCoreRegistration.registerBlock(new CopperBlockInferior(), COPPER_INFERIOR_NAME);
//        OreCoreMinItemsRepo.copperIngot = OreCoreRegistration.registerItem(new CopperIngot(), COPPER_INGOT_NAME);
//        OreCoreMinItemsRepo.copperNugget = OreCoreRegistration.registerItem(new CopperNugget(), COPPER_NUGGET_NAME);
//        OreCoreMinItemsRepo.copperDust = OreCoreRegistration.registerItem(new CopperDust(), COPPER_DUST_NAME);
//        OreCoreMinItemsRepo.copperGravel = OreCoreRegistration.registerBlock(new CopperGravel(), COPPER_GRAVEL_NAME);
//        OreCoreMinItemsRepo.copperBlock = OreCoreRegistration.registerBlock(new CopperPureBlock(), COPPER_BLOCK_NAME);

//        StandardElementRegistrations.initDictionary(this, DICT);
    }

    public void doInit() {
//        StandardElementRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
	@Override public Item asDust() { return OreCoreMinItemsRepo.copperDust; }
	@Override public GravelBlock asGravel() { return OreCoreMinItemsRepo.copperGravel; }
	@Override public OreBlock asInferior() { return OreCoreMinItemsRepo.copperInferior; }
	@Override public Item asIngot() { return OreCoreMinItemsRepo.copperIngot; }
	@Override public Item asNugget() { return OreCoreMinItemsRepo.copperNugget; }
	@Override public OreBlock asOre() { return OreCoreMinItemsRepo.copper; }
	@Override public Block asPureBlock() { return OreCoreMinItemsRepo.copperBlock; }

}
