package com.training.hero;

import java.util.Optional;

class OrdinaryHero implements Hero {
    private final String name;
    private final Race race;
    private final Profession profession;
    private final Weapon weapon;

    private OrdinaryHero(Builder builder) {
        this.name = builder.name;
        this.race = builder.race;
        this.profession = builder.profession;
        this.weapon = builder.weapon;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Race race() {
        return race;
    }

    @Override
    public Profession profession() {
        return profession;
    }

    @Override
    public Optional<Weapon> weapon() {
        return Optional.ofNullable(weapon);
    }

    static class Builder {
        private static final int MIN_NAME_LENGTH = 4;

        private String name;
        private Race race;
        private Profession profession;
        private Weapon weapon;

        Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder race(Race race) {
            this.race = race;
            return this;
        }

        public Builder profession(Profession profession) {
            this.profession = profession;
            return this;
        }

        public Builder weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            validate();
            return new OrdinaryHero(this);
        }

        private void validate() {
            if (name == null || isNameToShort(name)) {
                throw new ChosenWrongNameForHero(name);
            }

            if (race == null) {
                throw new HeroMustBeOneOfRaces();
            }

            if (profession == null) {
                throw new HeroMustHaveProfession();
            }

            if (weapon == null && !isHobbitThief(race, profession)) {
                throw new HeroMustHaveWeapon(race);
            }

            if (Profession.WIZARD.equals(profession) && isNonMagicalRace(race)) {
                throw new NonMagicalRaceMustNotBeWizard(race);
            }

            if (Weapon.TWO_HANDED_SWORD.equals(weapon) && isToWeakForTwoHandedSword(race)) {
                throw new WeaponIsTooHeavyForHero(weapon, race);
            }
        }

        private boolean isNameToShort(String name) {
            return name.length() < MIN_NAME_LENGTH;
        }

        private boolean isHobbitThief(Race race, Profession profession) {
            return Race.HOBBIT.equals(race) && Profession.THIEF.equals(profession);
        }

        private static boolean isNonMagicalRace(Race race) {
            return !Race.isMagical(race);
        }

        private boolean isToWeakForTwoHandedSword(Race race) {
            return Race.ELF.equals(race) || Race.HOBBIT.equals(race);
        }
    }
}
