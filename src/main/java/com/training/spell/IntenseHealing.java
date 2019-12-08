package com.training.spell;

public class IntenseHealing implements Spell<HealingEffect> {

    @Override
    public String words() {
        return "Szybkość czasu";
    }

    @Override
    public HealingEffect createEffect() {
        return () -> 40;
    }
}
