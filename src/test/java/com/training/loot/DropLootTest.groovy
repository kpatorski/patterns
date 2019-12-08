package com.training.loot

import com.training.hero.Hero
import spock.lang.Specification

class DropLootTest extends Specification {

    def "loot should be dropped depending on LootDroppingPolicy"() {
        given:
        def hero = Mock(Hero)

        when:
        def policy = Mock(LootDroppingPolicy) {
            shouldBeDropped() >> true
        }
        def loot = new DropLoot(policy).forHero(hero)

        then:
        loot.isPresent()
    }

    def "loot should not be dropped depending on LootDroppingPolicy"() {
        given:
        def hero = Mock(Hero)

        when:
        def policy = Mock(LootDroppingPolicy)
        def loot = new DropLoot(policy).forHero(hero)

        then:
        !loot.isPresent()
    }
}
