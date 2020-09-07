package com.javaguru.student_igors_jurkovs.lesson_4.level_2_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */
class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is bigger than " + secondNumber);
        } else {
            System.out.println(secondNumber + " is bigger than " + firstNumber);
        }
    }
}
