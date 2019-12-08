package com.training.questbox

import com.training.hero.Hero
import com.training.hero.Race
import com.training.questbox.magicloot.MagicArmor
import com.training.questbox.magicloot.MagicHelmet
import com.training.questbox.magicloot.MagicLegs
import com.training.questbox.ordinaryloot.OrdinaryArmor
import com.training.questbox.ordinaryloot.OrdinaryHelmet
import com.training.questbox.ordinaryloot.OrdinaryLegs
import spock.lang.Specification

class QuestBoxTest extends Specification {
    def lootingPolicy = new LootGenerationPolicy()

    def "Hero that belongs to magical race and have level higher than 24 should be rewarded with `magic` equipment"() {
        given:
        def hero = Mock(Hero) {
            level() >> 30
            race() >> Race.ELF
        }

        when:
        def equipment = new QuestBox(lootingPolicy).rewardForHero(hero)

        then:
        equipment.items() as List == [new MagicHelmet(), new MagicArmor(), new MagicLegs()]
    }

    def "Hero that belongs to magical race and have level lower than 25 should be rewarded with `ordinary` equipment"() {
        given:
        def hero = Mock(Hero) {
            level() >> 12
            race() >> Race.ELF
        }

        when:
        def equipment = new QuestBox(lootingPolicy).rewardForHero(hero)

        then:
        equipment.items() as List == [new OrdinaryHelmet(), new OrdinaryArmor(), new OrdinaryLegs()]
    }

    def "Hero that belongs to non-magical race and have level higher than 24 should be rewarded with `ordinary` equipment"() {
        given:
        def hero = Mock(Hero) {
            level() >> 80
            race() >> Race.ORC
        }

        when:
        def equipment = new QuestBox(lootingPolicy).rewardForHero(hero)

        then:
        equipment.items() as List == [new OrdinaryHelmet(), new OrdinaryArmor(), new OrdinaryLegs()]
    }

    def "Hero with level lower than 25 should always be rewarded with `ordinary` equipment"() {
        given:
        def hero = Mock(Hero) {
            level() >> 12
            race() >> Race.ELF
        }

        when:
        def equipment = new QuestBox(lootingPolicy).rewardForHero(hero)

        then:
        equipment.items() as List == [new OrdinaryHelmet(), new OrdinaryArmor(), new OrdinaryLegs()]
    }
}
