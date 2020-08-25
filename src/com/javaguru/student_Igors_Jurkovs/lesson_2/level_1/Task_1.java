package com.javaguru.student_Igors_Jurkovs.lesson_2.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] arghs) {

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstdoublenumber = sc.nextInt();

        System.out.println("Please enter second number: ");
        int secondDoubleNumber = sc.nextInt();

        int sumResult = firstdoublenumber + secondDoubleNumber;
        int subtractionResult = firstdoublenumber - secondDoubleNumber;
        int multiplyResult = firstdoublenumber * secondDoubleNumber;
        int divisionResult = firstdoublenumber / secondDoubleNumber;

        System.out.println("Sum of your numbers is: " + sumResult);
        System.out.println("Subtraction of your numbers is: " + subtractionResult);
        System.out.println("Multiplication of your numbers is: " + multiplyResult);
        System.out.println("Division of your numbers is: " + divisionResult);

    }
}