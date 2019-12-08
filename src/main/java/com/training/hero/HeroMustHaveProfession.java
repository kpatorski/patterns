package com.training.hero;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class HeroMustHaveProfession extends RuntimeException {
    HeroMustHaveProfession() {
        super(resolveMessage());
    }

    private static String resolveMessage() {
        return String.format("Hero must have one of professions: [%s]", Stream.of(Profession.values())
                        .map(Profession::name)
                        .collect(Collectors.joining(", ")));
    }
}
