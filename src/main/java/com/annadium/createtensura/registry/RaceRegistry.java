package com.annadium.createtensura.registry;

import com.annadium.createtensura.AnnasCreateTensuraCompat;
import com.annadium.createtensura.races.*;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.race.api.ManasRace;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class RaceRegistry {
    public static final RegistrySupplier<ManasRace> CONSTRUCT = register("construct", ConstructRace::new);
    public static final RegistrySupplier<ManasRace> ROBOT = register("robot", RobotRace::new);
    public static final RegistrySupplier<ManasRace> GOLEM = register("golem", GolemRace::new);
    public static final RegistrySupplier<ManasRace> GREATER_GOLEM = register("greater_golem", GreaterGolemRace::new);
    public static final RegistrySupplier<ManasRace> DIVINE_GOLEM = register("divine_golem", DivineGolemRace::new);

    public static void init() {

    }

    private static <E extends ManasRace> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return io.github.manasmods.manascore.race.impl.RaceRegistry.RACES.register(ResourceLocation.fromNamespaceAndPath(AnnasCreateTensuraCompat.MODID, name), supplier);
    }
}
