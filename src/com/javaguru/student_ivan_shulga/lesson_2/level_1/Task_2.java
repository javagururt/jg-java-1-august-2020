package com.javaguru.student_ivan_shulga.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {

        System.out.println("Please enter first number (double): ");

        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("First double numb3,5er: " + firstDoubleNumber);

        System.out.println("Please enter second number (double): ");

        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Second double number: " + secondDoubleNumber);

        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double addition = firstDoubleNumber + secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Multiplication result: " + multiplication);
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Addition result: " + addition);
        System.out.println("Division result: " + division);

    }

}
