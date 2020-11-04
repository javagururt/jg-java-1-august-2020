package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private final Shape victim = new Square("Square", 5);

    @Test
    public void calculateArea() {
        double expected = 25;
        double result = victim.calculateArea();
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        double expected = 20;
        double result = victim.calculatePerimeter();
        assertEquals(expected, result, 0.01);
    }
}