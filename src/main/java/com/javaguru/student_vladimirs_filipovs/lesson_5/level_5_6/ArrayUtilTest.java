package com.javaguru.student_vladimirs_filipovs.lesson_5.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest testRunner = new ArrayUtilTest();
        testRunner.shouldCreateArray();
        testRunner.shouldFindMaxNumber();
        testRunner.shouldFindMinNumber();
        testRunner.shouldPrintRandomNumberTill99();
    }

    public void shouldCreateArray() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = array.createArray(3);
        int expectedResult = 3;
        if (expectedResult == newArray.length) {
            System.out.println("Test shouldCreateArray: SUCCESS");
        } else {
            System.out.println("Test shouldCreateArray: FAIL, expected result: " + expectedResult + ", actual result: " + newArray.length);
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = new int[]{1, 6, 12, 23, 7};
        int expectedResult = 23;
        int maxNumber = array.findMaxNumber(newArray);
        if (expectedResult == maxNumber) {
            System.out.println("Test shouldFindMaxNumber: SUCCESS");
        } else {
            System.out.println("Test shouldFindMaxNumber: FAIL, expected result: " + expectedResult + ", actual result: " + maxNumber);
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = new int[]{44, 23, 56, 2, 31};
        int expectedResult = 2;
        int minNumber = array.findMinNumber(newArray);
        if (expectedResult == minNumber) {
            System.out.println("Test shouldFindMinNumber: SUCCESS");
        } else {
            System.out.println("Test shouldFindMinNumber: FAIL, expected result: " + expectedResult + ", actual result: " + minNumber);
        }
    }

    public void shouldPrintRandomNumberTill99() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = array.createArray(7);
        int[] fieldArray = array.fillArrayWithRandomNumbers(newArray);
        System.out.println(array.printArrayToConsole(fieldArray));
    }
}

