package com.javaguru.student_maksim_morozov.lesson_4.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scan.nextInt();
        if(firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("All numbers are equal!");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different!");
        } else {
            System.out.println("Neither all are equal or different!");
        }
    }
}
