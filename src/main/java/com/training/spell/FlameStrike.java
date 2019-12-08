package com.training.spell;

public class FlameStrike implements Spell<DestructiveEffect> {

    @Override
    public String words() {
        return "Kumitsu";
    }

    @Override
    public DestructiveEffect createEffect() {
        return () -> 40;
    }
}
