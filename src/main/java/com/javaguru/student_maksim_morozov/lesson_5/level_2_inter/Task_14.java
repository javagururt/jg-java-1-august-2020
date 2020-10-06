package com.javaguru.student_maksim_morozov.lesson_5.level_2_inter;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "лучше основываться на размере массива, а не на i, а так же учесть, что среднее может быть дробным числом")
class Task_14 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        int sumOfNumbers = 0;
        int i;
        for(i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            sumOfNumbers += numbers[i]; }
        System.out.println(sumOfNumbers / i);
    }
}
