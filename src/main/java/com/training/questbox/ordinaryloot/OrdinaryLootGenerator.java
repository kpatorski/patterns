package com.training.questbox.ordinaryloot;

import com.training.questbox.LootGenerator;
import com.training.questbox.equipment.Armor;
import com.training.questbox.equipment.Helmet;
import com.training.questbox.equipment.Legs;

public class OrdinaryLootGenerator implements LootGenerator {
    @Override
    public Helmet helmet() {
        return new OrdinaryHelmet();
    }

    @Override
    public Armor armor() {
        return new OrdinaryArmor();
    }

    @Override
    public Legs legs() {
        return new OrdinaryLegs();
    }
}
