package com.javaguru.student_ivan_shulga.lesson_5.level_4_junior;

import java.util.Random;

class Task_28 {

    public static void main(String[] args) {

        int[] intArray = new int[5];    // создаём массив

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) {        // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt(100);   // ограничение максимального значения рандомного числа
        }

        for (int i = 0; i < intArray.length; i++) {     // выводим массив на консоль
            System.out.println(i + "  -->  " + intArray[i]);
        }

        int min = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if ( min > intArray[i]) {
                min = intArray[i];
            }

        }

        System.out.println("Наименьшее число в массиве равно: " + min);

    }

}

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */