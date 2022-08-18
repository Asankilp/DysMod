package io.github.asankilp.dys.item;

import io.github.asankilp.dys.sound.SoundReg;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class AkazaAkari extends Item {
    public AkazaAkari() {
        super(new Properties());

    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 140, 4, true, false));
        playerIn.getCooldownTracker().setCooldown(this, 190);
        if (worldIn.isRemote) {
            worldIn.playSound(playerIn, playerIn.getPosition(), SoundReg.akariakarinSound.get(), SoundCategory.AMBIENT, 10f, 1f);
        }
        if(!playerIn.abilities.isCreativeMode) {
            stack.shrink(1);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
