package com.javaguru.student_igors_jurkovs.lesson_5.level_2_intern;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.

 */
class Array4 {
    public static void main(String[] args) {

        int numbers[] = new int[3];
        int sumOfNumbers = 0;
        int i;
        for(i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            sumOfNumbers += numbers[i];
        }
        System.out.println(sumOfNumbers / i);
    }
}
