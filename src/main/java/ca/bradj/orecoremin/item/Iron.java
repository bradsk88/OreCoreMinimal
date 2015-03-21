package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecoremin.item.iron.IronBlockInferior;
import ca.bradj.orecoremin.item.iron.IronDust;
import ca.bradj.orecoremin.item.iron.IronGravel;
import ca.bradj.orecoremin.item.iron.IronNugget;

public class Iron implements VanillaPlus {

    public static final String IRON_DUST_DICT = "dustIron";
    public static final String IRON_NUGGET_DICT = "nuggetIron";
    public static final String IRON_INGOT_DICT = "ingotIron";
    public static final String IRON_GRAVEL_DICT = "gravelIron";
    public static final String IRON_INFERIOR_DICT = "oreIronInferior";

    private static final String IRON_DUST_NAME = "Iron.Dust";
    private static final String IRON_NUGGET_NAME = "Iron.Nugget";
    private static final String IRON_INFERIOR_NAME = "Inferior.Iron";
    private static final String IRON_GRAVEL_NAME = "Iron.Gravel";

    public static final int IRON_GRAVEL_TOP_LEVEL = 70;
    public static final int IRON_INFERIOR_TOP_LEVEL = 50;

    public static final int IRON_GRAVEL_VEIN_SIZE = 4;
    public static final int IRON_INFERIOR_VEIN_SIZE = 6;
    private static Iron INSTANCE = null;

    public static Iron getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Iron();
        }
        return INSTANCE;
    }

    public static void preInit() {
        OreCoreMinItemsRepo.ironInferior = OreCoreRegistration.registerBlock(new IronBlockInferior(), IRON_INFERIOR_NAME);
        OreCoreMinItemsRepo.ironDust = OreCoreRegistration.registerItem(new IronDust(), IRON_DUST_NAME);
        OreCoreMinItemsRepo.ironNugget = OreCoreRegistration.registerItem(new IronNugget(), IRON_NUGGET_NAME);
        OreCoreMinItemsRepo.ironGravel = OreCoreRegistration.registerBlock(new IronGravel(), IRON_GRAVEL_NAME);

        OreDictionary.registerOre(IRON_DUST_DICT, OreCoreMinItemsRepo.ironDust);
        OreDictionary.registerOre(IRON_NUGGET_DICT, OreCoreMinItemsRepo.ironNugget);
        OreDictionary.registerOre(IRON_INFERIOR_DICT, OreCoreMinItemsRepo.ironInferior);
        OreDictionary.registerOre(IRON_GRAVEL_DICT, OreCoreMinItemsRepo.ironGravel);
    }

    public static void init() {
        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.ironDust, Items.iron_ingot, 1);

        OreCoreRegistration.nuggetToIngotStandard(OreCoreMinItems.iron().asNugget(), IRON_NUGGET_DICT, Items.iron_ingot);
        OreCoreRegistration.ingotToNuggetStandard(Items.iron_ingot, IRON_INGOT_DICT, OreCoreMinItemsRepo.ironNugget);

        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.ironGravel, Items.iron_ingot, 1);
        OreCoreRegistration.addSmelting(OreCoreMinItemsRepo.ironInferior, OreCoreMinItemsRepo.ironNugget, 3);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.ironDust; }
    @Override public Block asGravel() { return OreCoreMinItemsRepo.ironGravel; }
    @Override public Item asNugget() { return OreCoreMinItemsRepo.ironNugget; }
    @Override public Block asInferior() { return OreCoreMinItemsRepo.ironInferior; }

}
