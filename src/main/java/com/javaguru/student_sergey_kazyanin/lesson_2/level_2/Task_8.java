package com.javaguru.student_sergey_kazyanin.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_8 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Inter your name, please: ");
        String s = scan.nextLine();
        System.out.println("Hello " + s + "!");
    }
}
