package com.javaguru.student_igors_jurkovs.lesson_6.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i; // убираем рандом, чтобы проверить тесты
        }
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);}
    }

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    int findMaxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    boolean isInArraySuchNumber(int[] array, int number) {
        boolean result = false;
        for (int ar: array) {
            if (ar == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    int numberRepeat(int[] array, int number) {
        int counter = 0;
        for (int ar: array) {
            if (ar == number) {
                counter++;
            }
        }
        return counter;
    }

    void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    int[] reverseOrder(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        return array;
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
        for (int ar : array) {
            if (ar > result) {
                isGreater = true;
                break;
            }
        }
        return isGreater;
    }

    boolean testWithLoopToFindMin(int[] array, int result) {
        boolean isLesser = false;
        for (int ar : array) {
            if (ar < result) {
                isLesser = true;
                break;
            }
        }
        return isLesser;
    }

    boolean testWithLoopToCheckIsArrayFull(int[] array) {
        boolean empty = false;
        for (Integer ar : array) {
            if (ar != null) {
                empty = true;
                break;
            }
        }
        return empty;
    }
}

