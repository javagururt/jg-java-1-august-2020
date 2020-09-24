package com.javaguru.student_vladimirs_filipovs.lesson_5.level_5_6;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest testRunner = new ArrayUtilTest();
        testRunner.shouldCreateArray();
        testRunner.shouldFillArrayWithRandomNumbers();
        testRunner.shouldFindMaxNumber();
        testRunner.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil array1 = new ArrayUtil();
        int[] result = array1.createArray(3);
        int expectedResult = 3;
        if (expectedResult == result.length) {
            System.out.println("Test ShouldCreateArray: SUCCESS");
        } else {
            System.out.println("Test ShouldCreateArray: FAIL");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil array1 = new ArrayUtil();

    }

    public void shouldFindMaxNumber() {
        ArrayUtil array1 = new ArrayUtil();

    }

    public void shouldFindMinNumber() {
        ArrayUtil array1 = new ArrayUtil();

    }
}

