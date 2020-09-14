package com.javaguru.student_vladimirs_filipovs.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first whole number");
        int firstNumber = scan.nextInt();

        System.out.println("Please input second whole number");
        int secondNumber = scan.nextInt();

        System.out.println("Please input third whole number");
        int thirdNumber = scan.nextInt();

        double average = ((double) firstNumber + secondNumber + thirdNumber)/3;
        System.out.println("Average is " + average);
    }
}
