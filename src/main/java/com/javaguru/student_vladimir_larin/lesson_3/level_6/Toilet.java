package com.javaguru.student_vladimir_larin.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

// Task_24
@CodeReview(approved = true)
class Toilet {
    public String gender;
    public String property;
    public int capacity;

    public Toilet(String gender, String property, int capacity) {
        this.gender = gender;
        this.property = property;
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Information: this " + gender + " toilet is " + property + " and can accommodate " + capacity + " persons.");
    }
}
