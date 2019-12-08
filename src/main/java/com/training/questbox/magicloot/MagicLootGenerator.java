package com.training.questbox.magicloot;

import com.training.questbox.LootGenerator;
import com.training.questbox.equipment.Armor;
import com.training.questbox.equipment.Helmet;
import com.training.questbox.equipment.Legs;

public class MagicLootGenerator implements LootGenerator {
    @Override
    public Helmet helmet() {
        return new MagicHelmet();
    }

    @Override
    public Armor armor() {
        return new MagicArmor();
    }

    @Override
    public Legs legs() {
        return new MagicLegs();
    }
}
