package com.javaguru.student_vladimirs_filipovs.lesson_4.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number (int)");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter first number (int)");
        int secondNumber = scan.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Less of entered numbers is: " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Less of entered numbers is: " + firstNumber);
        } else {
            System.out.println("Entered numbers are equal: " + firstNumber + " = " + secondNumber);
        }
    }
}
