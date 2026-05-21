package com.annadium.createtensura.configs;

import com.annadium.createtensura.AnnasCreateTensuraCompat;
import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;
import io.github.manasmods.manascore.config.api.SyncToClient;

@SyncToClient
public class SkillConfig extends ManasConfig {
    public MechanicalHand mechanicalHand = new MechanicalHand();

    @Override
    public String getFileName() {
        return AnnasCreateTensuraCompat.MODID + "/ability/skill_config";
    }

    public static class MechanicalHand extends ManasSubConfig {
        @Comment("The magicule Cost of all of the modes")
        public double magiculeCost = 20.0;
    }
}
