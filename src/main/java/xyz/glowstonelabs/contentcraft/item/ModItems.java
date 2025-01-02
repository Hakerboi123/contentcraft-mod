package xyz.glowstonelabs.contentcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.glowstonelabs.contentcraft.ContentCraft;

public class ModItems {
    public static final Item XAENON_INGOT = registerItem("xaenon_ingot", new Item(new Item.Settings()));
    public static final Item RAW_XAENON = registerItem("raw_xaenon", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ContentCraft.MOD_ID, name), item);
    };

    public static void registerModItems() {
        ContentCraft.LOGGER.info("Registering Mod Items for " + ContentCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(XAENON_INGOT);
            entries.add(RAW_XAENON);
        });
    }
}

