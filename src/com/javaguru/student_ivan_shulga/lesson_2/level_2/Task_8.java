package com.javaguru.student_ivan_shulga.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_8 {

    public static void main(String[] args) {

        System.out.println("Please enter your name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

    }

}
