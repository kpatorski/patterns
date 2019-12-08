package com.training.hero;

public enum Race {
    MAN, ELF, ORC, DWARF, HOBBIT;

    public static boolean isMagical(Race race) {
        return ELF.equals(race) || MAN.equals(race);
    }
}
