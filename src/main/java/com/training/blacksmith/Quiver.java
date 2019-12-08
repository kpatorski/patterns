package com.training.blacksmith;

class Quiver extends Item {
    private final Arrows arrows;

    Quiver(int durability, Arrows arrows) {
        super(durability);
        this.arrows = arrows;
    }

    @Override
    int maxDurability() {
        return 100;
    }

    @Override
    public Resources repair() {
        Resources resources = usedResources();
        setDurability(maxDurability());
        return resources.add(arrows.repair());
    }

    private Resources usedResources() {
        int units = calculateRepairedUnits();
        return Resources.ofCloth(units);
    }

    private int calculateRepairedUnits() {
        return maxDurability() - durability();
    }
}
