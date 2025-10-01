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


public class ComponentApathy extends PotionEffectComponent {

    public ComponentApathy(ResourceLocation guiIcon) {
        super(guiIcon, EffectRegister.APATHY, new AttributeValuePair[]{new AttributeValuePair(Attribute.DURATION, 1.0F, 1.0F, 5.0F, 1F, 12.0F)});
    }

    public boolean targetsBlocks() {
        return false;
    }

    @Override
    public SoundEvent SoundEffect() {
        return SFX.Spell.Impact.Single.ENDER;
    }

    @Override
    public Affinity getAffinity() {
        return Affinity.ENDER;
    }

    @Override
    public float initialComplexity() {
        return 30.0F;
    }

    @Override
    public int requiredXPForRote() {
        return 500;
    }

    @Override
    public SpellPartTags getUseTag() {
        return SpellPartTags.HARMFUL;
    }

    @Override
    public List<Affinity> getValidTinkerAffinities() {
        return List.of(Affinity.ENDER);
    }

}

