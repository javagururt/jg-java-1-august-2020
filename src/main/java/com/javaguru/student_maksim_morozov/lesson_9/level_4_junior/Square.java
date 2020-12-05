package com.javaguru.student_maksim_morozov.lesson_9.level_4_junior;

class Square extends Shape {

    private final double height;

    Square(String title, double height) {
        super(title);
        this.height = height;
    }

    @Override
    double calculateArea() { return height * height;}

    @Override
    double claculatePerimeter() { return height * 4;}

}
