package xyz.glowstonelabs.contentcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.glowstonelabs.contentcraft.ContentCraft;
import xyz.glowstonelabs.contentcraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CONTENTCRAFT_FUNCTIONAL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ContentCraft.MOD_ID, "contentcraft_functional"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.ANVIL))
                    .displayName(Text.translatable("itemgroup.contentcraft.contentcraft_functional"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.XAENON_INGOT);
                        entries.add(ModItems.BISMUTH);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.BLACK_OPAL);
                        entries.add(ModItems.RAW_XAENON);
                        entries.add(ModItems.RAW_BISMUTH);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RAW_SAPPHIRE);
                        entries.add(ModItems.RAW_BLACK_OPAL);
                        entries.add(ModItems.XAENON_CHISEL);
                        entries.add(ModItems.XAENON_SWORD);
                        entries.add(ModItems.XAENON_PICKAXE);
                        entries.add(ModItems.XAENON_SHOVEL);
                        entries.add(ModItems.XAENON_AXE);
                        entries.add(ModItems.XAENON_HOE);

                        entries.add(ModItems.XAENON_HELMET);
                        entries.add(ModItems.XAENON_CHESTPLATE);
                        entries.add(ModItems.XAENON_LEGGINGS);
                        entries.add(ModItems.XAENON_BOOTS);
                    }).build());

    public static final ItemGroup CONTENTCRAFT_BLOCKS_N_GENERATION = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ContentCraft.MOD_ID, "contentcraft_blocks_n_generation"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.OAK_SAPLING))
                    .displayName(Text.translatable("itemgroup.contentcraft.contentcraft_blocks_n_generation"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.XAENON_BLOCK);
                        entries.add(ModBlocks.BISMUTH_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.BLACK_OPAL_BLOCK);
                        entries.add(ModBlocks.RAW_XAENON_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.XAENON_ORE);
                        entries.add(ModBlocks.BISMUTH_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.BLACK_OPAL_ORE);
                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_LEAVES);
                    }).build());



    public static void registerItemGroups() {
        ContentCraft.LOGGER.info("Registering Item Groups for " + ContentCraft.MOD_ID);
    }
}