package com.javaguru.student_ivan_shulga.lesson_15.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    private final QuadraticEq victim = new QuadraticEq();

    @Test
    public void calcDiscriminantGreaterThanZero() {
        String expected = "x1 = -4.7912878474779195, x2 = -0.20871215252208009";
        String actual = victim.calc(2,10,2);
        assertEquals(expected, actual);
    }

    @Test
    public void calcDiscriminantLessThanZero() {
        String expected = "Equation has no roots";
        String actual = victim.calc(10,2,10);
        assertEquals(expected, actual);
    }

    @Test
    public void calcDiscriminantEqualsZero() {
        String expected = "x = -1.0";
        String actual = victim.calc(3,6,3);
        assertEquals(expected, actual);
    }

}