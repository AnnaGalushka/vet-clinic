package com.magicvet;

import com.magicvet.model.Cat;
import com.magicvet.model.Dog;
import com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Comparator;


public class SandBox {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.Size.M),
                new Dog(Dog.Size.S),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XS),
                new Dog(Dog.Size.S)
        };

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().getValue() - o2.getSize().getValue();
            }
        });

        for (Dog dog : dogs) {
            System.out.println(dog.getSize());
        }
        System.out.println("---------------------------------------------------------------------------------");

        Pet[] pets = {
                new Dog("dog", "female", "5", "Molly", "Owner1", Pet.HealthState.CONSULTATION, Dog.Size.S),
                new Dog("dog", "male", "7", "Rex", "Owner2", Pet.HealthState.HEALTHY, Dog.Size.L),
                new Dog("dog", "male","3", "Polly", "Owner3", Pet.HealthState.HOSPITALIZATION, Dog.Size.M),
                new Cat("cat", "male", "4", "Tom", "Owner4", Pet.HealthState.HOME_TREATMENT),
                new Cat("cat", "female", "2", "Nora", "Owner5", Pet.HealthState.HEALTHY),
                new Cat("cat", "male", "1", "Charlie", "Owner6", Pet.HealthState.CONSULTATION)
        };

//        Сортування тварин за віком
        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return Integer.parseInt(o1.getAge()) - Integer.parseInt(o2.getAge());
            }
        });

        for (Pet pet : pets) {
            System.out.println(pet);
        }
        System.out.println("----------------------------------------------------------------------------------");

//        Сортування тварин за станом здоров'я
        Arrays.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getHealthState().getValue() - o2.getHealthState().getValue();
            }
        });

        for (Pet pet : pets) {
            System.out.println(pet);
        }

    }

}
