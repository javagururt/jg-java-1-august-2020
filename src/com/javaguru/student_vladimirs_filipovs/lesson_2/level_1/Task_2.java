package com.javaguru.student_vladimirs_filipovs.lesson_2.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first number (not an integer)");
        double firstDoubleNumber = scan.nextDouble();

        System.out.println("Please input second number (not an integer)");
        double secondDoubleNumber = scan.nextDouble();

        double result1 = firstDoubleNumber + secondDoubleNumber;
        double result2 = firstDoubleNumber * secondDoubleNumber;
        double result3 = firstDoubleNumber - secondDoubleNumber;
        double result4 = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + result1);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + result2);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + result3);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + result4);

    }
}
