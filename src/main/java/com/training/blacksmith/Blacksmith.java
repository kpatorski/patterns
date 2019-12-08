package com.training.blacksmith;

class Blacksmith {
    private static final int WOOD_GOLD_PER_UNIT = 10;
    private static final int CLOTH_GOLD_PER_UNIT = 18;
    private static final int IRON_GOLD_PER_UNIT = 29;
    private static final int MITHRIL_GOLD_PER_UNIT = 100;

    RepairCost repairEquipment(Item item) {
        return RepairCost.of(item.repair());
    }

    static class RepairCost {
        private int gold;

        private RepairCost() {
        }

        private static RepairCost of(Resources resources) {
            return new RepairCost()
                    .increaseBy(resources.wood() * WOOD_GOLD_PER_UNIT)
                    .increaseBy(resources.cloth() * CLOTH_GOLD_PER_UNIT)
                    .increaseBy(resources.iron() * IRON_GOLD_PER_UNIT)
                    .increaseBy(resources.mithril() * MITHRIL_GOLD_PER_UNIT);
        }

        private RepairCost increaseBy(int gold) {
            this.gold += gold;
            return this;
        }

        int gold() {
            return gold;
        }
    }
}
