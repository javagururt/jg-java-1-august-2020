package com.javaguru.student_vladimirs_filipovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random randomGenerator = new Random();
        numbers[0] = randomGenerator.nextInt(99);
        numbers[1] = randomGenerator.nextInt(99);
        numbers[2] = randomGenerator.nextInt(99);

        System.out.println(Arrays.toString(numbers));
    }
}
