package com.winter.mytharc.newdata.effects.negative;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class ApathyEffect extends MobEffect {

    public ApathyEffect()
    {
        super(MobEffectCategory.HARMFUL, 0);
        this.addAttributeModifier(Attributes.FOLLOW_RANGE, "8b59369b-d046-491e-b3ed-534109a3b140", -1.0, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

}
