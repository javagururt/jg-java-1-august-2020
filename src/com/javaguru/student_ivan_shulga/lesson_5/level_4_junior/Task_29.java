package com.javaguru.student_ivan_shulga.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Random;

@CodeReview(approved = true)
class Task_29 {

    public static void main(String[] args) {

        int[] intArray = new int[5];    // создаём массив

        Random randomInt = new Random();

        for (int i = 0; i < intArray.length; i++) {        // заполняем все ячейки рандомными числами
            intArray[i] = randomInt.nextInt(100);   // ограничение максимального значения рандомного числа
        }

        for (int i = 0; i < intArray.length; i++) {     // выводим массив на консоль
            System.out.println(i + "  -->  " + intArray[i]);
        }

        System.out.println("Четные числа в данном массиве это:");

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.println(intArray[i]);
            }

        }

    }

}

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */
