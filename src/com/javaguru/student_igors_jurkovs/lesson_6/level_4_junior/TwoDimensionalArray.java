package com.javaguru.student_igors_jurkovs.lesson_6.level_4_junior;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    int[][] createTwoDimensionalArray(int firstLength, int secondLength) {
        return new int[firstLength][secondLength];
    }

    void fillTwoDimensionalArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 1; //random.nextInt(101);
            }
        }
    }

    int sumOfAllArrayElements(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

    boolean isArrayFull(int[][] array) {
        boolean empty = false;
        for (int[] ar : array) {
            if (ar != null) {
                empty = true;
                break;
            }
        }
        return empty;
    }

    void printTwoDimensionalArray(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }
}
