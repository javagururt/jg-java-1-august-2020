package com.javaguru.student_vladimir_larin.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scanner.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Largest number " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Largest number " + secondNumber);
        } else {
            System.out.println("Largest number " + thirdNumber);
        }
    }
}
