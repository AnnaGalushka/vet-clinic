package com.magicvet.model;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String type, String sex, String age, String name, String ownerName, HealthState healthState) {
        super(type, sex, age, name, ownerName, healthState);
    }

}
