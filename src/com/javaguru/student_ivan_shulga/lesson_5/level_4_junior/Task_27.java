package com.javaguru.student_ivan_shulga.lesson_5.level_4_junior;

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {

        int[] intArray = new int[5];    // создаём массив

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) {        // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt(100);   // ограничение максимального значения рандомного числа
        }

        for (int i = 0; i < intArray.length; i++) {     // выводим массив на консоль
            System.out.println(i + "  -->  " + intArray[i]);
        }

        int max = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if ( max < intArray[i]) {
                max = intArray[i];
            }

        }

        System.out.println("Наибольшее число в массиве равно: " + max);

    }
}

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */