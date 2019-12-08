package com.training.meleeatack.legacy;

/*Its legacy code and must not be changed!*/
public class Dragon {
    private int hp;
    public Dragon() {
        this.hp = 1000;
    }

    public int hp() {
        return hp;
    }

    public Dragon setHp(int hp) {
        this.hp = hp;
        return this;
    }
}
