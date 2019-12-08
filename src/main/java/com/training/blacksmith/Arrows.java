package com.training.blacksmith;

class Arrows extends Item {
    Arrows(int durability) {
        super(durability);
    }

    @Override
    int maxDurability() {
        return 25;
    }

    @Override
    public Resources repair() {
        Resources resources = calculateUsedResources();
        setDurability(maxDurability());
        return resources;
    }

    private Resources calculateUsedResources() {
        int units = calculateRepairedUnits();
        return Resources.ofWood(units)
                .addIron(units)
                .addCloth(units);
    }

    private int calculateRepairedUnits() {
        return maxDurability() - durability();
    }
}
