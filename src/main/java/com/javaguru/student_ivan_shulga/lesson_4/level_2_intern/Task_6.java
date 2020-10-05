package com.javaguru.student_ivan_shulga.lesson_4.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter first number:");
            int firstNumber = scanner.nextInt();

            System.out.println("Please enter second number:");
            int secondNumber = scanner.nextInt();

                if (firstNumber > secondNumber) {
                    System.out.println("Min of Two: " + secondNumber);
                } else if (secondNumber > firstNumber) {
                    System.out.println("Min of Two: " + firstNumber);
                } else {
                    System.out.println("Numbers are EQUAL");
                }

    }

}
