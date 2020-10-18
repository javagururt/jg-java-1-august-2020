package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;
@CodeReview(approved = true)
class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaser enter array length:");
        int length = sc.nextInt();
        int numbers[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter " + (i + 1) + " number:");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
