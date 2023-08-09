package net.schlemens.schlemenspocketrockets.item;

import net.schlemens.schlemenspocketrockets.SchlemensPocketRockets;
import net.schlemens.schlemenspocketrockets.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup Pocket_Rockets = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SchlemensPocketRockets.MOD_ID, "pocketrocket"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pocketrocket"))
                    .icon(() -> new ItemStack(ModItems.POCKETROCKETMK1)).entries((displayContext, entries) -> {

                        // Add Items to Custom Item Group here
                        entries.add(ModItems.POCKETROCKETMK1);
                        entries.add(ModItems.POCKETROCKETMK2);
                        entries.add(ModItems.POCKETROCKETMK3);

                        entries.add(ModBlocks.EXPLOSIVE_BARREL);


                    }).build());

    public static void registerItemGroups() {
        SchlemensPocketRockets.LOGGER.info("Registering Item Groups for" + SchlemensPocketRockets.MOD_ID);
    }
}
