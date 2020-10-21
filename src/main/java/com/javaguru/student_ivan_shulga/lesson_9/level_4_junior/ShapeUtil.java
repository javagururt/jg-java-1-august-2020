package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble());
    }
    /* ^^^^^^^^^
    Создайте класс ShapeUtil. В класе ShapeUtil реализуйте метод: Circle createRandomCircle();
    Этот метод создаёт круг со случайным радиусом.
     */

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble());
    }
    /* ^^^^^^^^^
    В класе ShapeUtil реализуйте метод: Square createRandomSquare();
    Этот метод создаёт квадрат со случайно выбранной длиной стороны.
     */

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
    }
    /* ^^^^^^^^^
    В класе ShapeUtil реализуйте метод: Rectangle createRandomRectangle();
    Этот метод создаёт прямоугольник со случайно выбранными сторонами.
     */

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble(), random.nextDouble(), random.nextDouble());
    }
    /* ^^^^^^^^^
    В класе ShapeUtil реализуйте метод: Triangle createRandomTriangle();
    Этот метод создаёт равносторонний треугольник со случайно выбранной длиной стороны.
     */

    Shape randomShapeCreator() {
        int randomShapeIndex = random.nextInt(4);
            if (randomShapeIndex == 1) {
                return createRandomCircle();
                } else if (randomShapeIndex == 2) {
                    return createRandomSquare();
                    } else if (randomShapeIndex == 3) {
                        return createRandomRectangle();
                        } else
                            return createRandomTriangle();
                            }
    /* ^^^^^^^^^
    В класе ShapeUtil реализуйте метод, который создает случайную фигуру.
     */

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
    /* ^^^^^^^^^
    В классе ShapeUtil создайте методы:
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
     */

    double calculateArea(Shape[] shapes) {
        double allShapesArea = 0;
        for (Shape someShape : shapes) {
            allShapesArea += someShape.calculateArea();
        }
        return allShapesArea;
    }
    /* ^^^^^^^^^
    В класе ShapeUtil реализуйте метод: double calculateArea(Shape[] shapes);
    Этот метод расчитывает объщую площадьгеометрических фигур из массива.
     */

    double calculatePerimeter(Shape[] shapes) {
        double allShapesPerimeter = 0;
        for (Shape someShape : shapes) {
            allShapesPerimeter += someShape.calculatePerimeter();
        }
        return allShapesPerimeter;
    }
    /* ^^^^^^^^^
    В класе ShapeUtil реализуйте метод: double calculatePerimeter(Shape[] shapes);
    Этот метод расчитывает общий периметр геометрических фигур из массива.
     */

}
