package com.javaguru.student_igors_jurkovs.lesson_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Task_11 {
    @CodeReviewComment(teacher = "обычно называют аргумент - args")
    public static void main(String[] arghs)   {

        int a = 74;
        int b = 36;
        int sumResult = a + b;

        System.out.println("Result: " + sumResult);

        int x = 50;
        int y = 3;
        int divResult = x / y;

        System.out.println("Result: " + divResult);
    }
}
