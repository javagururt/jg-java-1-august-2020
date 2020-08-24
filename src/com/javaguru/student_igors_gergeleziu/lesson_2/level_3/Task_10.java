package com.javaguru.student_igors_gergeleziu.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

        public static void main(String[] args) {
            double radius;
            System.out.println("Test Data: ");
            Scanner sc= new Scanner(System.in);
            System.out.println("Radius = ");
            radius=sc.nextDouble();
            System.out.println("Expected Output: ");
            System.out.println("Perimeter is = "+2*Math.PI*radius);
            System.out.println("Area is = "+Math.PI*Math.pow(radius, 2));

        }
    }


