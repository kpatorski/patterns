package com.training.hero;

import java.util.Optional;

interface Hero {
    String name();

    Race race();

    Profession profession();

    Optional<Weapon> weapon();
}
