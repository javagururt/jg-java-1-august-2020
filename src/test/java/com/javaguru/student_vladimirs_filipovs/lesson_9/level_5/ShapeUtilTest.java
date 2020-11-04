package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilTest {
    private ShapeUtil victim;

    @Before
    public void setUp() {
        victim = new ShapeUtil();
    }

    @Test
    public void CalculateAllShapesAreaSum(){
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle("Circle", 2);
        Square square = new Square("Square", 3);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);
        Triangle triangle = new Triangle("Triangle", 6);
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        shapes[3] = triangle;
     double actual = victim.calculateArea(shapes);
     assertEquals(57.15, actual, 0.01);
    }

    @Test
    public void CalculateAllShapesAreaPerimeter(){
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle("Circle", 2);
        Square square = new Square("Square", 3);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);
        Triangle triangle = new Triangle("Triangle", 6);
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        shapes[3] = triangle;
        double actual = victim.calculatePerimeter(shapes);
        assertEquals(60.57, actual, 0.01);
    }
}