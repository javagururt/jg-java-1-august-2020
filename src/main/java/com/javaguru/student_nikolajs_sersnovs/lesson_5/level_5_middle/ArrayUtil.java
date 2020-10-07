package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_5_middle;

import java.util.Arrays;
import java.util.Random;


class ArrayUtil {

    /*
    Создайте класс ArrayUtil.
    Создайте в этом классе метод для создания
    массива целых чисел указанной длины.
    */

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        return 0;
    }

    /*
    Создайте в классе ArrayUtil метод для
    распечатки массива целых чисел на консоль.
     */
    public void printArrayToConsole(int[] array) {
        for (int j : array) {
            System.out.println(Arrays.toString(new int[]{j}));
        }

    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения максимального числа в массиве целых чисел.
     */
    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int j : array) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }


    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int j : array) {
            if (minNumber > j) {
                minNumber = j;
            }
        }
        return minNumber;
    }

}



