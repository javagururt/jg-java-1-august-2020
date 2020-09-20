package com.javaguru.student_sergey_kazyanin.lesson_4.level_2_intern.Task_7;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class EqualsNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
