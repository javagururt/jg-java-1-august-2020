package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_19;

class DogDemo {

    public static void main(String[] args) {

        Dog newDog = new Dog("Gav", 7);
        String dogName = newDog.getName();
        int dogAge = newDog.getAge();

        newDog.voice();

    }

}
