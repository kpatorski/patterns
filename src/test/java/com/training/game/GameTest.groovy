package com.training.game

import spock.lang.Specification

class GameTest extends Specification {

    def "when game should start"() {
        given: "game processes"
        def loadBitmaps = Mock(LoadBitmaps)
        def loadSounds = Mock(LoadSounds)
        def loadMap = Mock(LoadMap)
        def loadHero = Mock(LoadHero)
        def generateNpc = Mock(GenerateNpc)
        def generateMobs = Mock(GenerateMobs)

        when:
        new Game(loadBitmaps, loadSounds, loadMap, loadHero, generateNpc, generateMobs).start()

        then: "bitmaps should be loaded"
        1 * loadBitmaps.load()

        and: "sounds should be loaded"
        1 * loadSounds.load()

        and: "map should be loaded"
        1 * loadMap.load()

        and: "hero should be loaded"
        1 * loadHero.load()

        and: "npc should be generated"
        1 * generateNpc.generate()

        and: "mobs should be generated"
        1 * generateMobs.generate()
    }
}
