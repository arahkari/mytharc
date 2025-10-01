package com.winter.mytharc.newdata.event;

import com.winter.mytharc.newdata.effects.EffectRegister;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import com.winter.mytharc.MythArc;


@Mod.EventBusSubscriber(modid = MythArc.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class CommonEvents {

    // im pretty sure this should function

    @SubscribeEvent
    public static void onArrowFire(ArrowLooseEvent event) {
        LivingEntity entity = event.getEntity();
        int amplifier;


        // make this not terrible
        // this functions though I do not care
        if (entity.hasEffect(EffectRegister.DEADEYE.get())){
            amplifier = entity.getEffect(EffectRegister.DEADEYE.get()).getAmplifier();
            entity.removeEffect(EffectRegister.DEADEYE.get());
            MobEffectInstance effect = new MobEffectInstance(EffectRegister.DEADEYE.get(), 1, amplifier);
            entity.addEffect(effect);
        }

    }





}
