package com.training.blacksmith;

import java.util.ArrayList;
import java.util.Collection;

class Backpack extends Item {
    private Collection<Item> items = new ArrayList<>();

    Backpack(int durability) {
        super(durability);
    }

    Backpack putItem(Item item) {
        this.items.add(item);
        return this;
    }

    @Override
    int maxDurability() {
        return 50;
    }

    @Override
    Resources repair() {
        Resources resources = usedResourcesOnBackpack();
        setDurability(maxDurability());

        items.stream()
                .map(Item::repair)
                .forEach(resources::add);
        return resources;
    }

    private Resources usedResourcesOnBackpack() {
        int units = calculateRepairedUnits();
        return Resources.ofCloth(units);
    }

    private int calculateRepairedUnits() {
        return maxDurability() - durability();
    }
}
