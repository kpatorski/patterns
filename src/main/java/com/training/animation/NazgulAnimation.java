package com.training.animation;

class NazgulAnimation extends ExtendedAnimation {

    NazgulAnimation(Animation animation) {
        super(animation);
    }

    @Override
    public String render() {
        return super.render() + " and the Nazgûl flies in the sky";
    }
}
