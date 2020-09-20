package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_3_junior;
/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.
 */
import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Max number are:" + firstNumber);
        }
        else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
            System.out.println("Max number are:" + secondNumber);
        }
        else {
            System.out.println("Max number are: " + thirdNumber);
        }
    }
}
