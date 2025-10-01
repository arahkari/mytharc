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


public class ComponentRejuvenation extends PotionEffectComponent {

    public ComponentRejuvenation(ResourceLocation guiIcon) {
        super(guiIcon, EffectRegister.REJUVENATION, new AttributeValuePair[]{new AttributeValuePair(Attribute.MAGNITUDE, 1F, 1F, 3.0F, 1F, 16.0F), new AttributeValuePair(Attribute.DURATION, 30.0F, 20.0F, 90.0F, 10F, 8.0F)});
    }

    public boolean targetsBlocks() {
        return false;
    }

    @Override
    public SoundEvent SoundEffect() {
        return SFX.Spell.Impact.Single.EARTH;
    }

    @Override
    public Affinity getAffinity() {
        return Affinity.EARTH;
    }

    @Override
    public float initialComplexity() {
        return 25.0F;
    }

    @Override
    public int requiredXPForRote() {
        return 500;
    }

    @Override
    public SpellPartTags getUseTag() {
        return SpellPartTags.FRIENDLY;
    }

    @Override
    public List<Affinity> getValidTinkerAffinities() {
        return List.of(Affinity.EARTH);
    }

}

