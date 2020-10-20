package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle victim;

    @Before
    public void setUp() {
        victim = new Triangle("Triangle", 5);
    }

    @Test
    public void shouldCalculateTriangleArea(){
        double actual = victim.calculateArea();
        assertEquals(10.825, actual, 0.001);
    }

    @Test
    public void shouldCalculateTrianglePerimeter(){
        double actual = victim.calculatePerimeter();
        assertEquals(15, actual, 0.001);
    }
}