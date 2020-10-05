package com.javaguru.student_vladimirs_filipovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayUtilTest {

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
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(5);
        int toFindNumber = 3;
        boolean expectedResult = true;
        boolean actualResult = arrayUtil.isIncludeArrayAmountOfNumbers(newArray, toFindNumber);
        assertResultBoolean(expectedResult, actualResult, "test1NumberInArray");
    }

    void test2NumberOutOfArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(5);
        int toFind = 22;
        boolean expectedResult = false;
        boolean actualResult = arrayUtil.isIncludeArrayAmountOfNumbers(newArray, toFind);
        assertResultBoolean(expectedResult, actualResult, "test2NumberOutOfArray");
    }

    void test3NumberEqualsZero() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(5);
        int toFind = 0;
        boolean expectedResult = false;
        boolean actualResult = arrayUtil.isIncludeArrayAmountOfNumbers(newArray, toFind);
        assertResultBoolean(expectedResult, actualResult, "test3NumberEqualsZero");
    }

    void test4HowManyTimesIsRepeatedCurrentNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = new int[]{12, 4, 5, 99, 66, 31, 12, 99, 99, 81, 75, 99};
        int expectedResult = 4;
        int actualResult = arrayUtil.currentNumberCounter(newArray, 99);
        assertResult(expectedResult, actualResult, "test4HowManyTimesIsRepeatedCurrentNumber");
    }

    void test5HowManyTimesIsRepeatedCurrentNumberNotRepeated() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = new int[]{12, 4, 5, 99, 66, 31, 12, 99, 99, 81, 75, 99};
        int expectedResult = 0;
        int actualResult = arrayUtil.currentNumberCounter(newArray, 7);
        assertResult(expectedResult, actualResult, "test5HowManyTimesIsRepeatedCurrentNumberNotRepeated");
    }

    void test6ReplaceFirstNumberInArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(7);
        int[] expectedResult = {777, 2, 3, 4, 5, 6, 7};
        int[] actualResult = arrayUtil.replace(newArray, 777);
        assertResultArray(expectedResult, actualResult, "test6ReplaceFirstNumberInArray");
    }

    void test7ReplaceNumberInArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(7);
        int[] expectedResult = {1, 2, 777, 4, 5, 6, 7};
        int[] actualResult = arrayUtil.replaceAll(newArray, 3, 777);
        assertResultArray(expectedResult, actualResult, "test7ReplaceNumberInArray");
    }

    void test8ReplaceNumberInArrayIsNotExist() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(7);
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        int[] actualResult = arrayUtil.replaceAll(newArray, 22, 777);
        assertResultArray(expectedResult, actualResult, "test8ReplaceNumberInArrayIsNotExist");
    }

    void test9OppositeArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(7);
        int[] expectedResult = {7, 6, 5, 4, 3, 2, 1};
        int[] actualResult = arrayUtil.oppositeArray(newArray);
        assertResultArray(expectedResult, actualResult, "test9OppositeArray");
    }

    void test10SortArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = new int[]{21, 54, 32, 69, 777, 69};
        int[] expectedResult = {21, 32, 54, 69, 69, 777};
        int[] actualResult = arrayUtil.sortArray(newArray);
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

