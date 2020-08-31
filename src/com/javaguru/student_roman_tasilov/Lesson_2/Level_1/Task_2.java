package com.javaguru.student_roman_tasilov.Lesson_2.Level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) {
        System.out.println("Please enter first number (double): ");
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();

        System.out.println("First nubber: " + firstNumber);

        System.out.println("Please enter second number (double): ");

         double secondNumber = scanner.nextDouble();

        System.out.println("Second number: " + secondNumber);

        double sum = firstNumber + secondNumber;

        System.out.println("Sum " + sum);

        double subtraction = firstNumber - secondNumber;

        System.out.println("Subtraction: " + subtraction);

        double multiplyResult = firstNumber * sum;

        System.out.println("Multiply result: " + multiplyResult);

        double divisionResult = multiplyResult / secondNumber;

        System.out.println("Division result: " + divisionResult);






    }
}
