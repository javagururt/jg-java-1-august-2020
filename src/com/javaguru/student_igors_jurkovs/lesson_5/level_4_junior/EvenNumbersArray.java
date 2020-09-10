package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;

import java.util.Arrays;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */
class EvenNumbersArray {
    public static void main(String[] args) {
        int index = (int) (Math.random() * 10);
        int numbers[] = new int[index];
        for (int i = 0; i < index; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println(numbers[i]);
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < index; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
