package com.magicvet;

import com.magicvet.comparator.DogSizeComparator;
import com.magicvet.comparator.PetAgeComparator;
import com.magicvet.model.Cat;
import com.magicvet.model.Dog;
import com.magicvet.model.Pet;

import java.util.Arrays;

public class SandBox {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.M),
                new Dog(Dog.S),
                new Dog(Dog.XL),
                new Dog(Dog.XL),
                new Dog(Dog.XS),
                new Dog(Dog.S)
        };

        Arrays.sort(dogs, new DogSizeComparator());

        for (Dog dog : dogs) {
            System.out.println(dog.getSize());
        }

        Dog dog1 = new Dog();
        dog1.setAge("5");

        Dog dog2 = new Dog();
        dog2.setAge("3");

        Dog dog3 = new Dog();
        dog3.setAge("2");

        Dog dog4 = new Dog();
        dog4.setAge("4");

        Dog dog5 = new Dog();
        dog5.setAge("1");

        Cat cat1 = new Cat();
        cat1.setAge("7");

        Cat cat2 = new Cat();
        cat2.setAge("2");

        Cat cat3 = new Cat();
        cat3.setAge("1");

        Cat cat4 = new Cat();
        cat4.setAge("5");

        Cat cat5 = new Cat();
        cat5.setAge("6");

        Pet[] pets = {dog1, dog2, dog3, dog4, dog5, cat1, cat2, cat3, cat4, cat5};

        Arrays.sort(pets, new PetAgeComparator());

        for (Pet pet : pets) {
            System.out.println(pet.getAge());
        }
    }

}
