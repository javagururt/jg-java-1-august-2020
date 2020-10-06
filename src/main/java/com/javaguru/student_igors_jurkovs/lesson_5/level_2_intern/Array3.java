package com.javaguru.student_igors_jurkovs.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

 */
@CodeReview(approved = true)
class Array3 {
    public static void main(String[] args) {

        int numbers[] = new int[3];
        int sumOfNumbers = 0;
        for(int i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            sumOfNumbers += numbers[i];
        }
        System.out.println(sumOfNumbers);
    }
}
