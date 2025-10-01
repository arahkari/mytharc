package com.winter.mytharc.newdata.spell.component;

import com.mna.api.affinity.Affinity;
import com.mna.api.config.GeneralConfigValues;
import com.mna.api.entities.DamageHelper;
import com.mna.api.faction.FactionIDs;
import com.mna.api.faction.IFaction;
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
import com.mna.factions.Factions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.List;


public class ComponentDevourment extends SpellEffect implements IDamageComponent {

    public ComponentDevourment(ResourceLocation icon) {
        super(icon, new AttributeValuePair(Attribute.MAGNITUDE, 1.0F, 0.0F, 3.0F, 1.0F, 1.0F));
    }

    public ComponentApplicationResult ApplyEffect(SpellSource source, SpellTarget target, IModifiedSpellPart<SpellEffect> modificationData, SpellContext context) {

        if(target.isEntity() && target.getEntity() instanceof LivingEntity entity && target.getLivingEntity().isBaby())
        {
            LivingEntity spellTarget = target.getLivingEntity();
            LivingEntity spellCaster = source.getCaster();

            float damage = 69;
            entity.hurt(DamageHelper.createSourcedType(DamageTypes.MAGIC, context.getLevel().registryAccess(), source.getCaster()), damage * Math.max((float) GeneralConfigValues.GlobalDamageScale, 0.1f));



            MobEffectInstance effect = new MobEffectInstance(MobEffects.SATURATION, 1,(4 + (int)modificationData.getValue(Attribute.MAGNITUDE)));

            spellCaster.addEffect(effect);



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
        return 24.0F;
    }

    @Override
    public int requiredXPForRote() {
        return 500;
    }

    @Override
    public SpellPartTags getUseTag() {
        return SpellPartTags.HARMFUL;
    }
    public IFaction getFactionRequirement() {
        return Factions.DEMONS;
    }
    @Override
    public List<Affinity> getValidTinkerAffinities() {
        return List.of(Affinity.BLOOD);
    }

}

