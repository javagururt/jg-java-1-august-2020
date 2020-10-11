package com.javaguru.student_vladimirs_filipovs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class CircleTest {
    private Circle victim;

    @Before
    public void setUp() {
        victim = new Circle();
    }

    @Test
    public void shouldCalculateCircleArea(){
        victim.setRadius(2);
        victim.calculateArea();
        double actualResult = victim.area;
        double expectedResult = 12.5664;
        assertEquals(expectedResult, actualResult, 0.0001);
    }
}