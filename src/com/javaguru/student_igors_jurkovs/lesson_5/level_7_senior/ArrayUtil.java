package com.javaguru.student_igors_jurkovs.lesson_5.level_7_senior;

import java.util.Arrays;

class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    void printArrayToConsole(int[] array) {
        System.out.println("Your array is: ");
        for (int ar : array) {
            System.out.println(ar);
        }
    }

    int findMaxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    void findEvenNumbers(int[] array) {
        System.out.println("Even numbers are:");
        for (int ar : array) {
            if (ar % 2 == 0) {
                System.out.println(ar);
            }
        }
    }
    void findOddNumbers(int[] array) {
        System.out.println("Even numbers are:");
        for (int ar : array) {
            if (ar % 2 != 0) {
                System.out.println(ar);
            }
        }
    }
}