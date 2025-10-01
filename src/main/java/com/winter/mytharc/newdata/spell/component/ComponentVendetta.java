package com.winter.mytharc.newdata.spell.component;

import com.mna.api.affinity.Affinity;
import com.mna.api.config.GeneralConfigValues;
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

import java.util.List;


public class ComponentVendetta extends SpellEffect implements IDamageComponent {

    public ComponentVendetta(ResourceLocation icon) {
        super(icon, new AttributeValuePair[]{new AttributeValuePair(Attribute.DAMAGE, 2.0F, 1.0F, 8.0F, 1F, 3.0F), new AttributeValuePair(Attribute.LESSER_MAGNITUDE, 1.0F, 0.0F, 6.0F, 1.0F, 3.0F)});
    }

    public ComponentApplicationResult ApplyEffect(SpellSource source, SpellTarget target, IModifiedSpellPart<SpellEffect> modificationData, SpellContext context) {

        if(target.isEntity() && target.getEntity() instanceof LivingEntity entity)
        {
            LivingEntity spellTarget = target.getLivingEntity();
            LivingEntity spellCaster = source.getCaster();
            float damage = 1 * modificationData.getValue(Attribute.DAMAGE) + spellTarget.getActiveEffects().size();



            damage *= ((20 / spellCaster.getHealth()) / 3);

            if(spellCaster.getHealth() <= 2.0 + modificationData.getValue(Attribute.LESSER_MAGNITUDE))
            {
                damage += (modificationData.getValue(Attribute.LESSER_MAGNITUDE) / 2);
            }

            entity.hurt(DamageHelper.createSourcedType(DamageTypes.PLAYER_ATTACK, context.getLevel().registryAccess(), source.getCaster()), damage * Math.max((float) GeneralConfigValues.GlobalDamageScale, 0.1f));



            return ComponentApplicationResult.SUCCESS;


        }

        return ComponentApplicationResult.FAIL;
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
        return 25.0F;
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
        return List.of(Affinity.BLOOD);
    }

}

