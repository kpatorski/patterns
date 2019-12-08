package com.training.meleeatack;

import java.util.concurrent.ThreadLocalRandom;

class Orc implements Warrior {
    private static final int WEAPON_ATTACK_STAT = 25;

    @Override
    public void kill(Mob mob) {
        while (!mob.isDead()) {
            mob.takeDamage(calculateAttack());
        }
    }

    private int calculateAttack() {
        return WEAPON_ATTACK_STAT * ThreadLocalRandom.current().nextInt(1, 5);
    }
}
