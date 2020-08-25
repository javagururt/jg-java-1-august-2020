package com.javaguru.student_igors_jurkovs.lesson_2.level_3;
import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {

        System.out.println("Please enter radius: ");
        Scanner sc = new Scanner(System.in);
        double userRadius = sc.nextDouble();
        double circlePerimeter = 2 * Math.PI * userRadius;
        double squareUserRadius = userRadius * userRadius;
        double circleArea = Math.PI * squareUserRadius;

        System.out.println("Circles perimeter is: " + circlePerimeter);
        System.out.println("Circles area is: " + circleArea);

    }
}