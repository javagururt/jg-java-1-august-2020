package com.javaguru.student_vladimirs_filipovs.lesson_4.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first number (int)");
        int firstNumber = scan.nextInt();

        System.out.println("Please input second number (int)");
        int secondNumber = scan.nextInt();

        System.out.println("Please input third number (int)");
        int thirdNumber = scan.nextInt();

        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
        } else if ((firstNumber != secondNumber) && (firstNumber != thirdNumber) && (secondNumber != thirdNumber)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
