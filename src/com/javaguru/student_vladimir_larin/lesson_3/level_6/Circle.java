package com.javaguru.student_vladimir_larin.lesson_3.level_6;

class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
