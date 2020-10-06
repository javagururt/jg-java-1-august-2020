package com.javaguru.student_vladimirs_filipovs.lesson_6.level_1;

class CalculatorAutomaticTests {
    public static void main(String[] args) {
        CalculatorAutomaticTests testRunner = new CalculatorAutomaticTests();
        testRunner.task1Test11IsEven();
        testRunner.task1Test21IsEven();

    }

    void task1Test11IsEven() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(6);
        finalResult(actualResult, expectedResult, "task1Test11IsEven");
    }

    void task1Test21IsEven() {
        Calculator calculator = new Calculator();
        boolean expectedResult = false;
        boolean actualResult = calculator.isEven(7);
        finalResult(actualResult, expectedResult, "task1Test21IsEven");
    }

    private void finalResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAIL, expected result " + expectedResult + ", actual result " + actualResult);
        }
    }
}

