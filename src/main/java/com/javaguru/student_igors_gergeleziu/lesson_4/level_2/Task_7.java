package com.javaguru.student_igors_gergeleziu.lesson_4.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        if (number1 == number2) System.out.println("Numbers " + number1 + " and " + number2 + " are equal");
        else System.out.println("Numbers " + number1 + " and " + number2 + " are different");
    }
}
