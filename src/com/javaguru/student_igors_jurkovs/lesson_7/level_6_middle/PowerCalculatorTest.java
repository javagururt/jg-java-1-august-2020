package com.javaguru.student_igors_jurkovs.lesson_7.level_6_middle;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.shouldGiveResult0();
        powerCalculatorTest.shouldGiveResult1();
        powerCalculatorTest.shouldGiveResult25();
        powerCalculatorTest.zeroPowerZeroShouldGiveResult1();
        powerCalculatorTest.shouldGiveResult1024();
    }

    void shouldGiveResult25() {
        int expected = 25;
        int result = powerCalculator.powerCalculator(5, 2);
        powerCalculator.test(expected == result,"Result should be 25");
    }

    void shouldGiveResult1024() {
        int expected = 1024;
        int result = powerCalculator.powerCalculator(2, 10);
        powerCalculator.test(expected == result,"Result should be 1024");
    }

    void shouldGiveResult0() {
        int expected = 0;
        int result = powerCalculator.powerCalculator(0, 5);
        powerCalculator.test(expected == result,"Result should be 0");
    }

    void shouldGiveResult1() {
        int expected = 1;
        int result = powerCalculator.powerCalculator(5, 0);
        powerCalculator.test(expected == result,"Result should be 1");
    }

    void zeroPowerZeroShouldGiveResult1() {
        int expected = 1;
        int result = powerCalculator.powerCalculator(0, 0);
        powerCalculator.test(expected == result,"Result should be 1");
    }
}
