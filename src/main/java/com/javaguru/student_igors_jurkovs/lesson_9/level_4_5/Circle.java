package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
