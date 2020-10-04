package com.javaguru.student_igors_gergeleziu.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();
        if (number1 == number2 || number2 == number3 || number1 == number3)
            System.out.println("Some of numbers are equal");
        else if (number1 > number2 && number1 > number3) System.out.println("Number " + number1 + " is bigger");
        else if (number2 > number1 && number2 > number3) System.out.println("Number " + number2 + " is bigger");
        else if (number3 > number1 && number3 > number2) System.out.println("Number " + number3 + " is bigger");
    }
}
