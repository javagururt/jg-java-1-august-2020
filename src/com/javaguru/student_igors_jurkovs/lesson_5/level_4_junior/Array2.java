package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;

import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
class Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaser enter array length:");
        int length = sc.nextInt();
        int numbers[] = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }
    }
}
