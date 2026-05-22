package com.annadium.createtensura.registry;

import com.annadium.createtensura.AnnasCreateTensuraCompat;
import com.annadium.createtensura.ability.MechanicalEyeSkill;
import com.annadium.createtensura.ability.MechanicalHandSkill;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class SkillRegistry {

    public static final RegistrySupplier<MechanicalEyeSkill> MECHANICAL_EYE_SKILL = register("mechanical_eye", MechanicalEyeSkill::new);
    public static final RegistrySupplier<MechanicalHandSkill> MECHANICAL_HAND = register("mechanical_hand", MechanicalHandSkill::new);


    private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return io.github.manasmods.manascore.skill.impl.SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath(AnnasCreateTensuraCompat.MODID, name), supplier);
    }

    public static void init() {
    }
}
