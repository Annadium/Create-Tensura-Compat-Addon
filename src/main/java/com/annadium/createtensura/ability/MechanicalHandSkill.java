package com.annadium.createtensura.ability;

import com.annadium.createtensura.AnnasCreateTensuraCompat;
import com.annadium.createtensura.configs.SkillConfig;
import com.simibubi.create.AllSoundEvents;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.SkillHelper;
import io.github.manasmods.tensura.ability.TensuraSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.data.TensuraEntityTags;
import io.github.manasmods.tensura.data.existence.TensuraEntityExistenceData;
import io.github.manasmods.tensura.registry.attribute.TensuraAttributes;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

public class MechanicalHandSkill extends Skill {
    public MechanicalHandSkill() {
        super(SkillType.INTRINSIC);
    }

    public static ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(AnnasCreateTensuraCompat.MODID, "textures/skill/intrinsic/mechanical_hand.png");

    @Override
    public @Nullable ResourceLocation getSkillIcon() {
        return TEXTURE;
    }

    @Override
    public double getMagiculeCost(LivingEntity entity, ManasSkillInstance instance, int mode) {
        return ConfigRegistry.getConfig(SkillConfig.class).mechanicalHand.magiculeCost;
    }

    @Override
    public int nextMode(LivingEntity entity, ManasSkillInstance instance, int mode, boolean reverse) {
        if(mode == 1) return 0;
        else return 1;
    }

    @Override
    public int getModes(ManasSkillInstance instance) {
        // Two modes: Rotate and Remove
        return 2;
    }

    @Override
    public Component getModeName(ManasSkillInstance instance, int mode) {
        MutableComponent name;
        switch (mode) {
            case 1 -> name = Component.translatable(AnnasCreateTensuraCompat.MODID + ".skill.mode.mechanical_hand.rotate");
            case 0 -> name = Component.translatable(AnnasCreateTensuraCompat.MODID + ".skill.mode.mechanical_hand.remove");
            default -> name = Component.empty();
        }
        return name;
    }

    @Override
    public void onPressed(ManasSkillInstance instance, LivingEntity entity, int keyNumber, int mode) {
        // Handle logic based on the current mode
        if(!canActivateSkill(instance, entity, mode)) return;

        if(entity instanceof Player player) {
            switch (mode) {
                case 1: // Mode 1: Rotate functionality (current "rotate" behavior)
                    rotateBlock(player, instance);
                    break;
                case 0: // Mode 2: Remove functionality (pick up block using onSneakWrenched)
                    removeBlock(player, instance);
                    break;
                default:
                    break;
            }
        }
    }

    private void rotateBlock(Player player, ManasSkillInstance instance) {
        // Get the block the player is looking at
        HitResult hitResult = player.pick(5.0D, 0.0F, false);
        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            BlockPos pos = blockHitResult.getBlockPos();
            Level world = player.level();
            BlockState state = world.getBlockState(pos);

            // Check if the block is wrenchable and perform rotation
            if (state.getBlock() instanceof IWrenchable wrenchable) {
                InteractionResult result = wrenchable.onWrenched(state, new UseOnContext(world, player, InteractionHand.MAIN_HAND, player.getMainHandItem(), blockHitResult));
                if (result == InteractionResult.SUCCESS) {
                    world.playSound(null, player.getX(), player.getY(), player.getZ(), AllSoundEvents.WRENCH_ROTATE.getMainEvent(), SoundSource.PLAYERS, 1.0F, 1.0F);
                } else {
                    player.displayClientMessage(Component.translatable("Mechanical Hands: No valid target or action!"), true);
                }
            } else {
                player.displayClientMessage(Component.translatable("Mechanical Hands: This block is not wrenchable."), true);
            }
        }
    }

    private void removeBlock(Player player, ManasSkillInstance instance) {
        // Get the block the player is looking at
        HitResult hitResult = player.pick(5.0D, 0.0F, false);
        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            BlockPos pos = blockHitResult.getBlockPos();
            Level world = player.level();
            BlockState state = world.getBlockState(pos);

            // Check if the block is wrenchable and perform removal
            if (state.getBlock() instanceof IWrenchable wrenchable) {
                InteractionResult result = wrenchable.onSneakWrenched(state, new UseOnContext(world, player, InteractionHand.MAIN_HAND, player.getMainHandItem(), blockHitResult));
                if (result == InteractionResult.SUCCESS) {
                    world.playSound(null, player.getX(), player.getY(), player.getZ(), AllSoundEvents.WRENCH_REMOVE.getMainEvent(), SoundSource.PLAYERS, 1.0F, 1.0F);
                } else {
                    player.displayClientMessage(Component.translatable("Mechanical Hands: No valid target or action!"), true);
                }
            } else {
                player.displayClientMessage(Component.translatable("Mechanical Hands: This block is not wrenchable."), true);
            }
        }
    }
}
