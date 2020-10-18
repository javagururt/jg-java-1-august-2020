package com.javaguru.student_vladimir_petranovski.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class UserName {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
    }
}
