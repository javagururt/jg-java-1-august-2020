package com.javaguru.student_nikolajs_sersnovs.leason_2.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input circle radius: (double) ");
        double radius = scanner.nextDouble();
        double circlePerimeter = Math.PI * 2 * radius;
        double circlArea = Math.PI * (radius * radius);


        System.out.println("Test Data:");
        System.out.println("Radius =" + radius);
        System.out.println("Expected Output");
        System.out.println("Perimeter is = " + circlePerimeter);
        System.out.println("Area is = = " + circlArea);

    }
}
