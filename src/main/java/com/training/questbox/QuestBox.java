package com.training.questbox;

import com.training.hero.Hero;
import com.training.questbox.equipment.Equipment;

class QuestBox {
    private final LootGenerationPolicy lootGenerationPolicy;

    QuestBox(LootGenerationPolicy lootGenerationPolicy) {
        this.lootGenerationPolicy = lootGenerationPolicy;
    }

    Equipment rewardForHero(Hero hero) {
        LootGenerator generator = lootGenerationPolicy.lootFor(hero);
        return new Equipment()
                .add(generator.helmet())
                .add(generator.armor())
                .add(generator.legs());
    }
}
