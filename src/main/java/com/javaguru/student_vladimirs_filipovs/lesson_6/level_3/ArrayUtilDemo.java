package com.javaguru.student_vladimirs_filipovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] newArray = arrayUtil.createArray(10);
        System.out.println("Replace new array: " + Arrays.toString(newArray));

        arrayUtil.replace(newArray, 777);
        System.out.println("Replace first number in array: " + Arrays.toString(newArray));

        arrayUtil.replaceAll(newArray, 7, 99);
        System.out.println("Replace number in array: " + Arrays.toString(newArray));

        arrayUtil.oppositeArray(newArray);
        System.out.println("Opposite number in array: " + Arrays.toString(newArray));

        arrayUtil.sortArray(newArray);
        System.out.println("Sorts array's value: " + Arrays.toString(newArray));

        int[] newArrayNumberCounter = new int[]{1, 2, 5, 5, 5, 6, 7, 99, 54, 32,};
        int count = arrayUtil.currentNumberCounter(newArrayNumberCounter, 5);
        System.out.println("How many times repeated number 5: " + count);
    }
}
