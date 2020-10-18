package com.javaguru.student_ivan_shulga.lesson_9.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Animal {

    abstract void voice();

}

class Cat extends Animal {

    void voice() {
        System.out.println("Meow");
    }

}

class Dog extends Animal {

    void voice() {
        System.out.println("Woof");
    }

}

class Cow extends Animal {

    void voice() {
        System.out.println("Mooo");
    }

}

class AnimalDemo {

    public static void main(String[] args) {

        Cat newCat = new Cat();
        Dog newDog = new Dog();
        Cow newCow = new Cow();

        newCat.voice();
        newDog.voice();
        newCow.voice();

    }

}

/*
Придумайте и создайте абстрактный класс и его потомков.
 */
