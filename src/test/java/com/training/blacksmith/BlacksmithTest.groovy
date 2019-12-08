package com.training.blacksmith

import spock.lang.Specification

class BlacksmithTest extends Specification {

    def "should repair all Hero's stuff"() {
        given: "items"
        def bow = new Bow(220)
        def arrows = new Arrows(25)
        def quiver = new Quiver(5, arrows)
        def sword = new OneHandedSword(270)
        def mithrilShirt = new MithrilShirt(890)
        def backpack = new Backpack(20)
                .putItem(bow)
                .putItem(quiver)
                .putItem(sword)
                .putItem(mithrilShirt)

        when:
        def repairCost = new Blacksmith().repairEquipment(backpack)

        then:
        repairCost.gold() == 14570
        backpack.durability() == backpack.maxDurability()
        bow.durability() == bow.maxDurability()
        arrows.durability() == arrows.maxDurability()
        quiver.durability() == quiver.maxDurability()
        sword.durability() == sword.maxDurability()
        mithrilShirt.durability() == mithrilShirt.maxDurability()
    }
}
