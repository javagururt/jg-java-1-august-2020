package com.javaguru.student_maksim_morozov.lesson_2;

import java.util.Scanner;

class Task_10 {

        public static void main(String[] args) {

            System.out.println("Welcome to the Circle Calculator");
            System.out.println("Enter the radius of the circle (double): ");

            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();

            double pi = 3.1415;

            double area = pi * (radius * radius);

            double perimetr = 2 * pi * radius;

            System.out.println("Area is = " + area);

            System.out.println("Perimeter is = " + perimetr);

        }

    }
