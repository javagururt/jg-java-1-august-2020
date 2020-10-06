package com.javaguru.student_igors_jurkovs.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */
@CodeReview(approved = true)
class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int userInput = sc.nextInt();
        if (userInput >= 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is negative.");
        }
    }
}