package com.magicvet.model;

public class Cat extends Pet {

    public Cat() { }

    @Override
    public String toString() {
        return "Cat { " +
                "type = " + getType() +
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
