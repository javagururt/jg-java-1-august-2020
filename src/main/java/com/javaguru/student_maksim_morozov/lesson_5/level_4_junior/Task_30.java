package com.javaguru.student_maksim_morozov.lesson_5.level_4_junior;

import java.util.Random;
class Task_30 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Сгенерированные числа: " + array[i]);
        }
        int number;
        for (int j : array) {
            if (j % 2 != 0) {
                number = j;
                System.out.println("Нечетное число: " + number);
            }
        }
    }
}
