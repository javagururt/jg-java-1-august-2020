package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_21;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {

    public static void main(String[] args) {

        Dog newDog = new Dog("Gav", 9, "White");

        newDog.voice();
        newDog.happyBirthday();
    }

}
