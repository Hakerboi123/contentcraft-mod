package xyz.glowstonelabs.contentcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.glowstonelabs.contentcraft.ContentCraft;
import xyz.glowstonelabs.contentcraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CCXAENON_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ContentCraft.MOD_ID, "ccxaenon_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.XAENON_INGOT))
                    .displayName(Text.translatable("itemgroup.contentcraft.ccxaenon_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.XAENON_INGOT);
                        entries.add(ModItems.RAW_XAENON);
                    }).build());

    public static final ItemGroup CCXAENON_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ContentCraft.MOD_ID, "ccxaenon_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.XAENON_BLOCK))
                    .displayName(Text.translatable("itemgroup.contentcraft.ccxaenon_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.XAENON_BLOCK);
                        entries.add(ModBlocks.RAW_XAENON_BLOCK);
                        entries.add(ModBlocks.XAENON_ORE);
                    }).build());


    public static void registerItemGroups() {
        ContentCraft.LOGGER.info("Registering Item Groups for " + ContentCraft.MOD_ID);
    }
}