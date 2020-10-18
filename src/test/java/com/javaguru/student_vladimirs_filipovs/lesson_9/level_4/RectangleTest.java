package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle victim;

    @Before
    public void setUp() {
        victim = new Rectangle("Rectangle", 3, 4);
    }

    @Test
    public void shouldCalculateRectangleArea() {
        double actual = victim.calculateArea();
        assertEquals(12, actual, 0.001);
    }

    @Test
    public void shouldCalculateRectanglePerimeter() {
        double actual = victim.calculatePerimeter();
        assertEquals(14, actual, 0.001);
    }

}