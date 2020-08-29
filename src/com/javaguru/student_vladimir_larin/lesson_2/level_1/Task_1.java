package com.javaguru.student_vladimir_larin.lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter first number (int):");

        int a = sc.nextInt();

        System.out.println("Please enter second number (int):");

        int b = sc.nextInt();

        System.out.println("_________________________________");
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + a * b);
        System.out.println("Division: " + a + " : " + b + " = " + a / b);

    }
}
