package com.javaguru.student_vladimirs_filipovs.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public int[][] createArray(int arrayLength) {
        int[][] array = new int[arrayLength][arrayLength];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
        }
        return array;
    }

    public int[][] fillArrayWithRandomNumbers(int[][] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomGenerator.nextInt(9);
            }
        }
        return array;
    }

    public int sumAllArrayNumbers(int[][] array) {
        int sumAllNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumAllNumbers = array[i][j] + sumAllNumbers;
            }
        }
        return sumAllNumbers;
    }
}
