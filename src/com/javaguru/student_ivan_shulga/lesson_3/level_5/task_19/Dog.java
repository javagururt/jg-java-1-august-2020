package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_19;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {

    private String name;
    private int age;

    public Dog(String name, int newAge) {
        this.name = name;
        age = newAge;
    }

    public void voice() {
        System.out.println("Dog name is " + name + "\nDog age is " + age);
    }

}
