package com.javaguru.student_igors_jurkovs.lesson_3.level_5;

class Dog {
    private String name;
    private int age;
    private String color;

    Dog (String dogName, int age, String color) {
        this.name = dogName;
        this.age = age;
        this.color = color;
    }
    void happyBirthDay () {
        this.age += 1;
    }
    void changeColor () {
        color = "Black";
    }

    void voice () {
        System.out.println(name + ", " + age + ", " + color);
        System.out.println(name + ", " + age + ", " + color);
        System.out.println(name + ", " + age + ", " + color);

    }
}

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 2, "White");
        dog.voice();
        dog.happyBirthDay();
        dog.voice();
        dog.changeColor();
        dog.voice();
    }
}