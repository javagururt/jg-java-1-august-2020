package com.javaguru.student_maksim_morozov.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number!");
        }  else {
            System.out.println("Odd number!");
        }
    }
}
