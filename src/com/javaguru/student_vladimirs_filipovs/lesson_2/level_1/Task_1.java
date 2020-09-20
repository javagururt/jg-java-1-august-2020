package com.javaguru.student_vladimirs_filipovs.lesson_2.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first whole number:");
        int firstNumber = scan.nextInt();

        System.out.println("Please input second whole number:");
        int secondNumber = scan.nextInt();

        int result1 = firstNumber + secondNumber;
        int result2 = firstNumber * secondNumber;
        int result3 = firstNumber - secondNumber;
        int result4 = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + result1);
        System.out.println(firstNumber + " * " + secondNumber + " = " + result2);
        System.out.println(firstNumber + " - " + secondNumber + " = " + result3);
        System.out.println(firstNumber + " / " + secondNumber + " = " + result4);

    }
}
