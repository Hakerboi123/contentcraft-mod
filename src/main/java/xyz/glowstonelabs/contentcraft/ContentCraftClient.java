package xyz.glowstonelabs.contentcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import xyz.glowstonelabs.contentcraft.entity.ModEntities;
import xyz.glowstonelabs.contentcraft.entity.client.EndStoneGollumModel;
import xyz.glowstonelabs.contentcraft.entity.client.EndStoneGollumRenderer;

public class ContentCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(EndStoneGollumModel.ENDSTONE_GOLLUM, EndStoneGollumRenderer::getTexture);
        EntityRendererRegistry.register(ModEntities.ENDSTONE_GOLLUM, EndStoneGollumRenderer::new);

    }
}
