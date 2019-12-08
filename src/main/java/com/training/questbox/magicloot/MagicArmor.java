package com.training.questbox.magicloot;

import com.training.questbox.equipment.Armor;

import java.util.Objects;

public class MagicArmor implements Armor {
    @Override
    public int defend() {
        return 500;
    }

    @Override
    public int weight() {
        return 120;
    }

    @Override
    public String name() {
        return "Magic Armor";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicArmor item = (MagicArmor) o;
        return Objects.equals(name(), item.name());
    }

    @Override
    public String toString() {
        return name();
    }
}
