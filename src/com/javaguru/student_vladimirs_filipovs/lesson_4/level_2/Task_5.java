package com.javaguru.student_vladimirs_filipovs.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number (int)");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter first number (int)");
        int secondNumber = scan.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is greater than second number");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second number is greater then first number");
        } else {
            System.out.println("Entered numbers are equal");
        }
    }
}
