package com.training.spell;

public class FireBall implements Spell<DestructiveEffect> {

    @Override
    public String words() {
        return "Kaboom";
    }

    @Override
    public DestructiveEffect createEffect() {
        return () -> 15;
    }
}
