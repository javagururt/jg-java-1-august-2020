package com.javaguru.student_ivan_shulga.lesson_3.level_5.task_19;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "лучше не оставлять неиспользованные переменные. Непоятно тогда зачем нужно было вызывать методы.")
class DogDemo {

    public static void main(String[] args) {

        Dog newDog = new Dog("Gav", 7);

        newDog.voice();

    }

}
