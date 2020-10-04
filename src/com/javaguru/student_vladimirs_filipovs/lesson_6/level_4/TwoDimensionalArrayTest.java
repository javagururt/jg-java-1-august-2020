package com.javaguru.student_vladimirs_filipovs.lesson_6.level_4;

class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest testRunner = new TwoDimensionalArrayTest();
        testRunner.test1SumAllArray2x2Numbers();
        testRunner.test2SumAllArray3x3Numbers();
        testRunner.test3SumAllArray2x3Numbers();
        testRunner.test4SumAllArray3x2Numbers();
    }

    public void test1SumAllArray2x2Numbers() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] newArray = new int[][]{{12, 4}, {13, 11}};
        int expectedResult = 40;
        int actualResult = twoDimensionalArray.sumAllArrayNumbers(newArray);
        assertResult(expectedResult, actualResult, "test1SumAllArray2x2Numbers");
    }

    public void test2SumAllArray3x3Numbers() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] newArray = new int[][]{{12, 4, 7}, {13, 11, 5}, {6, 7, 9}};
        int expectedResult = 74;
        int actualResult = twoDimensionalArray.sumAllArrayNumbers(newArray);
        assertResult(expectedResult, actualResult, "test2SumAllArray3x3Numbers");
    }

    public void test3SumAllArray2x3Numbers() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] newArray = new int[][]{{12, 4, 7}, {13, 11, 5}};
        int expectedResult = 52;
        int actualResult = twoDimensionalArray.sumAllArrayNumbers(newArray);
        assertResult(expectedResult, actualResult, "test3SumAllArray2x3Numbers");
    }

    public void test4SumAllArray3x2Numbers() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] newArray = new int[][]{{12, 4}, {13, 11}, {7, 6}, {34, 9}};
        int expectedResult = 96;
        int actualResult = twoDimensionalArray.sumAllArrayNumbers(newArray);
        assertResult(expectedResult, actualResult, "test4SumAllArray3x2Numbers");
    }


    private void assertResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result: " + expectedResult + ", actual result: " + actualResult);
        }
    }
}
