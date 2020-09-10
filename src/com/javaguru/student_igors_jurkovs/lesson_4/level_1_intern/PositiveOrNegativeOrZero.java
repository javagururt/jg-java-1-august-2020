package com.javaguru.student_igors_jurkovs.lesson_4.level_1_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */
class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int userInput = sc.nextInt();
        if (userInput > 0) {
            System.out.println("Your number is positive.");
        } else if (userInput < 0) {
            System.out.println("Your number is negative.");
        } else {
            System.out.println("Your number is zero.");
        }
    }
}