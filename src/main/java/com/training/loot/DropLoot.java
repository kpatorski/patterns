package com.training.loot;

import com.training.hero.Hero;

import java.util.Optional;

class DropLoot {

    Optional<Loot> forHero(Hero hero) {
        return Optional.empty(); //TODO: Implement logic for dropping Loot that fully depends on LootDroppingPolicy
    }
}
