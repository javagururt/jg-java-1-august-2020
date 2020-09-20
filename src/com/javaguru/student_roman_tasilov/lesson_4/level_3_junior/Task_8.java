package com.javaguru.student_roman_tasilov.lesson_4.level_3_junior;
/* Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.*/

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please enter first number int: ");
        Scanner scFirst = new Scanner(System.in);
        int firstNumber = scFirst.nextInt();
        System.out.println("Please enter second number:  ");
        Scanner scSecond = new Scanner(System.in);
        int secondNumber = scSecond.nextInt();
        System.out.println("Please enter third number:  ");
        Scanner scThird = new Scanner(System.in);
        int thirdNumber = scThird.nextInt();

        if (firstNumber == secondNumber && secondNumber== thirdNumber) {
            System.out.println("All numbers are equal");
        }
        else if (secondNumber != firstNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");}
        else if ((firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber)
                || secondNumber != firstNumber && firstNumber != thirdNumber && secondNumber != thirdNumber ) {
            System.out.println("Neither all are equal or different");
        }}
}
