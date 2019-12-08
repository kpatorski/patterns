package com.training.hero

import spock.lang.Specification

class OrdinaryHeroTest extends Specification {

    def "should not create Hero without name"() {
        given:
        def name = null

        when:
        new OrdinaryHero.Builder()
                .name(name)
                .build()

        then:
        thrown(ChosenWrongNameForHero)
    }

    def "should not create Hero with name shorter than 4 characters"() {
        when:
        new OrdinaryHero.Builder().name(heroName).build()

        then:
        thrown(ChosenWrongNameForHero)

        where:
        heroName | _
        ""       | _
        "a"      | _
        "ab"     | _
        "abc"    | _
    }

    def "should not create Hero without race"() {
        given:
        def race = null

        when:
        new OrdinaryHero.Builder()
                .name("Gandalf")
                .race(race)
                .build()

        then:
        thrown(HeroMustBeOneOfRaces)
    }

    def "should not create Hero without profession"() {
        given:
        def profession = null

        when:
        new OrdinaryHero.Builder()
                .name("Gimli")
                .race(Race.DWARF)
                .profession(profession)
                .build()

        then:
        thrown(HeroMustHaveProfession)
    }

    def "non-magical race should not be Wizard"() {
        given:
        def magicalProfession = Profession.WIZARD

        when:
        new OrdinaryHero.Builder()
                .name("Gandalf")
                .race(nonMagicalRace)
                .profession(magicalProfession)
                .build()

        then:
        thrown(NonMagicalRaceMustNotBeWizard)

        where:
        nonMagicalRace | _
        Race.DWARF     | _
        Race.HOBBIT    | _
        Race.ORC       | _
    }

    def "Elf and Hobbit should not carry Two-handed sword"() {
        given:
        def weapon = Weapon.TWO_HANDED_SWORD
        def profession = Profession.WARRIOR

        when:
        new OrdinaryHero.Builder()
                .name("Gandalf")
                .race(race)
                .profession(profession)
                .weapon(weapon)
                .build()

        then:
        thrown(WeaponIsTooHeavyForHero)

        where:
        race        | _
        Race.HOBBIT | _
        Race.ELF    | _
    }

    def "Hero should have no weapon by default"() {
        given:
        def name = "Frodo"
        def race = Race.HOBBIT
        def profession = Profession.THIEF

        when:
        def hero = new OrdinaryHero.Builder()
                .name(name)
                .race(race)
                .profession(profession)
                .build()

        then:
        !hero.weapon().isPresent()
    }

    def "should create armed Hero"() {
        when:
        def hero = new OrdinaryHero.Builder()
                .name(name)
                .race(race)
                .profession(profession)
                .weapon(weapon)
                .build()

        then:
        hero.name() == name
        hero.race() == race
        hero.profession() == profession
        hero.weapon() == Optional.of(weapon)

        where:
        name        | race        | profession         | weapon
        "Galadriel" | Race.ELF    | Profession.WIZARD  | Weapon.WAND
        "Orgauth"   | Race.ORC    | Profession.WARRIOR | Weapon.AXE
        "Legolas"   | Race.ELF    | Profession.WARRIOR | Weapon.BOW
        "Frodo"     | Race.HOBBIT | Profession.THIEF   | Weapon.SWORD
    }

    def "should create unarmed Hero"() {
        when:
        def hero = new OrdinaryHero.Builder()
                .name(name)
                .race(race)
                .profession(profession)
                .build()

        then:
        hero.name() == name
        hero.race() == race
        hero.profession() == profession
        !hero.weapon()

        where:
        name       | race        | profession
        "Merry"    | Race.HOBBIT | Profession.THIEF
        "Radagast" | Race.MAN    | Profession.DRUID
    }

}
