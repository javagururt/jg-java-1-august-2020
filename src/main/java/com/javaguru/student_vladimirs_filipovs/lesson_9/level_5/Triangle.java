package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

class Triangle extends Shape {
    int sideLength;

    public Triangle(String shapeName, int sideLength) {
        super(shapeName);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    double calculateArea() {
        return (Math.pow(sideLength, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideLength=" + sideLength +
                '}';
    }
}
