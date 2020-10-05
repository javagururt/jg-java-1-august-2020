package com.javaguru.student_nikolajs_sersnovs.leason_2.level_3;
/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
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
