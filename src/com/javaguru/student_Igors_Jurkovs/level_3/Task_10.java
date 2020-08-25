package com.javaguru.student_Igors_Jurkovs.level_3;
import java.util.Scanner;
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

class Task_10 {
    public static void main(String[] args) {

        System.out.println("Please enter radius: ");
        Scanner sc = new Scanner(System.in);
        double userRadius = sc.nextDouble();
        double circlePerimeter = 2 * Math.PI * userRadius;
        double circleArea = Math.PI * power (userRadius, 2);

        System.out.println("Circles perimeter is: " + circlePerimeter);
        System.out.println("Circles area is: " + circleArea);

    }
}
