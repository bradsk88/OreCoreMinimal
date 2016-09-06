package ca.bradj.orecoremin.item;

/**
 * This class exists to provide a centralized access point for mods to access
 * the OreCore-Minimum items, while protecting those items from being changed
 * externally.
 */
public class OreCoreMinItems {

    public static Aluminum aluminum() {
        return Aluminum.getInstance();
    }

    public static Copper copper() {
        return Copper.getInstance();
    }

    public static Copper2Carbonate copper2Carbonate() {
        return Copper2Carbonate.getInstance();
    }

    public static Gold gold() {
        return Gold.getInstance();
    }

    public static void init() {
        OreCoreMinItemsRepo.init();
    }

    public static Iron iron() {
        return Iron.getInstance();
    }

    public static void preInit() {
        OreCoreMinItemsRepo.preInit();
    }

    public static Tin tin() {
        return Tin.getInstance();
    }

    public static void registerRenders() {
        Aluminum.registerRenders();
    }
}

