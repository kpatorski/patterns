package com.training.blacksmith;

abstract class Item {
    private int durability;

    Item(int durability) {
        this.durability = Math.min(durability, maxDurability());
    }

    int durability() {
        return durability;
    }

    Item setDurability(int durability) {
        this.durability = durability;
        return this;
    }

    abstract int maxDurability();

    abstract Resources repair();
}
