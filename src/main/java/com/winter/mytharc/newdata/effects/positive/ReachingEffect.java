package com.winter.mytharc.newdata.effects.positive;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;


public class ReachingEffect extends MobEffect {

    public ReachingEffect()
    {
        super(MobEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "9384cf9f-02d7-4491-90be-c2c940107528", 1.0, AttributeModifier.Operation.ADDITION);
        this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "05c836a5-0ef0-46b1-9dd8-a61a7e6b00cd", 1.0, AttributeModifier.Operation.ADDITION);
    }

}
