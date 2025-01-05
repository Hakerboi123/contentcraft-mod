package xyz.glowstonelabs.contentcraft.entity.client;

import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import xyz.glowstonelabs.contentcraft.ContentCraft;
import xyz.glowstonelabs.contentcraft.entity.custom.EndStoneGollumEntity;

public class EndStoneGollumRenderer extends MobEntityRenderer<EndStoneGollumEntity, EndStoneGollumModel<EndStoneGollumEntity>> {
    public EndStoneGollumRenderer(EntityRendererFactory.Context context) {
        super(context, new EndStoneGollumModel<>(context.getPart(EndStoneGollumModel.ENDSTONE_GOLLUM)), 0.75f);
    }



    public void render(EndStoneGollumEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
}

    
    public static Identifier getTexture(EndStoneGollumEntity entity) {
        return null;
    }

    public static TexturedModelData getTexture() {
    }
}



