package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
@CodeReview(approved = true)
class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Array length: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Please enter Array elements: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Inserted array elements: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + array[i]);
        }
    }
}




