package com.training.spell;

interface SpellEffect {
    default int usedMana() {
        return 30;
    }
}
