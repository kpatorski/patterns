package com.training.meleeatack

import spock.lang.Specification

class DragonTest extends Specification {

    def "should decrease legacy dragon's hp on takeDamage"() {
        given:
        def legacyDragon = new com.training.meleeatack.legacy.Dragon()
        def dragon = new Dragon(legacyDragon)

        when:
        dragon.takeDamage(200)

        then:
        legacyDragon.hp() == 800
    }

    def "should be dead if have no hp"() {
        given:
        def legacyDragon = new com.training.meleeatack.legacy.Dragon()
        def dragon = new Dragon(legacyDragon)

        when:
        dragon.takeDamage(2000)

        then:
        dragon.isDead()
    }
}
