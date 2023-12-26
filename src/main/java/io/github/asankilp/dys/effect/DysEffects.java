package io.github.asankilp.dys.effect;

import io.github.asankilp.dys.Dys;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class DysEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Dys.MODID);
    public static final Supplier<MobEffect> SENPAI_STARE = EFFECTS.register("senpai_stare", SenpaiEffect::new);


}
