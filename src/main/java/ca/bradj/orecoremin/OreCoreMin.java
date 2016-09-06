package ca.bradj.orecoremin;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = OreCoreMin.MODID, version = OreCoreMin.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class OreCoreMin {

    @SidedProxy(clientSide = "ca.bradj.orecoremin.ClientProxy", serverSide = "ca.bradj.orecoremin.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "OreCoreMin";
    public static final String VERSION = "2.0.0";

    public static CreativeTabs tabOreCoreMin = new CreativeTabs("tabOreCoreMin") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return OreCoreMinItems.aluminum().asIngot();
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(@SuppressWarnings("unused") FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(@SuppressWarnings("unused") FMLPostInitializationEvent e) {
        proxy.postInit();
    }

}
