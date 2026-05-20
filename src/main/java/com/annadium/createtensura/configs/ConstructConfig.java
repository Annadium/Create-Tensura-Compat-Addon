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
    public Robot robot = new Robot();
    public Mecha mecha = new Mecha();
    public Gundam gundam = new Gundam();
    public Warframe warframe = new Warframe();

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

    public static class Robot extends RaceConfig.Default {
        @Comment("EP requirement to evolve into a Robot.")
        public double epRequirement = 20000;
        @Comment("Minimal aura.")
        public double minAura = 100;
        @Comment("Maximum aura.")
        public double maxAura = 1000;
        @Comment("Minimal magicule.")
        public double minMagicule = 4500;
        @Comment("Maximum magicule.")
        public double maxMagicule = 9000;
        @Comment("Bonus Size.")
        public double size = 0;
        @Comment("Bonus Max Health.")
        public double maxHealth = 10;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = 40.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = 1;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = 0.65F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = -0;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = -0;

        public Robot() {

        }

        @Generated
        public double getEpRequirement() {
            return this.epRequirement;
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

    public static class Mecha extends RaceConfig.Default {
        @Comment("EP requirement to evolve into a Mecha.")
        public double epRequirement = 150000;
        @Comment("Minimal aura.")
        public double minAura = 50000;
        @Comment("Maximum aura.")
        public double maxAura = 50000;
        @Comment("Minimal magicule.")
        public double minMagicule = 14500;
        @Comment("Maximum magicule.")
        public double maxMagicule = 19000;
        @Comment("Bonus Size.")
        public double size = 1.5;
        @Comment("Bonus Max Health.")
        public double maxHealth = 90;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = 300.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = 2;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = 0.8F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = -0;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = -0;

        public Mecha() {

        }

        @Generated
        public double getEpRequirement() {
            return this.epRequirement;
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

    public static class Gundam extends RaceConfig.Default {
        @Comment("EP requirement to evolve into a Gundam.")
        public double epRequirement = 400000;
        @Comment("Minimal aura.")
        public double minAura = 200000;
        @Comment("Maximum aura.")
        public double maxAura = 200000;
        @Comment("Minimal magicule.")
        public double minMagicule = 900000;
        @Comment("Maximum magicule.")
        public double maxMagicule = 900000;
        @Comment("Bonus Size.")
        public double size = 4;
        @Comment("Bonus Max Health.")
        public double maxHealth = 490;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = 2990.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = 3;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = 0.95F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = -0;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = -0;

        public Gundam() {

        }

        @Generated
        public double getEpRequirement() {
            return this.epRequirement;
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

    public static class Warframe extends RaceConfig.Default {
        @Comment("EP requirement to evolve into a Warframe.")
        public double epRequirement = 400000;
        @Comment("Minimal aura.")
        public double minAura = 200000;
        @Comment("Maximum aura.")
        public double maxAura = 200000;
        @Comment("Minimal magicule.")
        public double minMagicule = 900000;
        @Comment("Maximum magicule.")
        public double maxMagicule = 900000;
        @Comment("Bonus Size.")
        public double size = 0;
        @Comment("Bonus Max Health.")
        public double maxHealth = 390;
        @Comment("Bonus Max Spiritual Health.")
        public double maxSpiritualHealth = 2990.0F;
        @Comment("Bonus Attack Damage.")
        public double attack = 3;
        @Comment("Bonus Attack Speed.")
        public double attackSpeed = 0.1;
        @Comment("Bonus Knockback Resistance.")
        public double knockbackResistance = 0.95F;
        @Comment("Bonus Movement Speed.")
        public double movementSpeed = 0.1;
        @Comment("Bonus Swimming Speed Multiplier.")
        public double swimSpeed = 0.1;

        public Warframe() {

        }

        @Generated
        public double getEpRequirement() {
            return this.epRequirement;
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
