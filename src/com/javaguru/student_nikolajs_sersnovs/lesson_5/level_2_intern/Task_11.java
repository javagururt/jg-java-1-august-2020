package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_2_intern;

import java.util.Scanner;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.

 */
class Task_11 {

    public static void main(String[] args) {
        int [] numbers = new int [3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please write third number (Integer): ");
        int thirdNumber = scanner.nextInt();

        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


    }
}
