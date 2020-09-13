package com.javaguru.student_ivan_shulga.lesson_4.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Max of Two: " + firstNumber);
            } else if (secondNumber > firstNumber) {
                System.out.println("Max of Two: " + secondNumber);
                } else {
                    System.out.println("Numbers are EQUAL");
                    }

    }

}
