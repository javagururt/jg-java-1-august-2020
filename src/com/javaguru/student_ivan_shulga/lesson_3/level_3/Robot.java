package com.javaguru.student_ivan_shulga.lesson_3.level_3;

class Robot {

    public void sayHello() {

        System.out.println("Hello!");
    }

    private String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }

}
