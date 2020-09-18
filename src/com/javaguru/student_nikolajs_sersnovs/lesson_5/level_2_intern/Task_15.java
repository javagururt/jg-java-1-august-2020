package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_2_intern;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */
class Task_15 {
    public static void main(String[] args) {
        int [] array = new int[3];
        int adding = 0;
        int adding2 = 0;
        int adding3 = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            adding = array[0] + 2;
            adding2 = array[1] + 2;
            adding3 = array[2] + 2;
        }

        System.out.println("Generated numbers: " + array[0]);
        System.out.println("Generated numbers: " + array[1]);
        System.out.println("Generated numbers: " + array[2]);
        System.out.println();
        System.out.println("Generated numbers with adding + 2: " + adding);
        System.out.println("Generated numbers with adding + 2: " + adding2);
        System.out.println("Generated numbers with adding + 2: " + adding3);






    }
}
