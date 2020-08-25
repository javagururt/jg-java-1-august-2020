package com.javaguru.student_igors_jurkovs.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] arghs) {

       System.out.println("Please enter first real number: ");
       Scanner sc = new Scanner(System.in);
       double firstDoubleNumber = sc.nextDouble();

       System.out.println("Please enter second real number: ");
       double secondDoubleNumber = sc.nextDouble();

       double sumResult = firstDoubleNumber + secondDoubleNumber;
       double subtractionResult = firstDoubleNumber - secondDoubleNumber;
       double multiplyResult = firstDoubleNumber * secondDoubleNumber;
       double divisionResult = firstDoubleNumber / secondDoubleNumber;

       System.out.println("Sum of your numbers is: " + sumResult);
       System.out.println("Subtraction of your numbers is: " + subtractionResult);
       System.out.println("Multiplication of your numbers is: " + multiplyResult);
       System.out.println("Division of your numbers is: " + divisionResult);

    }
}
