package com.javaguru.student_vadim_migun.lesson_9.level_4;
/*
Создайте класс ShapeUtil.
В класе ShapeUtil реализуйте метод:

    Circle createRandomCircle();

Этот метод создаёт круг со случайным радиусом.
 */

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble());
    }

    Square createRandomSquare() {
        return new Square("Square", random.nextDouble());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle", random.nextDouble(), random.nextDouble());
    }

    Circle createCircle (double radius) {
        return new Circle("Circle", radius);
    }

    Square createSquare(double height) {
        return new Square("Square", height);
    }

    Rectangle createRectangle(double height, double width) {
        return new Rectangle("Rectangle", height, width);
    }

    Triangle createTriangle(double height, double width) {
        return new Triangle("Triangle", height, width);
    }




    double createRandomRadius() {
        Random random = new Random();
        return random.nextInt(15);
    }

 //   double calculateAreaCircle() {
 //       return Math.PI * radius * radius;
    //  }

}


