package com.javaguru.student_vladimirs_filipovs.lesson_6.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public boolean isIncludeArrayAmountOfNumbers(int[] array, int includeNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == includeNumber) {
                return true;
            }
        }
        return false;
    }

    public int currentNumberCounter(int[] array, int includeNumber) {
        int numberCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == includeNumber) {
                numberCounter++;
            }
        }
        return numberCounter;
    }

    public int[] replace(int[] array, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            array[0] = newNumber;
        }
        return array;
    }

    public int[] replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
        return array;
    }

    public int[] oppositeArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int changeNumber = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = changeNumber;
        }
        return array;
    }

    public int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
}