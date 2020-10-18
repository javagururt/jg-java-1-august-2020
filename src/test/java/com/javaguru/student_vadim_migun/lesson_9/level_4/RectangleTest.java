package com.javaguru.student_vadim_migun.lesson_9.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class RectangleTest {

    Rectangle victim = new Rectangle(3, 5);

    @Test
    public void shouldCalculateArea() {
        double actual = victim.calculateArea();
        assertEquals(15, actual, 0.01);
        System.out.println(actual);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double actual = victim.calculatePerimeter();
        assertEquals(16, actual, 0.01);
        System.out.println(actual);
    }


}
