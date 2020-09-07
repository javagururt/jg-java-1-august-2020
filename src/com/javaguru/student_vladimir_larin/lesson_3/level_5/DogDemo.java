package com.javaguru.student_vladimir_larin.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Druzhok", 10, "White");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Black");
        dog.voice();
    }
}