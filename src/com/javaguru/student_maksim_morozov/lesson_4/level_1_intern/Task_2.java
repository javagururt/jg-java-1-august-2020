package com.javaguru.student_maksim_morozov.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        int number = scan.nextInt();
        System.out.println("Number = " + number);
        if (number > 0) {
            System.out.println("The number is positive!");
        } else if (number < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number = 0!");
        }
    }
}
