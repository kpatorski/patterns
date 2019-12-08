package com.training.questbox;

import com.training.hero.Hero;
import com.training.hero.Race;
import com.training.questbox.magicloot.MagicLootGenerator;
import com.training.questbox.ordinaryloot.OrdinaryLootGenerator;

class LootGenerationPolicy {
    LootGenerator lootFor(Hero hero) {
        if (hero.level() >= 25 && Race.isMagical(hero.race())) {
            return new MagicLootGenerator();
        }
        return new OrdinaryLootGenerator();
    }
}
