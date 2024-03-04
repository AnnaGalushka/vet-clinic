package com.magicvet.model;

import java.util.Objects;

public abstract class Pet {

    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    private HealthState healthState;

    public Pet() {

    }

    public Pet(String type, String sex, String age, String name, String ownerName, HealthState healthState) {
        this.type = type;
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.ownerName = ownerName;
        this.healthState = healthState;
    }


    public enum HealthState {
        EMERGENCY(1),
        HOSPITALIZATION(2),
        HOME_TREATMENT(3),
        CONSULTATION(4),
        HEALTHY(5),
        UNKNOWN(0);

        private final int value;

        HealthState(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return "Pet {" +
                "health state = " + healthState +
                ", type = " + type +
                ", sex = " + sex +
                ", age = " + age +
                ", name = " + name +
                ", ownerName = " + ownerName +
                "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pet pet = (Pet) object;
        return Objects.equals(type, pet.type)
                && Objects.equals(sex, pet.sex)
                && Objects.equals(age, pet.age)
                && Objects.equals(name, pet.name)
                && Objects.equals(ownerName, pet.ownerName)
                && healthState == pet.healthState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName, healthState);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }
}
