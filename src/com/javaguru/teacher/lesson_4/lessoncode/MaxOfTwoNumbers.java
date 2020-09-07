package com.javaguru.teacher.lesson_4.lessoncode;

import java.util.Scanner;

class MaxOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
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
