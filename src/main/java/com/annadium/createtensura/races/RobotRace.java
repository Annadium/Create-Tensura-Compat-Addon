package com.annadium.createtensura.races;

import com.annadium.createtensura.configs.ConstructConfig;
import com.annadium.createtensura.registry.RaceRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.manascore.race.api.ManasRaceInstance;
import io.github.manasmods.tensura.config.race.RaceConfig;
import io.github.manasmods.tensura.race.template.EvolutionRequirement;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class RobotRace extends ConstructRace {

    @Override
    public RaceConfig.Default getDefaultConfig() {
        return ConfigRegistry.getConfig(ConstructConfig.class).robot;
    }

    @Override
    public Map<EvolutionRequirement, Float> getEvolutionRequirements(ManasRaceInstance previous, LivingEntity entity) {
        return Map.of(new EvolutionRequirement.EPRequirement(ConfigRegistry.getConfig(ConstructConfig.class).robot.getEpRequirement()), 100f);
    }

    @Override
    public @Nullable ManasRace getDefaultEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return RaceRegistry.MECHA.get();
    }

    @Override
    public @Nullable ManasRace getAwakeningEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return RaceRegistry.MECHA.get();
    }

    @Override
    public @Nullable ManasRace getHarvestFestivalEvolution(ManasRaceInstance instance, LivingEntity entity) {
        return RaceRegistry.MECHA.get();
    }

    @Override
    public List<ManasRace> getNextEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        return List.of(RaceRegistry.MECHA.get());
    }

    @Override
    public List<ManasRace> getPreviousEvolutions(ManasRaceInstance instance, LivingEntity entity) {
        return List.of(RaceRegistry.CONSTRUCT.get());
    }
}
