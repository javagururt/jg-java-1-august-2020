package com.javaguru.student_vladimirs_filipovs.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task_14 {
    public static void main(String[] args) {
        int[] numbrs = new int[3];
        Random randomGenerator = new Random();
        numbrs[0] = randomGenerator.nextInt(99);
        numbrs[1] = randomGenerator.nextInt(99);
        numbrs[2] = randomGenerator.nextInt(99);

        int numbersAverage = (numbrs[0] + numbrs[1] + numbrs[2]) / numbrs.length;

        System.out.println("Numbers average: " + numbersAverage);
    }
}
