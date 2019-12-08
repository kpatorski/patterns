package com.training.hero;

class HeroMustHaveWeapon extends RuntimeException {
    HeroMustHaveWeapon(Race race) {
        super(resolveMessage(race));
    }

    private static String resolveMessage(Race race) {
        return String.format("[%s] hero must have a weapon", race);
    }
}
