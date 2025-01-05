package xyz.glowstonelabs.contentcraft.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import xyz.glowstonelabs.contentcraft.ContentCraft;
import xyz.glowstonelabs.contentcraft.entity.custom.EndStoneGollumEntity;

public class EndStoneGollumModel<E extends AnimalEntity> extends EntityModel<EndStoneGollumEntity> {
    public static final EntityModelLayer ENDSTONE_GOLLUM = new EntityModelLayer(Identifier.of(ContentCraft.MOD_ID, "endstone_gollum"), "main");

    public EndStoneGollumModel(ModelPart part) {
    }

    @Override
    public void setAngles(EndStoneGollumEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {

    }

    public class EndStoneGollum extends EntityModel<Entity> {
        private final ModelPart Body;
        private final ModelPart Torso;
        private final ModelPart Chest;
        private final ModelPart BodyElements;
        private final ModelPart Head;
        private final ModelPart Eyes;
        private final ModelPart Legs;
        private final ModelPart Leftleg;
        private final ModelPart Rightleg;
        private final ModelPart Arms;
        private final ModelPart RightArm;
        private final ModelPart LeftArm;
        public EndStoneGollum(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Torso = this.Body.getChild("Torso");
            this.Chest = this.Torso.getChild("Chest");
            this.BodyElements = this.Chest.getChild("BodyElements");
            this.Head = this.Chest.getChild("Head");
            this.Eyes = this.Head.getChild("Eyes");
            this.Legs = this.Torso.getChild("Legs");
            this.Leftleg = this.Legs.getChild("Leftleg");
            this.Rightleg = this.Legs.getChild("Rightleg");
            this.Arms = this.Torso.getChild("Arms");
            this.RightArm = this.Arms.getChild("RightArm");
            this.LeftArm = this.Arms.getChild("LeftArm");
        }
        public static TexturedModelData getTexturedModelData() {
            ModelData modelData = new ModelData();
            ModelPartData modelPartData = modelData.getRoot();
            ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData Torso = Body.addChild("Torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData Chest = Torso.addChild("Chest", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData BodyElements = Chest.addChild("BodyElements", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, 5.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData Head = Chest.addChild("Head", ModelPartBuilder.create().uv(0, 32).cuboid(-5.0F, 16.0F, -5.0F, 10.0F, 9.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, 0.0F));

            ModelPartData Eyes = Head.addChild("Eyes", ModelPartBuilder.create().uv(-1, -1).cuboid(-6.0F, 26.0F, 0.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
                    .uv(-1, -1).cuboid(-6.0F, 26.0F, -4.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

            ModelPartData Legs = Torso.addChild("Legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData Leftleg = Legs.addChild("Leftleg", ModelPartBuilder.create().uv(0, 51).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData Rightleg = Legs.addChild("Rightleg", ModelPartBuilder.create().uv(60, 32).cuboid(-3.0F, 0.0F, 1.0F, 6.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData Arms = Torso.addChild("Arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData RightArm = Arms.addChild("RightArm", ModelPartBuilder.create().uv(40, 49).cuboid(-3.0F, 7.0F, 8.0F, 6.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData LeftArm = Arms.addChild("LeftArm", ModelPartBuilder.create().uv(40, 32).cuboid(-3.0F, 7.0F, -12.0F, 6.0F, 13.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
            return TexturedModelData.of(modelData, 128, 128);
        }
        public void setAngles(EndStoneGollumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
        @Override
        public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
            Body.render(matrices, vertexConsumer, light, overlay, color);
        }

        public ModelPart getPart() {
            return Body;
        }

        @Override
        public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
            this.getPart().traverse().forEach(ModelPart::resetTransform);
            this.setHeadAngles(headYaw, headPitch);

            this.animateModel(entity, limbAngle, limbDistance, animationProgress);
            this.updateAnimation(EndStoneGollumEntity.idleanimationstate, EndStoneGollumAnimations.ANIM_IDLE, animationProgress);
        }

        private void updateAnimation(AnimationState idleanimationstate, Animation animIdle, float animationProgress) {

        }

        private void setHeadAngles(float headYaw, float headPitch) {
            headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
            headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

            this.Head.yaw = headYaw * 0.017453292F;
            this.Head.pitch = headPitch * 0.017453292F;
        }
    }
}
