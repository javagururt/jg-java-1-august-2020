package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */
@CodeReview(approved = true)
class Array {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random randomNumbers = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumbers.nextInt(50);
            System.out.println("Number [" + i + "] = " + numbers[i]);
        }

        System.out.println();

            numbers[0] = 10;  // заполнение массива вручную
            numbers[1] = 12;
            numbers[2] = 15;

            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);

        }

    }

