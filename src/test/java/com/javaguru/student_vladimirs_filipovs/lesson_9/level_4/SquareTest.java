package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private Square victim;

    @Before
    public void setUp() {
        victim = new Square("Square", 3);
    }

    @Test
    public void shouldCalculateSquareArea(){
        double actual = victim.calculateArea();
        assertEquals(9, actual, 0.001);
    }

    @Test
    public void shouldCalculateSquarePerimeter(){
        double actual = victim.calculatePerimeter();
        assertEquals(12, actual, 0.001);
    }
}