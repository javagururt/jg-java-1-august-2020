package com.javaguru.student_vadim_migun.lesson_4.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator victim = new Calculator();

    @Test
    public void sumTest() {
        int actual = victim.sum(20, 5);
        assertEquals(25, actual);

    }

    @Test
    public void subtraction() {
        int actual = victim.subtraction(17, 5);
        assertEquals(12, actual);
    }

    @Test
    public void multiplication() {
        int actual = victim.multiplication(3, 3);
        assertEquals(9, actual);
    }

    @Test
    public void division() {
        double actual = victim.division(12, 3);
        assertEquals(4, actual, 0.001);
    }

    @Test
    public void isEvenTrue() {
        boolean actual = victim.isEven(4);
        assertEquals(true, actual);
    }

    @Test
    public void isEvenFalse() {
        boolean actual = victim.isEven(3);
        assertEquals(false, actual);
    }

    @Test
    public void maxOfTwoNumbers() {
        int actual = victim.maxOfTwoNumbers(3, 6);
        assertEquals(6, actual);
    }

    @Test
    public void maxOfThreeNumbers() {
        int actual = victim.maxOfThreeNumber(1, 4, 7);
        assertEquals(7, actual);
    }
}