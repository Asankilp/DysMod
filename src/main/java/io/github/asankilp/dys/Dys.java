package io.github.asankilp.dys;
import io.github.asankilp.dys.effect.EffectReg;
import io.github.asankilp.dys.item.ItemReg;
import io.github.asankilp.dys.sound.SoundReg;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Dys.MODID)
public class Dys {
    public static final String MODID = "dys";
    public Dys() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        ItemReg.BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ItemReg.ITEMS.register(modEventBus);
        SoundReg.SOUNDS.register(modEventBus);
        EffectReg.EFFECTS.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code

    }
}
