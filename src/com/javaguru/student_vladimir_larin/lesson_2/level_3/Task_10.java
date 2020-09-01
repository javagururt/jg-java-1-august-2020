package com.javaguru.student_vladimir_larin.lesson_2.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {

        System.out.println("Enter radius:");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Radius = " + radius);
        System.out.println("Perimeter is = " + 2 * Math.PI * radius);
        System.out.println("Area is = " + Math.PI * (radius * radius));

    }

}
