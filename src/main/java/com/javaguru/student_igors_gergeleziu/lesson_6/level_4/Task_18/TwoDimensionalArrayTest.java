package com.javaguru.student_igors_gergeleziu.lesson_6.level_4.Task_18;


class TwoDimensionalArrayTest {
    private final TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
    private final int[][] twoDimensionalArrayTest = twoDimensionalArray.createTwoDimensionalArray(4);

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldCreateTwoDimensionalArray();
        test.shouldFillTwoDimensionalArrayWithRandomNumbers();
        test.shouldPrintTwoDimensionalArray();
        test.getSumOfTwoDimensionalArrayNumbers();
        test.SumOfTwoDimensionalArrayNumbersTest();
    }

    public void shouldCreateTwoDimensionalArray() {
        twoDimensionalArray.createTwoDimensionalArray(4);
    }

    public void shouldFillTwoDimensionalArrayWithRandomNumbers() {
        twoDimensionalArray.fillTwoDimensionalArrayWithRandomNumbers(twoDimensionalArrayTest);
    }

    public void shouldFillTwoDimensionalArrayWithNumbers3() {
        twoDimensionalArray.fillTwoDimensionalArrayWithNumbers3(twoDimensionalArrayTest);
    }

    public void shouldPrintTwoDimensionalArray() {
        twoDimensionalArray.printTwoDimensionalArray(twoDimensionalArrayTest);
    }

    public void getSumOfTwoDimensionalArrayNumbers() {
        System.out.println("Sum of all elements = " + twoDimensionalArray.sumOfTwoDimensionalArrayNumbers(twoDimensionalArrayTest));
    }

    public void SumOfTwoDimensionalArrayNumbersTest() {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        int[][] arrayTest = twoDimensionalArray.createTwoDimensionalArray(4);
        twoDimensionalArray.fillTwoDimensionalArrayWithNumbers3(arrayTest);
        int result = twoDimensionalArray.sumOfTwoDimensionalArrayNumbers(arrayTest);
        twoDimensionalArray.checkResult(result == 48, "SumOfTwoDimensionalArrayNumbersTest");
    }
}
