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

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int ourNumber1 : array) {
            if (ourNumber1 > maxNumber) {
                maxNumber = ourNumber1;
            }
        }
    }

    public void findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int ourNumber2 : array) {
            if (ourNumber2 < minNumber) {
                minNumber = ourNumber2;
            }
        }
    }
}
