package ca.bradj.orecoremin.item.iron;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;

public class Iron {

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

	public static void init() {
		OreCoreMinItems.ironInferior = OreCoreRegistration.registerBlock(new IronBlockInferior(), IRON_INFERIOR_NAME);
		OreCoreMinItems.ironDust = OreCoreRegistration.registerItem(new IronDust(), IRON_DUST_NAME);
		OreCoreMinItems.ironNugget = OreCoreRegistration.registerItem(new IronNugget(), IRON_NUGGET_NAME);
		OreCoreMinItems.ironGravel = OreCoreRegistration.registerBlock(new IronGravel(), IRON_GRAVEL_NAME);

		OreDictionary.registerOre(IRON_DUST_DICT, OreCoreMinItems.ironDust);
		OreDictionary.registerOre(IRON_NUGGET_DICT, OreCoreMinItems.ironNugget);
		OreDictionary.registerOre(IRON_INFERIOR_DICT, OreCoreMinItems.ironInferior);
		OreDictionary.registerOre(IRON_GRAVEL_DICT, OreCoreMinItems.ironGravel);

		OreCoreRegistration.addSmelting(OreCoreMinItems.ironDust, Items.iron_ingot, 1);

		OreCoreRegistration.nuggetToIngotStandard(IRON_NUGGET_DICT, Items.iron_ingot);
		OreCoreRegistration.ingotToNuggetStandard(IRON_INGOT_DICT, OreCoreMinItems.ironNugget);

		OreCoreRegistration.addSmelting(OreCoreMinItems.ironGravel, Items.iron_ingot, 1);
		OreCoreRegistration.addSmelting(OreCoreMinItems.ironInferior, OreCoreMinItems.ironNugget, 3);
	}

}
