package com.javaguru.student_vladimir_larin.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

// Task_24
@CodeReview(approved = true)
class CupDemo {
    public static void main(String[] args) {
        Cup cup = new Cup(true, "metal", "red");
        cup.status();
        System.out.println("Drink it.");
        cup.drink();
        cup.status();
    }
}


