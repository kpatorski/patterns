package com.training.meleeatack;

public class Dragon extends Mob {
    private final com.training.meleeatack.legacy.Dragon legacyDragon;

    Dragon(com.training.meleeatack.legacy.Dragon dragon) {
        super(dragon.hp());
        legacyDragon = dragon;
    }

    @Override
    void takeDamage(int damage) {
        super.takeDamage(damage);
        decreaseLegacyDragonHp(damage);
    }

    private void decreaseLegacyDragonHp(int damage) {
        legacyDragon.setHp(Math.max(0, legacyDragon.hp() - damage));
    }
}
