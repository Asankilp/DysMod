package io.github.asankilp.dys.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.CombatTracker;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import javax.annotation.Nullable;
import java.util.List;

public class KurumiShovel extends ShovelItem {

    public KurumiShovel() {
        super(DysTier.DEADIRON, 3, -3f, (new Item.Properties()).group(ItemGroup.TOOLS));
    }
    /*
     * This method refer to the Botania Mod.
     * Get the Source Code in github:
     * https://github.com/Vazkii/Botania
     *
     * Botania is Open Source and distributed under the
     * Botania License: http://botaniamod.net/license.php
     */
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getCreatureAttribute() == CreatureAttribute.UNDEAD) {
            attacker.world.playSound(null, attacker.getPosX(), attacker.getPosY(), attacker.getPosZ(), SoundEvents.ENTITY_ITEM_BREAK, attacker.getSoundCategory(), 1F, 0.5F);
            target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 30,10, true, true));
//            target.addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 1,4));
            if (attacker instanceof PlayerEntity) {

                target.attackEntityFrom(DamageSource.causePlayerDamage((PlayerEntity) attacker), getAttackDamage() * 5);
            } else {
                target.attackEntityFrom(DamageSource.causeMobDamage(attacker), getAttackDamage() * 5);
            }

        }
        return super.hitEntity(stack, target, attacker);
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("item.kurumi_shovel.tip1"));
        tooltip.add(new TranslationTextComponent("item.kurumi_shovel.tip2"));
    }


}
