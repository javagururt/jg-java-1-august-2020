package com.javaguru.student_igors_jurkovs.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Hello " + userName + "!");
    }
}
