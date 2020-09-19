package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_4_junior;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Array length:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Generated numbers: " + array[i]);
        }
    }
}
