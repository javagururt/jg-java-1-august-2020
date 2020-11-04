package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_4_junior;

/*
Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.
 */

class TwoDimensionalArrayTest {


    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldFillArrayWithRandomNumbers();
        System.out.println("---------------------");
        test.shouldSumRandomNumber();
    }


    void shouldFillArrayWithRandomNumbers() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arrayLength = new int[2][2];
        int[][] actualResult = twoDimensionalArray.TwoDimensionalArray(arrayLength);
        int expectResult = 2;
        testResult(expectResult, actualResult.length, "shouldFillArrayWithRandomNumbers");

    }

    void shouldSumRandomNumber() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arrayLength = new int[2][2];
        int[][] arrayNumber = twoDimensionalArray.TwoDimensionalArray(arrayLength);
        int actualResult = twoDimensionalArray.sumRandomNumber(arrayNumber);
        int expectResult = twoDimensionalArray.sumRandomNumber(arrayLength);
        testResult(expectResult, actualResult, "shouldSumRandomNumber");

    }

    private void testResult(int expectResult, int actualResult, String testName) {
        if (actualResult == expectResult) {
            System.out.println(testName + ": SUCCESS " + " " + actualResult + " | " + expectResult);
        } else {
            System.out.println(testName + ": FAILURE " + "Expected result: " + expectResult
                    + " but Actual result: " + actualResult);
        }
    }
}

