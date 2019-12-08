package com.training.spell;

class Target {
    private static final int MAX_HP = 300;
    private int hp = 200;

    Target apply(SpellEffect effect) {
        if (effect instanceof DestructiveEffect) {
            return takeDamage((DestructiveEffect) effect);
        }
        return heal((HealingEffect) effect);
    }

    private Target takeDamage(DestructiveEffect effect) {
        hp -= effect.damageTaken();
        return this;
    }

    private Target heal(HealingEffect effect) {
        hp = Math.min(hp + effect.restoredHealth(), MAX_HP);
        return this;
    }

    boolean isDead() {
        return hp < 1;
    }
}
