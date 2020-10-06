package com.javaguru.student_ivan_shulga.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Random;

@CodeReview(approved = true)
class Task_12 {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) { // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt();
        }

        System.out.println("Нулевой ячейке присвоено значение: " + intArray[0]); // для практики вариант вывода
        System.out.println("Первой ячейке присвоено значение: " + intArray[1]);
        System.out.println("Второй ячейке присвоено значение: " + intArray[2]);

        System.out.println();
        System.out.println("Или так:");
        System.out.println();

        for (int i = 0; i < intArray.length; i++) {     // для практики другой вариант вывода
            System.out.println("Индекс ячейки: " + i);
            System.out.println("Значение ячейки: " + intArray[i]);
        }

    }

}
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.
 */
