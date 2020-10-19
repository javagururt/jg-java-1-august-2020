package com.javaguru.student_vladimirs_filipovs.lesson_9.level_4;

class Triangle extends Shape {
    private double sidesLength;

    public Triangle(String title, double sidesLength) {
        super(title);
        this.sidesLength = sidesLength;
    }

    @Override
    double calculateArea() {
        return (Math.pow(sidesLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return sidesLength * 3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sidesLength=" + sidesLength +
                '}';
    }
}
