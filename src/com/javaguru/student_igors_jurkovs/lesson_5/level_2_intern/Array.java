package com.javaguru.student_igors_jurkovs.lesson_5.level_2_intern;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */
class Array {
    public static void main(String[] args) {

        int numbers[] = new int[3];
        int i;
        for(i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }

    }
}
