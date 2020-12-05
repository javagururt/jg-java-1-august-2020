package com.javaguru.student_maksim_morozov.lesson_9.level_4_junior;

class Rectangle extends Shape{

    private final double height;
    private final double width;

    Rectangle(String title, double height, double width){
        super(title);
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    double claculatePerimeter() {
        return height * 2 + width * 2;
    }
}
