package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_18;

class Dog {

    private String name;

    public Dog (String dogName) {
        this.name = dogName;
    }

    public void voice() {
        System.out.println(this.name + ", " + this.name + ", " + this.name);
    }

}
