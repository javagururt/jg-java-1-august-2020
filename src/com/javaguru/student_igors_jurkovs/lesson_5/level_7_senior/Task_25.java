package com.javaguru.student_igors_jurkovs.lesson_5.level_7_senior;

import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
class Task_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println("Please enter array length: ");
        int length = sc.nextInt();
        int[] array = arrayUtil.createArray(length);
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter " + (i + 1) + " number:");
            array[i] = sc.nextInt();
        }
        arrayUtil.printArrayToConsole(array);
    }
}
