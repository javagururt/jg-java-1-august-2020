package com.javaguru.student_vladimirs_filipovs.lesson_4.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first number (int)");
        int firstNumber = scan.nextInt();

        System.out.println("Please input second number (int)");
        int secondNumber = scan.nextInt();

        System.out.println("Please input third number (int)");
        int thirdNumber = scan.nextInt();

        // 221 - 212 - 122 - 211 - 121 - 112 - 222

        if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Greatest number is first and second : " + firstNumber + ", " + secondNumber);
        } else if ((firstNumber == thirdNumber) && (firstNumber > secondNumber)) {
            System.out.println("Greatest number is first and third : " + firstNumber + ", " + thirdNumber);
        } else if ((secondNumber == thirdNumber) && (secondNumber > firstNumber)) {
            System.out.println("Greatest number is second and third : " + secondNumber + ", " + thirdNumber);
        } else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Greatest number is first number : " + firstNumber);
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Greatest number is second number : " + secondNumber);
        } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println("Greatest number is third number : " + thirdNumber);
        } else {
            System.out.println("All numbers are equal: " + firstNumber + ", " + secondNumber + ", " + thirdNumber);
        }
    }
}
