package com.javaguru.student_vladimirs_filipovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class Task_28 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(99);
            System.out.println("index Nr." + (i) + " = " + array[i]);
        }
        int minNumber = array[0];
        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println("Min number = " + minNumber);
    }
}
