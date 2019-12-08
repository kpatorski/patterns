package com.training.hero;

import java.util.Optional;

public interface Hero {
    String name();

    Race race();

    Profession profession();

    Optional<Weapon> weapon();

    default int level(){
        return 1;
    }
}
