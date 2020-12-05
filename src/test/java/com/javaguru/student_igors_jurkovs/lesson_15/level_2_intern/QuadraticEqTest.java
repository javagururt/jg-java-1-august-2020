package com.javaguru.student_igors_jurkovs.lesson_15.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    private final QuadraticEq victim = new QuadraticEq();

    @Test
    public void calc() {
        String expected = "Equation has no roots";
        String result = victim.calc(25, 5, 10);
        assertEquals(expected, result);
    }

    @Test
    public void calc2() {
        String expected = "x1 = -0.5403124237432848, x2 = 0.7403124237432849";
        String result = victim.calc(25, -5, -10);
        assertEquals(expected, result);
    }

    @Test
    public void calc3() {
        String expected = "x = -1.0";
        String result = victim.calc(2, 4, 2);
        assertEquals(expected, result);
    }

}