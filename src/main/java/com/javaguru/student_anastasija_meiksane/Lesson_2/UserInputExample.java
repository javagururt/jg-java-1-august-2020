package com.javaguru.student_anastasija_meiksane.Lesson_2;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        System.out.println("Pleae enter number (int): ");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        System.out.println("First Number: " + firstNumber);


        System.out.println("Pleae enter second number (int): ");

        int secondNumber = scanner.nextInt();

        System.out.println("Second Number: " + secondNumber);

        double multiplyResult = firstNumber / (double) secondNumber;
                System.out.println("Result: " + multiplyResult);


    }
}
