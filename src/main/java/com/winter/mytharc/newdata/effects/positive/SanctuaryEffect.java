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

public class SanctuaryEffect extends MobEffect {

    public SanctuaryEffect()
    {
        super(MobEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(ALObjects.Attributes.DODGE_CHANCE.get(), "237d7b3c-26bd-4f71-ba28-8dbea47a11fe", 0.05, AttributeModifier.Operation.ADDITION);
    }

}
