package com.training.hero;

class WeaponIsTooHeavyForHero extends RuntimeException {
    WeaponIsTooHeavyForHero(Weapon weapon, Race race) {
        super(resolveMessage(weapon, race));
    }

    private static String resolveMessage(Weapon weapon, Race race) {
        return String.format("Weapon [%s] is to heavy for [%s]", weapon, race);
    }
}
