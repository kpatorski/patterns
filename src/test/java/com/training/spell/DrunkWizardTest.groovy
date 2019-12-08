package com.training.spell

import spock.lang.Specification

class DrunkWizardTest extends Specification {

    def "Drunk Wizard should spam random spells until target is dead"() {
        given:
        def target = new Target()
        def wizard = new DrunkWizard()

        when:
        wizard.destroyTarget(target)

        then:
        target.isDead()
    }
}
