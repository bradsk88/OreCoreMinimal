package ca.bradj.orecoremin;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = OreCoreMin.MODID, version = OreCoreMin.VERSION)
public class OreCoreMin {

    @SidedProxy(clientSide = "ca.bradj.orecoremin.ClientProxy", serverSide = "ca.bradj.orecoremin.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "OreCoreMin";
    public static final String VERSION = "1.0.0";

    public static CreativeTabs tabOreCoreMin = new CreativeTabs("tabOreCoreMin") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return OreCoreMinItems.copperIngot;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(@SuppressWarnings("unused") FMLInitializationEvent e) {
        proxy.init();
    }

    @EventHandler
    public void postInit(@SuppressWarnings("unused") FMLPostInitializationEvent e) {
        proxy.postInit();
    }

}
