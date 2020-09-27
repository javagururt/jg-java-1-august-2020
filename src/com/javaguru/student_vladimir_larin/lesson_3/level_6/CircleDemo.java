package com.javaguru.student_vladimir_larin.lesson_3.level_6;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius:");
        double radius = scanner.nextDouble();
        Circle a = new Circle(radius);
        a.calculateArea(radius);
        System.out.println("Area equals " + a.calculateArea(radius));

    }
}
