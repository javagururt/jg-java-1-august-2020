package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_12;

import com.javaguru.teacher.codereview.CodeReview;

/*
Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.

Подсказка: void replaceAll(int[] arr, int numberToReplace, int newNumber).
 */
@CodeReview(approved = true)
class ArrayUtil {
    public void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }
}
