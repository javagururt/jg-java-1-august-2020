package com.javaguru.student_igors_jurkovs.lesson_4.level_3_junior;

import java.util.Scanner;

/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */
class EqualOrDifferent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = sc.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }    }
}
