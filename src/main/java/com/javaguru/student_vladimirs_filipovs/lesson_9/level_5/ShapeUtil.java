package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

import java.util.Random;

class ShapeUtil {
    Random randomGenerator = new Random();

    public void createRandomShape() {
        int shapeDependenceOnRandom = randomGenerator.nextInt(4);
        if (shapeDependenceOnRandom == 0) {
            createRandomCircle();
        } else if (shapeDependenceOnRandom == 1) {
            createRandomSquare();
        } else if (shapeDependenceOnRandom == 2) {
            createRandomRectangle();
        } else {
            createRRandomTriangle();
        }
    }

    public Shape createRandomCircle() {
        Circle circle = new Circle("Circle", randomGenerator.nextInt(77));
        System.out.println("Circle: radius = " + circle.getRadius() + ", area = " + circle.calculateArea() + ", perimeter = " + circle.calculatePerimeter());
        return circle;
    }

    public Shape createRandomSquare() {
        Square square = new Square("Square", randomGenerator.nextInt(77));
        System.out.println("Square: sides length = " + square.getSideLength() + ", area = " + square.calculateArea() + ", perimeter = " + square.calculatePerimeter());
        return square;
    }

    public Shape createRandomRectangle() {
        Rectangle rectangle = new Rectangle("Rectangle", randomGenerator.nextInt(77), randomGenerator.nextInt(77));
        System.out.println("Rectangle: first sides length = " + rectangle.getFirstSideLength() + ", second sides length = " + rectangle.getSecondSideLength() + ", area = " + rectangle.calculateArea() + ", perimeter = " + rectangle.calculatePerimeter());
        return rectangle;
    }

    public Shape createRRandomTriangle() {
        Triangle triangle = new Triangle("Triangle", randomGenerator.nextInt(77));
        System.out.println("Triangle: sides length = " + triangle.getSideLength() + ", area = " + triangle.calculateArea() + ", perimeter = " + triangle.calculatePerimeter());
        return triangle;
    }

    public Shape[] createShapeArray() {
        Circle circle = new Circle("Circle", 5);
        Square square = new Square("Square", 6);
        Rectangle rectangle = new Rectangle("Rectangle", 7, 8);
        Triangle triangle = new Triangle("Triangle", 9);
        Shape[] shapes = new Shape[4];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        shapes[3] = triangle;
        return shapes;
    }

    double calculateArea(Shape[] shapes) {
        double shapesAreaSum = 0;
        for (int i = 0; i < shapes.length; i++) {
            shapesAreaSum = shapesAreaSum + shapes[i].calculateArea();
        }
        return shapesAreaSum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeterSum = 0;
        for (int i = 0; i < shapes.length; i++) {
            shapesPerimeterSum = shapesPerimeterSum + shapes[i].calculatePerimeter();
        }
        return shapesPerimeterSum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        System.out.println("Random shape is:");
        shapeUtil.createRandomShape();
        System.out.println();

        double shapesAreaSum = shapeUtil.calculateArea(shapeUtil.createShapeArray());
        System.out.println("Shapes area sum is: " + shapesAreaSum);

        double shapesPerimeterSum = shapeUtil.calculatePerimeter(shapeUtil.createShapeArray());
        System.out.println("Shapes perimeter sum is: " + shapesPerimeterSum);

        System.out.println();

        Shape triangle = shapeUtil.createRRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle area is : " + triangleArea);
        System.out.println("Triangle perimeter is : " + trianglePerimeter);
    }
}