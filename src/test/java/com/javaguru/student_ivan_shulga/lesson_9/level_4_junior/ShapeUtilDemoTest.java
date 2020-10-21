package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import static org.junit.Assert.*;

public class ShapeUtilDemoTest {

    ShapeUtil shapeUtil = new ShapeUtil();

    // всё остальное, вроде, работает нормально, здесь не даёт создать массив фигур, пока не понял отчего,
    // в то же время в ShapeUtilDemo он создаётся без проблем и проводятся расчёты
    // чего-то не вижу или не понимаю

    /*
    Shape[] shapes = new Shape[4];
    shapes[0] = shapeUtil.createRandomCircle();
    shapes[1] = shapeUtil.createRandomSquare();
    shapes[2] = shapeUtil.createRandomRectangle();
    shapes[3] = shapeUtil.createRandomTriangle();
     */

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