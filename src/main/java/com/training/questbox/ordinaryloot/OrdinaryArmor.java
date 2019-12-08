package com.training.questbox.ordinaryloot;

import com.training.questbox.equipment.Armor;

import java.util.Objects;

public class OrdinaryArmor implements Armor {
    @Override
    public int defend() {
        return 250;
    }

    @Override
    public int weight() {
        return 120;
    }

    @Override
    public String name() {
        return "Ordinary Armor";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdinaryArmor item = (OrdinaryArmor) o;
        return Objects.equals(name(), item.name());
    }

    @Override
    public String toString() {
        return name();
    }
}
