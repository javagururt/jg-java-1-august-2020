package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Shape victim = new Rectangle("Rectangle", 2, 3);

    @Test
    public void calculateArea() {
        double expected = 6;
        double actual = victim.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        double expected = 10;
        double actual = victim.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }

}