package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.gold.GoldBlockInferior;
import ca.bradj.orecoremin.item.gold.GoldDust;
import ca.bradj.orecoremin.item.gold.GoldGravel;

public class Gold implements VanillaPlus {

    public static final String GOLD_DUST_DICT = "dustGold";
    public static final String GOLD_INGOT_DICT = "ingotGold";
    public static final String GOLD_GRAVEL_DICT = "gravelGold";
    public static final String GOLD_INFERIOR_DICT = "oreGoldInferior";

    private static final String GOLD_DUST_NAME = "Gold.Dust";
    private static final String GOLD_INFERIOR_NAME = "Inferior.Gold";
    private static final String GOLD_GRAVEL_NAME = "Gold.Gravel";

    public static final int GOLD_GRAVEL_TOP_LEVEL = 50;
    public static final int GOLD_INFERIOR_TOP_LEVEL = 50;

    public static final int GOLD_GRAVEL_VEIN_SIZE = 4;
    public static final int GOLD_INFERIOR_VEIN_SIZE = 4;
    private static Gold INSTANCE;

    public static Gold getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Gold();
        }
        return INSTANCE;
    }

    public static void preInit() {
//        OreCoreMinItemsRepo.goldInferior = OreCoreRegistration.registerBlock(new GoldBlockInferior(), GOLD_INFERIOR_NAME);
//        OreCoreMinItemsRepo.goldDust = OreCoreRegistration.registerItem(new GoldDust(), GOLD_DUST_NAME);
//        OreCoreMinItemsRepo.goldGravel = OreCoreRegistration.registerBlock(new GoldGravel(), GOLD_GRAVEL_NAME);

        OreDictionary.registerOre(GOLD_DUST_DICT, OreCoreMinItemsRepo.goldDust);
        OreDictionary.registerOre(GOLD_INFERIOR_DICT, OreCoreMinItemsRepo.goldInferior);
        OreDictionary.registerOre(GOLD_GRAVEL_DICT, OreCoreMinItemsRepo.goldGravel);
    }

    public static void init() {
//        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.goldDust, Items.gold_ingot, 1);
//        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.goldGravel, Items.gold_ingot, 1);
//        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.goldInferior, Items.gold_nugget, 3);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.goldDust; }
    @Override public Item asNugget() { return Items.GOLD_NUGGET; }
    @Override public Block asGravel() { return OreCoreMinItemsRepo.goldGravel; }
    @Override public Block asInferior() { return OreCoreMinItemsRepo.goldInferior; }

}
