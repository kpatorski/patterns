package com.training.blacksmith;

class OneHandedSword extends Item {
    OneHandedSword(int durability) {
        super(durability);
    }

    @Override
    int maxDurability() {
        return 350;
    }

    @Override
    public Resources repair() {
        Resources resources = calculateUsedResources();
        setDurability(maxDurability());
        return resources;
    }

    private Resources calculateUsedResources() {
        int units = calculateRepairedUnits();
        return Resources.ofIron(units);
    }

    private int calculateRepairedUnits() {
        return maxDurability() - durability();
    }
}
