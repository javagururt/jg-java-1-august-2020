package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private Shape victim = new Triangle("Triangle", 2, 3, 4);

    @Test
    public void calculateArea() {
        double expected = 2.90;
        double actual = victim.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        double expected = 9.00;
        double actual = victim.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }

}