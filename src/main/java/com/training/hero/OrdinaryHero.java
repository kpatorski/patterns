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
            if (name == null || name.length() < 4) {
                throw new ChosenWrongNameForHero(name);
            }

            if (race == null) {
                throw new HeroMustBeOneOfRaces();
            }

            if (profession == null) {
                throw new HeroMustHaveProfession();
            }

            if (Profession.WIZARD.equals(profession) && (Race.DWARF.equals(race) || Race.ORC.equals(race) || Race.HOBBIT.equals(race))) {
                throw new NonMagicalRaceMustNotBeWizard(race);
            }

            if (Weapon.TWO_HANDED_SWORD.equals(weapon) && (Race.ELF.equals(race) || Race.HOBBIT.equals(race))) {
                throw new WeaponIsTooHeavyForHero(weapon, race);
            }
        }
    }
}
