package com.javaguru.student_maksim_morozov.lesson_4.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        if (firstNumber>secondNumber){
            System.out.println("Smallest number = " + secondNumber);
        } else {
            System.out.println("Smallest number = " + firstNumber);
        }
    }
}
