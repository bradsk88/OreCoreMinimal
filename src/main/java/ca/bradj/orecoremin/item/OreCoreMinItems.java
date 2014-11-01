package ca.bradj.orecoremin.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ca.bradj.orecoremin.item.aluminum.Aluminum;
import ca.bradj.orecoremin.item.aluminum.AluminumDust;
import ca.bradj.orecoremin.item.aluminum.AluminumIngot;
import ca.bradj.orecoremin.item.aluminum.AluminumNugget;
import ca.bradj.orecoremin.item.aluminum.AluminumPureBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteGravelBlock;
import ca.bradj.orecoremin.item.aluminum.BauxiteOreBlock;
import ca.bradj.orecoremin.item.copper.Copper;
import ca.bradj.orecoremin.item.copper.CopperBlock;
import ca.bradj.orecoremin.item.copper.CopperBlockInferior;
import ca.bradj.orecoremin.item.copper.CopperDust;
import ca.bradj.orecoremin.item.copper.CopperGravel;
import ca.bradj.orecoremin.item.copper.CopperIngot;
import ca.bradj.orecoremin.item.copper.CopperNugget;
import ca.bradj.orecoremin.item.copper.CopperPureBlock;
import ca.bradj.orecoremin.item.copper.carb.Copper2Carbonate;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateDust;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateIngot;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonateNugget;
import ca.bradj.orecoremin.item.copper.carb.Copper2CarbonatePureBlock;
import ca.bradj.orecoremin.item.gold.Gold;
import ca.bradj.orecoremin.item.gold.GoldBlockInferior;
import ca.bradj.orecoremin.item.gold.GoldDust;
import ca.bradj.orecoremin.item.gold.GoldGravel;
import ca.bradj.orecoremin.item.iron.Iron;
import ca.bradj.orecoremin.item.iron.IronBlockInferior;
import ca.bradj.orecoremin.item.iron.IronDust;
import ca.bradj.orecoremin.item.iron.IronGravel;
import ca.bradj.orecoremin.item.iron.IronNugget;
import ca.bradj.orecoremin.item.tin.Tin;
import ca.bradj.orecoremin.item.tin.TinBlock;
import ca.bradj.orecoremin.item.tin.TinBlockInferior;
import ca.bradj.orecoremin.item.tin.TinDust;
import ca.bradj.orecoremin.item.tin.TinGravel;
import ca.bradj.orecoremin.item.tin.TinIngot;
import ca.bradj.orecoremin.item.tin.TinNugget;
import ca.bradj.orecoremin.item.tin.TinPureBlock;

import com.google.common.base.Preconditions;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Centralized location for all OreCore items.
 */
public class OreCoreMinItems {

	public static CopperBlock copper;
	public static CopperIngot copperIngot;
	public static CopperNugget copperNugget;
	public static CopperDust copperDust;
	public static CopperBlockInferior copperInferior;
	public static CopperGravel copperGravel;
	public static CopperPureBlock copperBlock;

	public static Copper2CarbonateDust copper2CarbonateDust;
	public static Copper2CarbonateNugget copper2CarbonateNugget;
	public static Copper2CarbonateIngot copper2CarbonateIngot;
	public static Copper2CarbonatePureBlock copper2CarbonateBlock;

	public static BauxiteOreBlock bauxite;
	public static BauxiteGravelBlock bauxiteGravel;
	public static AluminumDust aluminumDust;
	public static AluminumNugget aluminumNugget;
	public static AluminumIngot aluminumIngot;
	public static AluminumPureBlock aluminumBlock;

	public static TinBlock tin;
	public static TinBlockInferior tinInferior;
	public static TinIngot tinIngot;
	public static TinNugget tinNugget;
	public static TinDust tinDust;
	public static TinGravel tinGravel;
	public static TinPureBlock tinBlock;

	public static IronDust ironDust;
	public static IronNugget ironNugget;
	public static IronBlockInferior ironInferior;
	public static IronGravel ironGravel;

	public static GoldDust goldDust;
	public static GoldBlockInferior goldInferior;
	public static GoldGravel goldGravel;

	public static final void init() {
		Aluminum.init();
		Copper.init();
		Copper2Carbonate.init();
		Gold.init();
		Iron.init();
		Tin.init();
	}

	public static class OreCoreRegistration {

		public static void addSmelting(Item oreIn, Item out, int numOut) {
			GameRegistry.addSmelting(oreIn, new ItemStack(out, numOut), 0);
		}

		public static void addSmelting(Block oreIn, Item out, int numOut) {
			GameRegistry.addSmelting(oreIn, new ItemStack(out, numOut), 0);
		}

		public static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, String name) {
			GameRegistry.registerBlock(block, name);
			block.setBlockName(name);
			return block;
		}

		public static <ITEM extends Item> ITEM registerItem(ITEM item, String name) {
			GameRegistry.registerItem(item, name);
			item.setUnlocalizedName(name);
			return item;
		}

		public static void nuggetToIngotStandard(String nuggetDictString, Item ingotOut) {
			Preconditions.checkNotNull(ingotOut);
			Preconditions.checkArgument(nuggetDictString.length() > 0);
			GameRegistry
					.addRecipe(new ShapedOreRecipe(ingotOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), nuggetDictString }));
		}

		public static void ingotToBlockStandard(String ingotDictString, Block blockOut) {
			Preconditions.checkNotNull(blockOut);
			Preconditions.checkArgument(ingotDictString.length() > 0);
			GameRegistry
					.addRecipe(new ShapedOreRecipe(blockOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), ingotDictString }));
		}

		public static void ingotToNuggetStandard(String ingotDictString, Item nuggetOut) {
			addShapelessRecipe(nuggetOut, 9, ingotDictString);
		}

		public static void blockToIngotStandard(String blockDictString, Item ingotOut) {
			addShapelessRecipe(ingotOut, 9, blockDictString);
		}

		@SuppressWarnings("all")
		// I know, I know -BJ
		public static void addShapelessRecipe(Item out, int numOut, String... inDictStrings) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(out, numOut), inDictStrings));
		}
	}

}
