package com.training.spell;

interface Spell<T extends SpellEffect> {
    //T cast(); //TODO: uncomment and adjust method

    String words(); // every spell should be spoken
}
