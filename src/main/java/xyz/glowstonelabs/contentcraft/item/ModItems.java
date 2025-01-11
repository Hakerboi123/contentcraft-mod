package xyz.glowstonelabs.contentcraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.glowstonelabs.contentcraft.ContentCraft;
import xyz.glowstonelabs.contentcraft.item.custom.XaenonChiselItem;

public class ModItems {
    public static final Item XAENON_INGOT = registerItem("xaenon_ingot", new Item(new Item.Settings()));
    public static final Item RAW_XAENON = registerItem("raw_xaenon", new Item(new Item.Settings()));

    public static final Item BISMUTH = registerItem("bismuth", new Item(new Item.Settings()));
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth", new Item(new Item.Settings()));

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new Item.Settings()));

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

    public static final Item BLACK_OPAL = registerItem("black_opal", new Item(new Item.Settings()));
    public static final Item RAW_BLACK_OPAL = registerItem("raw_black_opal", new Item(new Item.Settings()));

    public static final Item XAENON_CHISEL = registerItem("xaenon_chisel", new XaenonChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item XAENON_HELMET = registerItem("xaenon_helmet",
            new ArmorItem(ModArmourMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item XAENON_CHESTPLATE = registerItem("xaenon_chestplate",
            new ArmorItem(ModArmourMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item XAENON_LEGGINGS = registerItem("xaenon_leggings",
            new ArmorItem(ModArmourMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item XAENON_BOOTS = registerItem("xaenon_boots",
            new ArmorItem(ModArmourMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item XAENON_SWORD = registerItem("xaenon_sword",
            new SwordItem(ModToolMaterials.XAENON_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.XAENON_INGOT, 3, -2.4f))));
    public static final Item XAENON_PICKAXE = registerItem("xaenon_pickaxe",
            new PickaxeItem(ModToolMaterials.XAENON_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.XAENON_INGOT, 1, -2.8f))));
    public static final Item XAENON_SHOVEL = registerItem("xaenon_shovel",
            new ShovelItem(ModToolMaterials.XAENON_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.XAENON_INGOT, 1.5f, -3.0f))));
    public static final Item XAENON_AXE = registerItem("xaenon_axe",
            new AxeItem(ModToolMaterials.XAENON_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.XAENON_INGOT, 6, -3.2f))));
    public static final Item XAENON_HOE = registerItem("xaenon_hoe",
            new HoeItem(ModToolMaterials.XAENON_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.XAENON_INGOT, 0, -3f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ContentCraft.MOD_ID, name), item);
    };

    public static void registerModItems() {
        ContentCraft.LOGGER.info("Registering Mod Items for " + ContentCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(XAENON_INGOT);
            entries.add(RAW_XAENON);
        });
    }
}

