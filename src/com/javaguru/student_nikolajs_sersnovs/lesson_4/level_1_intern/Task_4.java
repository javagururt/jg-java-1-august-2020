package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_1_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.
 */
class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number (Integer): ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is Even: ");
        }
        else {
            System.out.println("Your number is odd: ");
        }

    }
}
