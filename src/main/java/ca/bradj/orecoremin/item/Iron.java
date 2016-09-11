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
import ca.bradj.orecoremin.item.iron.IronBlockInferior;
import ca.bradj.orecoremin.item.iron.IronDust;
import ca.bradj.orecoremin.item.iron.IronGravel;
import ca.bradj.orecoremin.item.iron.IronNugget;

public class Iron implements VanillaPlus {

//    public static final String IRON_DUST_DICT = "dustIron";
//    public static final String IRON_NUGGET_DICT = "nuggetIron";
//    public static final String IRON_INGOT_DICT = "ingotIron";
//    public static final String IRON_GRAVEL_DICT = "gravelIron";
//    public static final String IRON_INFERIOR_DICT = "oreIronInferior";
//
//    private static final String IRON_DUST_NAME = "Iron.Dust";
//    private static final String IRON_NUGGET_NAME = "Iron.Nugget";
//    private static final String IRON_INFERIOR_NAME = "Inferior.Iron";
//    private static final String IRON_GRAVEL_NAME = "Iron.Gravel";

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
        OreCoreMinItemsRepo.ironInferior = Registration.register(new IronBlockInferior());
        OreCoreMinItemsRepo.ironDust = Registration.register(new IronDust());
        OreCoreMinItemsRepo.ironNugget = Registration.register(new IronNugget());
        OreCoreMinItemsRepo.ironGravel = Registration.register(new IronGravel());
//
//        OreDictionary.registerOre(IRON_DUST_DICT, OreCoreMinItemsRepo.ironDust);
//        OreDictionary.registerOre(IRON_NUGGET_DICT, OreCoreMinItemsRepo.ironNugget);
//        OreDictionary.registerOre(IRON_INFERIOR_DICT, OreCoreMinItemsRepo.ironInferior);
//        OreDictionary.registerOre(IRON_GRAVEL_DICT, OreCoreMinItemsRepo.ironGravel);
    }

    public static void init() {
        Registration.nuggetToIngotStandard(OreCoreMinItems.iron().asNugget(), Items.IRON_INGOT);
        Registration.ingotToNuggetStandard(Items.IRON_INGOT, OreCoreMinItemsRepo.ironNugget);

        GameRegistry.addSmelting(OreCoreMinItemsRepo.ironDust, new ItemStack(OreCoreMinItemsRepo.ironNugget, 3), 0);
        GameRegistry.addSmelting(OreCoreMinItemsRepo.ironGravel, new ItemStack(Items.IRON_INGOT, 1), 0);
        GameRegistry.addSmelting(OreCoreMinItemsRepo.ironInferior, new ItemStack(OreCoreMinItemsRepo.ironNugget, 4), 0);
    }

    public static void registerRenders() {
        Registration.registerRender(OreCoreMinItemsRepo.goldInferior);
        Registration.registerRender(OreCoreMinItemsRepo.goldGravel);
        Registration.registerRender(OreCoreMinItemsRepo.goldDust);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreMinItemsRepo.ironDust; }
    @Override public OreCoreMinBlockInterface asGravel() { return OreCoreMinItemsRepo.ironGravel; }
    @Override public Item asNugget() { return OreCoreMinItemsRepo.ironNugget; }
    @Override public OreCoreMinBlockInterface asInferior() { return OreCoreMinItemsRepo.ironInferior; }

}
