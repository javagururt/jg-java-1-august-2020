package com.javaguru.student_vadim_migun.lesson_9.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class TriangleTest {

    Triangle victim = new Triangle(4.33,5);

    @Test
    public void shouldCalculateArea() {
        double actual = victim.calculateArea();
        assertEquals(10.825, actual, 0.001);
        System.out.println(actual);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double actual = victim.calculatePerimeter();
        assertEquals(15, actual, 0.1);
        System.out.println(actual);
    }
}