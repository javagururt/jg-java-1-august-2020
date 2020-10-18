package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private final double squareSide;

    Square(String title, double squareSide) {
        super(title);
        this.squareSide = squareSide;
    }

    double calculateArea() {
        return squareSide * squareSide;
    }

    double calculatePerimeter() {
        return 4 * squareSide;
    }
}
