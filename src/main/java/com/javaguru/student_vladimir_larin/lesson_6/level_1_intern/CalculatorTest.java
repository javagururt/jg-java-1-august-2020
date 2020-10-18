package com.javaguru.student_vladimir_larin.lesson_6.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.shouldReturnTrueWhenEven();
        testRunner.shouldReturnFalseWhenOdd();

    }

    void shouldReturnTrueWhenEven() {
        boolean expected = true;
        boolean actual = Calculator.isEven(2);
        assertResult(expected, actual, "shouldReturnTrueWhenEven");
    }

    void shouldReturnFalseWhenOdd() {
        boolean expected = false;
        boolean actual = Calculator.isEven(1);
        assertResult(expected, actual, "shouldReturnFalseWhenOdd");
    }

    private void assertResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED. Expected: " + expected + ", actual: " + actual);
        }
    }

}