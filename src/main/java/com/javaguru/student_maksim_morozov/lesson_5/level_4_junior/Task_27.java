package com.javaguru.student_maksim_morozov.lesson_5.level_4_junior;

import java.util.Random;

class Task_27 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Сгенерированные числа: " + array[i]);
        }
        int maxNumber = array[0];
        for (int j : array) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        System.out.println("Самое большое число: " + maxNumber);
    }
}
