package com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet {

    private String size;


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
