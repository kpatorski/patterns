package com.training.animation;

import java.util.Objects;

abstract class ExtendedAnimation implements Animation {
    private final Animation animation;

    ExtendedAnimation(Animation animation) {
        this.animation = animation;
    }

    @Override
    public String render() {
        return animation.render();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtendedAnimation that = (ExtendedAnimation) o;
        return Objects.equals(animation.render(), that.animation.render());
    }

    @Override
    public int hashCode() {
        return Objects.hash(animation.render());
    }
}
