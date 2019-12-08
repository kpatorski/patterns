package com.training.spell;

interface Spell<T extends SpellEffect> {
    default T cast() {
        System.out.println(words());
        return createEffect();
    }

    String words();

    T createEffect();
}
