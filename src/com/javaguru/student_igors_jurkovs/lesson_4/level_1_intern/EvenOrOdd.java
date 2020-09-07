package com.javaguru.student_igors_jurkovs.lesson_4.level_1_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you number:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd!");
        }
    }
}
