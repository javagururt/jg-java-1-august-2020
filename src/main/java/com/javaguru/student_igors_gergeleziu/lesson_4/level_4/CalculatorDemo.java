package com.javaguru.student_igors_gergeleziu.lesson_4.level_4;

import java.util.Scanner;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Addition " + calculate.addition(firstNumber, secondNumber));
        System.out.println("Subtraction " + calculate.subtraction(firstNumber, secondNumber));
        System.out.println("Multiplication " + calculate.multiplication(firstNumber, secondNumber));
        System.out.println("Division " + calculate.division(firstNumber, secondNumber));
    }
}
