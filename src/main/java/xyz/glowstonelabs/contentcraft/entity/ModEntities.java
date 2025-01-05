package xyz.glowstonelabs.contentcraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.glowstonelabs.contentcraft.ContentCraft;
import xyz.glowstonelabs.contentcraft.entity.custom.EndStoneGollumEntity;

public class ModEntities {
    public static final EntityType<EndStoneGollumEntity> ENDSTONE_GOLLUM = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(ContentCraft.MOD_ID, "endstone_gollum"),
            EntityType.Builder.create(EndStoneGollumEntity::new, SpawnGroup.CREATURE)
                    .dimensions(16f, 16f).build());


    public static void registerModEntities() {
        ContentCraft.LOGGER.info("Registering Mod Entities for " + ContentCraft.MOD_ID);
    }
}
