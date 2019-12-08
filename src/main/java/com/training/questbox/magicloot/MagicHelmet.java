package com.training.questbox.magicloot;

import com.training.questbox.equipment.Helmet;

import java.util.Objects;

public class MagicHelmet implements Helmet {
    @Override
    public int defend() {
        return 150;
    }

    @Override
    public String name() {
        return "Magic helmet";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicHelmet item = (MagicHelmet) o;
        return Objects.equals(name(), item.name());
    }

    @Override
    public String toString() {
        return name();
    }
}
