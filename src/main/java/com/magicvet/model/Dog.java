package com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet {

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";

    private String size;

    public Dog() { }

    public Dog(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Dog {" +
                "type = " + getType() +
                ", sex = " + getSex() +
                ", age = " + getAge() +
                ", name = " + getName() +
                ", ownerName = " + getOwnerName() +
                ", size = " + size +
                "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Dog dog = (Dog) object;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }


    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
}
