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
import dev.shadowsoffire.attributeslib.*;

public class DeadeyeEffect extends MobEffect {

    public DeadeyeEffect()
    {
        super(MobEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(ALObjects.Attributes.ARROW_VELOCITY.get(), "ccc67642-78da-4a6d-8555-7df6f6ee1cf6", 0.4, AttributeModifier.Operation.MULTIPLY_BASE);
    }

}
