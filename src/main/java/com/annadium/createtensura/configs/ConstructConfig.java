package com.annadium.createtensura.configs;

import com.annadium.createtensura.AnnasCreateTensuraCompat;
import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.SyncToClient;
import io.github.manasmods.tensura.config.race.RaceConfig;
import lombok.Generated;

@SyncToClient
public class ConstructConfig extends ManasConfig {
    public Construct construct = new Construct();

    public ConstructConfig() {

    }

    @Override
    public String getFileName() {
        return AnnasCreateTensuraCompat.MODID + "/race/construct_config";
    }

    public static class Construct extends RaceConfig.Default {
        @Comment("Minimal aura.")
        public double minAura = 10;
        @Comment("Maximum aura.")
        public double maxAura = 100;
        @Comment("Minimal magicule.")
        public double minMagicule = 1500;
        @Comment("Maximum magicule.")
        public double maxMagicule = 3000;
        @Comment("Bonus Size.")
        public double size = 0;
        @Comment("Bonus Max Health.")
        public double maxHealth = 6;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = 32.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = 0;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = 0.5F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = -0;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = -0;
        public Construct() {

        }

        @Generated
        public double getMinAura() {
            return this.minAura;
        }

        @Generated
        public double getMaxAura() {
            return this.maxAura;
        }

        @Generated
        public double getMinMagicule() {
            return this.minMagicule;
        }

        @Generated
        public double getMaxMagicule() {
            return this.maxMagicule;
        }

        @Generated
        public double getSize() {
            return this.size;
        }

        @Generated
        public double getMaxHealth() {
            return this.maxHealth;
        }

        @Generated
        public double getMaxSpiritualHealth() {
            return this.maxSpiritualHealth;
        }

        @Generated
        public double getAttack() {
            return this.attack;
        }

        @Generated
        public double getAttackSpeed() {
            return this.attackSpeed;
        }

        @Generated
        public double getKnockbackResistance() {
            return this.knockbackResistance;
        }

        @Generated
        public double getMovementSpeed() {
            return this.movementSpeed;
        }

        @Generated
        public double getSwimSpeed() {
            return this.swimSpeed;
        }
    }
}
