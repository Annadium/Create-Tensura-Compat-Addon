package com.annadium.createtensura.ability;

import com.simibubi.create.AllSoundEvents;
import com.simibubi.create.content.equipment.goggles.GogglesItem;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MechanicalEyeSkill extends Skill {
    public MechanicalEyeSkill() {
        super(SkillType.INTRINSIC);
    }

    private final Map<Player, Predicate<Player>> activePr = new HashMap<>();

    @Override
    public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
        return true;
    }

    @Override
    public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
        return instance.isToggled() && instance.isMastered(entity);
    }

    @Override
    public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {
        if(entity instanceof Player player) {
            PlayerPredicateWrapper wrapper = new PlayerPredicateWrapper(player);
            GogglesItem.addIsWearingPredicate(wrapper);
            activePr.put(player, wrapper);
            wrapper.setActive(true);

            player.displayClientMessage(Component.translatable("Mechanical Eyes activated")
                    .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN)), true);
            player.level().playSound(null, player.getX(), player.getY(), player.getZ(), AllSoundEvents.CONFIRM.getMainEvent(), SoundSource.PLAYERS, 1.0F, 1.0F);

        }
    }

    @Override
    public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {
        if (entity instanceof Player player) {
            PlayerPredicateWrapper wrapper = (PlayerPredicateWrapper) activePr.remove(player);
            if (wrapper != null) {
                wrapper.setActive(false); // Deactivate the predicate
            }

            player.displayClientMessage(Component.translatable("Mechanical Eyes deactivated")
                    .setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            player.level().playSound(null, player.getX(), player.getY(), player.getZ(), AllSoundEvents.DENY.getMainEvent(), SoundSource.PLAYERS, 1.0F, 1.0F);
        }
    }

    private static class PlayerPredicateWrapper implements Predicate<Player> {
        private final Player player;
        private boolean active;

        public PlayerPredicateWrapper(Player player) {
            this.player = player;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
        @Override
        public boolean test(Player p) {
            return active && p.equals(player);
        }
    }
}
