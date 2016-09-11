package ca.bradj.orecoremin;

import ca.bradj.orecoremin.item.OreCoreMinItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

public class CommonProxy {

    private static final String AGGRESSIVE = "Set this to true if you want orecore to attempt to make recipe outputs from other mods output OreCore items instead.";
    private static IWorldGenerator WORLD_GEN;
    private Configuration config;
    private Logger logger;
    public static boolean aggressive = false;

    public void preInit(FMLPreInitializationEvent e) {

        logger = e.getModLog();
        config = new Configuration(e.getSuggestedConfigurationFile());
        config.load();
        OreCoreMinItems.preInit();
        WORLD_GEN = new OreCoreMinWorldGen(config, e.getModLog());
    }

    public void init() {
//        MinecraftForge.EVENT_BUS.register(this);
//        FMLCommonHandler.instance().bus().register(this);
//        if (config.getBoolean("aggressive", "recipes", false, AGGRESSIVE)) {
//            aggressive = true;
//        }
        OreCoreMinItems.init();
        config.save();
        GameRegistry.registerWorldGenerator(WORLD_GEN, 1);
    }

    public void postInit() {
    }

}
