package com.javaguru.student_ivan_shulga.lesson_7.level_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void powerCalc0To0() {
        int expected = 1;
        int actual = PowerCalculator.powerCalc(0,0);
        assertEquals(expected, actual);
    }

    @Test
    public void powerCalc1To0() {
        int expected = 1;
        int actual = PowerCalculator.powerCalc(1,0);
        assertEquals(expected, actual);
    }

    @Test
    public void powerCalc0To1() {
        int expected = 0;
        int actual = PowerCalculator.powerCalc(0,1);
        assertEquals(expected, actual);
    }

    @Test
    public void powerCalc1To1() {
        int expected = 1;
        int actual = PowerCalculator.powerCalc(1,1);
        assertEquals(expected, actual);
    }

    @Test
    public void powerCalc3To3() {
        int expected = 27;
        int actual = PowerCalculator.powerCalc(3,3);
        assertEquals(expected, actual);
    }

}