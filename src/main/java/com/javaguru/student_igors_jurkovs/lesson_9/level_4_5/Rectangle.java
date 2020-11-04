package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {

    private final double firstSide;
    private final double secondSide;

    Rectangle(String title, double firstSide, double secondSide) {
        super(title);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    double calculateArea() {
        return firstSide * secondSide;
    }

    double calculatePerimeter() {
        return (firstSide + secondSide) * 2;
    }
}
