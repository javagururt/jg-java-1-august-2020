package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

class Circle extends Shape {
    protected int radius;

    public Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

