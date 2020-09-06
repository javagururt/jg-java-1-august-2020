package com.javaguru.student_ivan_shulga.lesson_3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog20 {

    private String name;
    private int age;

    public Dog20(String name, int newAge) {
        this.name = name;
        age = newAge;
    }

    public void happyBirthday() {
        age +=1;
    }

    public void voice() {
        System.out.println("Dog20 name is " + name + "\nDog20 age is " + age);
    }

}

class DogDemo20 {

    public static void main(String[] args) {

        Dog20 newDog20 = new Dog20("Gav", 9);

        newDog20.voice();
        newDog20.happyBirthday();

        newDog20.voice();
        newDog20.happyBirthday();

        newDog20.voice();
        newDog20.happyBirthday();

    }

}