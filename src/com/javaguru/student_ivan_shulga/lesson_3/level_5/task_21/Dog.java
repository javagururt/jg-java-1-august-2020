package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_21;

class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(String name, int newAge, String color) {
        this.name = name;
        age = newAge;
        this.color = color;
    }

    public void happyBirthday() {
        age +=1;
    }

    public void voice() {
        System.out.println("Dog name is " + name + "\nDog age is " + age + "\nDog age color " + color);
    }

}