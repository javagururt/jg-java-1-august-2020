package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
