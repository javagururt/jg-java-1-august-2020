package com.javaguru.teacher.lesson_6.lessoncode;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest testRunner = new NumberUtilsTest();
        testRunner.shouldReturn25();
        testRunner.shouldReturn256();
        testRunner.shouldReturn27();
        testRunner.shouldReturnOneWhenPower0();
        testRunner.shouldReturnZeroWhenNumber0();
        testRunner.shouldReturnOneWhenNumberOne();
    }

    void shouldReturnOneWhenPower0() {
        int expected = 1;
        int actual = NumberUtils.pow(0, 0);
        assertResult(expected, actual, "shouldReturnOneWhenPower0");
    }

    void shouldReturnZeroWhenNumber0() {
        int expected = 0;
        int actual = NumberUtils.pow(0, 1000);
        assertResult(expected, actual, "shouldReturnZeroWhenNumber0");
    }

    void shouldReturnOneWhenNumberOne() {
        int expected = 1;
        int actual = NumberUtils.pow(1, 1000);
        assertResult(expected, actual, "shouldReturnOneWhenNumberOne");
    }

    void shouldReturn25() {
        int expected = 25;
        int actual = NumberUtils.pow(5, 2);
        assertResult(expected, actual, "shouldReturn25");
    }

    void shouldReturn256() {
        int expected = 256;
        int actual = NumberUtils.pow(2, 8);
        assertResult(expected, actual, "shouldReturn256");
    }

    void shouldReturn27() {
        int expected = 27;
        int actual = NumberUtils.pow(3, 3);
        assertResult(expected, actual, "shouldReturn27");
    }

    private void assertResult(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.out.println(testName + ": FAILED. Expected: " + expected + ", actual: " + actual);
        }
    }
}
