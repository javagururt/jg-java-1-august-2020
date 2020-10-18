package com.javaguru.student_igors_jurkovs.lesson_5.level_7_senior;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
@CodeReview(approved = true)
class Task_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.println("Please enter array length: ");
        int length = sc.nextInt();
        int[] array = arrayUtil.createArray(length);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }
}
