package com.javaguru.student_vadim_migun.lesson_9.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle victim = new Circle("Circle", 3);

    @Test
    public void shouldCalculateArea() {
        double actual = victim.calculateArea();
        assertEquals(28.274,actual,0.001);
        System.out.println(actual);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double actual = victim.calculatePerimeter();
        assertEquals(18.849, actual,0.001);
        System.out.println(actual);
    }
}