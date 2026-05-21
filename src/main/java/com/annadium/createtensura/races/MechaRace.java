package com.annadium.createtensura.races;

import com.annadium.createtensura.configs.ConstructConfig;
import com.annadium.createtensura.registry.RaceRegistry;
import com.annadium.createtensura.registry.SkillRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.tensura.ability.TensuraSkill;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import io.github.manasmods.tensura.registry.skill.IntrinsicSkills;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MechaRace extends RobotRace {

    @Override
    public RaceConfig.Default getDefaultConfig() {
        return ConfigRegistry.getConfig(ConstructConfig.class).mecha;
    }

    @Override
    public Map<EvolutionRequirement, Float> getEvolutionRequirements(ManasRaceInstance previous, LivingEntity entity) {
        return Map.of(new EvolutionRequirement.EPRequirement(ConfigRegistry.getConfig(ConstructConfig.class).mecha.getEpRequirement()), 100f);
    }

    @Override
    public @Nullable ManasRace getDefaultEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return RaceRegistry.GUNDAM.get();
    }

    @Override
    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return RaceRegistry.GUNDAM.get();
    }

    @Override
    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return RaceRegistry.GUNDAM.get();
    }

    @Override
    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        return List.of(RaceRegistry.GUNDAM.get(), RaceRegistry.WARFRAME.get());
    }

    @Override
    public List<ManasRace> getPreviousEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        return List.of(RaceRegistry.ROBOT.get());
    }

    @Override
    public List<ManasSkill> getIntrinsicSkills(ManasRaceInstance instance, LivingEntity entity) {
        List<ManasSkill> list = new ArrayList<>();
        list.add(SkillRegistry.MECHANICAL_EYE_SKILL.get());
        list.add(SkillRegistry.MECHANICAL_HAND.get());
        list.add(IntrinsicSkills.GIANTIFICATION.get());
        return list;
    }
}
