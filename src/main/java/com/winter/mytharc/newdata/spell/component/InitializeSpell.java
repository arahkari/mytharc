package com.winter.mytharc.newdata.spell.component;

import com.mna.Registries;
import com.mna.api.affinity.Affinity;
import com.mna.api.spells.attributes.Attribute;
import com.mna.api.spells.attributes.AttributeValuePair;
import com.mna.api.spells.parts.Shape;
import com.mna.api.spells.parts.SpellEffect;
import com.winter.mytharc.ConstructResource;
import com.winter.mytharc.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

/**
 * Register all spell-components and shapes. Call via the event bus.
 * @author Joh0210
 */
@Mod.EventBusSubscriber(modid = MythArc.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitializeSpell {
    public static SpellEffect DARK_DAMAGE;
 //   public static SpellEffect CLEANSE;
    public static SpellEffect ALKAHEST;
    public static SpellEffect VENDETTA;
    public static SpellEffect DEVOURMENT;
    public static SpellEffect SHADOW;
    public static SpellEffect DEADEYE;
    public static SpellEffect REACHING;
    public static SpellEffect SANCTUARY;
    public static SpellEffect OVERCHARGE;
    public static SpellEffect REJUVENATION;
    public static SpellEffect APATHY;
    @SubscribeEvent
    public static void register(RegisterEvent event) {
        event.register(Registries.SpellEffect.get().getRegistryKey(), (helper) -> {
            helper.register("components/alkahest", ALKAHEST);
            helper.register("components/vendetta", VENDETTA);
            helper.register("components/devourment", DEVOURMENT);
            helper.register("components/shadow", SHADOW);
            helper.register("components/deadeye", DEADEYE);
            helper.register("components/rejuvenation", REJUVENATION);
            helper.register("components/reaching", REACHING);
            helper.register("components/overcharge", OVERCHARGE);
            helper.register("components/sanctuary", SANCTUARY);
            helper.register("components/apathy", APATHY);
        });
    }

    static {
        InitializeSpell.SHADOW = new ComponentShadow(ConstructResource.create("textures/spell/component/shadow.png"));
   //     InitializeSpell.CLEANSE = new ComponentCleanse(ConstructResource.create("textures/spell/component/cleanse.png"));
        InitializeSpell.ALKAHEST = new ComponentAlkahest(ConstructResource.create("textures/spell/component/alkahest.png"));
        InitializeSpell.VENDETTA = new ComponentVendetta(ConstructResource.create("textures/spell/component/vendetta.png"));
        InitializeSpell.DEVOURMENT = new ComponentDevourment(ConstructResource.create("textures/spell/component/devourment.png"));
        InitializeSpell.DEADEYE = new ComponentDeadeye(ConstructResource.create("textures/spell/component/deadeye.png"));
        InitializeSpell.OVERCHARGE = new ComponentOvercharge(ConstructResource.create("textures/spell/component/overcharge.png"));
        InitializeSpell.REACHING = new ComponentReaching(ConstructResource.create("textures/spell/component/reaching.png"));
        InitializeSpell.REJUVENATION = new ComponentRejuvenation(ConstructResource.create("textures/spell/component/rejuvenation.png"));
        InitializeSpell.SANCTUARY = new ComponentSanctuary(ConstructResource.create("textures/spell/component/sanctuary.png"));
        InitializeSpell.APATHY = new ComponentApathy(ConstructResource.create("textures/spell/component/apathy.png"));
    }
}
