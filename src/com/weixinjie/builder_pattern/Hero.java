package com.weixinjie.builder_pattern;

public class Hero {
    private Sex sex;
    private Profession profession;
    private String name;

    public Hero(Builder builder) {
        this.sex = builder.sex;
        this.profession = builder.profession;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "sex=" + sex +
                ", profession=" + profession +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private Sex sex;
        private Profession profession;
        private String name;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withProfession(Profession profession) {
            this.profession = profession;
            return this;
        }

        public Builder withSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
