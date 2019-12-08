package com.training.blacksmith;

class Resources {
    private int wood;
    private int iron;
    private int mithril;
    private int cloth;

    private Resources(){
    }

    static Resources empty() {
        return new Resources();
    }

    static Resources ofCloth(int units) {
        return new Resources().addCloth(units);
    }

    Resources addCloth(int units) {
        this.cloth += units;
        return this;
    }

    static Resources ofWood(int units) {
        return new Resources().addWood(units);
    }

    Resources addWood(int units) {
        this.wood += units;
        return this;
    }

    static Resources ofIron(int units) {
        return new Resources().addIron(units);
    }

    Resources addIron(int units) {
        this.iron += units;
        return this;
    }

    static Resources ofMithril(int units) {
        return new Resources().addMithril(units);
    }

    Resources addMithril(int units) {
        this.mithril += units;
        return this;
    }

    Resources add(Resources usedResource) {
        addWood(usedResource.wood);
        addIron(usedResource.iron);
        addMithril(usedResource.mithril);
        addCloth(usedResource.cloth);
        return this;
    }

    int wood() {
        return wood;
    }

    int iron() {
        return iron;
    }

    int mithril() {
        return mithril;
    }

    int cloth() {
        return cloth;
    }
}
