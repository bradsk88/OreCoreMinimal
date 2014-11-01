package ca.bradj.orecoremin.item.tin;

import net.minecraft.item.Item;
import ca.bradj.orecoremin.StandardElementRegistrations;
import ca.bradj.orecoremin.item.DictionaryNames;
import ca.bradj.orecoremin.item.GravelBlock;
import ca.bradj.orecoremin.item.OreBlock;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;
import ca.bradj.orecoremin.item.PureBlock;
import ca.bradj.orecoremin.item.StandardElement;

public class Tin implements StandardElement {

	public static final int TIN_TOP_LEVEL = 55;
	public static final int TIN_GRAVEL_TOP_LEVEL = 55;
	public static final int TIN_INFERIOR_TOP_LEVEL = 70;

	public static final int TIN_VEIN_SIZE = 4;
	public static final int TIN_GRAVEL_VEIN_SIZE = 4;
	public static final int TIN_INFERIOR_VEIN_SIZE = 8;

	public static final DictionaryNames DICT = new DictionaryNames() {{
		super.ORE = "oreTin";
		super.INFERIOR = "oreTinInferior";
		super.DUST = "dustTin";
		super.INGOT = "ingotTin";
		super.NUGGET = "nuggetTin";
		super.GRAVEL = "gravelTin";
		super.PURE_BLOCK = "blockTin";
	}};

	private static final String TIN_NAME = "Tin";
	private static final String TIN_INFERIOR_NAME = "Inferior.Tin";
	private static final String TIN_INGOT_NAME = "Tin.Ingot";
	private static final String TIN_NUGGET_NAME = "Tin.Nugget";
	private static final String TIN_DUST_NAME = "Tin.Dust";
	private static final String TIN_GRAVEL_NAME = "Tin.Gravel";
	private static final String TIN_BLOCK_NAME = "Tin.Block";

	public static void init() {
		new Tin().doInit();
	}

	public void doInit() {
		OreCoreMinItems.tin = OreCoreRegistration.registerBlock(new TinBlock(), TIN_NAME);
		OreCoreMinItems.tinInferior = OreCoreRegistration.registerBlock(new TinBlockInferior(), TIN_INFERIOR_NAME);
		OreCoreMinItems.tinIngot = OreCoreRegistration.registerItem(new TinIngot(), TIN_INGOT_NAME);
		OreCoreMinItems.tinNugget = OreCoreRegistration.registerItem(new TinNugget(), TIN_NUGGET_NAME);
		OreCoreMinItems.tinDust = OreCoreRegistration.registerItem(new TinDust(), TIN_DUST_NAME);
		OreCoreMinItems.tinGravel = OreCoreRegistration.registerBlock(new TinGravel(), TIN_GRAVEL_NAME);
		OreCoreMinItems.tinBlock = OreCoreRegistration.registerBlock(new TinPureBlock(), TIN_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}

	//@formatter:off
	@Override public Item asDust() { return OreCoreMinItems.tinDust; }
	@Override public GravelBlock asGravel() { return OreCoreMinItems.tinGravel; }
	@Override public OreBlock asInferior() { return OreCoreMinItems.tinInferior; }
	@Override public Item asIngot() { return OreCoreMinItems.tinIngot; }
	@Override public Item asNugget() { return OreCoreMinItems.tinNugget; }
	@Override public OreBlock asOre() { return OreCoreMinItems.tin; }
	@Override public PureBlock asPureBlock() { return OreCoreMinItems.tinBlock; }

}
