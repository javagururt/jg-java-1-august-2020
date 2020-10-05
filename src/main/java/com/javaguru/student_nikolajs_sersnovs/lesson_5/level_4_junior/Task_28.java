package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
@CodeReview(approved = true)
class Task_28 {
    public static void main(String[] args) {
        int[] array = new int[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Generated numbers: " + array[i]);
        }
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        System.out.println("Min number are: " + minNumber);
    }
}



