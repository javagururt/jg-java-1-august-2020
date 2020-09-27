package com.javaguru.student_vladimirs_filipovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random randomNumber = new Random();
        numbers[0] = randomNumber.nextInt(99);
        numbers[1] = randomNumber.nextInt(99);
        numbers[2] = randomNumber.nextInt(99);
        System.out.println(Arrays.toString(numbers));

        numbers[0] = numbers[0] + 2;
        numbers[1] = numbers[1] + 2;
        numbers[2] = numbers[2] + 2;
        System.out.println(Arrays.toString(numbers));

    }
}
