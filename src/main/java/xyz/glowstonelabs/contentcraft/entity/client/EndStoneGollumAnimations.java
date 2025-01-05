package xyz.glowstonelabs.contentcraft.entity.client;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class EndStoneGollumAnimations {
    public static final Animation ANIM_DORMANT = Animation.Builder.create(0f)
            .addBoneAnimation("Body",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -5f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Head",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -9f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Leftleg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Rightleg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 5f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("RightArm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, -4f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("LeftArm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 4f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Eyes",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(2f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation ANIM_IDLE = Animation.Builder.create(2f).looping()
            .addBoneAnimation("Torso",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Chest",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9583434f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.4583433f, AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.9583433f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Arms",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4583433f, AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9583434f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.4583433f, AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.9583433f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation WALK = Animation.Builder.create(2f).looping()
            .addBoneAnimation("Body",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-2.49f, -0.04f, -0.19f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(2.49f, 0.02f, 0.2f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(-2.49f, -0.04f, -0.19f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(2.49f, 0.02f, 0.2f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(-2.49f, -0.04f, -0.19f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Leftleg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Leftleg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, -12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, -12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 12.5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Rightleg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createTranslationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Rightleg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, -12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, 12.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, -12.5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("RightArm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(8f, 2f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(-7f, 2f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createTranslationalVector(8f, 2f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createTranslationalVector(-7f, 2f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createTranslationalVector(8f, 2f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("RightArm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -30f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 25f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, -30f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, 25f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, -30f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("LeftArm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(-11f, 3f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(6f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createTranslationalVector(-11f, 3f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createTranslationalVector(6f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createTranslationalVector(-11f, 3f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("LeftArm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 40f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, -25f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 40f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(0f, 0f, -25f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 40f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation ANIM_TRANSFORM = Animation.Builder.create(1f)
            .addBoneAnimation("BodyElements",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -5f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.125f, AnimationHelper.createTranslationalVector(0f, -4f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, AnimationHelper.createTranslationalVector(0f, -4f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, -2f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5416766f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("BodyElements",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0.01f, -0.15f, 0.2f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.20834334f, AnimationHelper.createRotationalVector(-2.49f, -0.15f, 0.2f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(2.51f, -0.15f, 0.2f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(2.51f, -0.15f, 0.2f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(0.02f, -0.29f, 0.41f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("Head",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -14f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.6766666f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("RightArm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -5f, -4f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("LeftArm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -5f, 4f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.375f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation ANIM_TODORMANT = Animation.Builder.create(0f).build();
}
