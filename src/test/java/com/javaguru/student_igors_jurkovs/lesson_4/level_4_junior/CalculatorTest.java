package com.javaguru.student_igors_jurkovs.lesson_4.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class CalculatorTest {

    private Calculator victim = new Calculator();

    @Test
    public void sum() {
        int firstNumber = 5;
        int secondNumber = 4;
        int result = victim.sum(firstNumber, secondNumber);
        assertEquals(9, result);
    }

    @Test
    public void subtraction() {
        int firstNumber = 10;
        int secondNumber = 3;
        int result = victim.subtraction(firstNumber, secondNumber);
        assertEquals(7, result);
    }

    @Test
    public void multiply() {
        int firstNumber = 5;
        int secondNumber = 3;
        int result = victim.multiply(firstNumber, secondNumber);
        assertEquals(15, result);
    }

    @Test
    public void division() {
        int firstNumber = 20;
        int secondNumber = 4;
        int result = victim.division(firstNumber, secondNumber);
        assertEquals(5, result);
    }

    @Test
    public void isEven() {
        int number = 5;
        boolean result = victim.isEven(number);
        assertFalse(result);
    }

    @Test
    public void maxOfTwoNumbers() {
        int firstNumber = 15;
        int secondNumber = 1;
        int result = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        assertEquals(15, result);
    }

    @Test
    public void maxOfThreeNumbers() {
        int firstNumber = 13;
        int secondNumber = 7;
        int thirdNumber = 4;
        int result = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        assertEquals(13, result);
    }
}