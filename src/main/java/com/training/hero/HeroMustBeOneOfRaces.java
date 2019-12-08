package com.training.hero;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class HeroMustBeOneOfRaces extends RuntimeException {
    HeroMustBeOneOfRaces() {
        super(resolveMessage());
    }

    private static String resolveMessage() {
        return String.format("Hero must be one of the [%s]", Stream.of(Race.values())
                        .map(Race::name)
                        .collect(Collectors.joining(", ")));
    }
}
