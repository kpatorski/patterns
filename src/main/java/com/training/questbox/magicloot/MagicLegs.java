package com.training.questbox.magicloot;

import com.training.questbox.equipment.Legs;

import java.util.Objects;

public class MagicLegs implements Legs {
    @Override
    public int defend() {
        return 220;
    }

    @Override
    public String name() {
        return "Magic Legs";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicLegs item = (MagicLegs) o;
        return Objects.equals(name(), item.name());
    }

    @Override
    public String toString() {
        return name();
    }
}
