package com.javaguru.student_ivan_shulga.lesson_5.level_2_intern;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуста, введите значение нулевой ячейки массива!");
        intArray[0] = scanner.nextInt();
        System.out.println("Пожалуста, введите значение первой ячейки массива!");
        intArray[1] = scanner.nextInt();
        System.out.println("Пожалуста, введите значение второй ячейки массива!");
        intArray[2] = scanner.nextInt();

        System.out.println("Значение нулевой ячейки равно: " + intArray[0]);
        System.out.println("Значение первой ячейки равно: " + intArray[1]);
        System.out.println("Значение второй ячейки равно: " + intArray[2]);
    }

}

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */