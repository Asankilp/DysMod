package io.github.asankilp.dys;
import io.github.asankilp.dys.block.DysBlocks;
import io.github.asankilp.dys.effect.DysEffects;
import io.github.asankilp.dys.item.DysItems;
import io.github.asankilp.dys.sound.DysSounds;
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
        DysBlocks.BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        DysItems.ITEMS.register(modEventBus);
        DysSounds.SOUNDS.register(modEventBus);
        DysEffects.EFFECTS.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code

    }
}
