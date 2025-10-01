package com.winter.mytharc.newdata.effects.positive;

import dev.shadowsoffire.attributeslib.api.ALObjects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;

public class RejuvenationEffect extends MobEffect {


    public RejuvenationEffect()
    {
        super(MobEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(ALObjects.Attributes.HEALING_RECEIVED.get(), "706ffcaa-cf4b-4876-8c0e-156b49ee03c0", 0.1, AttributeModifier.Operation.MULTIPLY_BASE);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 200 == 0;
    }

    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1.0f);
        }
    }



}
