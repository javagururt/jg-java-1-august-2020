package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ShapeUtil {

    private final Random random = new Random();

    Shape createRandomShape() {
        int randomShapeIndex = random.nextInt(4);
        if (randomShapeIndex == 0) {
            return createRandomCircle();
        } else if (randomShapeIndex == 1) {
            return createRandomSquare();
        } else if (randomShapeIndex == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    String getTitle(Shape shape) {
        return shape.getTitle(shape);
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape sh : shapes) {
            area += sh.calculateArea();
        }

        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape sh : shapes) {
            perimeter += sh.calculatePerimeter();
        }
        return perimeter;
    }

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble());
    }

    Circle createCircle(double radius) {
        return new Circle("Circle", radius);
    }

    Square createSquare(double side) {
        return new Square("Square", side);
    }

    Rectangle createRectangle(double firstSide, double secondSide) {
        return new Rectangle("Rectangle", firstSide, secondSide);
    }

    Triangle createTriangle(double side) {
        return new Triangle("Triangle", side);
    }

}
