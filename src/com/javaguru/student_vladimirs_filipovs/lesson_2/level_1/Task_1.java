package com.javaguru.student_vladimirs_filipovs.lesson_2.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main (String[] args){
        System.out.println("Please input first whole number:");

        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();

        System.out.println("Please input second whole number:");
        int secondNumber = scan.nextInt();

        int result1;
        int result2;
        int result3;
        int result4;

        result1 = firstNumber + secondNumber;
        result2 = firstNumber * secondNumber;
        result3 = firstNumber - secondNumber;
        result4 = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + result1);
        System.out.println(firstNumber + " * " + secondNumber + " = " + result2);
        System.out.println(firstNumber + " - " + secondNumber + " = " + result3);
        System.out.println(firstNumber + " / " + secondNumber + " = " + result4);

    }
}
