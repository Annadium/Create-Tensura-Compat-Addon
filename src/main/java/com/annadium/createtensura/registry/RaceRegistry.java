package com.annadium.createtensura.registry;

import com.annadium.createtensura.AnnasCreateTensuraCompat;
import com.annadium.createtensura.races.ConstructRace;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.race.api.ManasRace;
import io.github.manasmods.tensura.registry.race.TensuraRaces;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.function.Supplier;

public class RaceRegistry {
    public static final RegistrySupplier<ManasRace> CONSTRUCT = register("construct", ConstructRace::new);

    public static void init() {

    }

    private static <E extends ManasRace> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
        return io.github.manasmods.manascore.race.impl.RaceRegistry.RACES.register(ResourceLocation.fromNamespaceAndPath(AnnasCreateTensuraCompat.MODID, name), supplier);
    }
}
