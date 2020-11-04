package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

class Square extends Shape {
    int sideLength;

    public Square(String shapeName, int sideLength) {
        super(shapeName);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
