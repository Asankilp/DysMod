package io.github.asankilp.dys.block;

import io.github.asankilp.dys.Dys;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DysBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dys.MODID);
    public static final RegistryObject<Block> YAJU_BLOCK = BLOCKS.register("yaju_block", YajuBlock::new);

}
