package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

import java.util.Random;

class Circle extends Shape{

    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(String shapeName, int radius) {
        super(shapeName);
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

