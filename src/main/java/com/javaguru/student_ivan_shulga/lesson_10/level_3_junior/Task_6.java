package com.javaguru.student_ivan_shulga.lesson_10.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;
@CodeReview(approved = true)
class Task_6 {

    @CodeReviewComment(teacher = "лишние переменные")
    static int x = 3;
    static int y = 5;

    public static void main(String[] args) {

        Operation operationTest1;

        operationTest1 = (x,y) -> x + y;
        int result = operationTest1.calculate(3,5);
        System.out.println(result);

    }

}

interface Operation {

    int calculate(int x, int y);
}

/*
Функциональный интерфейс (functional interface) – это интерфейс у которого только один абстрактный метод.
Функциональный интерфейс может содержать любое количество методов по умолчанию (default) или статических методов.
В Java 8 была введена аннотация @FunctionalInterface, которая генерирует ошибку компиляции, если интерфейс не является функциональным
 */

/*
Что такое функциональный интерфейс в Java?

Найдите в интернете информацию об этом.
Придумайте и реализуйте его в виде программного кода.
В коментарии в коде напишите ответ на вопрос.
 */
