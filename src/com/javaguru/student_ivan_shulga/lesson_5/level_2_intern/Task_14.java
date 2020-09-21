package com.javaguru.student_ivan_shulga.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Random;
@CodeReview(approved = true)
class Task_14 {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) {            // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt(100);       // ограничение максимального значения рандомного числа
        }

        System.out.println("Нулевой ячейке присвоено значение: " + intArray[0]); // выводим значения для наглядности
        System.out.println("Первой ячейке присвоено значение: " + intArray[1]);
        System.out.println("Второй ячейке присвоено значение: " + intArray[2]);

        int average = 0;                              // среднее значение чисел сохранённых в массиве
        for (int i = 0; i < intArray.length; i++) {   //
            average = average + intArray[i];          //
        }                                             //
        average = average / intArray.length;          // среднее значение чисел сохранённых в массиве

        System.out.println();

        System.out.println("Среднее значение чисел сохранённых в массиве равно: " + average);

    }

}
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.
 */
