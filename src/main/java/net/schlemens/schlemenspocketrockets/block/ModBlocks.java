package net.schlemens.schlemenspocketrockets.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.schlemens.schlemenspocketrockets.SchlemensPocketRockets;

public class ModBlocks {

    // Add Blocks
    public static final Block EXPLOSIVE_BARREL = registerBlock("explosive_barrel",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SchlemensPocketRockets.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SchlemensPocketRockets.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SchlemensPocketRockets.LOGGER.info("Registering ModBlocks for " + SchlemensPocketRockets.MOD_ID);
    }
}
