package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_6.Task_25;
/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).
 */
class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius * this.radius;
    }

    public void calculateArea(){
        double calculateArea = Math.PI * (getRadius());
        System.out.println("Circle are: " + calculateArea );

    }
}











