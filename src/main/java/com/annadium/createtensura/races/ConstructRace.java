package com.annadium.createtensura.races;

import com.annadium.createtensura.configs.ConstructConfig;
import com.annadium.createtensura.registry.SkillRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.DefaultRace;
import io.github.manasmods.tensura.storage.Alignment;
import net.minecraft.world.entity.LivingEntity;

import java.util.ArrayList;
import java.util.List;

public class ConstructRace extends DefaultRace {
    public ConstructRace() {
        super(Difficulty.EASY);
        this.applyDefaultAttributeModifiers();
    }

    @Override
    public RaceConfig.Default getDefaultConfig() {
        return ConfigRegistry.getConfig(ConstructConfig.class).construct;
    }

    @Override
    public Alignment getAlignment() {
        return Alignment.MAJIN;
    }

    @Override
    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        List<ManasSkill> list = new ArrayList<>();
        list.add(SkillRegistry.MECHANICAL_EYE_SKILL.get());
        return list;
    }
}
