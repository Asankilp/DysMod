package io.github.asankilp.dys.sound;

import io.github.asankilp.dys.Dys;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundReg {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Dys.MODID);
    public static final RegistryObject<SoundEvent> yajuSound = SOUNDS.register("ambient.yaju.shout", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.shout")));
    public static final RegistryObject<SoundEvent> yaju_block_placeSound = SOUNDS.register("block.yaju_block.place", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "block.yaju_block.place")));
    public static final RegistryObject<SoundEvent> tokugawaShoutSound = SOUNDS.register("ambient.tokugawa.shout", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.tokugawa.shout")));
    public static final RegistryObject<SoundEvent> yajuYarimasuSound = SOUNDS.register("ambient.yaju.yarimasu", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.yarimasu")));
    public static final RegistryObject<SoundEvent> akariakarinSound = SOUNDS.register("ambient.akaza_akari.akarin", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.akaza_akari.akarin")));
}
