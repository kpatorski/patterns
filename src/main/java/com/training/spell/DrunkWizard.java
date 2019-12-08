package com.training.spell;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DrunkWizard {
    private SpellBook spellBook = new SpellBook(); //found in trash

    void destroyTarget(Target target) {
        //TODO: Read the spellBook, cast the Spell and apply SpellEffects on Target, (make sure that every Spell was spoken)
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
