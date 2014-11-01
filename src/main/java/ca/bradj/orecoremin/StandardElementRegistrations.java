package ca.bradj.orecoremin;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecoremin.item.DictionaryNames;
import ca.bradj.orecoremin.item.OreCoreMinItems.OreCoreRegistration;
import ca.bradj.orecoremin.item.StandardElement;

/**
 * @see StandardElement
 */
public class StandardElementRegistrations {

	public static void initDictionary(StandardElement el, DictionaryNames dict) {
		OreDictionary.registerOre(dict.ORE, el.asOre());
		OreDictionary.registerOre(dict.INFERIOR, el.asInferior());
		OreDictionary.registerOre(dict.INGOT, el.asIngot());
		OreDictionary.registerOre(dict.NUGGET, el.asNugget());
		OreDictionary.registerOre(dict.DUST, el.asDust());
		OreDictionary.registerOre(dict.PURE_BLOCK, el.asPureBlock());
		OreDictionary.registerOre(dict.GRAVEL, el.asGravel());
	}

	public static void initRecipes(StandardElement el, DictionaryNames dict) {
		OreCoreRegistration.nuggetToIngotStandard(dict.NUGGET, el.asIngot());
		OreCoreRegistration.ingotToNuggetStandard(dict.INGOT, el.asNugget());
		OreCoreRegistration.ingotToBlockStandard(dict.INGOT, el.asPureBlock());
		OreCoreRegistration.blockToIngotStandard(dict.PURE_BLOCK, el.asIngot());

		OreCoreRegistration.addSmelting(el.asOre(), el.asIngot(), 1);
		OreCoreRegistration.addSmelting(el.asDust(), el.asIngot(), 1);
		OreCoreRegistration.addSmelting(el.asGravel(), el.asIngot(), 1);
		OreCoreRegistration.addSmelting(el.asInferior(), el.asNugget(), 3);
	}

}
