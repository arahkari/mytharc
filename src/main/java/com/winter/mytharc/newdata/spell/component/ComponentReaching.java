package com.winter.mytharc.newdata.spell.component;

import com.mna.api.affinity.Affinity;
import com.mna.api.sound.SFX;
import com.mna.api.spells.SpellPartTags;
import com.mna.api.spells.attributes.Attribute;
import com.mna.api.spells.attributes.AttributeValuePair;
import com.mna.spells.components.PotionEffectComponent;
import com.winter.mytharc.newdata.effects.EffectRegister;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.List;


public class ComponentReaching extends PotionEffectComponent {

    public ComponentReaching(ResourceLocation guiIcon) {
        super(guiIcon, EffectRegister.REACHING, new AttributeValuePair[]{new AttributeValuePair(Attribute.MAGNITUDE, 1F, 1F, 3.0F, 1F, 10.0F), new AttributeValuePair(Attribute.DURATION, 10.0F, 10.0F, 120.0F, 10F, 8.0F)});
    }

    public boolean targetsBlocks() {
        return false;
    }

    @Override
    public SoundEvent SoundEffect() {
        return SFX.Spell.Impact.Single.ARCANE;
    }

    @Override
    public Affinity getAffinity() {
        return Affinity.ARCANE;
    }

    @Override
    public float initialComplexity() {
        return 15.0F;
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
        return List.of(Affinity.ARCANE);
    }

}

