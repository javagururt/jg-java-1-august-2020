package com.javaguru.student_vladimir_larin.lesson_5.level_2_intern;

import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        int avearge = 0;
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        avearge = sum / numbers.length;
        System.out.println(avearge);
    }
}