package com.javaguru.student_igors_gergeleziu.lesson_4.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();
        if (number1 == number2 && number2 == number3) System.out.println("All numbers are equal");
        else if (number1 != number2 && number2 != number3 && number1 != number3)
            System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}
