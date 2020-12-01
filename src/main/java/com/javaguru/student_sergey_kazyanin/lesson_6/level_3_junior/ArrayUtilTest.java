package com.javaguru.student_sergey_kazyanin.lesson_6.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldNotArrayNumber();
        test.shouldInArrayNumber();
        test.shouldZeroCount();
        test.shouldTwoCount();
    }

    public void shouldNotArrayNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 11;
        boolean actualResult = arrayUtil.isNumberInArray(testArray, number);
        boolean expectedResult = false;
        printTestResult(actualResult, expectedResult, "shouldNotArrayNumber");
    }

    public void shouldInArrayNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 4;
        boolean actualResult = arrayUtil.isNumberInArray(testArray, number);
        boolean expectedResult = true;
        printTestResult(actualResult, expectedResult, "shouldInArrayNumber");
    }

    public void shouldZeroCount() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {2, 4, 6, 8, 10};
        int number = 0;
        int actualResult = arrayUtil.numberCount(testArray, number);
        int expectedResult = 0;
        printTestResult(actualResult, expectedResult, "shouldZeroCount");
    }

    public void shouldTwoCount() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {2, 4, 6, 8, 4};
        int number = 4;
        int actualResult = arrayUtil.numberCount(testArray, number);
        int expectedResult = 2;
        printTestResult(actualResult, expectedResult, "shouldTwoCount");
    }

    public void printTestResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public void printTestResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
