package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class ShapeUtilTest {

    private final ShapeUtil shapeUtil = new ShapeUtil();
    Shape[] shapes = new Shape[4];

    @Before
    public void setUp() {

        shapes[0] = shapeUtil.createCircle(5);
        shapes[1] = shapeUtil.createSquare(5);
        shapes[2] = shapeUtil.createRectangle(5, 6);
        shapes[3] = shapeUtil.createTriangle(4);
    }


    @Test
    public void calculateArea() {
        double expected = 140.47;
        double result = shapeUtil.calculateArea(shapes);
        assertEquals(expected, result, 0.01);

    }

    @Test
    public void calculatePerimeter() {
        double expected = 85.42;
        double result = shapeUtil.calculatePerimeter(shapes);
        assertEquals(expected, result, 0.01);
    }
}