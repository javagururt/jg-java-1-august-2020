package com.javaguru.student_maksim_morozov.lesson_9.level_4_junior;

abstract class Shape {
    private String title;
    Shape(String title){this.title = title;}
    abstract double calculateArea();
    abstract double claculatePerimeter();
}
