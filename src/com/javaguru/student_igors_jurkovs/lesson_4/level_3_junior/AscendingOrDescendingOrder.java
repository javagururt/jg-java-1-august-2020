package com.javaguru.student_igors_jurkovs.lesson_4.level_3_junior;

import java.util.Scanner;

/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
public class AscendingOrDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = sc.nextInt();
        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Descending order");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Ascending order");
        } else {
            System.out.println("Neither descending or ascending order");
        }
    }
}
