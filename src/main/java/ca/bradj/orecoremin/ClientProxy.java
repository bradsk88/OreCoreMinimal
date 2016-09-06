package ca.bradj.orecoremin;

import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.base.OreCoreMinItem;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        OreCoreMinItems.registerRenders();
    }
}
