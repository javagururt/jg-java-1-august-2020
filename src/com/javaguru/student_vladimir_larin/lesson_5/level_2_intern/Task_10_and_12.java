package com.javaguru.student_vladimir_larin.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task_10_and_12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index = " + i);
            System.out.println("Value = " + numbers[i]);
        }
    }
}
