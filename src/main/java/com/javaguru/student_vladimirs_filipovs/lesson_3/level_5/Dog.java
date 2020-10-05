package com.javaguru.student_vladimirs_filipovs.lesson_3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    private String name;
    private int age;
    private String colour;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void changeColour(String newColour) {
        this.colour = newColour;
    }

    public void happyBirthday() {
        age += 1;
    }

    public void newColour() {
        colour = "White";
    }

    public void voice() {
        System.out.println("Dog's name is " + name + ", " + age + " years old, colour is " + colour);
        System.out.println("Dog's name is " + name + ", " + age + " years old, colour is " + colour);
        System.out.println("Dog's name is " + name + ", " + age + " years old, colour is " + colour);
    }
}