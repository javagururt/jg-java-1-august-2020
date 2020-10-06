package com.javaguru.student_vladimir_larin.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

// Task_24
@CodeReview(approved = true)
class ToiletDemo {
    public static void main(String[] args) {
        Toilet toilet = new Toilet("men", "public", 30);
        toilet.printInfo();
    }
}
