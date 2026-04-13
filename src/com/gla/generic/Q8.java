package com.gla.generic;

import java.util.List;

public class Q8 {
    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
