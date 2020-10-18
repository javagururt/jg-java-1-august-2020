package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_17;

import com.javaguru.teacher.codereview.CodeReview;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.
 */
@CodeReview(approved = true)
class Square extends Shape {
    private double length;

    public Square(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return Math.pow(length, 2);
    }

    @Override
    double calculatePerimeter() {
        return 4 * length;
    }
}
