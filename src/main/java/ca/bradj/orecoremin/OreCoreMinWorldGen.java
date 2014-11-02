package ca.bradj.orecoremin;

import java.util.Random;

import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.IWorldGenerator;

public class OreCoreMinWorldGen implements IWorldGenerator {

	public static final int DEFAULT_OREGEN_VALUE = 15;

	private Configuration config;
	private Logger logger;

	public OreCoreMinWorldGen(Configuration config, Logger logger) {
		this.config = Preconditions.checkNotNull(config);
		this.logger = Preconditions.checkNotNull(logger);
		config.addCustomCategoryComment("oregen", "OreCore was designed to use " + DEFAULT_OREGEN_VALUE
				+ " for all ore generation values, so you can feel relatively confident using\n"
				+ "that here.  Setting the value to 0 will stop the ore from generating entirely.  Setting the value to\n"
				+ "something greater than "
				+ DEFAULT_OREGEN_VALUE + " will make it more abundant.");
		logOreGen(config, logger, "bauxite");
		logOreGen(config, logger, "bauxiteGravel");
		logOreGen(config, logger, "copper");
		logOreGen(config, logger, "copperGravel");
		logOreGen(config, logger, "copperInferior");
		logOreGen(config, logger, "goldGravel");
		logOreGen(config, logger, "goldInferior");
		logOreGen(config, logger, "ironGravel");
		logOreGen(config, logger, "ironInferior");
		logOreGen(config, logger, "tin");
		logOreGen(config, logger, "tinGravel");
		logOreGen(config, logger, "tinInferior");
	}

	private void logOreGen(Configuration config, Logger logger, String ore) {
		logger.info("Will generate {} with {} attempts.", ore, config.get("oregen", ore, OreCoreMinWorldGen.DEFAULT_OREGEN_VALUE).getInt());
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.dimensionId) {
		case -1: // nether
			return;
		case 0: // overworld
			new OreCoreMinOverworldGen(config, logger, world, random, chunkX * 16, chunkZ * 16).generate();
		case 1: // end
			return;
		}

	}

}
