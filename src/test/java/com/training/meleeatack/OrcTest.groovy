package com.training.meleeatack

import spock.lang.Specification

class OrcTest extends Specification {

    def "Orc Warrior should be able to kill all mobs"() {
        given: "enemies"
        def dragon = null //TODO: replace value with your implementation
        def enemies = [new Ghoul(), new Vampire(), dragon, new Skeleton()] as List<Mob>

        and: "brave warrior"
        def warrior = new Orc()

        when:
        enemies.forEach({ enemy -> warrior.kill(enemy) })

        then:
        enemies.forEach({ enemy -> assert enemy.isDead() })
    }
}
