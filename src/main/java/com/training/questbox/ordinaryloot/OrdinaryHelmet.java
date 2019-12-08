package com.training.questbox.ordinaryloot;

import com.training.questbox.equipment.Helmet;

import java.util.Objects;

public class OrdinaryHelmet implements Helmet {
    @Override
    public int defend() {
        return 40;
    }

    @Override
    public String name() {
        return "Ordinary Helmet";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdinaryHelmet item = (OrdinaryHelmet) o;
        return Objects.equals(name(), item.name());
    }

    @Override
    public String toString() {
        return name();
    }
}
