package com.training.game;

class Game {
    private final LoadBitmaps loadBitmaps;
    private final LoadSounds loadSounds;
    private final LoadMap loadMap;
    private final LoadHero loadHero;
    private final GenerateNpc generateNpc;
    private final GenerateMobs generateMobs;

    Game(LoadBitmaps loadBitmaps, LoadSounds loadSounds, LoadMap loadMap, LoadHero loadHero, GenerateNpc generateNpc,
         GenerateMobs generateMobs) {
        this.loadBitmaps = loadBitmaps;
        this.loadSounds = loadSounds;
        this.loadMap = loadMap;
        this.loadHero = loadHero;
        this.generateNpc = generateNpc;
        this.generateMobs = generateMobs;
    }

    void start() {
        loadBitmaps.load();
        loadSounds.load();
        loadMap.load();
        loadHero.load();
        generateMobs.generate();
        generateNpc.generate();
    }
}
