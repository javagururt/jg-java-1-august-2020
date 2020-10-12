package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_4_junior;
/*
Как объявить двумерный массив?
Найти в интернете и написать пример кода в котором:
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.
 */

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {


    public int[][] TwoDimensionalArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }

    public int sumRandomNumber(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                sum += array[i][j];
        }
        System.out.println(sum);
        return sum;
    }
}








