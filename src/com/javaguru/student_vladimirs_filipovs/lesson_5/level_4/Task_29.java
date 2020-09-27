package com.javaguru.student_vladimirs_filipovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task_29 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(99);
            System.out.println("index Nr." + (i) + " = " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Odd number: " + array[i]);
            }
        }
    }
}