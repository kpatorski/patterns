package com.training.hero

import spock.lang.Specification

class FluentHeroTest extends Specification {

    def "builder api should be error prone"() {
        expect:
        FluentHero.newMan("Aragorn")
                .warrior()
                .weapon(Weapon.SWORD)
                .create()

        FluentHero.newMan("Gandalf")
                .wizard()
                .weapon(Weapon.WAND)
                .create()

        FluentHero.newHobbit("Bilbo")
                .thief()
                .create()

        FluentHero.newHobbit("Sam")
                .warrior()
                .weapon(Weapon.SWORD)
                .create()

        FluentHero.newHobbit("Frodo")
                .thief()
                .weapon(Weapon.SWORD)
                .create()
    }
}
