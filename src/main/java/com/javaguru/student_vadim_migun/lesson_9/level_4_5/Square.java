package com.javaguru.student_vadim_migun.lesson_9.level_4_5;

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

    private double height;
    private double width;

    public Square(String title, double height) {
        super(title);
        this.height = height;
    }

    @Override
    double calculateArea() {
        return height * height;
    }

    @Override
    double calculatePerimeter() {
        return height * 4;
    }
}
