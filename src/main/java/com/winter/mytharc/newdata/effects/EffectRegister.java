package com.winter.mytharc.newdata.effects;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import com.winter.mytharc.newdata.effects.positive.*;
import com.winter.mytharc.newdata.effects.negative.*;

import static com.winter.mytharc.MythArc.MODID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EffectRegister {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MODID);

    public static final RegistryObject<MobEffect> REJUVENATION = EFFECTS.register("rejuvenation", RejuvenationEffect::new);
    public static final RegistryObject<MobEffect> REACHING = EFFECTS.register("reaching", ReachingEffect::new);
    public static final RegistryObject<MobEffect> OVERCHARGE = EFFECTS.register("overcharge", OverchargeEffect::new);
    public static final RegistryObject<MobEffect> APATHY = EFFECTS.register("apathy", ApathyEffect::new);
    public static final RegistryObject<MobEffect> DEADEYE = EFFECTS.register("deadeye", DeadeyeEffect::new);
    public static final RegistryObject<MobEffect> SANCTUARY = EFFECTS.register("sanctuary", SanctuaryEffect::new);


}
