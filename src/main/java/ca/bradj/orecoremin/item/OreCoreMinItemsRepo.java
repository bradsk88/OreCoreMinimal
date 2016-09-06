package ca.bradj.orecoremin.item;

import ca.bradj.orecoremin.item.aluminum.AluminumDust;
import ca.bradj.orecoremin.item.aluminum.AluminumIngot;
import ca.bradj.orecoremin.item.aluminum.AluminumNugget;
import ca.bradj.orecoremin.item.aluminum.AluminumPureBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteGravelBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteOreBlock;
import ca.bradj.orecoremin.item.copper.CopperBlock;
import ca.bradj.orecoremin.item.copper.CopperBlockInferior;
import ca.bradj.orecoremin.item.copper.CopperDust;
import ca.bradj.orecoremin.item.copper.CopperGravel;
import ca.bradj.orecoremin.item.copper.CopperIngot;
import ca.bradj.orecoremin.item.copper.CopperNugget;
import ca.bradj.orecoremin.item.copper.CopperPureBlock;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateDust;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateIngot;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateNugget;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonatePureBlock;
import ca.bradj.orecoremin.item.gold.GoldBlockInferior;
import ca.bradj.orecoremin.item.gold.GoldDust;
import ca.bradj.orecoremin.item.gold.GoldGravel;
import ca.bradj.orecoremin.item.iron.IronBlockInferior;
import ca.bradj.orecoremin.item.iron.IronDust;
import ca.bradj.orecoremin.item.iron.IronGravel;
import ca.bradj.orecoremin.item.iron.IronNugget;
import ca.bradj.orecoremin.item.tin.TinBlock;
import ca.bradj.orecoremin.item.tin.TinBlockInferior;
import ca.bradj.orecoremin.item.tin.TinDust;
import ca.bradj.orecoremin.item.tin.TinGravel;
import ca.bradj.orecoremin.item.tin.TinIngot;
import ca.bradj.orecoremin.item.tin.TinNugget;
import ca.bradj.orecoremin.item.tin.TinPureBlock;

/**
 * Centralized location for all OreCore items.
 */
class OreCoreMinItemsRepo {

    static CopperBlock copper;
    static CopperIngot copperIngot;
    static CopperNugget copperNugget;
    static CopperDust copperDust;
    static CopperBlockInferior copperInferior;
    static CopperGravel copperGravel;
    static CopperPureBlock copperBlock;

    static Copper2CarbonateDust copper2CarbonateDust;
    static Copper2CarbonateNugget copper2CarbonateNugget;
    static Copper2CarbonateIngot copper2CarbonateIngot;
    static Copper2CarbonatePureBlock copper2CarbonateBlock;

    static BauxiteOreBlock bauxite;
    static BauxiteGravelBlock bauxiteGravel;
    static AluminumDust aluminumDust;
    static AluminumNugget aluminumNugget;
    static AluminumIngot aluminumIngot;
    static AluminumPureBlock aluminumBlock;

    static TinBlock tin;
    static TinBlockInferior tinInferior;
    static TinIngot tinIngot;
    static TinNugget tinNugget;
    static TinDust tinDust;
    static TinGravel tinGravel;
    static TinPureBlock tinBlock;

    static IronDust ironDust;
    static IronNugget ironNugget;
    static IronBlockInferior ironInferior;
    static IronGravel ironGravel;

    static GoldDust goldDust;
    static GoldBlockInferior goldInferior;
    static GoldGravel goldGravel;

    public static void preInit() {
        Aluminum.preInit();
//        Copper.preInit();
//        Copper2Carbonate.preInit();
//        Gold.preInit();
//        Iron.preInit();
//        Tin.preInit();
    }

    public static void init() {
        Aluminum.init();
//        Copper.init();
//        Copper2Carbonate.init();
//        Gold.init();
//        Iron.init();
//        Tin.init();
    }

}
