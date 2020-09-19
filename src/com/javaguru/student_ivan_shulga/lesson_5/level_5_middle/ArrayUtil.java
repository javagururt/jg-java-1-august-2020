package com.javaguru.student_ivan_shulga.lesson_5.level_5_middle;

// Здесь задания lesson_5 - level_5_middle и level_6_middle

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    } // ^^^ Task_31. Создайте класс ArrayUtil. Создайте в этом классе метод для создания массива целых чисел указанной длины.

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomInt = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt.nextInt(100);
        }
    } // ^^^ Task_33. Создайте в классе ArrayUtil метод для заполнения массива целых чисел случайными числами.

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "  -->  " + array[i]);
        }
    } // ^^^ Task_35. Создайте в классе ArrayUtil метод для распечатки массива целых чисел на консоль.

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        } return max;
    }// ^^^ Task_36. Создайте в классе ArrayUtil метод для нахождения максимального числа в массиве целых чисел.

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( min > array[i]) {
                min = array[i];
            }
        } return min;
    } // ^^^ Task_38. Создайте в классе ArrayUtil метод для нахождения минимального числа в массиве целых чисел.

}
