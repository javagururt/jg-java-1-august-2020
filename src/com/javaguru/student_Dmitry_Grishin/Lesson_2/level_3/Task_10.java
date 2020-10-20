package com.javaguru.student_Dmitry_Grishin.Lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

        static double square(double radius) {
            return radius * radius;
        }
        public static void main(String[] args) {
            System.out.println("Please, enter your radius: ");
            Scanner scanner = new Scanner(System.in);
            double rScale = scanner.nextDouble();

            double circlePerimeter = 2 * rScale * Math.PI;
            double circleArea = Math.PI * square(rScale);
            System.out.println("Circle Perimeter is = " + circlePerimeter);
            System.out.println("Circle Area is = " + circleArea);

        }

}
