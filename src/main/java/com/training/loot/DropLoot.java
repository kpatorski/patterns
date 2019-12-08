package com.training.loot;

import com.training.hero.Hero;

import java.util.Optional;

class DropLoot {
    private final LootDroppingPolicy lootDroppingPolicy;

    DropLoot(LootDroppingPolicy lootDroppingPolicy) {
        this.lootDroppingPolicy = lootDroppingPolicy;
    }

    Optional<Loot> forHero(Hero hero) {
        return lootDroppingPolicy.shouldBeDropped() ? Optional.of(new Loot()) : Optional.empty();
    }
}
