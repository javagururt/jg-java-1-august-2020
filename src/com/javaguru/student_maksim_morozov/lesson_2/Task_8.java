package com.javaguru.student_maksim_morozov.lesson_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        System.out.println("Enter your user name");
        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
        System.out.println("Hello, " + userName);
    }

}