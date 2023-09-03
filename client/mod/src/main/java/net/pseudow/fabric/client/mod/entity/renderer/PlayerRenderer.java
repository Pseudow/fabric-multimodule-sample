package net.pseudow.fabric.client.mod.entity.renderer;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.pseudow.fabric.common.entity.PlayerCustomEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PlayerRenderer extends GeoEntityRenderer<PlayerCustomEntity> {
    public PlayerRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new DefaultedEntityGeoModel<>(PlayerCustomEntity.IDENTIFIER));
    }

    @Override
    public void render(PlayerCustomEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    protected void renderLabelIfPresent(PlayerCustomEntity entity, Text text, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
    }
}
