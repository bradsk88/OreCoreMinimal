package ca.bradj.orecoremin.item.copper.carb;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;

public class Copper2Carbonate {

	private static final String COPPER_2_CARBONATE_DUST_NAME = "Copper.II.Carbonate.Dust";
	private static final String COPPER_2_CARBONATE_NUGGET_NAME = "Copper.II.Carbonate.Nugget";
	private static final String COPPER_2_CARBONATE_INGOT_NAME = "Copper.II.Carbonate.Ingot";
	private static final String COPPER_2_CARBONATE_BLOCK_NAME = "Copper.II.Carbonate.Block";

	private static final String DUST_DICT = "dustCopper2Carbonate";
	private static final String NUGGET_DICT = "nuggetCopper2Carbonate";
	private static final String INGOT_DICT = "ingotCopper2Carbonate";
	private static final String BLOCK_DICT = "blockCopper2Carbonate";

	public static void init() {
		OreCoreMinItems.copper2CarbonateDust = OreCoreRegistration.registerItem(new Copper2CarbonateDust(), COPPER_2_CARBONATE_DUST_NAME);
		OreCoreMinItems.copper2CarbonateNugget = OreCoreRegistration.registerItem(new Copper2CarbonateNugget(), COPPER_2_CARBONATE_NUGGET_NAME);
		OreCoreMinItems.copper2CarbonateIngot = OreCoreRegistration.registerItem(new Copper2CarbonateIngot(), COPPER_2_CARBONATE_INGOT_NAME);
		OreCoreMinItems.copper2CarbonateBlock = OreCoreRegistration.registerBlock(new Copper2CarbonatePureBlock(), COPPER_2_CARBONATE_BLOCK_NAME);

		OreDictionary.registerOre(DUST_DICT, OreCoreMinItems.copper2CarbonateDust);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreMinItems.copper2CarbonateNugget);
		OreDictionary.registerOre(INGOT_DICT, OreCoreMinItems.copper2CarbonateIngot);
		OreDictionary.registerOre(BLOCK_DICT, OreCoreMinItems.copper2CarbonateBlock);

		OreCoreRegistration.nuggetToIngotStandard(NUGGET_DICT, OreCoreMinItems.copper2CarbonateIngot);
		OreCoreRegistration.ingotToNuggetStandard(INGOT_DICT, OreCoreMinItems.copper2CarbonateNugget);
		OreCoreRegistration.ingotToBlockStandard(INGOT_DICT, OreCoreMinItems.copper2CarbonateBlock);
		OreCoreRegistration.blockToIngotStandard(BLOCK_DICT, OreCoreMinItems.copper2CarbonateIngot);

		OreCoreRegistration.addSmelting(OreCoreMinItems.copper2CarbonateDust, OreCoreMinItems.copper2CarbonateIngot, 1);
	}

}
