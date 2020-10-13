package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(shapeUtil.getTitle(circle) + " area: " + circleArea);
        System.out.println(shapeUtil.getTitle(circle) + circlePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println(shapeUtil.getTitle(rectangle) + " area: " + rectangleArea);
        System.out.println(shapeUtil.getTitle(rectangle) + " perimeter: " + rectanglePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square area: " + squareArea);
        System.out.println("Square perimeter: " + squarePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle area: " + triangleArea);
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        Shape[] shapes = new Shape[4];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = shapeUtil.createRandomShape();
        }

        System.out.println("Shapes area: " + shapeUtil.calculateArea(shapes));
        System.out.println("Shapes perimeter: " + shapeUtil.calculatePerimeter(shapes));
    }
}
