package com.javaguru.student_ivan_shulga.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Random;
@CodeReview(approved = true)
class Task_13 {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) { // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt();
        }

        System.out.println("Нулевой ячейке присвоено значение: " + intArray[0]);
        System.out.println("Первой ячейке присвоено значение: " + intArray[1]);
        System.out.println("Второй ячейке присвоено значение: " + intArray[2]);

        int sum = 0;                                   // сложение всех чисел массива
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }

        System.out.println();

        System.out.println("Сумма чисел сохранённых в каждой ячейке массива равна: " + sum);

    }

}
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.
 */
