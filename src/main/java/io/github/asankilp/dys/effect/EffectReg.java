package io.github.asankilp.dys.effect;

import io.github.asankilp.dys.Dys;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectReg {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Dys.MODID);
    public static final RegistryObject<MobEffect> SENPAI = EFFECTS.register("senpai_stare", SenpaiEffect::new);


}
