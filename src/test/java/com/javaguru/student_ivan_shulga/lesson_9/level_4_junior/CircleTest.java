package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Shape victim = new Circle("Circle", 3.0);

    @Test
    public void calculateArea() {
        double expected = 28.27;
        double actual = victim.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        double expected = 18.84;
        double actual = victim.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }

}