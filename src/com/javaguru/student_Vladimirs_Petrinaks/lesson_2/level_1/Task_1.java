package com.javaguru.student_Vladimirs_Petrinaks.lesson_2.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int firstNumber = sc.nextInt();

        System.out.println("Введите второе число :");
        int secondNumber = sc.nextInt();

        int sumOfNumbers = firstNumber + secondNumber;
        int subtractionOfNumbers = firstNumber - secondNumber;
        int multiplyOfNumbers = firstNumber * secondNumber;
        int divisionOfNumbers = firstNumber / secondNumber;

        System.out.println("Сложение этих чисел равно " + sumOfNumbers);
        System.out.println("Вычитание 1ого от 2ого числа равно " + subtractionOfNumbers);
        System.out.println("Умножение этих чисел равно " + multiplyOfNumbers);
        System.out.println("Деление 1ого на 2ое число равно " + divisionOfNumbers);

        sc.close();
    }
}
//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.