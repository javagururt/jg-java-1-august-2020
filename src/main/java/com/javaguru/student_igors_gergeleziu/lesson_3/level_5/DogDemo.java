package com.javaguru.student_igors_gergeleziu.lesson_3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class DogDemo {
    public static void main(String[] args) {
        Dog buddy= new Dog("Buddy", 5, "black");
        buddy.voice();
        buddy.happyBirthday();
        buddy.changeColor("white");
        buddy.voice();
    }
}
