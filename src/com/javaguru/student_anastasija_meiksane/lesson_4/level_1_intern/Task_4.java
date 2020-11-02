package com.javaguru.student_anastasija_meiksane.lesson_4.level_1_intern;

import java.util.Scanner;

public class Task_4 {
    /*
    Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else if (number % 2 > 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
