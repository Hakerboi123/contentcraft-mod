package xyz.glowstonelabs.contentcraft.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import xyz.glowstonelabs.contentcraft.ContentCraft;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmourMaterials {
        public static final RegistryEntry<ArmorMaterial> XAENON_ARMOR_MATERIAL = registerArmorMaterial("xaenon_armor",
                () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                    map.put(ArmorItem.Type.BOOTS, 2);
                    map.put(ArmorItem.Type.LEGGINGS, 4);
                    map.put(ArmorItem.Type.CHESTPLATE, 6);
                    map.put(ArmorItem.Type.HELMET, 2);
                    map.put(ArmorItem.Type.BODY, 4);
                }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.XAENON_INGOT),
                        List.of(new ArmorMaterial.Layer(Identifier.of(ContentCraft.MOD_ID, "xaenon"))), 0,0));


        public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
            return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ContentCraft.MOD_ID, name), material.get());
        }
    }
