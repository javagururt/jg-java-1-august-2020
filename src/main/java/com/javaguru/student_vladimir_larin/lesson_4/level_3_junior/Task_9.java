package com.javaguru.student_vladimir_larin.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scanner.nextInt();
        if (thirdNumber > secondNumber && secondNumber > firstNumber) {
            System.out.println("increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}