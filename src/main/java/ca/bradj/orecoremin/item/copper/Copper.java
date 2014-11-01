package ca.bradj.orecoremin.item.copper;

import net.minecraft.item.Item;
import ca.bradj.orecoremin.StandardElementRegistrations;
import ca.bradj.orecoremin.item.DictionaryNames;
import ca.bradj.orecoremin.item.GravelBlock;
import ca.bradj.orecoremin.item.OreBlock;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.PureBlock;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;
import ca.bradj.orecoremin.item.StandardElement;

public class Copper implements StandardElement {

	public static final int COPPER_TOP_LEVEL = 50;
	public static final int COPPER_GRAVEL_TOP_LEVEL = 50;
	public static final int COPPER_INFERIOR_TOP_LEVEL = 70;

	public static final int COPPER_VEIN_SIZE = 6;
	public static final int COPPER_GRAVEL_VEIN_SIZE = 4;
	public static final int COPPER_INFERIOR_VEIN_SIZE = 10;

	public static final DictionaryNames DICT = new DictionaryNames() {{
		super.ORE = "oreCopper";
		super.INFERIOR = "oreCopperInferior";
		super.DUST = "dustCopper";
		super.INGOT = "ingotCopper";
		super.NUGGET = "nuggetCopper";
		super.GRAVEL = "gravelCopper";
		super.PURE_BLOCK = "blockCopper";
	}};

	private static final String COPPER_NAME = "Copper";
	private static final String COPPER_INFERIOR_NAME = "Inferior.Copper";
	private static final String COPPER_INGOT_NAME = "Copper.Ingot";
	private static final String COPPER_NUGGET_NAME = "Copper.Nugget";
	private static final String COPPER_DUST_NAME = "Copper.Dust";
	private static final String COPPER_GRAVEL_NAME = "Copper.Gravel";
	private static final String COPPER_BLOCK_NAME = "Copper.Block";

	public static void init() {
		new Copper().doInit();
	}

	public void doInit() {
		OreCoreMinItems.copper = OreCoreRegistration.registerBlock(new CopperBlock(), COPPER_NAME);
		OreCoreMinItems.copperInferior = OreCoreRegistration.registerBlock(new CopperBlockInferior(), COPPER_INFERIOR_NAME);
		OreCoreMinItems.copperIngot = OreCoreRegistration.registerItem(new CopperIngot(), COPPER_INGOT_NAME);
		OreCoreMinItems.copperNugget = OreCoreRegistration.registerItem(new CopperNugget(), COPPER_NUGGET_NAME);
		OreCoreMinItems.copperDust = OreCoreRegistration.registerItem(new CopperDust(), COPPER_DUST_NAME);
		OreCoreMinItems.copperGravel = OreCoreRegistration.registerBlock(new CopperGravel(), COPPER_GRAVEL_NAME);
		OreCoreMinItems.copperBlock = OreCoreRegistration.registerBlock(new CopperPureBlock(), COPPER_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}

	//@formatter:off
	@Override public Item asDust() { return OreCoreMinItems.copperDust; }
	@Override public GravelBlock asGravel() { return OreCoreMinItems.copperGravel; }
	@Override public OreBlock asInferior() { return OreCoreMinItems.copperInferior; }
	@Override public Item asIngot() { return OreCoreMinItems.copperIngot; }
	@Override public Item asNugget() { return OreCoreMinItems.copperNugget; }
	@Override public OreBlock asOre() { return OreCoreMinItems.copper; }
	@Override public PureBlock asPureBlock() { return OreCoreMinItems.copperBlock; }

}
