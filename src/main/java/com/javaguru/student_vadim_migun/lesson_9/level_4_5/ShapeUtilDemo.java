package com.javaguru.student_vadim_migun.lesson_9.level_4_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil circle = new ShapeUtil();
 //       circle.createRandomRadius();
        System.out.println("radius = " + circle.createRandomRadius());
 //       circle.calculateAreaCircle(circle.createRandomRadius());
        System.out.println("Area circle = " + circle.calculateAreaCircle(circle.createRandomRadius()));


    }
}
