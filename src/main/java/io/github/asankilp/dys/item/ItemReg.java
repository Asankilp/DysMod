package io.github.asankilp.dys.item;
import io.github.asankilp.dys.Dys;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dys.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dys.MODID);




    public static final RegistryObject<Block> YAJU_BLOCK = BLOCKS.register("yaju_block", () -> new YajuBlock());
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> YAJU_BLOCK_ITEM = ITEMS.register("yaju_block", ()
            -> new BlockItem(ItemReg.YAJU_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAJU = ITEMS.register("yaju", () -> new Yaju());
    public static final RegistryObject<Item> RINGO = ITEMS.register("ringo", Ringo::new);
    public static final RegistryObject<Item> GOLDEN_RINGO = ITEMS.register("golden_ringo", GoldenRingo::new);
    public static final RegistryObject<Item> DEAD_IRON = ITEMS.register("dead_iron", DeadIron::new);
    public static final RegistryObject<Item> KURUMI_SHOVEL = ITEMS.register("kurumi_shovel", () -> new KurumiShovel());
    public static final RegistryObject<Item> AKAZA_AKARI = ITEMS.register("akaza_akari", AkazaAkari::new);
}
