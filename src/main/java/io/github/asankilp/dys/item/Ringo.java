package io.github.asankilp.dys.item;

import io.github.asankilp.dys.sound.SoundReg;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Ringo extends Item {
    private static final Food ringo = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(() -> new EffectInstance(Effects.NAUSEA, 114, 514, true, false), 1)
            .build();

    public Ringo() {
        super(new Properties().food(ringo).group(ItemGroup.FOOD));
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack itemIn, World worldIn, LivingEntity entityIn) {
        worldIn.playSound((PlayerEntity) null, entityIn.getPosX(), entityIn.getPosY(), entityIn.getPosZ(), SoundReg.tokugawaShoutSound.get(), SoundCategory.AMBIENT, 0.5f, 1f);
        return super.onItemUseFinish(itemIn, worldIn, entityIn);
    }
}