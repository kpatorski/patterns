package com.training.questbox;

import com.training.questbox.equipment.Armor;
import com.training.questbox.equipment.Helmet;
import com.training.questbox.equipment.Legs;

public interface LootGenerator {
    Helmet helmet();
    Armor armor();
    Legs legs();
}
