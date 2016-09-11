package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.item.base.OreBlock;
import ca.bradj.orecoremin.item.base.OreCoreMinBlockInterface;
import ca.bradj.orecoremin.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.gold.GoldBlockInferior;
import ca.bradj.orecoremin.item.gold.GoldDust;
import ca.bradj.orecoremin.item.gold.GoldGravel;

public class Gold implements VanillaPlus {

    public static final String GOLD_DUST_DICT = "dustGold";
//    public static final String GOLD_INGOT_DICT = "ingotGold";
    public static final String GOLD_GRAVEL_DICT = "gravelGold";
    public static final String GOLD_INFERIOR_DICT = "oreGoldInferior";

//    private static final String GOLD_DUST_NAME = "Gold.Dust";
//    private static final String GOLD_INFERIOR_NAME = "Inferior.Gold";
//    private static final String GOLD_GRAVEL_NAME = "Gold.Gravel";
//
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
        OreCoreMinItemsRepo.goldInferior = Registration.register(new GoldBlockInferior());
        OreCoreMinItemsRepo.goldDust = Registration.register(new GoldDust());
        OreCoreMinItemsRepo.goldGravel = Registration.register(new GoldGravel());

        OreDictionary.registerOre(GOLD_DUST_DICT, OreCoreMinItemsRepo.goldDust);
        OreDictionary.registerOre(GOLD_INFERIOR_DICT, OreCoreMinItemsRepo.goldInferior);
        OreDictionary.registerOre(GOLD_GRAVEL_DICT, OreCoreMinItemsRepo.goldGravel);
    }

    public static void init() {
        GameRegistry.addSmelting(OreCoreMinItemsRepo.goldGravel, new ItemStack(Items.GOLD_INGOT, 1), 0);
        GameRegistry.addSmelting(OreCoreMinItemsRepo.goldDust, new ItemStack(Items.GOLD_NUGGET, 3), 0);
        GameRegistry.addSmelting(OreCoreMinItemsRepo.goldInferior, new ItemStack(Items.GOLD_NUGGET, 4), 0);

    }

    public static void registerRenders() {
        Registration.registerRender(OreCoreMinItemsRepo.goldInferior);
        Registration.registerRender(OreCoreMinItemsRepo.goldGravel);
        Registration.registerRender(OreCoreMinItemsRepo.goldDust);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.goldDust; }
    @Override public Item asNugget() { return Items.GOLD_NUGGET; }
    @Override public OreCoreMinBlockInterface asGravel() { return OreCoreMinItemsRepo.goldGravel; }
    @Override public OreCoreMinBlockInterface asInferior() { return OreCoreMinItemsRepo.goldInferior; }

}
