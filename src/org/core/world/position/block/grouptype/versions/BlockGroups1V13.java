package org.core.world.position.block.grouptype.versions;

import org.core.world.position.block.BlockTypes;

public interface BlockGroups1V13 {

    CoreBlockGroup PISTON = new CoreBlockGroup("Piston",
            BlockTypes.STICKY_PISTON.get(),
            BlockTypes.PISTON_HEAD.get(),
            BlockTypes.STICKY_PISTON.get(),
            BlockTypes.MOVING_PISTON.get());
    CoreBlockGroup PISTON_BLOCK = new CoreBlockGroup("Piston Block",
            BlockTypes.PISTON.get(),
            BlockTypes.STICKY_PISTON.get());
    CoreBlockGroup WOOD_STAIRS = new CoreBlockGroup("Wood Stairs",
            BlockTypes.ACACIA_STAIRS.get(),
            BlockTypes.BIRCH_STAIRS.get(),
            BlockTypes.DARK_OAK_STAIRS.get(),
            BlockTypes.JUNGLE_STAIRS.get(),
            BlockTypes.OAK_STAIRS.get(),
            BlockTypes.SPRUCE_STAIRS.get());
    CoreBlockGroup STAIRS = new CoreBlockGroup("Stairs",
            BlockTypes.ACACIA_STAIRS.get(),
            BlockTypes.BIRCH_STAIRS.get(),
            BlockTypes.DARK_OAK_STAIRS.get(),
            BlockTypes.JUNGLE_STAIRS.get(),
            BlockTypes.OAK_STAIRS.get(),
            BlockTypes.SPRUCE_STAIRS.get(),
            BlockTypes.COBBLESTONE_STAIRS.get(),
            BlockTypes.BRICK_STAIRS.get(),
            BlockTypes.DARK_PRISMARINE_STAIRS.get(),
            BlockTypes.NETHER_BRICK_STAIRS.get(),
            BlockTypes.PRISMARINE_BRICK_STAIRS.get(),
            BlockTypes.PRISMARINE_STAIRS.get(),
            BlockTypes.PURPUR_STAIRS.get(),
            BlockTypes.QUARTZ_STAIRS.get(),
            BlockTypes.RED_SANDSTONE_STAIRS.get(),
            BlockTypes.SANDSTONE_STAIRS.get(),
            BlockTypes.STONE_BRICK_STAIRS.get());
    CoreBlockGroup WOOD_SLAB = new CoreBlockGroup("Wood Slab",
            BlockTypes.SPRUCE_SLAB.get(),
            BlockTypes.OAK_SLAB.get(),
            BlockTypes.JUNGLE_SLAB.get(),
            BlockTypes.BIRCH_SLAB.get(),
            BlockTypes.DARK_OAK_SLAB.get(),
            BlockTypes.ACACIA_SLAB.get());
    CoreBlockGroup SLAB = new CoreBlockGroup("Slab",
            BlockTypes.SPRUCE_SLAB.get(),
            BlockTypes.OAK_SLAB.get(),
            BlockTypes.JUNGLE_SLAB.get(),
            BlockTypes.BIRCH_SLAB.get(),
            BlockTypes.DARK_OAK_SLAB.get(),
            BlockTypes.ACACIA_SLAB.get(),
            BlockTypes.BRICK_SLAB.get(),
            BlockTypes.COBBLESTONE_SLAB.get(),
            BlockTypes.DARK_PRISMARINE_SLAB.get(),
            BlockTypes.NETHER_BRICK_SLAB.get(),
            BlockTypes.PETRIFIED_OAK_SLAB.get(),
            BlockTypes.PRISMARINE_BRICK_SLAB.get(),
            BlockTypes.PRISMARINE_SLAB.get(),
            BlockTypes.PURPUR_SLAB.get(),
            BlockTypes.QUARTZ_SLAB.get(),
            BlockTypes.RED_SANDSTONE_SLAB.get(),
            BlockTypes.SANDSTONE_SLAB.get(),
            BlockTypes.STONE_BRICK_SLAB.get(),
            BlockTypes.STONE_SLAB.get());
    CoreBlockGroup WOOD_BUTTON = new CoreBlockGroup("Wood Button",
            BlockTypes.ACACIA_BUTTON.get(),
            BlockTypes.BIRCH_BUTTON.get(),
            BlockTypes.DARK_OAK_BUTTON.get(),
            BlockTypes.JUNGLE_BUTTON.get(),
            BlockTypes.OAK_BUTTON.get(),
            BlockTypes.SPRUCE_BUTTON.get());
    CoreBlockGroup BUTTON = new CoreBlockGroup("Button",
            BlockTypes.ACACIA_BUTTON.get(),
            BlockTypes.BIRCH_BUTTON.get(),
            BlockTypes.DARK_OAK_BUTTON.get(),
            BlockTypes.JUNGLE_BUTTON.get(),
            BlockTypes.OAK_BUTTON.get(),
            BlockTypes.SPRUCE_BUTTON.get(),
            BlockTypes.STONE_BUTTON.get());
    CoreBlockGroup WOOD_DOOR = new CoreBlockGroup("Wood Door",
            BlockTypes.DARK_OAK_DOOR.get(),
            BlockTypes.OAK_DOOR.get(),
            BlockTypes.ACACIA_DOOR.get(),
            BlockTypes.BIRCH_DOOR.get(),
            BlockTypes.JUNGLE_DOOR.get(),
            BlockTypes.SPRUCE_DOOR.get());
    CoreBlockGroup DOOR = new CoreBlockGroup("Door",
            BlockTypes.IRON_DOOR.get(),
            BlockTypes.DARK_OAK_DOOR.get(),
            BlockTypes.OAK_DOOR.get(),
            BlockTypes.ACACIA_DOOR.get(),
            BlockTypes.BIRCH_DOOR.get(),
            BlockTypes.JUNGLE_DOOR.get(),
            BlockTypes.SPRUCE_DOOR.get());
    CoreBlockGroup TRAP_WOOD_DOOR = new CoreBlockGroup("Trap Wood Door",
            BlockTypes.ACACIA_TRAPDOOR.get(),
            BlockTypes.OAK_TRAPDOOR.get(),
            BlockTypes.BIRCH_TRAPDOOR.get(),
            BlockTypes.DARK_OAK_TRAPDOOR.get(),
            BlockTypes.JUNGLE_TRAPDOOR.get(),
            BlockTypes.SPRUCE_TRAPDOOR.get());
    CoreBlockGroup TRAP_DOOR = new CoreBlockGroup("Trap Door",
            BlockTypes.IRON_TRAPDOOR.get(),
            BlockTypes.ACACIA_TRAPDOOR.get(),
            BlockTypes.OAK_TRAPDOOR.get(),
            BlockTypes.BIRCH_TRAPDOOR.get(),
            BlockTypes.DARK_OAK_TRAPDOOR.get(),
            BlockTypes.JUNGLE_TRAPDOOR.get(),
            BlockTypes.SPRUCE_TRAPDOOR.get());
    CoreBlockGroup STAINED_GLASS = new CoreBlockGroup("Stained Glass",
            BlockTypes.BLACK_STAINED_GLASS.get(),
            BlockTypes.BLUE_STAINED_GLASS.get(),
            BlockTypes.BROWN_STAINED_GLASS.get(),
            BlockTypes.CYAN_STAINED_GLASS.get(),
            BlockTypes.GRAY_STAINED_GLASS.get(),
            BlockTypes.GREEN_STAINED_GLASS.get(),
            BlockTypes.LIGHT_BLUE_STAINED_GLASS.get(),
            BlockTypes.LIGHT_GRAY_STAINED_GLASS.get(),
            BlockTypes.LIME_STAINED_GLASS.get(),
            BlockTypes.MAGENTA_STAINED_GLASS.get(),
            BlockTypes.ORANGE_STAINED_GLASS.get(),
            BlockTypes.PINK_STAINED_GLASS.get(),
            BlockTypes.PURPLE_STAINED_GLASS.get(),
            BlockTypes.RED_STAINED_GLASS.get(),
            BlockTypes.WHITE_STAINED_GLASS.get(),
            BlockTypes.YELLOW_STAINED_GLASS.get());
    CoreBlockGroup STAINED_GLASS_PANE = new CoreBlockGroup("Stained Glass",
            BlockTypes.BLACK_STAINED_GLASS_PANE.get(),
            BlockTypes.BLUE_STAINED_GLASS_PANE.get(),
            BlockTypes.BROWN_STAINED_GLASS_PANE.get(),
            BlockTypes.CYAN_STAINED_GLASS_PANE.get(),
            BlockTypes.GRAY_STAINED_GLASS_PANE.get(),
            BlockTypes.GREEN_STAINED_GLASS_PANE.get(),
            BlockTypes.LIGHT_BLUE_STAINED_GLASS_PANE.get(),
            BlockTypes.LIGHT_GRAY_STAINED_GLASS_PANE.get(),
            BlockTypes.LIME_STAINED_GLASS_PANE.get(),
            BlockTypes.MAGENTA_STAINED_GLASS_PANE.get(),
            BlockTypes.ORANGE_STAINED_GLASS_PANE.get(),
            BlockTypes.PINK_STAINED_GLASS_PANE.get(),
            BlockTypes.PURPLE_STAINED_GLASS_PANE.get(),
            BlockTypes.RED_STAINED_GLASS_PANE.get(),
            BlockTypes.WHITE_STAINED_GLASS_PANE.get(),
            BlockTypes.YELLOW_STAINED_GLASS_PANE.get());
    CoreBlockGroup SAPLING = new CoreBlockGroup("Sapling",
            BlockTypes.ACACIA_SAPLING.get(),
            BlockTypes.BIRCH_SAPLING.get(),
            BlockTypes.DARK_OAK_SAPLING.get(),
            BlockTypes.JUNGLE_SAPLING.get(),
            BlockTypes.OAK_SAPLING.get(),
            BlockTypes.SPRUCE_SAPLING.get());
    CoreBlockGroup POTTED_SAPLING = new CoreBlockGroup("Potted Sapling",
            BlockTypes.POTTED_ACACIA_SAPLING.get(),
            BlockTypes.POTTED_BIRCH_SAPLING.get(),
            BlockTypes.POTTED_DARK_OAK_SAPLING.get(),
            BlockTypes.POTTED_JUNGLE_SAPLING.get(),
            BlockTypes.POTTED_OAK_SAPLING.get(),
            BlockTypes.POTTED_SPRUCE_SAPLING.get());
    CoreBlockGroup WOOD_PRESSURE_PLATE = new CoreBlockGroup("Wood Pressure Plate",
            BlockTypes.ACACIA_PRESSURE_PLATE.get(),
            BlockTypes.BIRCH_PRESSURE_PLATE.get(),
            BlockTypes.DARK_OAK_PRESSURE_PLATE.get(),
            BlockTypes.JUNGLE_PRESSURE_PLATE.get(),
            BlockTypes.OAK_PRESSURE_PLATE.get(),
            BlockTypes.SPRUCE_PRESSURE_PLATE.get());
    CoreBlockGroup WEIGHTED_PRESSURE_PLATE = new CoreBlockGroup("Wood Pressure Plate",
            BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE.get(),
            BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE.get());
    CoreBlockGroup PRESSURE_PLATE = new CoreBlockGroup("Pressure Plate",
            BlockTypes.ACACIA_PRESSURE_PLATE.get(),
            BlockTypes.BIRCH_PRESSURE_PLATE.get(),
            BlockTypes.DARK_OAK_PRESSURE_PLATE.get(),
            BlockTypes.JUNGLE_PRESSURE_PLATE.get(),
            BlockTypes.OAK_PRESSURE_PLATE.get(),
            BlockTypes.SPRUCE_PRESSURE_PLATE.get(),
            BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE.get(),
            BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE.get(),
            BlockTypes.STONE_PRESSURE_PLATE.get());
    CoreBlockGroup SHULKER_BOX = new CoreBlockGroup("Shulker Box",
            BlockTypes.BLACK_SHULKER_BOX.get(),
            BlockTypes.BLUE_SHULKER_BOX.get(),
            BlockTypes.BROWN_SHULKER_BOX.get(),
            BlockTypes.CYAN_SHULKER_BOX.get(),
            BlockTypes.GRAY_SHULKER_BOX.get(),
            BlockTypes.GREEN_SHULKER_BOX.get(),
            BlockTypes.LIGHT_BLUE_SHULKER_BOX.get(),
            BlockTypes.LIGHT_GRAY_SHULKER_BOX.get(),
            BlockTypes.LIME_SHULKER_BOX.get(),
            BlockTypes.MAGENTA_SHULKER_BOX.get(),
            BlockTypes.ORANGE_SHULKER_BOX.get(),
            BlockTypes.PINK_SHULKER_BOX.get(),
            BlockTypes.PURPLE_SHULKER_BOX.get(),
            BlockTypes.RED_SHULKER_BOX.get(),
            BlockTypes.WHITE_SHULKER_BOX.get(),
            BlockTypes.YELLOW_SHULKER_BOX.get());
    CoreBlockGroup WALL_HEAD = new CoreBlockGroup("Wall Head",
            BlockTypes.CREEPER_WALL_HEAD.get(),
            BlockTypes.DRAGON_WALL_HEAD.get(),
            BlockTypes.PLAYER_WALL_HEAD.get(),
            BlockTypes.ZOMBIE_WALL_HEAD.get());
    CoreBlockGroup STANDARD_HEAD = new CoreBlockGroup("Standard Head",
            BlockTypes.CREEPER_HEAD.get(),
            BlockTypes.DRAGON_HEAD.get(),
            BlockTypes.PLAYER_HEAD.get(),
            BlockTypes.ZOMBIE_HEAD.get());
    CoreBlockGroup HEAD = new CoreBlockGroup("Head", BlockTypes.CREEPER_HEAD.get(),
            BlockTypes.DRAGON_HEAD.get(),
            BlockTypes.PLAYER_HEAD.get(),
            BlockTypes.ZOMBIE_HEAD.get());
    CoreBlockGroup REDSTONE_TORCH = new CoreBlockGroup("Redstone Torch",
            BlockTypes.REDSTONE_TORCH.get(),
            BlockTypes.REDSTONE_WALL_TORCH.get());
    CoreBlockGroup STANDARD_TORCH = new CoreBlockGroup("Standard Torch",
            BlockTypes.TORCH.get(),
            BlockTypes.WALL_TORCH.get());
    CoreBlockGroup WALL_TORCH = new CoreBlockGroup("Wall Torch",
            BlockTypes.WALL_TORCH.get(),
            BlockTypes.REDSTONE_WALL_TORCH.get());
    CoreBlockGroup STANDING_TORCH = new CoreBlockGroup("Standing Torch",
                                                   BlockTypes.TORCH.get(),
            BlockTypes.REDSTONE_TORCH.get());
    CoreBlockGroup TORCH = new CoreBlockGroup("Torch",
            BlockTypes.TORCH.get(),
            BlockTypes.WALL_TORCH.get(),
            BlockTypes.REDSTONE_TORCH.get(),
            BlockTypes.REDSTONE_WALL_TORCH.get());
    CoreBlockGroup CONCRETE = new CoreBlockGroup("Concrete",
            BlockTypes.BLACK_CONCRETE.get(),
            BlockTypes.BLUE_CONCRETE.get(),
            BlockTypes.BROWN_CONCRETE.get(),
            BlockTypes.CYAN_CONCRETE.get(),
            BlockTypes.GRAY_CONCRETE.get(),
            BlockTypes.GREEN_CONCRETE.get(),
            BlockTypes.LIGHT_BLUE_CONCRETE.get(),
            BlockTypes.LIGHT_GRAY_CONCRETE.get(),
            BlockTypes.LIME_CONCRETE.get(),
            BlockTypes.MAGENTA_CONCRETE.get(),
            BlockTypes.ORANGE_CONCRETE.get(),
            BlockTypes.PINK_CONCRETE.get(),
            BlockTypes.PURPLE_CONCRETE.get(),
            BlockTypes.RED_CONCRETE.get(),
            BlockTypes.WHITE_CONCRETE.get(),
            BlockTypes.YELLOW_CONCRETE.get());
    CoreBlockGroup CONCRETE_POWDER = new CoreBlockGroup("Concrete Powder",
            BlockTypes.BLACK_CONCRETE_POWDER.get(),
            BlockTypes.BLUE_CONCRETE_POWDER.get(),
            BlockTypes.BROWN_CONCRETE_POWDER.get(),
            BlockTypes.CYAN_CONCRETE_POWDER.get(),
            BlockTypes.GRAY_CONCRETE_POWDER.get(),
            BlockTypes.GREEN_CONCRETE_POWDER.get(),
            BlockTypes.LIGHT_BLUE_CONCRETE_POWDER.get(),
            BlockTypes.LIGHT_GRAY_CONCRETE_POWDER.get(),
            BlockTypes.LIME_CONCRETE_POWDER.get(),
            BlockTypes.MAGENTA_CONCRETE_POWDER.get(),
            BlockTypes.ORANGE_CONCRETE_POWDER.get(),
            BlockTypes.PINK_CONCRETE_POWDER.get(),
            BlockTypes.PURPLE_CONCRETE_POWDER.get(),
            BlockTypes.RED_CONCRETE_POWDER.get(),
            BlockTypes.WHITE_CONCRETE_POWDER.get(),
            BlockTypes.YELLOW_CONCRETE_POWDER.get());
    CoreBlockGroup BED = new CoreBlockGroup("Bed",
            BlockTypes.BLACK_BED.get(),
            BlockTypes.BLUE_BED.get(),
            BlockTypes.BROWN_BED.get(),
            BlockTypes.CYAN_BED.get(),
            BlockTypes.GRAY_BED.get(),
            BlockTypes.GREEN_BED.get(),
            BlockTypes.LIME_BED.get(),
            BlockTypes.MAGENTA_BED.get(),
            BlockTypes.ORANGE_BED.get(),
            BlockTypes.PINK_BED.get(),
            BlockTypes.PURPLE_BED.get(),
            BlockTypes.RED_BED.get(),
            BlockTypes.WHITE_BED.get(),
            BlockTypes.YELLOW_BED.get(),
            BlockTypes.LIGHT_BLUE_BED.get(),
            BlockTypes.LIGHT_GRAY_BED.get(),
            BlockTypes.LIGHT_BLUE_BED.get());
    CoreBlockGroup TERRACOTTA = new CoreBlockGroup("Terracotta",
            BlockTypes.BLACK_TERRACOTTA.get(),
            BlockTypes.BLUE_TERRACOTTA.get(),
            BlockTypes.BROWN_TERRACOTTA.get(),
            BlockTypes.CYAN_TERRACOTTA.get(),
            BlockTypes.GRAY_TERRACOTTA.get(),
            BlockTypes.GREEN_TERRACOTTA.get(),
            BlockTypes.LIME_TERRACOTTA.get(),
            BlockTypes.MAGENTA_TERRACOTTA.get(),
            BlockTypes.ORANGE_TERRACOTTA.get(),
            BlockTypes.PINK_TERRACOTTA.get(),
            BlockTypes.PURPLE_TERRACOTTA.get(),
            BlockTypes.RED_TERRACOTTA.get(),
            BlockTypes.WHITE_TERRACOTTA.get(),
            BlockTypes.YELLOW_TERRACOTTA.get());
    CoreBlockGroup FENCE_GATE = new CoreBlockGroup("Fence Gate",
            BlockTypes.ACACIA_FENCE_GATE.get(),
            BlockTypes.BIRCH_FENCE_GATE.get(),
            BlockTypes.DARK_OAK_FENCE_GATE.get(),
            BlockTypes.JUNGLE_FENCE_GATE.get(),
            BlockTypes.OAK_FENCE_GATE.get(),
            BlockTypes.SPRUCE_FENCE_GATE.get());
    CoreBlockGroup FENCE = new CoreBlockGroup("Fence",
            BlockTypes.ACACIA_FENCE.get(),
            BlockTypes.BIRCH_FENCE.get(),
            BlockTypes.DARK_OAK_FENCE.get(),
            BlockTypes.JUNGLE_FENCE.get(),
            BlockTypes.NETHER_BRICK_FENCE.get(),
            BlockTypes.OAK_FENCE.get(),
            BlockTypes.SPRUCE_FENCE.get());
    CoreBlockGroup OAK_SIGN = new CoreBlockGroup("Oak Sign", BlockTypes.OAK_SIGN.get(), BlockTypes.OAK_WALL_SIGN.get());
}
