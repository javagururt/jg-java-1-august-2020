package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle victim;

    @Before
    public void setUp() {
        victim = new Circle("Circle", 5);
    }

    @Test
    public void shouldCalculateCircleArea() {
        double actual = victim.calculateArea();
        assertEquals(78.54, actual, 0.001);
    }

    @Test
    public void shouldCalculateCirclePerimeter() {
        double actual = victim.calculatePerimeter();
        assertEquals(31.416, actual, 0.001);
    }

}