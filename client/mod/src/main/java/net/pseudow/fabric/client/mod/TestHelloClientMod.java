package net.pseudow.fabric.client.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.pseudow.fabric.client.api.TestHelloClientApi;
import net.pseudow.fabric.client.mod.entity.renderer.PlayerRenderer;
import net.pseudow.fabric.common.entity.PlayerCustomEntity;
import software.bernie.geckolib.GeckoLib;

public class TestHelloClientMod implements ClientModInitializer, TestHelloClientApi {
    @Override
    public void onInitializeClient() {
        GeckoLib.initialize();
        EntityRendererRegistry.register(PlayerCustomEntity.ENTITY_TYPE, PlayerRenderer::new);
    }

    @Override
    public void sayHello() {
        System.out.println("Client hello!");
    }
}
