package com.javaguru.student_ivan_shulga.lesson_5.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите желаемую длинну массива!");

        int arrayLength = scanner.nextInt();

        System.out.println("Создан массив в " + arrayLength + " ячеек!");

        int[] testArray = new int[arrayLength];

        Random randomInt = new Random();

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = randomInt.nextInt();
        }

        System.out.println("Заполнили ячейки массива рандомными числами, получили такой массив:");

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(i + "  -->  " + testArray[i]);
        }

    }

}

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */