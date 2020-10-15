package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private Shape victim = new Square("Square", 2);

    @Test
    public void calculateArea() {
        double expected = 4;
        double actual = victim.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        double expected = 8;
        double actual = victim.calculatePerimeter();
        assertEquals(expected, actual, 0.01);

    }

}