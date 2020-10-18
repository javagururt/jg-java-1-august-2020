package com.javaguru.student_vladimir_larin.lesson_8.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class CalculatorTest {

    private Calculator target = new Calculator();

    @Test
    public void shouldReturnTrueWhenEven() {
        boolean actual = target.isEven(500);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenOdd() {
        boolean actual = target.isEven(43);
        assertFalse(actual);
    }
}