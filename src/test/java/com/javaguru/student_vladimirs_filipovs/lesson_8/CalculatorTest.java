package com.javaguru.student_vladimirs_filipovs.lesson_8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void setUp() {
        victim = new Calculator();
    }

    @Test
    public void shouldCalculateSum() {
        int actualResult = victim.sum(3, 6);
        assertEquals(9, actualResult);
    }

    @Test
    public void shouldCalculateDeduct() {
        int actualResult = victim.deduct(5, 2);
        assertEquals(3, actualResult);
    }

    @Test
    public void shouldCalculateMultiply() {
        int actualResult = victim.multiply(3, 5);
        assertEquals(15, actualResult);
    }

    @Test
    public void shouldCalculateDivide() {
        int actualResult = victim.divide(9, 3);
        assertEquals(3, actualResult);
    }

    @Test
    public void shouldCalculateIsEvenTrue() {
        boolean actualResult = victim.isEven(6);
        assertEquals(true, actualResult);
    }

    @Test
    public void shouldCalculateIsEvenFalse() {
        boolean actualResult = victim.isEven(7);
        assertEquals(false, actualResult);
    }

    @Test
    public void shouldShowMaxOfTwoNumbersShouldBeFirst() {
        int actualResult = victim.maxOfTwoNumbers(7, 3);
        assertEquals(7, actualResult);
    }

    @Test
    public void shouldShowMaxOfTwoNumbersShouldBeSecond() {
        int actualResult = victim.maxOfTwoNumbers(3, 9);
        assertEquals(9, actualResult);
    }

    @Test
    public void shouldShowMaxOfTwoNumbersWithNegativeNumber() {
        int actualResult = victim.maxOfTwoNumbers(3, -9);
        assertEquals(3, actualResult);
    }

    @Test
    public void shouldShowMaxOfThirdNumbersShouldBeFirst() {
        int actualResult = victim.maxOfThirdNumbers(99, 5, 9);
        assertEquals(99, actualResult);
    }

    @Test
    public void shouldShowMaxOfThirdNumbersShouldBeSecond() {
        int actualResult = victim.maxOfThirdNumbers(69, 777, 0);
        assertEquals(777, actualResult);
    }

    @Test
    public void shouldShowMaxOfThirdNumbersShouldBeThird() {
        int actualResult = victim.maxOfThirdNumbers(61, 27, 999666);
        assertEquals(999666, actualResult);
    }

    @Test
    public void shouldShowMaxOfThirdNumbersWithNegativeNumbers() {
        int actualResult = victim.maxOfThirdNumbers(-69, -777, -765);
        assertEquals(-69, actualResult);
    }
}