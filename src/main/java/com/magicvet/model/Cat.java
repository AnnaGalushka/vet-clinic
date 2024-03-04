package com.magicvet.model;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String type, String sex, String age, String name, String ownerName, HealthState healthState) {
        super(type, sex, age, name, ownerName, healthState);
    }

    @Override
    public String toString() {
        return "{" +
                "health state = " + getHealthState() +
                ", type = " + getType() +
                ", sex = " + getSex() +
                ", age = " + getAge() +
                ", name = " + getName() +
                ", ownerName = " + getOwnerName() +
                "}";
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
