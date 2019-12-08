package com.training.blacksmith;

class MithrilShirt extends Item {
    private int maxDurability = 1000;

    MithrilShirt(int durability) {
        super(durability);
    }

    @Override
    public int maxDurability() {
        return maxDurability;
    }

    @Override
    public Resources repair() {
        reduceMaxDurability();
        Resources resources = calculateUsedResources();
        setDurability(maxDurability);
        return resources;
    }

    private void reduceMaxDurability() {
        maxDurability *= 0.1;
    }

    private Resources calculateUsedResources() {
        int units = calculateRepairedUnits();
        return Resources.ofMithril(units);
    }

    private int calculateRepairedUnits() {
        return maxDurability - durability();
    }
}
