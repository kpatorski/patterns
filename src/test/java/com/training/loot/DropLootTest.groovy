package com.training.loot

import com.training.hero.Hero
import spock.lang.Specification

class DropLootTest extends Specification {

    def "loot should be dropped depending on LootDroppingPolicy"() {
        given:
        def hero = Mock(Hero)

        when:
        def loot = Optional.empty() //TODO: execute logic for dropping loot -> new DropLoot()...

        then:
        loot.isPresent()
    }

    def "loot should not be dropped depending on LootDroppingPolicy"() {
        given:
        def hero = Mock(Hero)

        when:
        def loot = Optional.empty() //TODO: execute logic for dropping loot -> new DropLoot()...

        then:
        !loot.isPresent()
    }
}
