package com.javaguru.student_maksim_morozov.lesson_9.level_4_junior;

class Circle extends Shape {

    private final double radius;

    Circle(String title, double radius){
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {return Math.PI * (radius * radius); }

    @Override
    double claculatePerimeter() { return 2 * Math.PI * radius; }
}
