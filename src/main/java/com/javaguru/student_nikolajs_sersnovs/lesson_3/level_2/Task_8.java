package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

/*
Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi " + userName + "!";
 */
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        String userName = "Nikolajs";
        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);

    }
}
