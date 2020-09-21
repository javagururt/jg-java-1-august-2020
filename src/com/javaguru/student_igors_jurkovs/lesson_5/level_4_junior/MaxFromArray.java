package com.javaguru.student_igors_jurkovs.lesson_5.level_4_junior;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Arrays;

@CodeReview(approved = true)
class MaxFromArray {
    public static void main(String[] args) {
        int index = (int) (Math.random() * 100);
        int numbers[] = new int[index];
        for (int i = 0; i < index; i++) {
            numbers[i] = (int) (Math.random() * 10000);
            System.out.println(numbers[i]);
        }
        Arrays.sort(numbers);
        System.out.println("Max number in array is = " + numbers[index - 1]);
    }
}
