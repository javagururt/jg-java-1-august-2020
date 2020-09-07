package com.javaguru.student_vladimir_larin.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {

        System.out.println("Please enter your user name:");

        Scanner console = new Scanner(System.in);

        String userName = console.nextLine();

        System.out.println("Hello, " + userName + "!");
    }

}
