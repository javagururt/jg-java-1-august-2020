package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_10;

import com.javaguru.teacher.codereview.CodeReview;

/*
Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.
 */
@CodeReview(approved = true)
class ArrayUtil {
    public int countWhetherNumber(int number) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 3, 3};
        int count = 0;
        for (int i : arr) {
            if(number == i) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayUtil().countWhetherNumber(3));
    }
}
