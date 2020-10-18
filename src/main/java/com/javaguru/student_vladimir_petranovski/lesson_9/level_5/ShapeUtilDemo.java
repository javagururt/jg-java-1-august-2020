package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);
    }
}
