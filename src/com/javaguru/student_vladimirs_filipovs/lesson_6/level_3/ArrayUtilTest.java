package com.javaguru.student_vladimirs_filipovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayUtilTest {

    private static final ArrayUtil ARRAY_UTIL = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest testRunner = new ArrayUtilTest();
        testRunner.test1NumberInArray();
        testRunner.test2NumberOutOfArray();
        testRunner.test3NumberEqualsZero();
        testRunner.test4HowManyTimesIsRepeatedCurrentNumber();
        testRunner.test5HowManyTimesIsRepeatedCurrentNumberNotRepeated();
        testRunner.test6ReplaceFirstNumberInArray();
        testRunner.test7ReplaceNumberInArray();
        testRunner.test8ReplaceNumberInArrayIsNotExist();
        testRunner.test9OppositeArray();
        testRunner.test10SortArray();
    }


    void test1NumberInArray() {
        int[] newArray = ARRAY_UTIL.createArray(5);
        int toFindNumber = 3;
        boolean expectedResult = true;
        boolean actualResult = ARRAY_UTIL.isIncludeArrayAmountOfNumbers(newArray, toFindNumber);
        assertResultBoolean(expectedResult, actualResult, "test1NumberInArray");
    }

    void test2NumberOutOfArray() {
        int[] newArray = ARRAY_UTIL.createArray(5);
        int toFind = 22;
        boolean expectedResult = false;
        boolean actualResult = ARRAY_UTIL.isIncludeArrayAmountOfNumbers(newArray, toFind);
        assertResultBoolean(expectedResult, actualResult, "test2NumberOutOfArray");
    }

    void test3NumberEqualsZero() {
        int[] newArray = ARRAY_UTIL.createArray(5);
        int toFind = 0;
        boolean expectedResult = false;
        boolean actualResult = ARRAY_UTIL.isIncludeArrayAmountOfNumbers(newArray, toFind);
        assertResultBoolean(expectedResult, actualResult, "test3NumberEqualsZero");
    }

    void test4HowManyTimesIsRepeatedCurrentNumber() {
        int[] newArray = new int[]{12, 4, 5, 99, 66, 31, 12, 99, 99, 81, 75, 99};
        int expectedResult = 4;
        int actualResult = ARRAY_UTIL.currentNumberCounter(newArray, 99);
        assertResult(expectedResult, actualResult, "test4HowManyTimesIsRepeatedCurrentNumber");
    }

    void test5HowManyTimesIsRepeatedCurrentNumberNotRepeated() {
        int[] newArray = new int[]{12, 4, 5, 99, 66, 31, 12, 99, 99, 81, 75, 99};
        int expectedResult = 0;
        int actualResult = ARRAY_UTIL.currentNumberCounter(newArray, 7);
        assertResult(expectedResult, actualResult, "test5HowManyTimesIsRepeatedCurrentNumberNotRepeated");
    }

    void test6ReplaceFirstNumberInArray() {
        int[] newArray = ARRAY_UTIL.createArray(7);
        int[] expectedResult = {777, 2, 3, 4, 5, 6, 7};
        int[] actualResult = ARRAY_UTIL.replace(newArray, 777);
        assertResultArray(expectedResult, actualResult, "test6ReplaceFirstNumberInArray");
    }

    void test7ReplaceNumberInArray() {
        int[] newArray = ARRAY_UTIL.createArray(7);
        int[] expectedResult = {1, 2, 777, 4, 5, 6, 7};
        int[] actualResult = ARRAY_UTIL.replaceAll(newArray, 3, 777);
        assertResultArray(expectedResult, actualResult, "test7ReplaceNumberInArray");
    }

    void test8ReplaceNumberInArrayIsNotExist() {
        int[] newArray = ARRAY_UTIL.createArray(7);
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        int[] actualResult = ARRAY_UTIL.replaceAll(newArray, 22, 777);
        assertResultArray(expectedResult, actualResult, "test8ReplaceNumberInArrayIsNotExist");
    }

    void test9OppositeArray() {
        int[] newArray = ARRAY_UTIL.createArray(7);
        int[] expectedResult = {7, 6, 5, 4, 3, 2, 1};
        int[] actualResult = ARRAY_UTIL.oppositeArray(newArray);
        assertResultArray(expectedResult, actualResult, "test9OppositeArray");
    }

    void test10SortArray() {
        int[] newArray = new int[]{21, 54, 32, 69, 777, 69};
        int[] expectedResult = {21, 32, 54, 69, 69, 777};
        int[] actualResult = ARRAY_UTIL.sortArray(newArray);
        assertResultArray(expectedResult, actualResult, "test10SortArray");
    }


    private void assertResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }

    private void assertResultArray(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result: " + Arrays.toString(expectedResult) + ", actual result: " + Arrays.toString(actualResult));
        }
    }

    private void assertResultBoolean(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }
}

