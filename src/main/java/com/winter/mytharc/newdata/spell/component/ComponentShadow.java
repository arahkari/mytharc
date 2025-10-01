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


public class ComponentShadow extends SpellEffect implements IDamageComponent {

    public ComponentShadow(ResourceLocation icon) {
        super(icon, new AttributeValuePair[]{new AttributeValuePair(Attribute.DAMAGE, 2.0F, 1.0F, 15.0F, 1F, 3.0F), new AttributeValuePair(Attribute.MAGNITUDE, 0.1F, 0.0F, 1F, 0.1F, 3.0F)});
    }

    public ComponentApplicationResult ApplyEffect(SpellSource source, SpellTarget target, IModifiedSpellPart<SpellEffect> modificationData, SpellContext context) {

        if(target.isEntity() && target.getEntity() instanceof LivingEntity entity)
        {
            LivingEntity spellTarget = target.getLivingEntity();
            float damage = 1 * modificationData.getValue(Attribute.DAMAGE);

            if(spellTarget.getHealth() < (spellTarget.getMaxHealth() * (0.05 + modificationData.getValue(Attribute.MAGNITUDE))))
            {
                damage *= 2;
            }



            entity.hurt(DamageHelper.createSourcedType(DamageTypes.MAGIC, context.getLevel().registryAccess(), source.getCaster()), damage * Math.max((float) GeneralConfigValues.GlobalDamageScale, 0.1f));


            return ComponentApplicationResult.SUCCESS;


        }

        return ComponentApplicationResult.FAIL;
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
        return List.of(Affinity.ENDER);
    }

}

