package com.javaguru.student_maksim_morozov.lesson_5.level_4_junior;

import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Сгенерированные числа: " + array[i]);
        }
        int minNumber = array[0];
        for (int j : array) {
            if (minNumber > j) {
                minNumber = j;
            }
        }
        System.out.println("Самое маленькое число: " + minNumber);
    }
}
