package com.training.animation

import spock.lang.Specification

class AnimatorTest extends Specification {

    def "should create animation depending on FTP"() {
        expect:
        animation == Animator.createAnimationIn(ftp).render()

        where:
        ftp | animation
        10  | "The Hero punches the Orc in the face"
        25  | "The Hero punches the Orc in the face and the Nazgûl flies in the sky"
        30  | "The Hero punches the Orc in the face and the Nazgûl flies in the sky"
        40  | "The Hero punches the Orc in the face and thousands of warriors are fighting around"
        60  | "The Hero punches the Orc in the face and thousands of warriors are fighting around and the Nazgûl flies in the sky"
        80  | "The Hero punches the Orc in the face and thousands of warriors are fighting around and the Nazgûl flies in the sky"
    }
}
