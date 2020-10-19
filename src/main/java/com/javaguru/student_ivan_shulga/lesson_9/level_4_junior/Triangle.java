package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "для полупериметра можно вызвать метод calculatePerimeter разделить " +
        "на 2 и записать в переменную в методе (не в состоянии класса). И использовать уже в формуле p")
class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    // private double semiPerimeter = (sideA + sideB + sideC) / 2; // почему-то не работало так

    Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double calculateArea() {
        return Math.sqrt(((sideA + sideB + sideC) / 2) * (((sideA + sideB + sideC) / 2) - sideA) * (((sideA + sideB + sideC) / 2) - sideB) * (((sideA + sideB + sideC) / 2) - sideC));
    }

    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Этот класс должен представлять равносторонний треугоник.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.
 */