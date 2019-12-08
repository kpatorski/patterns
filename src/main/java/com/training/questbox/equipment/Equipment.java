package com.training.questbox.equipment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Equipment {
    private Collection<Item> items = new ArrayList<>();

    public Equipment add(Item item) {
        this.items.add(item);
        return this;
    }

    public Collection<Item> items() {
        return Collections.unmodifiableCollection(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(items, equipment.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
