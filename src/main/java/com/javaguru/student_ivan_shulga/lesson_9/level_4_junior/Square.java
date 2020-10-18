package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double sideA;

    Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    double calculateArea() {
        return sideA * 2;
    }

    double calculatePerimeter() {
        return sideA * 4;
    }

}

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.
 */