package com.javaguru.student_nikolajs_sersnovs.leason_2.level_1;
/*
Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner
следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();
 */
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Input second number:");
        double secondNumber = scanner.nextDouble();

        double Addition = firstNumber + secondNumber;
        double Subtraction = firstNumber - secondNumber;
        double Multiplication = firstNumber * secondNumber;
        double Division = firstNumber / secondNumber;

        System.out.println("Addition = " + Addition);
        System.out.println("Subtraction = " + Subtraction);
        System.out.println("Multiplication = " + Multiplication);
        System.out.println("Division = " + Division);

    }
}
