package com.javaguru.student_igors_jurkovs.lesson_9.level_3_junior.task_13;

abstract class Animal {

    private String name;
    private int age;

    Animal(String animalKind, int age) {
        this.name = animalKind;
        this.age = age;
    }
}
