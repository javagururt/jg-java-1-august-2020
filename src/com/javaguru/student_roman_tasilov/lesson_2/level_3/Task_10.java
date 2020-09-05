package com.javaguru.student_roman_tasilov.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter circle radius: (double)");
        double radius = sc.nextDouble();
        double perimeter = Math.PI * 2 * radius;
        double area = Math.PI * (radius * radius);

        System.out.println("Test Data:");
        System.out.println("Radius =" + radius);
        System.out.println("Expected output");
        System.out.println("Perimeter is =" + perimeter);
        System.out.println("Area is =" + area);

    }
}
