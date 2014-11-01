package ca.bradj.orecoremin;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import org.apache.logging.log4j.Logger;

import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.aluminum.Aluminum;
import ca.bradj.orecoremin.item.copper.Copper;
import ca.bradj.orecoremin.item.gold.Gold;
import ca.bradj.orecoremin.item.iron.Iron;
import ca.bradj.orecoremin.item.tin.Tin;

import com.google.common.base.Preconditions;

public class OreCoreMinOverworldGen {

	private World world;
	private Random random;
	private Configuration config;
	private int x;
	private int z;

	public OreCoreMinOverworldGen(Configuration config, @SuppressWarnings("unused") Logger logger, World world, Random random, int x, int z) {
		this.world = Preconditions.checkNotNull(world);
		this.random = Preconditions.checkNotNull(random);
		this.config = Preconditions.checkNotNull(config);
		this.x = x;
		this.z = z;
	}

	public void generate() {

		doGenerateOre(OreCoreMinItems.bauxite, 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_VEIN_SIZE, config, "bauxite");
		doGenerateOre(OreCoreMinItems.bauxiteGravel, 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_GRAVEL_VEIN_SIZE, OreCoreMinItems.bauxite, config, "bauxiteGravel");

		doGenerateOre(OreCoreMinItems.copper, 0, Copper.COPPER_TOP_LEVEL, Copper.COPPER_VEIN_SIZE, config, "copper");
		doGenerateOre(OreCoreMinItems.copperGravel, 0, Copper.COPPER_GRAVEL_TOP_LEVEL, Copper.COPPER_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "copperGravel");
		doGenerateOre(OreCoreMinItems.copperInferior, 0, Copper.COPPER_INFERIOR_TOP_LEVEL, Copper.COPPER_INFERIOR_VEIN_SIZE, config, "copperInferior");

		doGenerateOre(OreCoreMinItems.goldGravel, 0, Gold.GOLD_GRAVEL_TOP_LEVEL, Gold.GOLD_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "goldGravel");
		doGenerateOre(OreCoreMinItems.goldInferior, 0, Gold.GOLD_INFERIOR_TOP_LEVEL, Gold.GOLD_INFERIOR_VEIN_SIZE, config, "goldInferior");

		doGenerateOre(OreCoreMinItems.ironGravel, 0, Iron.IRON_GRAVEL_TOP_LEVEL, Iron.IRON_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "ironGravel");
		doGenerateOre(OreCoreMinItems.ironInferior, 0, Iron.IRON_INFERIOR_TOP_LEVEL, Iron.IRON_INFERIOR_VEIN_SIZE, config, "ironInferior");

		doGenerateOre(OreCoreMinItems.tin, 0, Tin.TIN_TOP_LEVEL, Tin.TIN_VEIN_SIZE, config, "tin");
		doGenerateOre(OreCoreMinItems.tinGravel, 0, Tin.TIN_GRAVEL_TOP_LEVEL, Tin.TIN_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "tinGravel");
		doGenerateOre(OreCoreMinItems.tinInferior, 0, Tin.TIN_INFERIOR_TOP_LEVEL, Tin.TIN_INFERIOR_VEIN_SIZE, config, "tinInferior");
	}

	private void doGenerateOre(Block ore, int minLayer, int maxLayer, int veinSize, Configuration config, String configTag) {
		doGenerateOre(ore, minLayer, maxLayer, veinSize, Blocks.stone, config, configTag);
	}

	private void doGenerateOre(Block ore, int minLayer, int maxLayer, int veinSize, Block destination, Configuration config, String configTag) {
		Property attempts = config.get("oregen", configTag, OreCoreMinWorldGen.DEFAULT_OREGEN_VALUE);
		for (int i = 0; i < attempts.getInt(); i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = minLayer + random.nextInt(maxLayer - minLayer);
			int chunkZ = z + random.nextInt(16);

			new WorldGenMinable(ore, 0, veinSize, destination).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

}
