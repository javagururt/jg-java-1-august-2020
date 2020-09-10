package com.javaguru.student_igors_jurkovs.lesson_5.level_2_intern;

import java.util.Scanner;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.

 */
class Array2 {
    public static void main(String[] args) {
        int number[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter " + (i+1) + " number:");
            number[i] = sc.nextInt();
            }
        System.out.println("number[0] = " + number[0]);
        System.out.println("number[1] = " + number[1]);
        System.out.println("number[2] = " + number[2]);
    }
}

