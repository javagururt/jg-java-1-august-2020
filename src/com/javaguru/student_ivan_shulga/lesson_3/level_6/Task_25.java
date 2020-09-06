package com.javaguru.student_ivan_shulga.lesson_3.level_6;

import java.util.Scanner;

// по мотивам lesson_2 - level_3 - Task_10
class Circle {

    double radius;
    double pi = 3.14;

    public Circle(double radius) { this.radius = radius; }

    public double calculateArea() { return pi * (radius * radius); }

    public void print () {

    }

}

class DemoCircle {

    public static void main(String[] args) {

        Circle circle = new Circle(6);

        double circleArea = circle.calculateArea();

        System.out.println("Площадь круга равна:  " + circleArea);
    }

}
