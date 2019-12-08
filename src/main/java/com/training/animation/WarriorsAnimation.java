package com.training.animation;

class WarriorsAnimation extends ExtendedAnimation {
    WarriorsAnimation(Animation animation) {
        super(animation);
    }

    @Override
    public String render() {
        return super.render() + " and thousands of warriors are fighting around";
    }
}
