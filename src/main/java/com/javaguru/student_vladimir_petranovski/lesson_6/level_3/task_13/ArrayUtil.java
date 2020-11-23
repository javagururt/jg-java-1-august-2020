package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_13;

import com.javaguru.teacher.codereview.CodeReview;

/*
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.

 */
@CodeReview(approved = true)
class ArrayUtil {
    public void coupArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int number = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = number;
        }
    }
}
