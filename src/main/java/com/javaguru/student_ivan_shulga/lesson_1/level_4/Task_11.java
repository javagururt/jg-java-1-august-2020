package com.javaguru.student_ivan_shulga.lesson_1.level_4;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.net.SocketOption;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "импорты, которые не используются лучше удалать")
class Task_11 {

    public static void main(String[] args) {

        int sum = 74 + 36;
        System.out.println(sum);

        int divide = 50 / 3;
        System.out.println(divide);

    }
}
