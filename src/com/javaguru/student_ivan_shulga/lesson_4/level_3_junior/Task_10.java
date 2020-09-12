package com.javaguru.student_ivan_shulga.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter third number:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Max of Three: " + firstNumber);
        } else if (firstNumber < secondNumber && secondNumber > thirdNumber) {
            System.out.println("Max of Three: " + secondNumber);
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Max of Three: " + thirdNumber);
        } else if (firstNumber == secondNumber && secondNumber < thirdNumber) {
            System.out.println("Max of Three: " + thirdNumber);
        } else if (firstNumber == secondNumber && secondNumber > thirdNumber) {
            System.out.println("Max of Three: " + firstNumber);
        } else if (firstNumber > secondNumber && secondNumber == thirdNumber) {
            System.out.println("Max of Three: " + firstNumber);
        } else if (firstNumber < secondNumber && secondNumber == thirdNumber) {
            System.out.println("Max of Three: " + secondNumber);
        } else if (firstNumber > secondNumber && firstNumber == thirdNumber) {
            System.out.println("Max of Three: " + firstNumber);
        } else {
            System.out.println("Numbers are EQUALS");
        }

    }

}

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.
PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */