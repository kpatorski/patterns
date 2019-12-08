package com.training.animation;

class Animator {
    static Animation createAnimationIn(int ftp) {
        if (ftp >= 60) {
            return new NazgulAnimation(new WarriorsAnimation(new PunchingAnimation()));
        } else if (ftp >= 40) {
            return new WarriorsAnimation(new PunchingAnimation());
        } else if (ftp >= 25) {
            return new NazgulAnimation(new PunchingAnimation());
        }
        return new PunchingAnimation();
    }
}
