package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.orecoremin.item.base.GravelBlock;
import ca.bradj.orecoremin.item.base.OreBlock;
import ca.bradj.orecoremin.item.tin.TinBlock;
import ca.bradj.orecoremin.item.tin.TinBlockInferior;
import ca.bradj.orecoremin.item.tin.TinDust;
import ca.bradj.orecoremin.item.tin.TinGravel;
import ca.bradj.orecoremin.item.tin.TinIngot;
import ca.bradj.orecoremin.item.tin.TinNugget;
import ca.bradj.orecoremin.item.tin.TinPureBlock;

public class Tin implements OreCoreMinMaterial {

    public static final int TIN_TOP_LEVEL = 55;
    public static final int TIN_GRAVEL_TOP_LEVEL = 55;
    public static final int TIN_INFERIOR_TOP_LEVEL = 70;

    public static final int TIN_VEIN_SIZE = 4;
    public static final int TIN_GRAVEL_VEIN_SIZE = 4;
    public static final int TIN_INFERIOR_VEIN_SIZE = 8;
    private static Tin INSTANCE;

    static Tin getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Tin();
        }
        return INSTANCE;
    }

//    public static final DictionaryNames DICT = new DictionaryNames() {
//        {
//            super.ORE.set("oreTin");
//            super.INFERIOR.set("oreTinInferior");
//            super.DUST.set("dustTin");
//            super.INGOT.set("ingotTin");
//            super.NUGGET.set("nuggetTin");
//            super.GRAVEL.set("gravelTin");
//            super.PURE_BLOCK.set("blockTin");
//        }
//    };
//
//    private static final String TIN_NAME = "Tin";
//    private static final String TIN_INFERIOR_NAME = "Inferior.Tin";
//    private static final String TIN_INGOT_NAME = "Tin.Ingot";
//    private static final String TIN_NUGGET_NAME = "Tin.Nugget";
//    private static final String TIN_DUST_NAME = "Tin.Dust";
//    private static final String TIN_GRAVEL_NAME = "Tin.Gravel";
//    private static final String TIN_BLOCK_NAME = "Tin.Block";

    public static void preInit() {
        getInstance().doPreInit();
    }

    public static void init() {
        getInstance().doInit();
    }

    private void doPreInit() {
        OreCoreMinItemsRepo.tin = Registration.register(new TinBlock());
        OreCoreMinItemsRepo.tinInferior = Registration.register(new TinBlockInferior());
        OreCoreMinItemsRepo.tinIngot = Registration.register(new TinIngot());
        OreCoreMinItemsRepo.tinNugget = Registration.register(new TinNugget());
        OreCoreMinItemsRepo.tinDust = Registration.register(new TinDust());
        OreCoreMinItemsRepo.tinGravel = Registration.register(new TinGravel());
        OreCoreMinItemsRepo.tinBlock = Registration.register(new TinPureBlock());
//
//        StandardElementRegistrations.initDictionary(this, DICT);
    }

    public void doInit() {
        Registration.initMaterialRecipes(this);
    }

    //@formatter:off
	@Override public Item asDust() { return OreCoreMinItemsRepo.tinDust; }
	@Override public GravelBlock asGravel() { return OreCoreMinItemsRepo.tinGravel; }
	@Override public OreBlock asInferior() { return OreCoreMinItemsRepo.tinInferior; }
	@Override public Item asIngot() { return OreCoreMinItemsRepo.tinIngot; }
	@Override public Item asNugget() { return OreCoreMinItemsRepo.tinNugget; }
	@Override public OreBlock asOre() { return OreCoreMinItemsRepo.tin; }
	@Override public Block asPureBlock() { return OreCoreMinItemsRepo.tinBlock; }

}
