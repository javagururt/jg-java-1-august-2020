package com.javaguru.student_nikolajs_sersnovs.lesson_3.level_6.Task_25;

import com.javaguru.teacher.codereview.CodeReviewComment;

/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).
 */
class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius * radius;

    }

    @CodeReviewComment(teacher = "название метода не соответствует логике внутри него")
    //а сейчас?

    public void calculateArea(){
        double calculateArea = Math.PI * (this.radius);
        System.out.println("Circle are: " + calculateArea );

    }
}











