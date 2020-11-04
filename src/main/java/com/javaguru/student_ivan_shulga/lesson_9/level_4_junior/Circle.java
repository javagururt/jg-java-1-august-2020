package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea() {
        return radius * radius * Math.PI;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


}

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Circle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Circle.

PS: подсказка - необходимые значения для
расчёта площади и периметра подавайте к
класс через конструктор.

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // implement here calculateArea()

    // implement here calculatePerimeter()

}
 */
