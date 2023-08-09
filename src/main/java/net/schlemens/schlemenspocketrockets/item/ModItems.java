package net.schlemens.schlemenspocketrockets.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.schlemens.schlemenspocketrockets.SchlemensPocketRockets;

public class ModItems {

    // Items
    public static final Item POCKETROCKETMK1 = registerItem("pocketrocketmk1", new Item(new FabricItemSettings()));
    public static final Item POCKETROCKETMK2 = registerItem("pocketrocketmk2", new Item(new FabricItemSettings()));
    public static final Item POCKETROCKETMK3 = registerItem("pocketrocketmk3", new Item(new FabricItemSettings()));


    // Add Items to Tools Item Group
    private static void addItemsToToolsIemGroup(FabricItemGroupEntries entries) {
        //entries.add([item]);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SchlemensPocketRockets.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SchlemensPocketRockets.LOGGER.info("Registering Mod Items for " + SchlemensPocketRockets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsIemGroup);
    }
}
