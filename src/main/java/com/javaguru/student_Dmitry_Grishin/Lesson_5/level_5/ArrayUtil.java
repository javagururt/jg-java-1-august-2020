package com.javaguru.student_Dmitry_Grishin.Lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

/*
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.
 */
/*
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.
 */

class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        Random randomInt = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt.nextInt(90);
        }
    }

    /*
    Создайте в классе ArrayUtil метод для
    распечатки массива целых чисел на консоль.
    */
    void printArrayToConsole(int[] array) {
        for (int arrayIndex : array) {
            System.out.println(Arrays.toString(new int[]{arrayIndex}));
        }
    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения максимального числа в массиве целых чисел.
     */
    int findMaxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения минимального числа в массиве целых чисел.
     */
    int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }

    boolean testWithLoopToFindMax(int[] array, int result) {
        boolean isGreater = false;
        for (int arrayIndex : array) {
            if (arrayIndex > result) {
                isGreater = true;
                break;
            }
        }
        return isGreater;
    }

    boolean testWithLoopToFindMin(int[] array, int result) {
        boolean isLesser = false;
        for (int arrayIndex : array) {
            if (arrayIndex < result) {
                isLesser = true;
                break;
            }
        }
        return isLesser;
    }
}


