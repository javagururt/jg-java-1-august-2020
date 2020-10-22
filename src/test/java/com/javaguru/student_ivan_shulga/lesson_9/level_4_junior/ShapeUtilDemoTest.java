package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilDemoTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    public void shouldCalculateAllShapesAreas() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 3);
        shapes[1] = new Square("Square", 2);
        shapes[2] = new Rectangle("Rectangle", 2,3);
        shapes[3] = new Triangle("Triangle", 2,2,3);

        double allAreas = shapeUtil.calculateArea(shapes);

        assertEquals(40.258, allAreas, 0.001);

    }

    @Test
    public void shouldCalculateAllShapesPerimeters() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 3);
        shapes[1] = new Square("Square", 2);
        shapes[2] = new Rectangle("Rectangle", 2,3);
        shapes[3] = new Triangle("Triangle", 2,2,3);

        double allPerimeters = shapeUtil.calculatePerimeter(shapes);

        assertEquals(43.849, allPerimeters, 0.001);

    }

}

/*
Задание:
Создайте класс ShapeUtilTest
и напишите тесты для методов:

    double calculateArea(Shape[] shapes);
    double calculatePerimeter(Shape[] shapes);

PS: пример создания и заполнения массива
геометрических фигур:

ShapeUtil shapeUtil = new ShapeUtil();
Shape[] shapes = new Shape[4];
shape[0] = shapeUtil.createRandomCircle();
shape[1] = shapeUtil.createRandomSquare();
shape[2] = shapeUtil.createRandomRectangle();
shape[3] = shapeUtil.createRandomTriangle();
 */