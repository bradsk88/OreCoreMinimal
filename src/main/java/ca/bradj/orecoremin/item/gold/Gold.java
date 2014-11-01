package ca.bradj.orecoremin.item.gold;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;

public class Gold {

	public static final String GOLD_DUST_DICT = "dustGold";
	public static final String GOLD_INGOT_DICT = "ingotGold";
	public static final String GOLD_GRAVEL_DICT = "gravelGold";
	public static final String GOLD_INFERIOR_DICT = "oreGoldInferior";

	private static final String GOLD_DUST_NAME = "Gold.Dust";
	private static final String GOLD_INFERIOR_NAME = "Inferior.Gold";
	private static final String GOLD_GRAVEL_NAME = "Gold.Gravel";

	public static final int GOLD_GRAVEL_TOP_LEVEL = 50;
	public static final int GOLD_INFERIOR_TOP_LEVEL = 50;

	public static final int GOLD_GRAVEL_VEIN_SIZE = 4;
	public static final int GOLD_INFERIOR_VEIN_SIZE = 4;

	public static void init() {
		OreCoreMinItems.goldInferior = OreCoreRegistration.registerBlock(new GoldBlockInferior(), GOLD_INFERIOR_NAME);
		OreCoreMinItems.goldDust = OreCoreRegistration.registerItem(new GoldDust(), GOLD_DUST_NAME);
		OreCoreMinItems.goldGravel = OreCoreRegistration.registerBlock(new GoldGravel(), GOLD_GRAVEL_NAME);

		OreDictionary.registerOre(GOLD_DUST_DICT, OreCoreMinItems.goldDust);
		OreDictionary.registerOre(GOLD_INFERIOR_DICT, OreCoreMinItems.goldInferior);
		OreDictionary.registerOre(GOLD_GRAVEL_DICT, OreCoreMinItems.goldGravel);

		OreCoreRegistration.addSmelting(OreCoreMinItems.goldDust, Items.gold_ingot, 1);
		OreCoreRegistration.addSmelting(OreCoreMinItems.goldGravel, Items.gold_ingot, 1);
		OreCoreRegistration.addSmelting(OreCoreMinItems.goldInferior, Items.gold_nugget, 3);
	}
}
