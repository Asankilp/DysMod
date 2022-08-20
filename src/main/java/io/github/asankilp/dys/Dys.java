package io.github.asankilp.dys;
import io.github.asankilp.dys.item.ItemReg;
import io.github.asankilp.dys.sound.SoundReg;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Dys.MODID)
public class Dys {
    public static final String MODID = "dys";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public Dys() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        ItemReg.BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ItemReg.ITEMS.register(modEventBus);
        SoundReg.SOUNDS.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code

    }
}
