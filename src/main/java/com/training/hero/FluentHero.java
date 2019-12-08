package com.training.hero;

import java.util.Optional;

class FluentHero implements Hero {
    private final String name;
    private final Race race;
    private final Profession profession;
    private final Weapon weapon;

    private FluentHero(HobbitBuilder builder) {
        this.name = builder.name;
        this.race = builder.race;
        this.profession = builder.profession;
        this.weapon = builder.weapon;
    }

    private FluentHero(ManBuilder builder) {
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

    public static DefineManProfession newMan(String name) {
        return new ManBuilder(name);
    }

    public static DefineHobbitProfession newHobbit(String name) {
        return new HobbitBuilder(name);
    }

    private static class ManBuilder implements DefineManProfession, DefineWeapon, Create {
        private final String name;
        private final Race race = Race.MAN;
        private Profession profession;
        private Weapon weapon;

        private ManBuilder(String name) {
            //name validation
            this.name = name;
        }

        @Override
        public DefineWeapon warrior() {
            this.profession = Profession.WARRIOR;
            return this;
        }

        @Override
        public DefineWeapon thief() {
            this.profession = Profession.THIEF;
            return this;
        }

        @Override
        public DefineWeapon wizard() {
            this.profession = Profession.WARRIOR;
            return this;
        }

        @Override
        public Create weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        @Override
        public Hero create() {
            return new FluentHero(this);
        }
    }

    interface DefineManProfession {
        DefineWeapon warrior();

        DefineWeapon thief();

        DefineWeapon wizard();
    }

    interface DefineWeapon {
        Create weapon(Weapon weapon);
    }

    private static class HobbitBuilder implements DefineHobbitProfession, DefineHobbitThief {
        private final String name;
        private final Race race = Race.HOBBIT;
        private Profession profession;
        private Weapon weapon;

        private HobbitBuilder(String name) {
            //name validation
            this.name = name;
        }

        @Override
        public DefineWeapon warrior() {
            this.profession = Profession.WARRIOR;
            return this;
        }

        @Override
        public DefineHobbitThief thief() {
            this.profession = Profession.THIEF;
            return this;
        }

        @Override
        public Create weapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        @Override
        public Hero create() {
            //name validation
            return new FluentHero(this);
        }
    }

    interface DefineHobbitProfession {
        DefineWeapon warrior();

        DefineHobbitThief thief();
    }

    interface DefineHobbitThief extends DefineWeapon, Create{
    }

    interface Create {
        Hero create();
    }
}
