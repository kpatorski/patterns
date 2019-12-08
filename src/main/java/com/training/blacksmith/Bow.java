package com.training.blacksmith;

class Bow extends Item {

    Bow(int durability) {
        super(durability);
    }

    @Override
    int maxDurability() {
        return 220;
    }

    @Override
    public Resources repair() {
        Resources resources = calculateUsedResources();
        setDurability(maxDurability());
        return resources;
    }

    private Resources calculateUsedResources() {
        int units = calculateRepairedUnits();
        return Resources.ofWood(units);
    }

    private int calculateRepairedUnits() {
        return maxDurability() - durability();
    }
}
