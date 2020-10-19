package com.javaguru.student_vadim_migun.lesson_9.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {

    private double height;
    private double width;

    public Triangle(String title, double height, double width) {
        super(title);
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return 0.5 * height * width;
    }

    @Override
    double calculatePerimeter() {
        return width * 3;
    }
}
