package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_2_intern;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.

 */
class Task_14 {
    public static void main(String[] args) {
        int [] array = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i] / array.length;
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("Average of generated numbers: " + sum);
    }
}
