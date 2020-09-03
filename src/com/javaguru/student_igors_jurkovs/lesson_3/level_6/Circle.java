package com.javaguru.student_igors_jurkovs.lesson_3.level_6;

/*
Task_25
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */

class Circle {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    double square (double a) {
        return a * a;
    }

    void calculateArea () {
        double circleArea = Math.PI * square(radius);
        System.out.println("Circle area is " + circleArea);
    }
}

class CircleDemo {

    public static void main(String[] args) {

        Circle circle = new Circle(5.0);

        circle.calculateArea();
    }
}
