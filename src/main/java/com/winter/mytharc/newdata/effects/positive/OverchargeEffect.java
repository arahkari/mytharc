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

public class OverchargeEffect extends MobEffect {

    public OverchargeEffect()
    {
        super(MobEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(ALObjects.Attributes.DRAW_SPEED.get(), "6392c7ca-2fd8-4d9d-a37c-248b086a4fce", 0.5, AttributeModifier.Operation.MULTIPLY_BASE);
        this.addAttributeModifier(Attributes.ATTACK_SPEED, "a0a56e69-6c33-4811-a302-6b5463350e40", 0.5, AttributeModifier.Operation.MULTIPLY_BASE);
    }

}
