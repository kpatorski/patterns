package com.training.spell;

public class HeavyMagicMissile implements Spell<DestructiveEffect> {

    @Override
    public String words() {
        return "Fus ro dah";
    }

    @Override
    public DestructiveEffect createEffect() {
        return () -> 30;
    }
}
