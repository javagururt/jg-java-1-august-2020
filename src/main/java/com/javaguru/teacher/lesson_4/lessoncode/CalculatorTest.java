package com.javaguru.teacher.lesson_4.lessoncode;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.test1();
        testRunner.test2();
    }

    void test1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(1, 2);
        int expectedResult = 3;

        if (expectedResult == actualResult) {
            System.out.println("Test 1: SUCCESS");
        } else {
            System.out.println("Test 1: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }

    void test2() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(-4, 10);
        int expectedResult = 6;

        if (expectedResult == actualResult) {
            System.out.println("Test 2: SUCCESS");
        } else {
            System.out.println("Test 2: FAILURE, expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
