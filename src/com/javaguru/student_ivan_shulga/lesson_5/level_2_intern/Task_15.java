package com.javaguru.student_ivan_shulga.lesson_5.level_2_intern;

import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] intArray = new int[3];

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) {            // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt(100);       // ограничение максимального значения рандомного числа
        }

        System.out.println("Нулевой ячейке присвоено значение: " + intArray[0]); // выводим значения
        System.out.println("Первой ячейке присвоено значение: " + intArray[1]);
        System.out.println("Второй ячейке присвоено значение: " + intArray[2]);

        System.out.println();

        for (int i = 0; i < intArray.length; i++) {     // увеличиваем значение каждой ячеки на 2
            intArray[i] = intArray[i] + 2;
        }

        System.out.println("Значение нулевой ячейки увеличенное на 2 равно: " + intArray[0]); // выводим значения ячеек увеличенные на два
        System.out.println("Значение первой ячейки увеличенное на 2 равно: " + intArray[1]);
        System.out.println("Значение второй ячейки увеличенное на 2 равно:  " + intArray[2]);

    }

}
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */