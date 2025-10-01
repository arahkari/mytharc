package com.winter.mytharc.newdata.spell.component;

import com.mna.api.affinity.Affinity;
import com.mna.api.config.GeneralConfigValues;
import com.mna.api.effects.MAEffects;
import com.mna.api.entities.DamageHelper;
import com.mna.api.sound.SFX;
import com.mna.api.spells.ComponentApplicationResult;
import com.mna.api.spells.SpellPartTags;
import com.mna.api.spells.attributes.Attribute;
import com.mna.api.spells.attributes.AttributeValuePair;
import com.mna.api.spells.base.IDamageComponent;
import com.mna.api.spells.base.IModifiedSpellPart;
import com.mna.api.spells.parts.SpellEffect;
import com.mna.api.spells.targeting.SpellContext;
import com.mna.api.spells.targeting.SpellSource;
import com.mna.api.spells.targeting.SpellTarget;
import com.mna.spells.components.PotionEffectComponent;
import com.winter.mytharc.newdata.effects.EffectRegister;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

import java.util.List;


public class ComponentDeadeye extends PotionEffectComponent {

    public ComponentDeadeye(ResourceLocation guiIcon) {
        super(guiIcon, EffectRegister.DEADEYE, new AttributeValuePair[]{new AttributeValuePair(Attribute.MAGNITUDE, 1F, 1F, 3.0F, 1F, 16.0F), new AttributeValuePair(Attribute.DURATION, 2.0F, 2.0F, 7.0F, 1F, 5.0F)});
    }

    public boolean targetsBlocks() {
        return false;
    }

    @Override
    public SoundEvent SoundEffect() {
        return SFX.Spell.Impact.Single.BLOOD;
    }

    @Override
    public Affinity getAffinity() {
        return Affinity.BLOOD;
    }

    @Override
    public float initialComplexity() {
        return 19.0F;
    }

    @Override
    public int requiredXPForRote() {
        return 500;
    }

    @Override
    public SpellPartTags getUseTag() {
        return SpellPartTags.UTILITY;
    }

    @Override
    public List<Affinity> getValidTinkerAffinities() {
        return List.of(Affinity.BLOOD);
    }

}

