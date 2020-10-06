package com.javaguru.student_anastasija_meiksane.Lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;
@CodeReview(approved = true)
 class Task_8 {

    /*
    Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");


    String name = scanner.next();

    System.out.println("Hello " + name + "! ");
    }
}
