package ca.bradj.orecoremin.item.aluminum;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;

public class Aluminum {

	private static final String BAUXITE_DICT = "oreBauxite";
	private static final String BAUXITE_DICT2 = "oreAluminum";
	private static final String BAUXITE_DICT3 = "oreAluminium";
	private static final String ALUMINUM_DUST_DICT = "dustAluminum";
	private static final String ALUMINUM_DUST_DICT2 = "dustAluminium";
	private static final String ALUMINUM_NUGGET_DICT = "nuggetAluminum";
	private static final String ALUMINUM_NUGGET_DICT2 = "nuggetAluminium";
	private static final String ALUMINUM_INGOT_DICT = "ingotAluminum";
	private static final String ALUMINUM_INGOT_DICT2 = "ingotAluminium";
	private static final String ALUMINUM_BLOCK_DICT = "blockAluminum";
	private static final String ALUMINUM_BLOCK_DICT2 = "blockAluminium";

	private static final String BAUXITE_NAME = "Bauxite.Ore";
	private static final String BAUXITE_GRAVEL_NAME = "Bauxite.Gravel";
	private static final String ALUMINUM_DUST_NAME = "Aluminum.Dust";
	private static final String ALUMINUM_NUGGET_NAME = "Aluminum.Nugget";
	private static final String ALUMINUM_INGOT_NAME = "Aluminum.Ingot";
	private static final String ALUMINUM_BLOCK_NAME = "Aluminum.Block";

	public static final int BAUXITE_TOP_LEVEL = 50;

	public static final int BAUXITE_VEIN_SIZE = 4;
	public static final int BAUXITE_GRAVEL_VEIN_SIZE = 10;

	public static void init() {

		OreCoreMinItems.bauxite = OreCoreRegistration.registerBlock(new BauxiteOreBlock(), BAUXITE_NAME);
		OreCoreMinItems.bauxiteGravel = OreCoreRegistration.registerBlock(new BauxiteGravelBlock(), BAUXITE_GRAVEL_NAME);
		OreCoreMinItems.aluminumIngot = OreCoreRegistration.registerItem(new AluminumIngot(), ALUMINUM_INGOT_NAME);
		OreCoreMinItems.aluminumDust = OreCoreRegistration.registerItem(new AluminumDust(), ALUMINUM_DUST_NAME);
		OreCoreMinItems.aluminumNugget = OreCoreRegistration.registerItem(new AluminumNugget(), ALUMINUM_NUGGET_NAME);
		OreCoreMinItems.aluminumBlock = OreCoreRegistration.registerBlock(new AluminumPureBlock(), ALUMINUM_BLOCK_NAME);

		OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(OreCoreMinItems.bauxite, 1));
		OreDictionary.registerOre(BAUXITE_DICT2, new ItemStack(OreCoreMinItems.bauxite, 1));
		OreDictionary.registerOre(BAUXITE_DICT3, new ItemStack(OreCoreMinItems.bauxite, 1));

		OreDictionary.registerOre(ALUMINUM_DUST_DICT, OreCoreMinItems.aluminumDust);
		OreDictionary.registerOre(ALUMINUM_DUST_DICT2, OreCoreMinItems.aluminumDust);

		OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, OreCoreMinItems.aluminumNugget);
		OreDictionary.registerOre(ALUMINUM_NUGGET_DICT2, OreCoreMinItems.aluminumNugget);

		OreDictionary.registerOre(ALUMINUM_INGOT_DICT, OreCoreMinItems.aluminumIngot);
		OreDictionary.registerOre(ALUMINUM_INGOT_DICT2, OreCoreMinItems.aluminumIngot);

		OreDictionary.registerOre(ALUMINUM_BLOCK_DICT, OreCoreMinItems.aluminumBlock);
		OreDictionary.registerOre(ALUMINUM_BLOCK_DICT2, OreCoreMinItems.aluminumBlock);

		OreCoreRegistration.nuggetToIngotStandard(ALUMINUM_NUGGET_DICT, OreCoreMinItems.aluminumIngot);
		OreCoreRegistration.nuggetToIngotStandard(ALUMINUM_NUGGET_DICT2, OreCoreMinItems.aluminumIngot);

		OreCoreRegistration.ingotToNuggetStandard(ALUMINUM_INGOT_DICT, OreCoreMinItems.aluminumNugget);
		OreCoreRegistration.ingotToNuggetStandard(ALUMINUM_INGOT_DICT2, OreCoreMinItems.aluminumNugget);

		OreCoreRegistration.ingotToBlockStandard(ALUMINUM_INGOT_DICT, OreCoreMinItems.aluminumBlock);
		OreCoreRegistration.ingotToBlockStandard(ALUMINUM_INGOT_DICT2, OreCoreMinItems.aluminumBlock);

		OreCoreRegistration.blockToIngotStandard(ALUMINUM_BLOCK_DICT, OreCoreMinItems.aluminumIngot);
		OreCoreRegistration.blockToIngotStandard(ALUMINUM_BLOCK_DICT2, OreCoreMinItems.aluminumIngot);

		OreCoreRegistration.addSmelting(OreCoreMinItems.aluminumDust, OreCoreMinItems.aluminumNugget, 3);
		OreCoreRegistration.addSmelting(OreCoreMinItems.bauxite, OreCoreMinItems.aluminumIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreMinItems.bauxiteGravel, OreCoreMinItems.aluminumIngot, 1);
	}

}
