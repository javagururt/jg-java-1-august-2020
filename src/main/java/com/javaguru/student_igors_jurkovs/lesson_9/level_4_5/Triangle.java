package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {

    private final double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    double calculateArea() {
        return (side * side) * Math.sqrt(3) / 4;
    }

    double calculatePerimeter() {
        return side * 3;
    }
}
