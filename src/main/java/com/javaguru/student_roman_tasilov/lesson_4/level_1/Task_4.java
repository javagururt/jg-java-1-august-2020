package com.javaguru.student_roman_tasilov.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;
import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "можно использовать просто else, так как если не 'четное', то остается только 1 вариант")
public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Please enter number int: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is event number");
        }
        else if (number % 2 != 0) {
            System.out.println("It is Odd number");
        }
}}
