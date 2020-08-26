package com.javaguru.student_ivan_shulga.lesson_2.level_1;

import java.util.Scanner;

//integer
//multiplication
//subtraction
//addition
//division

class Task_1 {

    public static void main(String[] args) {

        System.out.println("Please enter first number (integer): ");

        Scanner fn = new Scanner(System.in);
        int firstNumber = fn.nextInt();

        System.out.println("First number: " + firstNumber);

        System.out.println("Please enter second number (integer): ");

        int secondNumber = fn.nextInt();

        System.out.println("Second number: " + secondNumber);

        int multiplication = firstNumber * secondNumber;
        int subtraction = firstNumber - secondNumber;
        int addition = firstNumber + secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Multiplication result: " + multiplication);
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Addition result: " + addition);
        System.out.println("Division result: " + division);

    }

}
