package com.javaguru.student_vladimirs_filipovs.lesson_5.level_2;

import java.util.Random;

class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random randomGenerator = new Random();
        numbers[0] = randomGenerator.nextInt(99);
        numbers[1] = randomGenerator.nextInt(99);
        numbers[2] = randomGenerator.nextInt(99);

        int numbersSum = numbers[0] + numbers[1] + numbers[2];

        System.out.println("Numbers sum = " + numbersSum);
    }
}
