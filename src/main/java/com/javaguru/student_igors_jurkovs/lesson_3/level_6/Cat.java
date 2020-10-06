package com.javaguru.student_igors_jurkovs.lesson_3.level_6;

/*
Task_24
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Cat {

    String name;
    String breed;
    int age;
    int number;

    Cat (String name, String breed, int age, int number) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.number = number;

    }
    void printCatInformation () {
        System.out.println(number + " " + name + ", " + age + " years old, " + breed);
    }
    void reserve () {
        this.name = name + " Reserved";
    }
}

class Dog {

    String name;
    String breed;
    int age;
    int number;

    Dog (String name, String breed, int age, int number) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.number = number;

    }
    void printCatInformation () {
        System.out.println(number + " " + name + ", " + age + " years old, " + breed);
    }
    void reserve () {
        this.name = name + " Reserved";
    }
}
class AnimalShelterDemo {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Simba", "birman", 2, 1);
        Cat cat2 = new Cat("Fifa", "mongrel", 5, 2);
        Cat cat3 = new Cat("Mars", "persian", 1,3 );

        Dog dog1 = new Dog("Rex", "shepherd", 7, 1);
        Dog dog2 = new Dog("Lucky", "papillon", 3,2);
        Dog dog3 = new Dog("Suzy", "akita", 1, 3);

        System.out.println("Current information about animal shelter: ");
        System.out.println("These cats waiting for new owner:");
        System.out.println();

        cat1.printCatInformation();
        cat2.printCatInformation();
        cat3.printCatInformation();

        System.out.println();

        System.out.println("These dogs waiting for new owner:");

        System.out.println();

        dog1.printCatInformation();
        dog2.printCatInformation();
        dog3.printCatInformation();

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Whom would you like to take?");
        System.out.println("1. Dog 2. Cat");
        int catDogChoice = sc.nextInt();

        if (catDogChoice == 1) {
            System.out.println("What dog would you like to take?");
            int userChoice2 = sc.nextInt();

            if (userChoice2 == 1) {
                dog1.reserve();
                dog1.printCatInformation();
            }
            if (userChoice2 == 2) {
                dog2.reserve();
                dog2.printCatInformation();
            }
            if (userChoice2 == 3) {
                dog3.reserve();
                dog3.printCatInformation();
            }
        }
        if (catDogChoice == 2) {
            System.out.println("What cat would you like to take?");
            int userChoice = sc.nextInt();

            if (userChoice == 1) {
                cat1.reserve();
                cat1.printCatInformation();
            }
            if (userChoice == 2) {
                cat2.reserve();
                cat2.printCatInformation();
            }
            if (userChoice == 3) {
                cat3.reserve();
                cat3.printCatInformation();
            }
        }
        System.out.println("Thank you for helping to our fluffy friends to find a home!");
    }
}
