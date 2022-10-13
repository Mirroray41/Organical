package net.zappfire.organical;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Organical implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "organical";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final ItemGroup GRAY = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "gray"))
			.icon(() -> new ItemStack(Blocks.GRAY_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.SNOW_BLOCK));
				stacks.add(new ItemStack(Blocks.POWDER_SNOW));
				stacks.add(new ItemStack(Blocks.WHITE_WOOL));
				stacks.add(new ItemStack(Blocks.WHITE_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.IRON_BLOCK));
				stacks.add(new ItemStack(Blocks.BIRCH_WOOD));
				stacks.add(new ItemStack(Blocks.WHITE_CONCRETE));
				stacks.add(new ItemStack(Blocks.POLISHED_DIORITE));
				stacks.add(new ItemStack(Blocks.DIORITE));
				stacks.add(new ItemStack(Blocks.SMOOTH_STONE));
				stacks.add(new ItemStack(Blocks.LIGHT_GRAY_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.LIGHT_GRAY_WOOL));
				stacks.add(new ItemStack(Blocks.ANDESITE));
				stacks.add(new ItemStack(Blocks.POLISHED_ANDESITE));
				stacks.add(new ItemStack(Blocks.COBBLESTONE));
				stacks.add(new ItemStack(Blocks.STONE));
				stacks.add(new ItemStack(Blocks.STONE_BRICKS));
				stacks.add(new ItemStack(Blocks.CHISELED_STONE_BRICKS));
				stacks.add(new ItemStack(Blocks.CRACKED_STONE_BRICKS));
				stacks.add(new ItemStack(Blocks.COAL_ORE));
				stacks.add(new ItemStack(Blocks.POLISHED_BASALT));
				stacks.add(new ItemStack(Blocks.CYAN_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.BEDROCK));
				stacks.add(new ItemStack(Blocks.DEEPSLATE));
				stacks.add(new ItemStack(Blocks.COBBLED_DEEPSLATE));
				stacks.add(new ItemStack(Blocks.DEEPSLATE_COAL_ORE));
				stacks.add(new ItemStack(Blocks.DEEPSLATE_BRICKS));
				stacks.add(new ItemStack(Blocks.GRAY_CONCRETE));
				stacks.add(new ItemStack(Blocks.CHISELED_DEEPSLATE));
				stacks.add(new ItemStack(Blocks.CRACKED_DEEPSLATE_TILES));
				stacks.add(new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICKS));
				stacks.add(new ItemStack(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
				stacks.add(new ItemStack(Blocks.BLACK_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.BLACK_WOOL));
				stacks.add(new ItemStack(Blocks.COAL_BLOCK));
				stacks.add(new ItemStack(Blocks.BLACK_CONCRETE));
			})
			.build();

	public static final ItemGroup BROWN = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "brown"))
			.icon(() -> new ItemStack(Blocks.BROWN_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.DRIPSTONE_BLOCK));
				stacks.add(new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK));
				stacks.add(new ItemStack(Blocks.PACKED_MUD));
				stacks.add(new ItemStack(Blocks.ROOTED_DIRT));
				stacks.add(new ItemStack(Blocks.DIRT));
				stacks.add(new ItemStack(Blocks.COARSE_DIRT));
				stacks.add(new ItemStack(Blocks.BARREL));
				stacks.add(new ItemStack(Blocks.STRIPPED_DARK_OAK_WOOD));
				stacks.add(new ItemStack(Blocks.ANCIENT_DEBRIS));
				stacks.add(new ItemStack(Blocks.NOTE_BLOCK));
				stacks.add(new ItemStack(Blocks.MANGROVE_WOOD));
				stacks.add(new ItemStack(Blocks.SOUL_SOIL));
				stacks.add(new ItemStack(Blocks.BROWN_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.GRAY_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.SPRUCE_WOOD));
				stacks.add(new ItemStack(Blocks.CHISELED_NETHER_BRICKS));
				stacks.add(new ItemStack(Blocks.CRACKED_NETHER_BRICKS));
				stacks.add(new ItemStack(Blocks.BLACK_TERRACOTTA));
			})
			.build();

	public static final ItemGroup RED = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "red"))
			.icon(() -> new ItemStack(Blocks.RED_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.RED_MUSHROOM_BLOCK));
				stacks.add(new ItemStack(Blocks.RED_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.RED_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.FIRE_CORAL_BLOCK));
				stacks.add(new ItemStack(Blocks.RED_WOOL));
				stacks.add(new ItemStack(Blocks.RED_CONCRETE));
				stacks.add(new ItemStack(Blocks.CRIMSON_NYLIUM));
				stacks.add(new ItemStack(Blocks.NETHERRACK));
				stacks.add(new ItemStack(Blocks.CRIMSON_HYPHAE));
				stacks.add(new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA));
			})
			.build();

	public static final ItemGroup ORANGE = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "orange"))
			.icon(() -> new ItemStack(Blocks.ORANGE_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.SHROOMLIGHT));
				stacks.add(new ItemStack(Blocks.ORANGE_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.RED_SAND));
				stacks.add(new ItemStack(Blocks.CUT_RED_SANDSTONE));
				stacks.add(new ItemStack(Blocks.RED_SANDSTONE));
				stacks.add(new ItemStack(Blocks.CHISELED_RED_SANDSTONE));
				stacks.add(new ItemStack(Blocks.ORANGE_CONCRETE));
			})
			.build();

	public static final ItemGroup YELLOW = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "yellow"))
			.icon(() -> new ItemStack(Blocks.YELLOW_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.SAND));
				stacks.add(new ItemStack(Blocks.CUT_SANDSTONE));
				stacks.add(new ItemStack(Blocks.CHISELED_SANDSTONE));
				stacks.add(new ItemStack(Blocks.SANDSTONE));
				stacks.add(new ItemStack(Blocks.STRIPPED_BIRCH_WOOD));
				stacks.add(new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.HORN_CORAL_BLOCK));
				stacks.add(new ItemStack(Blocks.RAW_GOLD_BLOCK));
				stacks.add(new ItemStack(Blocks.HONEYCOMB_BLOCK));
				stacks.add(new ItemStack(Blocks.YELLOW_CONCRETE));
			})
			.build();

	public static final ItemGroup GREEN = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "green"))
			.icon(() -> new ItemStack(Blocks.LIME_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.LIME_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.LIME_CONCRETE));
				stacks.add(new ItemStack(Blocks.MELON));
				stacks.add(new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.GREEN_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.MOSS_BLOCK));
				stacks.add(new ItemStack(Blocks.GREEN_CONCRETE));
			})
			.build();

	public static final ItemGroup BLUE = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "blue"))
			.icon(() -> new ItemStack(Blocks.LIGHT_BLUE_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.DIAMOND_BLOCK));
				stacks.add(new ItemStack(Blocks.LIGHT_BLUE_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.LIGHT_BLUE_CONCRETE));
				stacks.add(new ItemStack(Blocks.BLUE_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.BLUE_WOOL));
				stacks.add(new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.BLUE_CONCRETE));
			})
			.build();

	public static final ItemGroup PURPLE = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "purple"))
			.icon(() -> new ItemStack(Blocks.MAGENTA_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.VERDANT_FROGLIGHT));
				stacks.add(new ItemStack(Blocks.PINK_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.PURPUR_PILLAR));
				stacks.add(new ItemStack(Blocks.PURPUR_BLOCK));
				stacks.add(new ItemStack(Blocks.MAGENTA_WOOL));
				stacks.add(new ItemStack(Blocks.AMETHYST_BLOCK));
				stacks.add(new ItemStack(Blocks.BUDDING_AMETHYST));
				stacks.add(new ItemStack(Blocks.PURPLE_WOOL));
				stacks.add(new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.BUBBLE_CORAL_BLOCK));
				stacks.add(new ItemStack(Blocks.STRIPPED_CRIMSON_HYPHAE));
				stacks.add(new ItemStack(Blocks.CRIMSON_PLANKS));
			})
			.build();

	public static final ItemGroup PINK = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "pink"))
			.icon(() -> new ItemStack(Blocks.PINK_CONCRETE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.PINK_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.PINK_CONCRETE));
				stacks.add(new ItemStack(Blocks.BRAIN_CORAL_BLOCK));
				stacks.add(new ItemStack(Blocks.MAGENTA_CONCRETE_POWDER));
				stacks.add(new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.MAGENTA_TERRACOTTA));
				stacks.add(new ItemStack(Blocks.PURPLE_TERRACOTTA));
			})
			.build();

	public static final ItemGroup STAIRS_GRAY = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "stairs_gray"))
			.icon(() -> new ItemStack(Blocks.STONE_STAIRS))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.SMOOTH_QUARTZ_STAIRS));
				stacks.add(new ItemStack(Blocks.QUARTZ_STAIRS));
				stacks.add(new ItemStack(Blocks.POLISHED_DIORITE_STAIRS));
				stacks.add(new ItemStack(Blocks.DIORITE_STAIRS));
				stacks.add(new ItemStack(Blocks.ANDESITE_STAIRS));
				stacks.add(new ItemStack(Blocks.POLISHED_ANDESITE_STAIRS));
				stacks.add(new ItemStack(Blocks.STONE_STAIRS));
				stacks.add(new ItemStack(Blocks.COBBLESTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.STONE_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.COBBLED_DEEPSLATE_STAIRS));
				stacks.add(new ItemStack(Blocks.POLISHED_DEEPSLATE_STAIRS));
				stacks.add(new ItemStack(Blocks.DEEPSLATE_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.DEEPSLATE_TILE_STAIRS));
				stacks.add(new ItemStack(Blocks.POLISHED_BLACKSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.BLACKSTONE_STAIRS));

			})
			.build();

	public static final ItemGroup STAIRS_BROWN = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "stairs_brown"))
			.icon(() -> new ItemStack(Blocks.OAK_STAIRS))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.END_STONE_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.SMOOTH_SANDSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.SANDSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.BIRCH_STAIRS));
				stacks.add(new ItemStack(Blocks.OAK_STAIRS));
				stacks.add(new ItemStack(Blocks.MUD_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.SPRUCE_STAIRS));
				stacks.add(new ItemStack(Blocks.DARK_OAK_STAIRS));
				stacks.add(new ItemStack(Blocks.NETHER_BRICK_STAIRS));
			})
			.build();

	public static final ItemGroup STAIRS_RAINBOW = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "stairs_rainbow"))
			.icon(() -> new ItemStack(Blocks.SMOOTH_SANDSTONE_STAIRS))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.RED_NETHER_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.MANGROVE_STAIRS));
				stacks.add(new ItemStack(Blocks.BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.MUD_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.JUNGLE_STAIRS));
				stacks.add(new ItemStack(Blocks.SMOOTH_RED_SANDSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.RED_SANDSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.ACACIA_STAIRS));
				stacks.add(new ItemStack(Blocks.WAXED_CUT_COPPER_STAIRS));
				stacks.add(new ItemStack(Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS));
				stacks.add(new ItemStack(Blocks.SMOOTH_SANDSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.SANDSTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.END_STONE_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.BIRCH_STAIRS));
				stacks.add(new ItemStack(Blocks.MOSSY_COBBLESTONE_STAIRS));
				stacks.add(new ItemStack(Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS));
				stacks.add(new ItemStack(Blocks.DARK_PRISMARINE_STAIRS));
				stacks.add(new ItemStack(Blocks.WARPED_STAIRS));
				stacks.add(new ItemStack(Blocks.PRISMARINE_BRICK_STAIRS));
				stacks.add(new ItemStack(Blocks.PRISMARINE_STAIRS));
				stacks.add(new ItemStack(Blocks.PURPUR_STAIRS));
				stacks.add(new ItemStack(Blocks.CRIMSON_STAIRS));
			})
			.build();

	public static final ItemGroup EMPTY1 = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "empty"))
			.icon(() -> new ItemStack(Blocks.AIR))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.AIR));
			})
			.build();

	public static final ItemGroup SLAB_GRAY = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "slab_gray"))
			.icon(() -> new ItemStack(Blocks.STONE_SLAB))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.SMOOTH_QUARTZ_SLAB));
				stacks.add(new ItemStack(Blocks.QUARTZ_SLAB));
				stacks.add(new ItemStack(Blocks.POLISHED_DIORITE_SLAB));
				stacks.add(new ItemStack(Blocks.DIORITE_SLAB));
				stacks.add(new ItemStack(Blocks.ANDESITE_SLAB));
				stacks.add(new ItemStack(Blocks.POLISHED_ANDESITE_SLAB));
				stacks.add(new ItemStack(Blocks.STONE_SLAB));
				stacks.add(new ItemStack(Blocks.COBBLESTONE_SLAB));
				stacks.add(new ItemStack(Blocks.STONE_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.COBBLED_DEEPSLATE_SLAB));
				stacks.add(new ItemStack(Blocks.POLISHED_DEEPSLATE_SLAB));
				stacks.add(new ItemStack(Blocks.DEEPSLATE_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.DEEPSLATE_TILE_SLAB));
				stacks.add(new ItemStack(Blocks.POLISHED_BLACKSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.BLACKSTONE_SLAB));

			})
			.build();

	public static final ItemGroup SLAB_BROWN = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "slab_brown"))
			.icon(() -> new ItemStack(Blocks.OAK_SLAB))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.END_STONE_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.SMOOTH_SANDSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.SANDSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.BIRCH_SLAB));
				stacks.add(new ItemStack(Blocks.OAK_SLAB));
				stacks.add(new ItemStack(Blocks.MUD_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.SPRUCE_SLAB));
				stacks.add(new ItemStack(Blocks.DARK_OAK_SLAB));
				stacks.add(new ItemStack(Blocks.NETHER_BRICK_SLAB));
			})
			.build();

	public static final ItemGroup SLAB_RAINBOW = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "slab_rainbow"))
			.icon(() -> new ItemStack(Blocks.SMOOTH_SANDSTONE_SLAB))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.RED_NETHER_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.MANGROVE_SLAB));
				stacks.add(new ItemStack(Blocks.BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.MUD_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.JUNGLE_SLAB));
				stacks.add(new ItemStack(Blocks.SMOOTH_RED_SANDSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.RED_SANDSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.ACACIA_SLAB));
				stacks.add(new ItemStack(Blocks.WAXED_CUT_COPPER_SLAB));
				stacks.add(new ItemStack(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB));
				stacks.add(new ItemStack(Blocks.SMOOTH_SANDSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.SANDSTONE_SLAB));
				stacks.add(new ItemStack(Blocks.END_STONE_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.BIRCH_SLAB));
				stacks.add(new ItemStack(Blocks.MOSSY_COBBLESTONE_SLAB));
				stacks.add(new ItemStack(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB));
				stacks.add(new ItemStack(Blocks.DARK_PRISMARINE_SLAB));
				stacks.add(new ItemStack(Blocks.WARPED_SLAB));
				stacks.add(new ItemStack(Blocks.PRISMARINE_BRICK_SLAB));
				stacks.add(new ItemStack(Blocks.PRISMARINE_SLAB));
				stacks.add(new ItemStack(Blocks.PURPUR_SLAB));
				stacks.add(new ItemStack(Blocks.CRIMSON_SLAB));
			})
			.build();

	public static final ItemGroup EMPTY2 = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "empty"))
			.icon(() -> new ItemStack(Blocks.AIR))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.AIR));
			})
			.build();

	public static final ItemGroup EMPTY3 = FabricItemGroupBuilder.create(
					new Identifier(Organical.MODID, "empty"))
			.icon(() -> new ItemStack(Blocks.AIR))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.AIR));
			})
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Organical Initialized!");
	}
}
