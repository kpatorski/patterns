package com.training.hero;

class NonMagicalRaceMustNotBeWizard extends RuntimeException {
    NonMagicalRaceMustNotBeWizard(Race nonMagicalRace) {
        super(resolveMessage(nonMagicalRace));
    }

    private static String resolveMessage(Race race) {
        return String.format("Non-magical race [%s] must not be Wizard", race);
    }
}
