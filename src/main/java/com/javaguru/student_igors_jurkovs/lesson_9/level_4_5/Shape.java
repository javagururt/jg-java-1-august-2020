package com.javaguru.student_igors_jurkovs.lesson_9.level_4_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    String getTitle(Shape shape) {
        return shape.title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
