package com.training.loot;

import java.util.concurrent.ThreadLocalRandom;

class LootDroppingPolicy {
    boolean shouldBeDropped() {
        return ThreadLocalRandom.current().nextInt(1, 100) % 10 != 0;
    }
}
