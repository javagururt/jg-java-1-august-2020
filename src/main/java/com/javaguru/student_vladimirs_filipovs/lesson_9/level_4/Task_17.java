package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

class Square extends Shape {
    protected double length;

    public Square(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * length;
    }

    @Override
    double calculatePerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
