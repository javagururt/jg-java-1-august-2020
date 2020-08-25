package com.javaguru.student_vladimir_larin.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {

        System.out.println("Please enter first number (double):");

        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Please enter second number (double):");

        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("___________________________________");
        System.out.println("Addition: " + firstDoubleNumber + " + " + secondDoubleNumber + " = " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Subtraction: " + firstDoubleNumber + " - " + secondDoubleNumber + " = " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication: " + firstDoubleNumber + " * " + secondDoubleNumber + " = " + firstDoubleNumber * secondDoubleNumber);
        System.out.println("Division: " + firstDoubleNumber + " : " + secondDoubleNumber + " = " + firstDoubleNumber / secondDoubleNumber);
    }
}