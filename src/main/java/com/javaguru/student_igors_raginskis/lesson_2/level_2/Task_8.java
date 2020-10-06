package com.javaguru.student_igors_raginskis.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        System.out.println("Please, enter your name: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
