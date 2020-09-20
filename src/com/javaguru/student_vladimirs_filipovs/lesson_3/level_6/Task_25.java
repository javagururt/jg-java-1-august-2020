package com.javaguru.student_vladimirs_filipovs.lesson_3.level_6;

class Circle {
    double radius;
    double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        this.area = Math.pow(radius, 2) * Math.PI;
    }

    public void printInfo() {
        System.out.println("Circle area is: " + area);
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(2.4);
        circle1.calculateArea();
        circle1.printInfo();
    }

}