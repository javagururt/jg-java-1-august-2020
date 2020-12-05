package com.javaguru.student_maksim_morozov.lesson_9.level_4_junior;

class Triangle extends Shape{
    private final double height;
    private final double width;

    Triangle(String title, double height, double width){
        super(title);
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return 0.5 * height * width;
    }

    @Override
    double claculatePerimeter() {
        return width * 3;
    }
}
