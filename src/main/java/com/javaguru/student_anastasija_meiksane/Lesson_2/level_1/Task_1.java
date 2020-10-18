package com.javaguru.student_anastasija_meiksane.Lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number(int) : ");

        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number (int): ");

        int secondNumber = scanner.nextInt();

        System.out.print(firstNumber + "+" + secondNumber);

        int sumResult = firstNumber + secondNumber;
        System.out.println(" = " + sumResult);

        int minResult = firstNumber - secondNumber;
        System.out.print(firstNumber + "-" + secondNumber);
        System.out.println(" = " + minResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.print(firstNumber + "*" + secondNumber);
        System.out.println(" = " + multiplyResult);

        double divideResult = firstNumber / (double) secondNumber;
        System.out.print(firstNumber + " / " + secondNumber);
        System.out.println(" = " + divideResult);







/*
Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.
 */


    }
}
