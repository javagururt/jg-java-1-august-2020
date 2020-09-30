package com.javaguru.student_vladimirs_filipovs.lesson_5.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
        }
        return array;
    }

    public int[] fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(99);
        }
        return array;
    }

    public String printArrayToConsole(int[] array) {
       return Arrays.toString(array);
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int ourNumber : array) {
            if (ourNumber > maxNumber) {
                maxNumber = ourNumber;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int ourNumber : array) {
            if (ourNumber < minNumber) {
                minNumber = ourNumber;
            }
        }
        return minNumber;
    }
}
