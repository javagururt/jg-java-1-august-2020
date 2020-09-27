package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_2_intern;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.
 */
class Task_13 {

    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
            sum += array[i];
        }

        System.out.println("Total sum of generated numbers: " + sum);
    }
}

