package com.javaguru.student_igors_jurkovs.lesson_5.level_2_intern;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */
class Array5 {
    public static void main(String[] args) {

        int numbers[] = new int[3];
        for(int i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            System.out.println(numbers[i]);
            numbers[i] += 2;
        }
        System.out.println("Array elements after +2:");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
