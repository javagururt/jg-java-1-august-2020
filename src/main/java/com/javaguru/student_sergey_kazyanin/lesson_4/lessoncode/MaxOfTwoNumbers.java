package com.javaguru.student_sergey_kazyanin.lesson_4.lessoncode;

import java.util.Scanner;

class MaxOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Max of Two: ");
        if (firstNumber > secondNumber) {
            System.out.println("First number " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Second number " + secondNumber);
        } else {
            System.out.println("EQUALS");
        }

    }
}
