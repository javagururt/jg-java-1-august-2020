package com.javaguru.student_vladimirs_filipovs.lesson_9.level_5;

class Rectangle extends Shape {
    int firstSideLength;
    int secondSideLength;

    public Rectangle(String shapeName, int firstSideLength, int secondSideLength) {
        super(shapeName);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public int getFirstSideLength() {
        return firstSideLength;
    }

    public int getSecondSideLength() {
        return secondSideLength;
    }

    @Override
    double calculateArea() {
        return firstSideLength * secondSideLength;
    }

    @Override
    double calculatePerimeter() {
        return firstSideLength + firstSideLength + secondSideLength + secondSideLength;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                '}';
    }
}
