package com.javaguru.student_nikolajs_sersnovs.leason_2.level_2;
/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

 */
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input your name:");
        String name = in.nextLine();
        System.out.println("Hello, " +name + "!");

    }
}
