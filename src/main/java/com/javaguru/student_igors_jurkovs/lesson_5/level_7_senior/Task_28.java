package com.javaguru.student_igors_jurkovs.lesson_5.level_7_senior;

import com.javaguru.teacher.codereview.CodeReview;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
@CodeReview(approved = true)
class Task_28 {
    public static void main(String[] args) {
        int length = 5;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(length);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Min number is: " + arrayUtil.findMinNumber(array));
    }
}
