package com.training.spell;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DrunkWizard {
    private SpellBook spellBook = new SpellBook();

    void destroyTarget(Target target) {
        while (!target.isDead()) {
            SpellEffect spellEffect = spellBook.readPage(randomPage()).cast();
            target.apply(spellEffect);
        }
    }

    private int randomPage() {
        return ThreadLocalRandom.current().nextInt(spellBook.firstPageNumber(), spellBook.lastPageNumber());
    }

    private static class SpellBook {
        private List<Spell> spellsPages = Arrays.asList(
                new FlameStrike(),
                new HeavyMagicMissile(),
                new FireBall(),
                new IntenseHealing());

        private Spell readPage(int number) {
            return spellsPages.get(number);
        }

        private int firstPageNumber() {
            return 0;
        }

        private int lastPageNumber() {
            return spellsPages.size();
        }
    }
}
