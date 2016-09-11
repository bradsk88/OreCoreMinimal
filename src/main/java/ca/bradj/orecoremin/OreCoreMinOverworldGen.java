package ca.bradj.orecoremin;

import java.util.Random;

import ca.bradj.orecoremin.item.base.OreCoreMinBlockInterface;
import com.google.common.base.Predicates;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import org.apache.logging.log4j.Logger;

import ca.bradj.orecoremin.item.Aluminum;
import ca.bradj.orecoremin.item.Copper;
import ca.bradj.orecoremin.item.Gold;
import ca.bradj.orecoremin.item.Iron;
import ca.bradj.orecoremin.item.OreCoreMinItems;
import ca.bradj.orecoremin.item.Tin;

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

		doGenerateOre(OreCoreMinItems.aluminum().asOre(), 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_VEIN_SIZE, config);
		doGenerateOre(OreCoreMinItems.aluminum().asGravel(), 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_GRAVEL_VEIN_SIZE, Blocks.GRAVEL, config);

		doGenerateOre(OreCoreMinItems.copper().asOre(), 0, Copper.COPPER_TOP_LEVEL, Copper.COPPER_VEIN_SIZE, config);
		doGenerateOre(OreCoreMinItems.copper().asGravel(), 0, Copper.COPPER_GRAVEL_TOP_LEVEL, Copper.COPPER_GRAVEL_VEIN_SIZE, Blocks.GRAVEL, config);
		doGenerateOre(OreCoreMinItems.copper().asInferior(), 0, Copper.COPPER_INFERIOR_TOP_LEVEL, Copper.COPPER_INFERIOR_VEIN_SIZE, config);

		doGenerateOre(OreCoreMinItems.gold().asGravel(), 0, Gold.GOLD_GRAVEL_TOP_LEVEL, Gold.GOLD_GRAVEL_VEIN_SIZE, Blocks.GRAVEL, config);
		doGenerateOre(OreCoreMinItems.gold().asInferior(), 0, Gold.GOLD_INFERIOR_TOP_LEVEL, Gold.GOLD_INFERIOR_VEIN_SIZE, config);

		doGenerateOre(OreCoreMinItems.iron().asGravel(), 0, Iron.IRON_GRAVEL_TOP_LEVEL, Iron.IRON_GRAVEL_VEIN_SIZE, Blocks.GRAVEL, config);
		doGenerateOre(OreCoreMinItems.iron().asInferior(), 0, Iron.IRON_INFERIOR_TOP_LEVEL, Iron.IRON_INFERIOR_VEIN_SIZE, config);

		doGenerateOre(OreCoreMinItems.tin().asOre(), 0, Tin.TIN_TOP_LEVEL, Tin.TIN_VEIN_SIZE, config);
		doGenerateOre(OreCoreMinItems.tin().asGravel(), 0, Tin.TIN_GRAVEL_TOP_LEVEL, Tin.TIN_GRAVEL_VEIN_SIZE, Blocks.GRAVEL, config);
		doGenerateOre(OreCoreMinItems.tin().asInferior(), 0, Tin.TIN_INFERIOR_TOP_LEVEL, Tin.TIN_INFERIOR_VEIN_SIZE, config);
	}

	private void doGenerateOre(OreCoreMinBlockInterface ore, int minLayer, int maxLayer, int veinSize, Configuration config) {
		doGenerateOre(ore, minLayer, maxLayer, veinSize, Blocks.STONE, config);
	}

	private void doGenerateOre(OreCoreMinBlockInterface ore, int minLayer, int maxLayer, int veinSize, Block destination, Configuration config) {
		Property attempts = config.get("oregen", ore.getBlockRegistryName(), OreCoreMinWorldGen.DEFAULT_OREGEN_VALUE);
		for (int i = 0; i < attempts.getInt(); i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = minLayer + random.nextInt(maxLayer - minLayer);
			int chunkZ = z + random.nextInt(16);

			IBlockState oreDS = ore.getDefaultBlockState();
			IBlockState destinationDS = destination.getDefaultState();
			new WorldGenMinable(oreDS, veinSize, Predicates.equalTo(destinationDS))
					.generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
	}

}
