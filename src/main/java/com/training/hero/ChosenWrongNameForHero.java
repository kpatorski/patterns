package com.training.hero;

class ChosenWrongNameForHero extends RuntimeException {
    ChosenWrongNameForHero(String heroName) {
        super(resolveMessage(heroName));
    }

    private static String resolveMessage(String heroName) {
        return String.format("[%s] is not valid name for Hero", heroName);
    }
}
