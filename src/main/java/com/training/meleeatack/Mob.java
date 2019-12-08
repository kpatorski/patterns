package com.training.meleeatack;

abstract class Mob {
    private int hp;

    Mob(int hp) {
        this.hp = hp;
    }

    String name() {
        return getClass().getSimpleName();
    }

    boolean isDead() {
        return hp <= 0;
    }

    void takeDamage(int damage) {
        logDamages(damage);
        hp = Math.max(0, hp - damage);
    }

    private void logDamages(int damage) {
        System.out.println(String.format("%s received %s points of damage", name(), damage));
        if (isDead()) {
            System.out.println(String.format("%s is dead", name()));
        }
    }
}
