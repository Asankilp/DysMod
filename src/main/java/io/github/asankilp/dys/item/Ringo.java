package io.github.asankilp.dys.item;

import io.github.asankilp.dys.sound.SoundReg;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Ringo extends Item {
    private static final FoodProperties ringo = (new FoodProperties.Builder())
            .saturationMod(10)
            .nutrition(20)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 114, 514, true, false), 1)
            .build();

    public Ringo() {
        super(new Properties().food(ringo).tab(CreativeModeTab.TAB_FOOD));
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemIn, Level levelIn, LivingEntity entityIn) {
        if (levelIn.isClientSide) {
            levelIn.playSound((Player) entityIn, entityIn.getX(), entityIn.getY(), entityIn.getZ(), SoundReg.tokugawaShoutSound.get(), entityIn.getSoundSource(), 10f, 1f);
        }
        return super.finishUsingItem(itemIn, levelIn, entityIn);
    }
}