package net.pseudow.fabric.common.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.pseudow.fabric.common.TestHello;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class PlayerCustomEntity extends MobEntity implements GeoEntity, GeoAnimatable {
    public static final Identifier IDENTIFIER = new Identifier(TestHello.MOD_ID, "player");
    public static final EntityType<PlayerCustomEntity> ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            PlayerCustomEntity.IDENTIFIER,
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PlayerCustomEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f))
                    .build()
    );

    static {
        FabricDefaultAttributeRegistry.register(
                ENTITY_TYPE,
                MobEntity.createLivingAttributes()
                        .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 1024.0)
        );
    }

    private final AnimatableInstanceCache cache;

    protected PlayerCustomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);

        this.cache = GeckoLibUtil.createInstanceCache(this);
        this.setCustomName(Text.literal("NPC Test"));
    }

    @Override
    protected void initGoals() {
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public double getTick(Object o) {
        return 0;
    }
}
