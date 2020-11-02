package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
